CREATE DATABASE app_bdd  ;

USE exo9;

CREATE TABLE app_bdd (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    titre VARCHAR(255)
);

INSERT INTO mytable (titre) VALUES ("docker-exercice9"),("titre2");