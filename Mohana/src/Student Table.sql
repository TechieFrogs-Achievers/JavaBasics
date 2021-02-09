CREATE TABLE Students 
(
    student_ID int,
    student_name VARCHAR(255),
    student_Address VARCHAR(255),
    student_DOB datetime,
    city VARCHAR(255),
);

SELECT * FROM Students;

ALTER DATABASE [COLLEGE] MODIFY NAME = [SCHOOL];

INSERT INTO Students (student_ID,student_name,student_Address,student_DOB,city)
VALUES('1','Mohana','Ashoknagar','26-april-1999','HYD');
