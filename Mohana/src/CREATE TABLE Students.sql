CREATE TABLE Students
(
    std_id int not null,
    std_name VARCHAR(50) not null,
    std_Dob DATETIME,
    std_Adress VARCHAR(50),
    std_sec VARCHAR(50),
); 

SELECT * From Students; 

INSERT INTO Students (std_id,std_name,std_Dob,std_Adress,std_sec)
VALUES(10,'Mohana','26-april-1999','Hyd','A');

INSERT INTO Students (std_id,std_name,std_Dob,std_Adress,std_sec)
VALUES(11,'Lakshmi','26-may-1999','vizag','B');

INSERT INTO Students (std_id,std_name,std_Dob,std_Adress,std_sec)
VALUES(12,'Sweety','28-feb-1998','rjy','A');

INSERT INTO Students (std_id,std_name,std_Dob,std_Adress,std_sec)
VALUES(13,'Sam','28-april-1999','Hyd','C');

INSERT INTO Students (std_id,std_name,std_Dob,std_Adress,std_sec)
VALUES(14,'Chay','14-april-1999','Kakinada','C');

UPDATE Students
SET std_name = 'swapna'
WHERE std_id = 12;

DELETE From Students
WHERE Std_id = 12;