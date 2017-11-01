# MARCEL LAVRIGNE CHANGELOG


* `0.0.1`

    - 984 - [Green Zone] - MAJ des valeurs des OP
    - 983 - [Green Zone] - Sauvegarde des nouveaux points d'inflexion
    - 981 - [Green Zone] Modifier le texte / style du bouton "Customize green zone" sur le graphe
    - 969 - [Green Zone] - Edition : Ajout marqueur du point d'inflexion
    - 924 - [Green Zone] - Positionnement bouton dans graphe
    - 919 - [Green Zone] - Edition : Reload de l'OP d'origine
    - 917 - [Green Zone] - Edition : Bouton + action refresh (dynamique ?)
    - 916 - [Green Zone] - Edition : Affichage graphe light
    - 796 - [Green Zone] - Edition de la zone verte
    - 794 - [Green Zone] - Accès à la page d'édition depuis le graphe
    - 798 - [Green Zone] - Impacts sur la fiche parcelle
    - 915 - [Green Zone] - Gestion de l'erreur dans le output
    - 914 - [Green Zone] - Modification inputs / outputs avec ModelBuilder
    - 913 - [Green Zone] - Creation entity (Repo Service Controller)
    - 982 - [Green Zone] - Converter et sauvegarde PPE
    - 923 - [Green Zone] - PPE5 : Ajout de l'entrée "custom"
    - 921 - [Green Zone] - PPE5 : Apply to all years

    - 867 - [Midday Potential]
    - 1025 - [Midday Potential] - Impact sur la fiche parcelle
    - 1017 - [Midday Potential] - Pouvoir ajouter une mesure de potentiel

    - 973 - [Interface Weather] - Cumul d'irrigations : weekly report, liste irrigation, fiche parcelle
    - 961 - [Interface Weather] - Design irrigation auto
    - 972 - [Interface Weather] - Convert from ml to mm + Nouvellle unité
    - 957 - [Interface Weather] - Affichage dans la liste et sur le graphe (if manuel ... else auto)
    - 955 - [Interface Weather] - Stratégie de stockage > intervention
    - 954 - [Interface Weather] - Preparation data vers simulator (input) - convert To Intervention
    - 824 - [Simulator] Installation/Test du MCR 2016a

    - 865 - [PPE 5] Ajouter l'objectif de production "Raisin de table"
    - 670 - PPE5 : Apply to years : Ajouter "All"

    - 355 - Graphe : les tooltips ne permettent pas de savoir quelles sont les valeurs de potentiel associées au fond de courbe
    - 740 - Rendre inactif les boutons de validation après le 1er clic
    - 1016 - intégration nouveau JAR
    - 672 - Tri alphabétique : Ajouter "Stress" de l'autre côté de "A-Z"
    - 668 - Fiche parcelle : onglet Param : enherbement : afficher les dates Germination / Senescence

BugFixes:
    - 1030 - [TMA] - Objectif de production + Enherbement pas rechargé sur changement de parcelle

* `1.2.2`

BugFixes:

    - #971 - [TMA] - Inputs des champs nombres: irrigation et PPE(surface)
    - #907 - [TMA] - Non déconnexion du compte après fermeture du navigateur
    - #337 - Compatibilite avec IE

* `1.2.1`

Version simulateur matlab vintel: 1.3.1

Features:

    - #313 - Pouvoir éditer la liste des irrigations
    - #495 - Plotsheet : Forçage phéno : Autoriser la sauvegarde d'un stade en mode "Automatic" même si la date forcée n'est pas pertinente
    - #555 - Interventions : afficher la date par défaut à la date à laquelle la toolbar est positionnée
    - #567 - Interventions : pop-ups : remplacer quantity par des champs plus explicites
    - #676 - PPE5 : Cover crop width : limiter à 1 chiffre après la virgule
    - #689 - PPE3 : Création de la première parcelle d'un compte : bizzareries sur le centrage de la carte
    - #697 - Simulateur - Sauvegarder l'erreur lorsqu'on arrive pas à construire le SimulationInput
    - #715 - création de la page 'report' avec des données
    - #717 - client: mise en forme des données
    - #718 - server: Requêtage sur les plot
    - #732 - PPE3 : Carte google maps à agrandir
    - #746 - [BDD] - Supprimer les tables City / Country / State
    - #749 - Modification du modèle de données et du modele object avec ajout de la nouvelle entité "Report"
    - #759 - Création entité dans le MDD et le MO > Rest (CS,SS)
    - #760 - Converter PlotContext to Report (CS)
    - #761 - i18n entete et les contenus statiques (CS)
    - #762 - Intégration maquettes : edit / readonlymode / liste (CS)
    - #763 - Converter to Server du WO (sérialisation Json) (CS)
    - #764 - [Weekly reports] - Exports CSV (WR et WO)
    - #765 - Gestion des alertes (CS)
    - #771 - Ajouter les infos Total precipitation + Total applied water in last 7 days (colonne droite, onglet Situation)
    - #792 - Rester connecté coché par défaut
    - #814 - [Weekly reports] - Visualisation graphique sur les WO
    - #864 - [Weekly reports] - Pas de tri sur les colonnes du WO


