package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstname;
    private String lastname;
    private int gradeYear;
    private String studentId;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;

    private static int id = 1000;

    //Constructeur : prompt user to enter name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student firstname : ");
        this.firstname = in.nextLine();

        System.out.print("Enter student lastname : ");
        this.lastname = in.nextLine();

        System.out.println("1 for Freshmen\n2 for Sophomore\n3 for Junior\n4 for Senior\nEnter student grade level : ");
        this.gradeYear = in.nextInt();

        setStudentId();
    }

    //Generate an ID
    private void setStudentId() {
        id++;
        //Grade level + static Id
        studentId = gradeYear +""+  id;
    }

    //Enroll in courses
    public void enroll() {
        //get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enrolle (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else { break; }
        } while (1 != 0);
    }

    //View balance
    public void viewBalance(){
        System.out.println("Your balance is : $" + tuitionBalance);
    }

    //Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    //Show status
    public String toString() {
        return "Student id: " + studentId +
                "\nName: " + firstname + " " + lastname +
                "\nGrade level: " + gradeYear +
                "\nCourses enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }


}
