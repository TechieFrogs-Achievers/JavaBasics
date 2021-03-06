create TABLE details
(
    first_name VARCHAR(50) not null,
    last_name VARCHAR(50) null,
    addre VARCHAR(50),
    dob DATETIME,
    phone bigint,

); 

SELECT *From details 

INSERT INTO details(first_name,last_name,addre,dob,phone)
VALUES ('mohana','kemisetti','hyd','26-april-1999',9491900528);


INSERT INTO details(first_name,last_name,addre,dob,phone)
VALUES ('ramya','kondapalli','kolakata','1-nov-1999',9990900528);

INSERT INTO details(first_name,last_name,addre,dob,phone)
VALUES ('sreeja','majeti','kkd','28-april-1999',9499090528);

INSERT INTO details(first_name,last_name,addre,dob,phone)
VALUES ('Durga','baddela','hyd','25-dec-1998',9478900528);

INSERT INTO details(first_name,last_name,addre,dob,phone)
VALUES ('neeraja','Bejawada','nzd','20-april-1999',9491900528);

ALTER TABLE details
ADD
---education VARCHAR(50) null
percentages int

INSERT INTO details(first_name,last_name,addre,dob,phone,percentages,Branch)
VALUES ('mohana','kemisetti','hyd','26-april-1999',9491900528,90,'');

ALTER TABLE details
ADD Branch VARCHAR(50) DEFAULT 'ECE'; 

ALTER TABLE details 
ALTER COLUMN Branch VARCHAR(255)

ALTER TABLE details
ADD  Branchh VARCHAR(70)  DEFAULT 'ECE'; 

ALTER TABLE details
DROP COLUMN Branchh;

SELECT first_name,phone
FROM details 

SELECT DISTINCT first_name,last_name
FROM details 

SELECT DISTINCT first_name,last_name,addre
from details
WHERE addre = 'hyd';

ALTER TABLE details
ADD salary int 

UPDATE details
SET Branch= 'ECE'


SELECT * FROM details WHERE salary = 45000; 

SELECT * from details WHERE salary >= 40000;

SELECT * FROM details WHERE first_name = 'mohana';

SELECT * FROM details 
WHERE salary BETWEEN 40000 AND 45000

SELECT * FROM details
WHERE first_name LIKE 'mo%'

SELECT * FROM details
WHERE first_name LIKE '%e%'

SELECT * FROM details
WHERE last_name LIKE '[a-e]%'

SELECT * FROM details

SELECT first_name,last_name
FROM details
WHERE percentages   IS NOT  Null

SELECT * FROM details
WHERE addre = 'hyd' AND first_name ='mohana'

SELECT * FROM details
WHERE addre ='hyd' OR first_name = 'Durga'

SELECT * FROM details
WHERE NOT addre ='hyd'

SELECT addre as addresss
FROM details
































