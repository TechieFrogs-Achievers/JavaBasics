use SampleDB

CREATE TABLE Employess_tbl
(
    empId INT NOT NULL,
    empName VARCHAR(50) NOT NULL,
    empAddress VARCHAR(50),
    empJoiningDate DATETIME,
    empSalary INT,
    empRole VARCHAR(50) NULL,
);

CREATE TABLE Student_tabl
(
    studentID INT NOT NULL,
    studentFirstName VARCHAR(50) NOT NULL,
    studentLastName VARCHAR(50) NOT NULL,
    studentAddress VARCHAR(50),
    studentAge INT NULL,
    studentJoiningDate DATETIME,
);

CREATE table dummyTablenew
(
    dummyId INT NOT NULL,
    dummyname VARCHAR(50) NOT NULL,
    age VARCHAR(50) null,
    newage VARCHAR(50),
);

insert into dummyTablenew
(dummyId,newage,dummyname,age)
VALUES(1,32,'rama',33)

SELECT * from dummyTablenew

insert into dummyTablenew 
(dummyId,dummyname,age,newage)
VALUES (2,'haha',34,92)

DELETE dummyTablenew 
WHERE dummyId =1

SELECT * from Employess_tbl

SELECT * from Student_tabl

Select count(*) from Employess_tbl

--create few records in employee table
INSERT into Employess_tbl
(empId,empName,empAddress,empJoiningDate,empSalary,empRole)
VALUES(1,'Joel','HYD','12-may-2013',30000,'Accountant');

INSERT into Employess_tbl
(empId,empName,empAddress,empJoiningDate,empSalary,empRole)
VALUES(2,'Neha','Madhapur','24-Dec-2015',35000,'manager');

INSERT into Employess_tbl
(empId,empName,empAddress,empJoiningDate,empSalary,empRole)
VALUES(3,'shalini','Ameerpet','1-Nov-2012',42000,'Developer');

INSERT into Employess_tbl
(empId,empName,empAddress,empJoiningDate,empSalary,empRole)
VALUES(4,'Ramya','HiTech city','16-jan-2013',47000,'HR manager');

--create few records in student table
INSERT into Student_tabl
(studentID,studentFirstName,studentLastName,studentAddress,studentAge,studentJoiningDate)
VALUES(401,'Ramya','Kondapalli','Anagara',22,'26-june-2014');

INSERT into Student_tabl
(studentID,studentFirstName,studentLastName,studentAddress,studentAge,studentJoiningDate)
VALUES(402,'Prasanthi','pinjerla','KKd',12,'15-may-2015');

INSERT into Student_tabl
(studentID,studentFirstName,studentLastName,studentAddress,studentAge,studentJoiningDate)
VALUES(403,'Sowmya','Pithucka','Rajahmundry',23,'8-mar-2011');

update Employess_tbl
set empAddress='Jubli hills'
WHERE empId= 3

UPDATE Employess_tbl
set empSalary = 50000
WHERE empId = 4

UPDATE Student_tabl
set studentAge = 24
WHERE studentID = 402

UPDATE  Student_tabl
set studentJoiningDate = '8-Dec-2016'
WHERE studentID = 403

SELECT * from Employess_tbl WHERE empid= 2
DELETE from Employess_tbl
WHERE empId = 3

SELECT * FROM Student_tabl WHERE studentID = 403
DELETE from Student_tabl 
WHERE studentID = 403
