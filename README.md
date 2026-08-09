Third PRD — CampusTrack: Student Result Management System
Project Overview

CampusTrack is a beginner-friendly Java console application designed to manage the academic result, attendance, and semester fee status of one student.

The application accepts student details, course selection, marks for three subjects, attendance percentage, and fee payment. It validates the input, calculates the academic result, assigns a grade, checks attendance and fee status, and finally displays a complete semester report.

Project Details
Project Type: Individual Java Console Application
Repository Name: Third-PRD
Difficulty: Beginner
Programming Language: Java
Input: Runtime input using Scanner
Students Handled: One student per execution
Database: Not used
Features

The CampusTrack application performs the following tasks:

Reads student ID, name, and age.
Validates the student's age.
Provides a course selection menu.
Assigns the course and semester fee using switch.
Accepts Java, SQL, and Aptitude marks.
Validates all marks between 0 and 100.
Calculates total marks and average.
Determines whether the student passed all subjects.
Assigns a grade using if-else-if.
Validates attendance percentage.
Determines attendance status using a ternary operator.
Accepts the amount of semester fee paid.
Calculates the remaining fee balance.
Determines fee status using a ternary operator.
Determines the final semester status.
Displays individual reasons when the semester is not cleared.
Concepts Used
Java Concepts
Java program structure
Variables
Primitive data types
String
Scanner
Arithmetic operators
Relational operators
Logical operators
if
else if
else
switch
Ternary operator
while loop
print
println
printf
Concepts Not Used

This project intentionally does not use:

Arrays
Collections
User-defined methods
Additional classes
Constructors
Exception handling
File handling
Database connectivity
Inheritance
Streams
Lambda expressions
GUI
Web development

The complete program is written inside the main method.

Application Flow
START

Display CampusTrack heading

Read Student ID
Read Student Name
Read and validate Age

Display Course Menu
Read and validate Course Choice
Use switch to assign Course and Semester Fee

Read and validate Java Marks
Read and validate SQL Marks
Read and validate Aptitude Marks

Calculate Total Marks
Calculate Average

Check individual subject results
Determine Academic Result
Determine Grade

Read and validate Attendance
Determine Attendance Status

Read and validate Fee Paid
Calculate Fee Balance
Determine Fee Status

Determine Final Semester Status

Display Complete Student Report

Display Reasons if Semester is Not Cleared

STOP
Course Details
Course Choice	Course	Semester Fee
1	BCA	₹30,000
2	B.Sc Computer Science	₹35,000
3	B.E/B.Tech	₹50,000
Academic Rules
Subject Pass Mark

Each subject requires a minimum of 35 marks.

The three subjects are:

Java
SQL
Aptitude

The student passes the academic requirement only when all three subjects have at least 35 marks.

Java >= 35
AND
SQL >= 35
AND
Aptitude >= 35
Grade System
Condition	Grade
Any subject below 35	F
Average >= 75	A
Average >= 60	B
Average >= 50	C
Average < 50	D

A failed subject always results in F, even if the overall average is high.

Attendance Rules

Attendance must be between 0 and 100.

Attendance >= 75

Attendance status:

SUFFICIENT
SHORTAGE

Attendance of exactly 75% is accepted.

Fee Rules

The fee paid must be:

0 or more
AND
not greater than the semester fee

Fee balance:

Fee Balance = Semester Fee - Fee Paid

Fee status:

Fee Balance == 0
        |
        YES → CLEARED
        |
        NO  → PENDING
Final Semester Status

The semester is cleared only when all three conditions are satisfied:

Academic Result = PASSED
AND
Attendance >= 75
AND
Fee Balance = 0

Otherwise:

SEMESTER NOT CLEARED
Validation

The application validates the following inputs using while loops.

Age

Valid range:

16 to 30
Course Choice

Valid choices:

1 to 3
Subject Marks

Valid range:

0 to 100
Attendance

Valid range:

0 to 100
Fee Paid

Valid when:

0 <= Fee Paid <= Semester Fee
Expected Report
==================================================
              STUDENT SEMESTER REPORT
==================================================
Student ID          :
Student Name        :
Age                 :
Course              :

--------------- ACADEMIC DETAILS -----------------
Java Marks          :
SQL Marks           :
Aptitude Marks      :
Total Marks         :
Average             :
Academic Result     :
Grade               :

--------------- ATTENDANCE DETAILS ---------------
Attendance          :
Attendance Status   :

------------------ FEE DETAILS --------------------
Semester Fee        :
Fee Paid            :
Fee Balance         :
Fee Status          :

---------------- FINAL STATUS ---------------------
Semester Status     :

Reasons:
...
==================================================

The Reasons section is displayed only when the semester is not cleared.

Sample Run
Input
Enter student ID: STU101
Enter student name: Ananya Rao
Enter age: 20

