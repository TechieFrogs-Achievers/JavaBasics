USE SelectStatements

CREATE TABLE Books_Details
(
    book_Id VARCHAR(50) NOT NULL,
    book_title VARCHAR(100) NOT NULL,
    book_author varchar(100) NOT NULL,
    Totalbooks_count int NULL,
    Available_books INT,
    book_issueDate DATETIME,
    book_returnDate DATETIME,
    pay_fine FLOAT,
    book_student VARCHAR(100) NOT NULL,
    Duration int NULL,
);

CREATE TABLE Student_Details
(
    stu_Id INT NOT NULL,
    stu_Name VARCHAR(50) NOT NULL,
    stu_Stream VARCHAR(50) NULL,
    books_count INT NULL,
    fine FLOAT,
);

--Few records for book details table
INSERT into Books_Details
(book_Id,book_title,book_author,Totalbooks_count,Available_books,book_issueDate,
book_returnDate,pay_fine,book_student,Duration)
values('1872F','C-langauge','BalaGuruswamy',42,14,'12-mar-2019','21-mar-2019',0.0,'Joel',10);

INSERT into Books_Details
(book_Id,book_title,book_author,Totalbooks_count,Available_books, book_issueDate,
book_returnDate,pay_fine,book_student,Duration)
values('2624J','java programming langauge','Nageswara rao',55,9,'7-Nov-2019','21-Nov-2019',15.0,'Manish',14);

INSERT into Books_Details
(book_Id,book_title,book_author,Totalbooks_count,Available_books, book_issueDate,
book_returnDate,pay_fine,book_student,Duration)
values('4251A','Analog electronics','L.K.Maheswari',36,10,'26-Apr-2019','11-May-2019',5.0,'Sai',16);

INSERT into Books_Details
(book_Id,book_title,book_author,Totalbooks_count,Available_books, book_issueDate,
book_returnDate,pay_fine,book_student,Duration)
values('2431M','Micro Processors','D.A.Godse',20,10,'18-Jan-2019','21-Feb-2019',80.0,'Harsha',28);

INSERT into Books_Details
(book_Id,book_title,book_author,Totalbooks_count,Available_books, book_issueDate,
book_returnDate,pay_fine,book_student,Duration)
values('8261X','Surveying','N.N.Basak',17,6,'12-Mar-2019','25-Mar-2019',0.0,'Darwin',15);

INSERT into Books_Details
(book_Id,book_title,book_author,Totalbooks_count,Available_books, book_issueDate,
book_returnDate,pay_fine,book_student,Duration)
values('645B','Engineering Drawing','P.s.Gill',60,17,'11-Mar-2019','22-Mar-2019',0.0,'Adhi',11);

INSERT into Books_Details
(book_Id,book_title,book_author,Totalbooks_count,Available_books, book_issueDate,
book_returnDate,pay_fine,book_student,Duration)
values('645M','Engineering Drawing','P.s.Gill',60,15,'5-July-2019','25-July-2019',25.0,'Lovely',20);

INSERT into Books_Details
(book_Id,book_title,book_author,Totalbooks_count,Available_books, book_issueDate,
book_returnDate,pay_fine,book_student,Duration)
values('2431A','Micro Processors','D.A.Godse',20,12,'20-jan-2019','10-Feb-2019',35.0,'Harsha',22);

INSERT into Books_Details
(book_Id,book_title,book_author,Totalbooks_count,Available_books,book_issueDate,
book_returnDate,pay_fine,book_student,Duration)
values('1872O','C-langauge','BalaGuruswamy',42,5,'12-Aug-2019','20-Aug-2019',0.0,'Yamini',8);

INSERT into Books_Details
(book_Id,book_title,book_author,Totalbooks_count,Available_books, book_issueDate,
book_returnDate,pay_fine,book_student,Duration)
values('2624P','java programming langauge','Nageswara rao',55,18,'1-Dec-2019','21-Dec-2019',30.0,'Manish',21);

--few records for students details table
INSERT into Student_Details
(stu_Id,stu_Name,stu_Stream,books_count,fine)
VALUES (407,'Ramya','ECE',4,12.0)

INSERT into Student_Details
(stu_Id,stu_Name,stu_Stream,books_count,fine)
VALUES (512,'Priyanka','CSE',6,46.0)

INSERT into Student_Details
(stu_Id,stu_Name,stu_Stream,books_count,fine)
VALUES (347,'Swathi','AGRI',6,23.0)

INSERT into Student_Details
(stu_Id,stu_Name,stu_Stream,books_count,fine)
VALUES (424,'Mohana','ECE',1,0.0)

INSERT into Student_Details
(stu_Id,stu_Name,stu_Stream,books_count,fine)
VALUES (506,'jameema','CSE',3,8.0)

INSERT into Student_Details
(stu_Id,stu_Name,stu_Stream,books_count,fine)
VALUES (577,'Yamini','CSE',4,14.0)

INSERT into Student_Details
(stu_Id,stu_Name,stu_Stream,books_count,fine)
VALUES (332,'Divya','AGRI',6,37.0)

INSERT into Student_Details
(stu_Id,stu_Name,stu_Stream,books_count,fine)
VALUES (589,'Alkehya','CSE',4,8.0)

INSERT into Student_Details
(stu_Id,stu_Name,stu_Stream,books_count,fine)
VALUES (410,'Neeraja','ECE',6,13.0)

INSERT into Student_Details
(stu_Id,stu_Name,stu_Stream,books_count,fine)
VALUES (550,'Bindhu','CSE',3,12.0)

INSERT into Student_Details
(stu_Id,stu_Name,stu_Stream,books_count,fine)
VALUES (490,'Sasi','ECE',4,6.0)

INSERT into Student_Details
(stu_Id,stu_Name,stu_Stream,books_count,fine)
VALUES (333,'Mounika','AGRI',2,4.0)

INSERT into Student_Details
(stu_Id,stu_Name,stu_Stream,books_count,fine)
VALUES (476,'Satya','ECE',1,0.0)

INSERT into Student_Details
(stu_Id,stu_Name,stu_Stream,books_count,fine)
VALUES (555,'Shirin','CSE',2,0.0)

INSERT into Student_Details
(stu_Id,stu_Name,stu_Stream,books_count,fine)
VALUES (598,'Teja','CSE',5,11.0)

INSERT into Student_Details
(stu_Id,stu_Name,stu_Stream,books_count,fine)
VALUES (534,'Prasanthi','CSE',3,5.0)


