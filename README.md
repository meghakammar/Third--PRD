Third PRD — CampusTrack: Student Academic Management System
1. Project Title

CampusTrack — Student Academic Management System

CampusTrack is a beginner-level Java console application that collects student academic information and generates a semester report.

The application checks:

Student details
Course and semester
Subject marks
Academic result
Attendance
Assignment performance
Scholarship eligibility
Semester fee payment
Final semester clearance

The program uses runtime input through Scanner.

2. Problem Statement

A college needs to check the academic progress of students before allowing them to continue to the next semester.

The CampusTrack application collects student information, marks, attendance, assignment scores and fee payment details.

The program validates the entered values, calculates the required results and displays whether the student is cleared for the next semester.

If the student is not cleared, the program displays the failed conditions and recommendations for improvement.

3. Features
Accept student details using Scanner.
Select a course using a menu.
Validate student age.
Validate semester.
Validate subject marks.
Calculate total marks.
Calculate percentage.
Check individual subject pass marks.
Calculate academic result and grade.
Calculate attendance percentage.
Check attendance status.
Process assignment scores.
Use break for early assignment completion.
Use continue for invalid assignment scores.
Calculate assignment average.
Calculate scholarship percentage.
Calculate scholarship amount.
Calculate final payable fee.
Calculate fee balance.
Check final semester clearance.
Display failed conditions.
Display recommendations.
Process another student using a do-while loop.
4. Concepts Used
Java program structure
Variables
Primitive data types
String
Scanner
Arithmetic operators
Assignment operators
Relational operators
Logical operators
Type casting
if
else if
else
Nested conditions
Compound conditions
switch
Ternary operator
while loop
for loop
do-while loop
break
continue
print
println
printf

No arrays, collections or user-defined methods are used.

5. Input Details
Input	Data Type	Validation
Student ID	String	Required single word
Full Name	String	Complete line
Age	int	15 to 35
Email	String	Single word
Course Choice	int	1 to 5
Semester	int	1 to 8
Career Goal	String	Complete line
Java Marks	int	0 to 100
SQL Marks	int	0 to 100
Web Technology Marks	int	0 to 100
Aptitude Marks	int	0 to 100
Communication Marks	int	0 to 100
Total Classes	int	1 to 300
Classes Attended	int	0 to total classes
Number of Assignments	int	1 to 10
Assignment Score	int	0 to 10 or -1
Amount Paid	double	0 to final payable fee
6. Validation Rules
Age

Age must be between 15 and 35.

If an invalid age is entered, the program asks again.

Course

The course choice must be between 1 and 5.

BCA
B.Sc Computer Science
B.E/B.Tech
MCA
Other

A switch statement is used to select the course and base semester fee.

Semester

Semester must be between 1 and 8.

Subject Marks

Every subject mark must be between 0 and 100.

Total Classes

Total classes must be between 1 and 300.

Classes Attended

Classes attended cannot be greater than total classes.

Assignments

Number of assignments must be between 1 and 10.

Assignment scores can be between 0 and 10.

The value -1 is used to finish assignment entry early.

Fee Payment

Amount paid must be between 0 and the final payable fee.

7. Academic Result Rules

There are five subjects:

Java
SQL
Web Technology
Aptitude
Communication

The minimum pass mark for every subject is 35.

The student passes the academic criteria only when:

Java is 35 or above
SQL is 35 or above
Web Technology is 35 or above
Aptitude is 35 or above
Communication is 35 or above
Percentage is 40 or above
Total Marks

Total marks are calculated from all five subjects.

Percentage

Percentage is calculated from the total marks.

Grade
Condition	Grade
Academic criteria failed	F
Percentage >= 85	A+
Percentage >= 75	A
Percentage >= 65	B
Percentage >= 50	C
Percentage >= 40	D

A student with a failed subject receives grade F even if the overall percentage is high.

8. Attendance Rules

The program collects:

Total classes conducted
Classes attended

Attendance percentage is calculated using classes attended divided by total classes and multiplied by 100.

The attendance criteria is passed when attendance is 75% or above.

Attendance status:

REGULAR when attendance is 75% or above
SHORTAGE when attendance is below 75%

A ternary operator is used to determine the status.

9. Assignment Rules

The user can enter between 1 and 10 assignment scores.

Each score must be between 0 and 10.

The value -1 means finish assignment entry early.

break

When -1 is entered, the assignment loop stops using break.

continue

When an invalid score such as 15 is entered, the entry is skipped using continue.

Invalid scores do not affect the total or average.

The assignment average is calculated using the total of valid assignment scores divided by the number of valid assignments.

If no valid assignment is entered, the assignment average is 0.00.

The assignment criteria is passed when:

Valid assignment count is greater than 0
Assignment average is 5 or above

Assignment status:

SATISFACTORY
NEEDS IMPROVEMENT
10. Scholarship and Fee Rules

The scholarship depends on academic percentage and attendance.

10% Scholarship

The student receives a 10% scholarship when:

Academic criteria is passed
Percentage is 85 or above
Attendance is 85 or above
5% Scholarship

The student receives a 5% scholarship when:

Academic criteria is passed
Percentage is 75 or above
Attendance is 75 or above
No Scholarship

All other cases receive 0% scholarship.

The 10% scholarship condition is checked first.

