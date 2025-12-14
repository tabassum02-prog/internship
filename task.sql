CREATE TABLE IF NOT EXISTS departments (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS faculty (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    department_id INT REFERENCES departments(id)
);

CREATE TABLE IF NOT EXISTS students (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(50),
    dept_id INT REFERENCES departments(id)
);

CREATE TABLE IF NOT EXISTS courses (
    id SERIAL PRIMARY KEY,
    course_name VARCHAR(50),
    faculty_id INT REFERENCES faculty(id)
);

CREATE TABLE IF NOT EXISTS attendance (
    id SERIAL PRIMARY KEY,
    student_id INT REFERENCES students(id),
    course_id INT REFERENCES courses(id),
    present_days INT,
    total_days INT
);

CREATE TABLE IF NOT EXISTS marks (
    id SERIAL PRIMARY KEY,
    student_id INT REFERENCES students(id),
    course_id INT REFERENCES courses(id),
    marks INT
);

INSERT INTO attendance (id, student_id, course_id, status, date) VALUES
(1, 1, 101, 'Present', '2025-01-10'),
(2, 2, 102, 'Absent', '2025-01-10'),
(3, 3, 103, 'Present', '2025-01-10'),
(4, 4, 101, 'Present', '2025-01-11'),
(5, 5, 102, 'Absent', '2025-01-11'),
(6, 6, 103, 'Present', '2025-01-11'),
(7, 7, 101, 'Present', '2025-01-12'),
(8, 8, 102, 'Present', '2025-01-12'),
(9, 9, 103, 'Absent', '2025-01-12'),
(10, 10, 101, 'Present', '2025-01-12');

INSERT INTO courses (id, course_name, faculty_id) VALUES
(1, 'Data Structures', 201),
(2, 'Operating Systems', 202),
(3, 'Database Management Systems', 203),
(4, 'Computer Networks', 201),
(5, 'Web Development', 204),
(6, 'Artificial Intelligence', 205),
(7, 'Software Engineering', 202),
(8, 'Cloud Computing', 206),
(9, 'Cyber Security', 207),
(10, 'Machine Learning', 205);


INSERT INTO departments (department_id, department_name) VALUES
(101, 'Computer Science'),
(102, 'Information Technology'),
(103, 'Electronics'),
(104, 'Mechanical Engineering'),
(105, 'Civil Engineering'),
(106, 'Electrical Engineering'),
(107, 'Artificial Intelligence'),
(108, 'Data Science'),
(109, 'Cyber Security'),
(110, 'Software Engineering');


INSERT INTO faculty (id, name, department) VALUES
(1, 'Dr. Rajesh Sharma', 'Computer Science'),
(2, 'Prof. Ayesha Khan', 'Information Technology'),
(3, 'Dr. Pravin Patil', 'Electronics'),
(4, 'Prof. Neha Joshi', 'Mathematics'),
(5, 'Dr. Sameer Deshmukh', 'Physics'),
(6, 'Prof. Fatima Shaikh', 'Computer Science'),
(7, 'Dr. Rohan Kulkarni', 'Information Technology'),
(8, 'Prof. Sneha Pawar', 'Electronics'),
(9, 'Dr. Imtiaz Ali', 'Mathematics'),
(10, 'Prof. Priya More', 'Physics');


INSERT INTO marks (id, student_id, course_id, marks) VALUES
(1, 1, 101, 88),
(2, 2, 102, 76),
(3, 3, 103, 92),
(4, 4, 101, 85),
(5, 5, 102, 79),
(6, 6, 103, 90),
(7, 7, 101, 83),
(8, 8, 102, 74),
(9, 9, 103, 95),
(10, 10, 101, 87);




INSERT INTO students (id, name, email, dep_id) VALUES
(1, 'Ayesha Shaikh', 'ayesha.shaikh@example.com', 101),
(2, 'Rahul Patil', 'rahul.patil@example.com', 102),
(3, 'Sneha Deshmukh', 'sneha.deshmukh@example.com', 103),
(4, 'Imran Khan', 'imran.khan@example.com', 101),
(5, 'Priya Joshi', 'priya.joshi@example.com', 102),
(6, 'Aniket Shinde', 'aniket.shinde@example.com', 103),
(7, 'Fatima Ansari', 'fatima.ansari@example.com', 101),
(8, 'Rohan Pawar', 'rohan.pawar@example.com', 102),
(9, 'Zoya Khan', 'zoya.khan@example.com', 103),
(10, 'Aditya More', 'aditya.more@example.com', 101);


SELECT * FROM students;

SELECT * FROM marks;

SELECT * FROM faculty;
 
SELECT * FROM attendance;

SELECT * FROM departments;

SELECT * FROM courses;
 
SELECT * FROM students
WHERE dep_id = 101;
 
SELECT * FROM marks
WHERE student_id = 3;
 
SELECT * FROM faculty
WHERE department = 'Computer Science';
 
SELECT * FROM courses
WHERE faculty_id= 5;
 
SELECT * FROM attendance
WHERE student_id= 1;
 

SELECT * FROM students
WHERE name LIKE 'A%';

SELECT * FROM faculty
WHERE name LIKE 'A%';

SELECT * FROM courses
WHERE course_name LIKE 'A%';

SELECT * FROM marks
WHERE marks BETWEEN 40 AND 80;

SELECT * FROM attendance
WHERE date BETWEEN '2025-01-01' AND '2025-01-15';

SELECT * FROM students
WHERE id BETWEEN 1 AND 5;

SELECT * FROM students
ORDER BY name;

SELECT * FROM marks
ORDER BY marks DESC;

SELECT dep_id, COUNT(*) AS total_students
FROM students
GROUP BY dep_id;

SELECT course_name, COUNT(*) AS total_enrolled
FROM courses
GROUP BY course_name
HAVING COUNT(*) > 2;

SELECT  s.id, s.name, d.department_name
FROM students s
INNER JOIN departments d
ON s.dep_id = d.department_id;

SELECT s.name, m.marks
FROM students s
INNER JOIN marks m
ON s.id = m.student_id;

SELECT c.course_name, f.name AS faculty_name
FROM courses c
INNER JOIN faculty f
ON c.faculty_id = f.id;

SELECT c.course_name, f.name
FROM courses c
LEFT JOIN faculty f
ON c.faculty_id = f.id;

SELECT s.name, a.status, a.date
FROM students s
LEFT JOIN attendance a
ON s.id = a.student_id;

SELECT s.name, m.marks
FROM marks m
RIGHT JOIN students s
ON m.student_id = s.id;

SELECT d.department_name, c.course_name
FROM courses c
RIGHT JOIN departments d
ON c.id = d.department_id;
 
 
 
 