CREATE TABLE course_category (
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL,
    description VARCHAR(200)
);

INSERT INTO course_category
	(name, description)
VALUES
	    ('Frontend', 'Kursy związane z wizualną częścią aplikacji'),
		('Backend', 'Kursy związane z serwerową częścią aplikacji');
        
UPDATE course SET category_id = 1 WHERE id = 3;
UPDATE course SET category_id = 2 WHERE id IN (1, 2);