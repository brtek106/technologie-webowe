CREATE DATABASE course_platform;

CREATE TABLE user (
id INT PRIMARY KEY AUTO_INCREMENT,
username VARCHAR(30) UNIQUE NOT NULL,
email VARCHAR(40) UNIQUE NOT NULL,
password VARCHAR(40) NOT NULL
);

CREATE TABLE course (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50) UNIQUE NOT NULL,
description VARCHAR(2000)
);

INSERT INTO user
	(username, email, password)
VALUES
	('jankowal', 'jan@kowalski.com', 'jan1234'),
    ('maria', 'maria@gmail.com', 'maria1234'),
    ('peter99', 'peter@99.com', 'peter1234');
    
INSERT INTO course
	(name, description)
VALUES
	('Kurs Java', 'Kurs programowania przeznaczony dla początkujących i nieco bardziej zaawansowanych.'),
    ('Kurs Python', 'Naucz się języka Python i wykorzystaj go do programowania sztucznej inteligencji i zaawansowanych obliczeń.'),
    ('Kurs JavaScript', 'Poznaj język JavaScript i naucz się tworzyć piękne, dynamiczne strony internetowe, które podbiją świat.');