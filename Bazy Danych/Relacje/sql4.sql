CREATE TABLE user_details (
	id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT UNIQUE NOT NULL,
    telephone VARCHAR(11),
    city VARCHAR(30),
    FOREIGN KEY (user_id) REFERENCES user (id)
);

INSERT INTO user_details
	(user_id, telephone, city)
VALUES
	(2, '777 888 999', 'Warszawa');