INSERT INTO `user_settings` VALUES (1,'fr_FR',1,1,1,1),(2,'fr_FR',1,0,0,1);

INSERT INTO `user` VALUES (1,'manu','manu','manu','tarrou','emmanuel.tarrou34@gmail.com','Montpellier','ADMIN',1),(2,'marcel','marcel','marcel','lavigne','test@test.fr','Montpellier','USER',2);

INSERT INTO `event` VALUES (1,'Dégustation de la cuvée des pères','Evènenement crée','EVENT',1,'48 impasse des Lilas','Montpellier','France',25,NULL,'0654142563',32, 1,'2017-12-01 19:00:00'),(2,'Visite du domaine des Anges','Visite guidée accompagnée de dégustation succéssives des vins du domaine','EVENT',1,'485 allée des vignobles','Nîmes','France',70,NULL,'0414585625',14, 1,'2017-05-02 14:00:00'),(3,'Soirée d\'inauguration du Trinque Brioche','Soirée d\'inauguration du bar','PARTY',1,'14 rue du docteur Faraday','Montpellier','France',140,NULL,'0685478569',9, 1,'2017-12-12 18:00:00');

INSERT INTO `comment` VALUES (1,'Superbe dégustation, tout était parfait!','2017-05-02 14:00:00',1,1),(2,'Visite impressionnante, les conseils fournis étaient très pertinents','2017-06-02 14:00:00',1,2);

INSERT INTO `history` VALUES (1,1,3,4),(2,1,2,2),(3,2,3,1);

INSERT INTO `message` VALUES (1,1,2,1, 'Salut cokin, comment vas tu?','2017-05-02 14:00:00'),(2,2,1,1,'Bien et toi?','2017-05-02 14:12:00');

INSERT INTO `news` VALUES (1,'Comment déguster un bon chardonnay?',1,'bla bla bla','2017-05-02 14:00:00','2017-05-02 14:00:00'),(2,'Du vin rouge avec du poission?',1,'bli bli','2017-05-02 14:00:00','2017-05-02 14:00:00');

INSERT INTO `notification` VALUES (1,'NEW_MESSAGE',1,1,'2017-05-02 14:00:00',0),(2,'BOOKING_CONFIRMED',1,1,'2017-05-02 14:00:00',1);

INSERT INTO `subscription` VALUES (1,1,2,'2017-05-02 14:00:00',2),(2,2,1,'2017-05-02 14:00:00',4);