BugFixes:

    - #688 - PPE2 : Le choix 'Aucun système d'irrigation' n'est pas conservé à l'affichage
    - #725 - Pouvoir resaisir le même nom qu'une parcelle supprimée
    - #836 - [Weekly reports] - f5 > Perte de la langue US
    - #840 - Edition / Suppression > Liste parcelles non rafraichie (regression)
    - #855 - [PPE 2] Pas de valeur décimale possible pour le débit d'un goutteur


* `1.0.1`

    Hotfixs pour la prod

    - #694 - Simulation en erreur lorsque FTSW forcée au premier jour de météo
    - #699 - Non prise en compte des stades phéno forcés
    - #719 - [Saisie irrigation multiple] Faciliter l'upload d'un fichier d'irrigation
    - #720 - Lors de saisie de multi-irrigs, les simulations ne sont pas toutes rejouées
    - #721 - Le bouton Sauvegarder du Multi-irrig reste clickable après avoir été clické 1 fois
    - #724 - Lorsque dans le plotcontext maxwidth > 59 inch (largeur de la canopée), impossible de créer la parcelle
    - #726 - Login appelé 2 fois sur validation du formulaire
    - #736 - Traduction colonne date


* `1.0.0`

BugFixes:

    - #212 Bouton "Contact"/"Help" : le bouton "Back to dashboard" ne fonctionne pas.
    - #549 : PPE : débit des goutteurs : Ajouter "/h" à l'unité

Features:

    - Interdit l'utilisation de IE.
    - Dump de la prod à jour avant bascule

* `1.0.0-RC2`

BugFixes:

    - Position marker non conservée pour le 1er plot créé
    - mise à jour de la précision de la conversion 'feet to meter'
    - Interdiction d'utiliser l'application avec IE
    - Upgrade itk-analytics
    - Affichage du crouton à la sauvegarde du multi-irrig
    - Page d'aide
    - #685 : Irrigations multiples : A la création d'une parcelle, je ne peux pas ajouter d'irrigation pour une saison passée

* `1.0.0-RC1`

BugFixes:

    - #349 : [Reopened] Interventions : empêcher la création de 2 interventions du MEME type le même jour, sauf pour les mesures de potentiel de base
    - #501 : PPE : Tous sliders : On ne peut plus vider le champ une fois qu'on a touché le slider
    - #506 : PPE 5 : Image pour la canopée pas raccord avec les sliders, surtout pour la largeur
    - #549 : PPE : débit des goutteurs : Ajouter "/h" à l'unité
    - #653 : PPE : Saisie de valeurs : Si je saisie une valeur hors borne, elle s'affiche telle quelle sur le curseur
    - #654 : PPE5: Porosité : je ne peux pas saisir d'autres valeurs que la valeur min
    - #655 : Création de parcelle : Empêcher le retour au PPE4 si le plot context courant n'est pas valide
    - #656 : PPE : Limitation des valeurs min/maxà la saisie : Sous firefox, en utilisant les flèches haut/bas, je peux sortir des bornes
    - #666 : Suppression de parcelle : label reste sur la carte après suppression + nom parcelle mal affiché + finir internationalisation
    - #667 : FTSW/PAW : Changement de vocabulaire
    - #669 : PPE5 : Taper Entrée depuis un champ éditable ouvre "Apply to years"
    - #671 : Edition du PPE1 : Je clique Nouveau client, je reviens au client existant : les champs sont effacés
    - #674 : PPE5 : Contrôle des dates d'apparition/disparition de l'herbe : on peut saisir une date de disparition antérieure à la date d'apparition


