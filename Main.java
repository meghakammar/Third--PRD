
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // --------------------------------------------------
        // FR-01: Welcome Screen
        // --------------------------------------------------
        System.out.println("==================================================");
        System.out.println("                 CAMPUSTRACK");
        System.out.println("==================================================");
        System.out.println("        Simple Student Result Management System");
        System.out.println("--------------------------------------------------");
        System.out.println();

        // --------------------------------------------------
        // FR-02: Read Student Details
        // --------------------------------------------------
        System.out.print("Enter student ID: ");
        String studentId = scanner.next();

        scanner.nextLine();

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        while (age < 16 || age > 30) {
            System.out.println("Invalid age. Enter a value between 16 and 30.");
            System.out.print("Enter age: ");
            age = scanner.nextInt();
        }

        // --------------------------------------------------
        // FR-03: Select Course
        // --------------------------------------------------
        System.out.println();
        System.out.println("Select Course");
        System.out.println("1. BCA");
        System.out.println("2. B.Sc Computer Science");
        System.out.println("3. B.E/B.Tech");
        System.out.println();

        System.out.print("Enter course choice: ");
        int courseChoice = scanner.nextInt();

        while (courseChoice < 1 || courseChoice > 3) {
            System.out.println("Invalid course choice. Enter a value from 1 to 3.");
            System.out.print("Enter course choice: ");
            courseChoice = scanner.nextInt();
        }

        String courseName = "";
        double semesterFee = 0;

        switch (courseChoice) {
            case 1:
                courseName = "BCA";
                semesterFee = 30000;
                break;

            case 2:
                courseName = "B.Sc Computer Science";
                semesterFee = 35000;
                break;

            case 3:
                courseName = "B.E/B.Tech";
                semesterFee = 50000;
                break;

            default:
                System.out.println("Invalid course choice.");
        }

        // --------------------------------------------------
        // FR-04: Read Subject Marks
        // --------------------------------------------------
        System.out.print("Enter Java marks: ");
        int javaMarks = scanner.nextInt();

        while (javaMarks < 0 || javaMarks > 100) {
            System.out.println("Invalid marks. Enter a value between 0 and 100.");
            System.out.print("Enter Java marks: ");
            javaMarks = scanner.nextInt();
        }

        System.out.print("Enter SQL marks: ");
        int sqlMarks = scanner.nextInt();

        while (sqlMarks < 0 || sqlMarks > 100) {
            System.out.println("Invalid marks. Enter a value between 0 and 100.");
            System.out.print("Enter SQL marks: ");
            sqlMarks = scanner.nextInt();
        }

        System.out.print("Enter Aptitude marks: ");
        int aptitudeMarks = scanner.nextInt();

        while (aptitudeMarks < 0 || aptitudeMarks > 100) {
            System.out.println("Invalid marks. Enter a value between 0 and 100.");
            System.out.print("Enter Aptitude marks: ");
            aptitudeMarks = scanner.nextInt();
        }

        // --------------------------------------------------
        // FR-05: Calculate Total and Average
        // --------------------------------------------------
        int totalMarks = javaMarks + sqlMarks + aptitudeMarks;
        double average = totalMarks / 3.0;

        // --------------------------------------------------
        // FR-06: Determine Academic Result
        // --------------------------------------------------
        boolean academicPassed
                = javaMarks >= 35
                && sqlMarks >= 35
                && aptitudeMarks >= 35;

        String academicResult = academicPassed ? "PASSED" : "FAILED";

        // --------------------------------------------------
        // FR-07: Determine Grade
        // --------------------------------------------------
        String grade;

        if (!academicPassed) {
            grade = "F";
        } else if (average >= 75) {
            grade = "A";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else {
            grade = "D";
        }

        // --------------------------------------------------
        // FR-08: Check Attendance
        // --------------------------------------------------
        System.out.print("Enter attendance percentage: ");
        double attendance = scanner.nextDouble();

        while (attendance < 0 || attendance > 100) {
            System.out.println("Invalid attendance. Enter a value between 0 and 100.");
            System.out.print("Enter attendance percentage: ");
            attendance = scanner.nextDouble();
        }

        String attendanceStatus
                = attendance >= 75 ? "SUFFICIENT" : "SHORTAGE";

        // --------------------------------------------------
        // FR-09: Calculate Fee Balance
        // --------------------------------------------------
        System.out.print("Enter fee paid: ");
        double feePaid = scanner.nextDouble();

        while (feePaid < 0 || feePaid > semesterFee) {
            System.out.println("Invalid fee amount. Enter a value between 0 and "
                    + String.format("%.2f", semesterFee) + ".");
            System.out.print("Enter fee paid: ");
            feePaid = scanner.nextDouble();
        }

        double feeBalance = semesterFee - feePaid;

        String feeStatus
                = feeBalance == 0 ? "CLEARED" : "PENDING";

        // --------------------------------------------------
        // FR-10: Determine Final Semester Status
        // --------------------------------------------------
        String semesterStatus
                = academicPassed && attendance >= 75 && feeBalance == 0
                        ? "SEMESTER CLEARED"
                        : "SEMESTER NOT CLEARED";

        // --------------------------------------------------
        // FR-11: Display Complete Student Report
        // --------------------------------------------------
        System.out.println();
        System.out.println("==================================================");
        System.out.println("              STUDENT SEMESTER REPORT");
        System.out.println("==================================================");

        System.out.printf("Student ID          : %s%n", studentId);
        System.out.printf("Student Name        : %s%n", studentName);
        System.out.printf("Age                 : %d%n", age);
        System.out.printf("Course              : %s%n", courseName);

        System.out.println();
        System.out.println("--------------- ACADEMIC DETAILS -----------------");

        System.out.printf("Java Marks          : %d%n", javaMarks);
        System.out.printf("SQL Marks           : %d%n", sqlMarks);
        System.out.printf("Aptitude Marks      : %d%n", aptitudeMarks);
        System.out.printf("Total Marks         : %d/300%n", totalMarks);
        System.out.printf("Average             : %.2f%n", average);
        System.out.printf("Academic Result     : %s%n", academicResult);
        System.out.printf("Grade               : %s%n", grade);

        System.out.println();
        System.out.println("--------------- ATTENDANCE DETAILS ---------------");

        System.out.printf("Attendance          : %.2f%%%n", attendance);
        System.out.printf("Attendance Status   : %s%n", attendanceStatus);

        System.out.println();
        System.out.println("------------------ FEE DETAILS --------------------");

        System.out.printf("Semester Fee        : Rs.%.2f%n", semesterFee);
        System.out.printf("Fee Paid            : Rs.%.2f%n", feePaid);
        System.out.printf("Fee Balance         : Rs.%.2f%n", feeBalance);

        System.out.println();
        System.out.println("---------------- FINAL STATUS ---------------------");

        System.out.printf("Semester Status     : %s%n", semesterStatus);

        // --------------------------------------------------
        // FR-11: Display Exact Reasons
        // --------------------------------------------------
        if (!academicPassed || attendance < 75 || feeBalance > 0) {

            System.out.println();
            System.out.println("Reasons:");

            if (javaMarks < 35) {
                System.out.println("- Java marks are below 35.");
            }

            if (sqlMarks < 35) {
                System.out.println("- SQL marks are below 35.");
            }

            if (aptitudeMarks < 35) {
                System.out.println("- Aptitude marks are below 35.");
            }

            if (attendance < 75) {
                System.out.println("- Attendance is below 75%.");
            }

            if (feeBalance > 0) {
                System.out.println("- Semester fee is pending.");
            }
        }

        System.out.println("==================================================");

        scanner.close();
    }
}
