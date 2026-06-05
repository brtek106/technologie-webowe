CREATE TABLE user (
id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(40) NOT NULL,
email VARCHAR(50) NOT NULL UNIQUE,
password VARCHAR(50) NOT NULL,
last_movie_id INT
);

CREATE TABLE subscription (
id INT PRIMARY KEY AUTO_INCREMENT,
singup_date DATETIME NOT NULL,
expration_date DATETIME NOT NULL,
user_id INT,
FOREIGN KEY (user_id) REFERENCES user (id)
);

CREATE TABLE movie (
id INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(100) NOT NULL,
description VARCHAR(2000),
year INT NOT NULL,
rating INT NOT NULL,
category_id INT,
FOREIGN KEY (category_id) REFERENCES movie_category (id)
);

CREATE TABLE movie_category (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(45) NOT NULL
);

CREATE TABLE watch_progress (
user_id INT NOT NULL,
movie_id INT NOT NULL,
watch_time INT NOT NULL,
PRIMARY KEY (user_id, movie_id),
FOREIGN KEY (user_id) REFERENCES user (id),
FOREIGN KEY (movie_id) REFERENCES movie (id)
);