Features:

    - Montée de version du simulateur Matlab de 1.2.0 à 1.2.1
    - #212 : Bouton "Contact"/"Help"
    - #665 : Page de login : Afficher les mentions de nos financeurs


* `0.0.9` :

BugFixes:

    - #502 : PPE 2 : Image pour la distance entre ceps dans le rang : Pas assez claire
    - #516 : PPE 4 : Remplacer la valeur min de sand/clay de 0 à 5 : Bornes du fichier qui définit les bornes non prises en compte
    - #535 : PPE1 : les modifications des paramètres client ne sont pas sauvegardées
    - #544 : PPE2 : connexion NON admin : le message indiquant qu'il faut nous contacter pour connecter une station météo a disparu.
    - #562 : PPE2 : année de plantation = 1 fait planter la sauvegarde
    - #569 : Problème à la migration de données pour Vitivista ? Parcelle "Ma parcelle" non visible sur la test
    - #570 : Tablette : Pop-up stades phéno : Le bas de la fenêtre est coupé sur iPad
    - #574 : PPE : On peut sauvegarder le PPE, même s'il y a des erreurs pour d'autres plot context que le courant
    - #576 : PPE2 : Si le champ Année de plantation est incorrect, on ne peut pas sauvegarder le PPE
    - #577 : PPE 2: Ajout de contrôle sur la parcelle
    - #578 : PPE 2 : Traduction du bloc Irrigation System
    - #579 : PPE 2 : impossible de modifier le champ distance entre les rangs
    - #580 : Irrigations : Traduction des messages d'erreurs
    - #581 : Irrigations : Décalage des dates
    - #584 : PPE 4 : Slider ne correspond pas à l'image
    - #583 : PPE : Sauvegarder un plot sans plotcontext

Features:  

    - Montée de version du simulateur Matlab de 1.1.0 à 1.2.0
    - #503 : PPE5 : Image pour la porosité : Pas assez claire
    - #524 : Rendre accessible à la demande l'ensemble des simulation inputs de l'appli pour les agros
    - #533 : PPE 4 : Slider ne correspond pas à l'image
    - #538 : PPE : Rendre le gris des sliders plus visibles
    - #539 : PPE5 : les paramètres obligatoires du PPE5 sont encore en bleu
    - #540 : PPE2 : Uniformiser les textes justifiés à gauche
    - #550 : Conversion d'unités
    - #553 : PPE5 : Image pour la bande enherbée à modifier quand 1 rang sur 2
    - #560 : PPE : Modifier le comportement des boutons Prev/Next/Save
    - #564 : Dashboard : icône pour le tri alphabétique : mettre un z de la même taille que la A
    - #566 : Interventions sur le graphe : si on ajoute une irrigation le 29 décembre par exemple et qu'on place la souris dessus pour voir sa valeur, elle est masquée par le bandeau de droite
    - #621 : PPE3: Amélioration marker + Montée de version

* `0.0.8` :

BugFixes:

    - #504 : PPE 5 : Image bande enherbée doit avoir de l'herbe par défaut pour être raccord avec la valeur par défaut pour la largeur de la bande enherbée
    - #546 : Interventions : on ne peut plus créer d'interventions
    - #551 : Irrigations multiples : NaN est sauvé ?
    - #528 : Légende du graphe en Anglais pas affichée en entier : agrandir la largeur de la "boîte" Légende

* `0.0.7` :

BugFixes:

    - #489 : Plotsheet : Onglet "Paramètres" : recâbler "Production objective"
    - #514 : Fiche parcelle : préconisation d'irrigation : ne pas afficher Zéro hors saison
    - #519 : PPE 4: Image et Slide non raccords pour la profondeur d'enracinement
    - #528 : Légende du graphe en Anglais pas affichée en entier : agrandir la largeur de la "boîte" Légende