Scholarship Amount

Scholarship Amount = Base Fee × Scholarship Percentage / 100

Final Payable Fee

Final Payable Fee = Base Fee - Scholarship Amount

Fee Balance

Fee Balance = Final Payable Fee - Amount Paid

Fee status:

PAID when the balance is zero
PENDING otherwise
11. Final Clearance Rules

The student is cleared for the next semester only when all four conditions are satisfied:

Academic criteria passed
Attendance is 75% or above
Assignment criteria passed
Fee balance is zero

If all conditions are satisfied:

CLEARED FOR NEXT SEMESTER

Otherwise:

ACTION REQUIRED

The program checks academic performance, attendance, assignments and fees independently.

12. How to Run
Step 1: Open the Project

Open the Third-PRD folder in VS Code.

Step 2: Open Terminal

Open the VS Code terminal.

Step 3: Compile the Program

Run:

javac Main.java
Step 4: Run the Program

Run:

java Main
 Test Cases
Test Case 1 — All Conditions Passed

Expected results:

Academic Result: PASSED
Grade: A
Attendance Status: REGULAR
Assignment Status: SATISFACTORY
Fee Status: PAID
Semester Clearance: CLEARED FOR NEXT SEMESTER
Test Case 2 — Subject Failed

Marks:

Java: 90
SQL: 90
Web Technology: 90
Aptitude: 30
Communication: 90

Expected:

Total Marks: 390/500
Percentage: 78.00%
Academic Result: FAILED
Grade: F
Semester Clearance: ACTION REQUIRED

Failed condition:

Aptitude marks are below 35.
Test Case 3 — Boundary Values

Input:

All subject marks: 40
Classes conducted: 100
Classes attended: 75
Assignment scores: 5, 5, 5

Expected:

Percentage: 40.00%
Academic Result: PASSED
Grade: D
Attendance Percentage: 75.00%
Attendance Status: REGULAR
Assignment Average: 5.00
Assignment Status: SATISFACTORY
Semester Clearance: CLEARED FOR NEXT SEMESTER
Test Case 4 — Attendance Shortage and Pending Fee

Input:

Classes conducted: 100
Classes attended: 70
Assignment scores: 7, 7, 7
Amount paid: 20000

Expected:

Attendance Percentage: 70.00%
Attendance Status: SHORTAGE
Fee Status: PENDING
Semester Clearance: ACTION REQUIRED

Failed conditions:

Attendance is below 75%.
Semester fee is pending.
Test Case 5 — continue and break

Assignment input:

5
8
15
6
-1

Expected:

Valid Assignments: 3
Assignment Total: 19
Assignment Average: 6.33
Assignment Status: SATISFACTORY

The score 15 is skipped using continue.

The score -1 stops the loop using break.

Test Case 6 — No Valid Assignment

Assignment input:

3
15
12
-1

Expected:

Valid Assignments: 1
Assignment Total: 3
Assignment Average: 3.00
Assignment Status: NEEDS IMPROVEMENT
Semester Clearance: ACTION REQUIRED
Test Case 7 — Ten Percent Scholarship

Use:
Course: MCA
Percentage: 88.80%
Attendance: 90.00%
Base Fee: ₹45000

Expected:

Scholarship Percentage: 10%
Scholarship Amount: ₹4500.00
Final Payable Fee: ₹40500.00
Test Case 8 — Invalid Input Re-entry

The program should correctly handle:

Invalid age followed by a valid age
Invalid course followed by a valid course
Invalid marks followed by valid marks
Invalid total classes followed by valid total classes
Classes attended greater than total classes followed by valid attendance
14. Project Structure

Third-PRD/

Main.java
README.md
output/
    sample-output.txt
15. Sample Output

STUDENT SEMESTER REPORT

Student ID : STU101
Student Name : Ananya Rao
Age : 20
Email : ananya@gmail.com
Course : B.E/B.Tech
Semester : 4
Career Goal : Become a Java backend developer

ACADEMIC SUMMARY

Java Marks : 88
SQL Marks : 82
Web Technology Marks : 79
Aptitude Marks : 76
Communication Marks : 80
Total Marks : 405/500
Percentage : 81.00%
Academic Result : PASSED
Grade : A

ATTENDANCE SUMMARY

Classes Conducted : 120
Classes Attended : 102
Attendance Percentage : 85.00%
Attendance Status : REGULAR

ASSIGNMENT SUMMARY

Valid Assignments : 5
Assignment Total : 41
Assignment Average : 8.20
Assignment Status : SATISFACTORY

FEE SUMMARY

Base Semester Fee : ₹50000.00
Scholarship Percentage : 5%
Scholarship Amount : ₹2500.00
Final Payable Fee : ₹47500.00
Amount Paid : ₹47500.00
Fee Balance : ₹0.00
Fee Status : PAID

FINAL STATUS

Semester Clearance : CLEARED FOR NEXT SEMESTER

FAILED CONDITIONS

None

RECOMMENDATIONS

Maintain the current performance in the next semester.


CampusTrack demonstrates the use of core Java programming concepts to solve a real-world student academic management problem.

The project uses runtime input, validation, calculations, conditions, loops, switch, ternary operators, break and continue.

It generates a complete semester report and determines whether the student is cleared for the next semester.