use SelectStatements

SELECT * from  Books_Details

SELECT * from Student_Details



ALTER TABLE Books_Details DROP COLUMN Totalbooks_count

ALTER TABLE Books_Details ADD Totalbook_count INT 

SELECT book_id, book_title FROM Books_Details

SELECT DISTINCT  * FROM Student_Details

SELECT distinct book_title FROM Books_Details

SELECT distinct Duration FROM Books_Details where Duration > 15

SELECT * FROM Books_Details WHERE book_title = 'java programming langauge'

SELECT * FROM Books_Details WHERE duration > 12

SELECT * FROM Books_Details WHERE Available_books < 25

SELECT * FROM Student_Details WHERE fine BETWEEN 10 and 25

SELECT * FROM Student_Details WHERE stu_Stream LIKE '%I'

SELECT * FROM Student_Details WHERE stu_Stream LIKE 'E%'

SELECT * FROM Student_Details WHERE stu_Name IN ('Ramya')

SELECT * FROM Student_Details WHERE stu_Stream LIKE 'E__%'

SELECT * FROM Student_Details WHERE stu_Stream LIKE '%__I'

SELECT Totalbooks_count FROM Books_Details WHERE Totalbooks_count IS NULL

SELECT book_Id FROM Books_Details WHERE book_title IS NULL

SELECT book_Id,book_title FROM Books_Details where Available_books >10 AND Duration >15;

SELECT book_author FROM Books_Details where book_issueDate > '1-Feb-2019' OR book_returnDate < '1-May-2019'

SELECT * FROM Student_Details WHERE NOT books_count =4 AND stu_Stream= 'ECE'

SELECT stu_Stream AS stu_BranchName FROM Student_Details

SELECT TOP 5 *  FROM Books_Details

SELECT TOP 50 PERCENT * FROM Books_Details

SELECT TOP 50 PERCENT * FROM Student_Details

SELECT Count(*) from Books_Details

SELECT Count(*) from Student_Details

SELECT AVG(Duration) FROM Books_Details

SELECT SUM(fine) FROM Student_Details

SELECT MIN(books_count) FROM Student_Details

SELECT MAX(fine) FROM Student_Details

SELECT max(fine) as Highest_price FROM Student_Details

SELECT * FROM Books_Details ORDER BY book_title ASC

SELECT * from Student_Details ORDER BY books_count DESC