Features:  

    - #368 : Cabler le PPE 5
    - #372 : Problème des conversions de quantité d'irrigation
    - #425 : Afficher le nom de la station météo plutôt que son code
    - #460 : ITK Vigne devient Vintel : Remplacer le logo ITK Vigne par celui de Vintel sur la page de login en français
    - #479 : Affichage des mesures de FTSW : supprimer le trait sous le point de mesure
    - #480 : Page d'accueil : Supprimer "Copyright © 2016 All rights reserved"
    - #483 : User settings : séparer clairement la partie changement de mot de passe, comme pour "Informations personnelles" et "Préférences"
    - #500 : PPE 2 : Nom de parcelle : Interdire des noms déjà dans l'appli
    - #504 : PPE 5 : Image bande enherbée doit avoir de l'herbe par défaut pour être raccord avec la valeur par défaut pour la largeur de la bande enherbée
    - #509 : Page de login : Masquer le lien pour la récupération du mot de passe
    - #510 : User settings : Faire une passe sur les fichiers d'internationalisation
    - #512 : User settings : améliiorer la lisibilité
    - #513 : PPE : Faire une passe sur l'internationalisation
    - #518 : PPE2 : Séparer plus clairement les paramètres Irrigation de ceux au-dessus
    - #520 : PPE 4 : Clarifier l'affichage du type de sol au-dessus des champs Texture.
    - #521 : User settings : câbler le choix de l'unité d'irrigation
    - #522 : Remonter dans l'interface les erreurs Weather
    - #529 : PPE : Changer la couleur bleue des paramètres obligatoires
    - #532 : Sélection d'une parcelle : afficher le nom du client dans le bandeau de droite
    - #534 : PPE1 : Si "Nouveau client" : masquer la ligne "Client" avec le menu déroulant

* `0.0.6` :
    - BugFixes début de sprint mars, tickets:
    - #493
    - #494
    - #508
    - #445
    - #486
    - #492
    - #496
    - #478
    - #485
    - #215
    - #420
    - #491
    - #497
    - #498
    - #490
    - #488


* `0.0.5` :
    - \#228 Pages de settings
    - \252 Mult irrigations
    - PPE5
    - Unit conversion
    - contraintes d'intégrité supplémentaires sur la base
    - MAJ script de migration : conversion des unités d'irrigation, varietes sans doublons, calcul fraction enherbement
    - Pour simulateur : Clay 60 % max, enherbement fraction
    - Slider compo
    - Fix : google map version
    - Align to maven 3.3.3
    - Align to version 1.1.0_R2015a of agro simulator

* `0.0.4` :
    - Model update to compute and display midday potential
    - PPE 1
    - PPE 2
    - PPE 3
    - PPE 4
    - Refactor charts generation
    - Display past seasons
    - Deal with "Stay Connected" option
    - Old production data migration
    - New weather data available notification
    - i18n
    - Align to version 1.0.0_R2015a of agro simulator

* `0.0.3` :
    - Fix breadcrumb affichage comme un lien
    - Fix couleurs boutons out-of-season
    - Changement couleur orange stress zone sur le graphe
    - Changement icone relaunch simulation
    - \#344 : Fiche parcelle : pas la bonne icône pour le trimming
    - \#345 : Graphe : décalage d'un jour de l'affichage des résultats de simulation
    - \#352 : Connexion au compte demo/iopklm : le dashboard ne s'affiche pas
    - \#348 : Intervention : cadre de saisie trop petit
    - \#346 : Display dot as separator in decimal when fill-in intervention
    - \#351 : Forçage phéno : le forçage du débourrement fait planter la simu
    - \#221 : Forced phenological stages
    - \#255, #218, #246 Volet de droite ( situation, irrigations, paramètres)
    - \#339 MAJ modèle BDD
    - \#338 : Display alert level for each plot based on simulation result
    - \#336 : On connexion, don't select a plot that does not belong to the current user
    - \#236 : Sort plot list by name
    - align to latest version of Model Builder to generate Simulation IO
    - creation of vintel-weather sub-module
    - clean-up maven dependencies management
    - Refactor client to deal with breadcrumb management
    - Trigger simulation on startup when a new simulator is found

* `0.0.2` :

    - November 2015 release
    - Full simulation chart (stress + weather)
    - Interventions (displayed on chart + CRUD)
    - Loader
    - Switch view mode on plotsheet (full chart, 3 panels, 2 panels,..)
    - Implementation of simulation Trigger based on an aspect
    - Align to version 0.1.1_R2015a of agro simulator and 0.3.2 of itk-sim
    - Clean-up launch context. Use of property files to set-up application
    - Deploy swagger when generate web artifact


* `0.0.1` :

    - First release
    - Admin + management
    - Launch simulations through itk-sim
    - Migration from mysql to postgres
    - Some Refactors
