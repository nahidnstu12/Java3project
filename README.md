## This is 3 JAVA project during University project Assignment.

1. Bus Management

2. Library mangement

3. Pong

  

## Bus Management

- DB - busmanagement
- Table Names (4)
   - ticket_table(source,destination,busno,name,age,gender)
   - employee(emp_id,name,role)
   - route(rid,station,distance,arrival,departure)
   - bus( busno,name,route,seat,driver,superviser )
- utility tools
-  - java.sql.DriverManager
   - net.proteanit.sql.DbUtils

## Library Management

- DB - librarynew
- Table Names
  - Book(Book_ID,Book_Name,Edition,publisher,Author_Name,Page,Price, Availablity )
  - account(Username,Name,password,sec_Q,Answer)
  - student(Student_ID,Name,Roll_no,Phone,Department,Session,Year)
  - book(Book_ID,Book_Name,Edition,Publisher,Author_Name,Page,Price)
  - issue(Student_ID,Book_ID,Book_Name,Availablity,Edition,Publisher,Author_name,Page,Price,Name,Roll_no,Phone,Department,Session,Year,DateOfIssue, date_of_return)
  - returnbook(Student_ID,Name,Roll_no,Phone,Department,Session,Year,Book_ID,Book_name,Edition,publisher,Page,Price,DateOfIssue,ReturnDate)
- utility tools
  - java.sql.DriverManager
  - net.proteanit.sql.DbUtils
  - JCalender 
  - itextpdf
  
  
 