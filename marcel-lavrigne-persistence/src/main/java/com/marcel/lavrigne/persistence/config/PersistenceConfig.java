package com.marcel.lavrigne.persistence.config;

import com.googlecode.flyway.core.Flyway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jndi.JndiTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.naming.NamingException;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.marcel.lavrigne.persistence")
public class PersistenceConfig {

    private static final Logger LOG = LoggerFactory.getLogger(PersistenceConfig.class);

    @Bean
    DataSource dataSource() {
        DataSource dataSource = null;
        final JndiTemplate jndi = new JndiTemplate();
        try {
            dataSource = (DataSource) jndi.lookup("java:comp/env/jdbc/datasource");
        } catch (final NamingException e) {
            LOG.error("NamingException for dataSource", e);
        }
        return dataSource;
    }

    @Bean(initMethod = "migrate")
    public Flyway dbInitialization() {
        final Flyway flyway = new Flyway();
        flyway.setDataSource(dataSource());
        flyway.setSqlMigrationPrefix("DB-");
        flyway.setLocations("sql/automated/common", "sql/automated/mainOnly");
        return flyway;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        final LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        emf.setDataSource(dataSource());
        emf.setPackagesToScan("com.marcel.lavrigne.model");
        final HibernateJpaVendorAdapter hibernateAdapter = new HibernateJpaVendorAdapter();
        hibernateAdapter.setShowSql(true);
        final Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.cache.use_second_level_cache", "true");
        jpaProperties.put("hibernate.cache.use_query_cache", "true");
        jpaProperties.put("hibernate.cache.region.factory_class", "org.hibernate.cache.ehcache.SingletonEhCacheRegionFactory");
        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQLInnoDBDialect");
        jpaProperties.put("hibernate.search.default.directory_provider", "filesystem");
        jpaProperties.put("hibernate.search.default.indexBase", "lucene/indexes");
        jpaProperties.put("hibernate.search.lucene_version", "LUCENE_CURRENT");
        emf.setJpaProperties(jpaProperties);
        emf.setJpaVendorAdapter(hibernateAdapter);
        return emf;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new JpaTransactionManager(entityManagerFactory().getObject());
    }

    @Bean
    static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}