Select Course
1. BCA
2. B.Sc Computer Science
3. B.E/B.Tech

Enter course choice: 3
Enter Java marks: 78
Enter SQL marks: 72
Enter Aptitude marks: 65
Enter attendance percentage: 82
Enter fee paid: 50000
Output
==================================================
              STUDENT SEMESTER REPORT
==================================================
Student ID          : STU101
Student Name        : Ananya Rao
Age                 : 20
Course              : B.E/B.Tech

--------------- ACADEMIC DETAILS -----------------
Java Marks          : 78
SQL Marks           : 72
Aptitude Marks      : 65
Total Marks         : 215/300
Average             : 71.67
Academic Result     : PASSED
Grade               : B

--------------- ATTENDANCE DETAILS ---------------
Attendance          : 82.00%
Attendance Status   : SUFFICIENT

------------------ FEE DETAILS --------------------
Semester Fee        : ₹50000.00
Fee Paid            : ₹50000.00
Fee Balance         : ₹0.00
Fee Status          : CLEARED

---------------- FINAL STATUS ---------------------
Semester Status     : SEMESTER CLEARED
==================================================
Test Cases
Test Case 1: All Conditions Passed
Java Marks     : 78
SQL Marks      : 72
Aptitude Marks : 65
Attendance     : 82%
Fee Paid       : ₹50000

Expected:

Academic Result     : PASSED
Grade               : B
Attendance Status   : SUFFICIENT
Fee Status          : CLEARED
Semester Status     : SEMESTER CLEARED
Test Case 2: One Subject Failed
Java Marks     : 90
SQL Marks      : 30
Aptitude Marks : 90
Attendance     : 85%
Fee Balance    : ₹0

Expected:

Academic Result     : FAILED
Grade               : F
Semester Status     : SEMESTER NOT CLEARED

Reasons:
- SQL marks are below 35.
Test Case 3: Boundary Values
Java Marks     : 35
SQL Marks      : 35
Aptitude Marks : 35
Attendance     : 75%
Fee Balance    : ₹0

Expected:

Average             : 35.00
Academic Result     : PASSED
Grade               : D
Attendance Status   : SUFFICIENT
Fee Status          : CLEARED
Semester Status     : SEMESTER CLEARED
Test Case 4: Attendance Shortage and Pending Fee
Java Marks     : 70
SQL Marks      : 68
Aptitude Marks : 72
Attendance     : 70%
Semester Fee   : ₹30000
Fee Paid       : ₹20000

Expected:

Academic Result     : PASSED
Attendance Status   : SHORTAGE
Fee Balance         : ₹10000.00
Fee Status          : PENDING
Semester Status     : SEMESTER NOT CLEARED

Reasons:
- Attendance is below 75%.
- Semester fee is pending.
Test Case 5: Invalid Input Validation
Enter age: 12
Invalid age. Enter a value between 16 and 30.
Enter age: 20

Enter course choice: 7
Invalid course choice. Enter a value from 1 to 3.
Enter course choice: 1

Enter Java marks: 110
Invalid marks. Enter a value between 0 and 100.
Enter Java marks: 75

Enter attendance percentage: -10
Invalid attendance. Enter a value between 0 and 100.
Enter attendance percentage: 80
Pseudocode

The project pseudocode is available in:

pseudocode/pseudocode.txt

It describes the complete application flow before implementation.

Repository Structure
Third-PRD/
│
├── README.md
│
├── src/
│   └── Main.java
│
├── pseudocode/
│   └── pseudocode.txt
│
└── output/
    ├── semester-cleared-output-01.png
    ├── semester-cleared-output-02.png
    ├── semester-cleared-output-03.png
    └── semester-cleared-output-04.png

    Output Screenshots

The output folder contains screenshots of the Java console execution and demonstrates the program's final results.

Technical Note

The JDK is used to develop and compile the Java program. The Java compiler converts the Java source code into bytecode. The JVM executes the bytecode, allowing Java programs to run on different operating systems that have a compatible JVM.

Learning Outcomes

After completing this project, the learner should be able to:

Use Java variables and data types.
Read runtime input using Scanner.
Apply arithmetic, relational, and logical operators.
Use if-else-if conditions.
Use switch statements.
Validate user input using while loops.
Use ternary operators.
Perform calculations using Java.
Format console output using printf.
Build a complete beginner-level Java console application.
Conclusion

CampusTrack demonstrates how fundamental Java concepts can be combined to create a practical console-based Student Result Management System.

The project provides hands-on practice with input handling, validation, conditional statements, switch, loops, arithmetic calculations, ternary operators, and formatted output.

By completing this project, the learner gains experience in converting a set of functional requirements into a working Java application while maintaining clear program flow and readable output.