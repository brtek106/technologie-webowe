SELECT * FROM titles WHERE title = 'Engineer';

SELECT * FROM employees
	WHERE emp_no IN (
		SELECT emp_no FROM titles WHERE title = 'Engineer'
        );

SELECT
	first_name, last_name, title, from_date, to_date
FROM
	employees, titles
WHERE
	employees.emp_no = titles.emp_no
AND
	title = 'Engineer'
;

SELECT
	first_name, last_name, title, from_date, to_date
FROM
	employees JOIN titles ON employees.emp_no = titles.emp_no
WHERE
	title = 'Engineer'
;

DELETE FROM titles WHERE emp_no = 10004;

SELECT
	employees.emp_no, first_name, last_name, title, from_date, to_date
FROM
	employees INNER JOIN titles ON employees.emp_no = titles.emp_no;
    
SELECT
	employees.emp_no, first_name, last_name, title, from_date, to_date
FROM
	employees LEFT JOIN titles ON employees.emp_no = titles.emp_no;