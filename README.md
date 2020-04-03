Ce programme en un exemple simple d’un microservice  « microcommerce » contenant une seule entité « Product », basé sur un projet de commerce en ligne.

#Importation du projet.
Depuis l'IDE, File-->Import-->Import Maven Project et sélectionner le dossier microcommerce

#Compilation
clic droit dur le projet -->Run As-->Maven Install

#Démarrage
clic droit sur la classe MicrocommerceApplication.java-->Run As-->Java Application
L'application tourne sur un serveur Tomcat intégré (pas besoin de le configurer). 
Le port d'ecoute par défaut est 8080. 
Pour le modifier, on utilise le fichier application.properties (exemple : server.port 9090). 

#Configuration de la base de données
Par défaut, ce pogramme uilise une base de donnée en memoire H2 avec un fichier data.sql permettant de peupler la base.
cette configuration est faite sur le fichier application.properties.
Pour des besoins d'accès à une base de données persitente, une configuration MYSQL est fournie au même endroit, il suffira de la décommenter et commenter la conf de la BD h2.

#explication des classes et interface :
La classe Product.java (com.ecommerce.microcommerce.model) est un bean entity. Elle contient les propriétés suivantes :id (clé primaire),nom et prix.
La classe MicrocommerceApplication.java est la classe de démarrage de l'application. Elle contient une seule méthode (main) et des annotations comme celle de Swagger.
L'interface ProductDao.java qui fournit une implémentation automatique et qui sera utilisé dans le controleur pour acceder aux méthodes de base (sauvegarde et de recherche,...)
La classe ProductController.java qui représente le controleur et contenant des fonctionnalités accéssibles via des requetes REST (Ajout d'un produit, Liste des produits,...)
La classe MicrocommerceApplicationTests.java contient les tests unitaires.

#lancement des tests unitaires
clic droit sur MicrocommerceApplicationTests.java-->Run As JUnit Test

#Dépendances
Le fichier pom.xml contient toutes les dépendances maven du projet

