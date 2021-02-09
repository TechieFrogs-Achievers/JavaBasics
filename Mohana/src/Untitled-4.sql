
CREATE TABLE Employees
(
    emp_id int not null,
    emp_name VARCHAR(50) not null,
    emp_dep VARCHAR(50),
    emp_Address VARCHAR(50),
    emp_DoB  DATETIME,
    emp_salary int,
);
---to show the contents of table
SELECT * FROM Employees; 

---inserting values into table

INSERT INTO Employees(emp_id,emp_name,emp_dep,emp_Address,emp_DoB,emp_salary)
VALUES (1,'Mohana','IT','HYD','26-april-1999',30000);

INSERT INTO Employees(emp_id,emp_name,emp_dep,emp_Address,emp_DoB,emp_salary)
VALUES (2,'Sam','HR','HYD','28-april-1999',35000);

INSERT INTO Employees(emp_id,emp_name,emp_dep,emp_Address,emp_DoB,emp_salary)
VALUES (3,'Candy','HR','Vizag','7-may-1998',35000);

INSERT INTO Employees(emp_id,emp_name,emp_dep,emp_Address,emp_DoB,emp_salary)
VALUES (4,'Lakshmi','Frontend','Rjy','20-june-1999',50000);

INSERT INTO Employees(emp_id,emp_name,emp_dep,emp_Address,emp_DoB,emp_salary)
VALUES (5,'Roy','Backend','Vijayawada','7-july-1997',40000);

---updating values in table
UPDATE Employees
SET emp_name = 'swapna',emp_dep ='IT'
WHERE emp_id = 3;
 
---deleting values in table
DELETE From Employees 
WHERE emp_id = 5;
