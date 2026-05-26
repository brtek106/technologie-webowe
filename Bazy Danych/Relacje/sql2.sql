CREATE TABLE user_course (
	id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    course_id INT NOT NULL,
    signup_date DATE NOT NULL,
    expiration_date DATE NOT NULL,
    CONSTRAINT fk_user_id  FOREIGN KEY (user_id) REFERENCES user (id),
    CONSTRAINT fk_course_id FOREIGN KEY (course_id) REFERENCES course (id)
);

INSERT INTO user_course
	(user_id, course_id, signup_date, expiration_date)
VALUES
	(2, 2, '2018-10-10', '2019-10-10'),
    (2, 3, '2019-10-10', '2020-10-10'),
    (3, 1, '2019-11-06', '2020-11-06');
    
DELETE FROM user WHERE id = 2;

ALTER TABLE course
ADD category_id INT,
ADD FOREIGN KEY (category_id) REFERENCES course_category (id);