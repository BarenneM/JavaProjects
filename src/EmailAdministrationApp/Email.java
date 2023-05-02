package EmailAdministrationApp;

import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private int defaultPasswordLength;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;

    //Constructor
    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        //System.out.println("firstname : " + firstname + " lastename : " + lastname);

        //Call a method asking for the department
        this.department = this.setDepartment();
        //System.out.println("Department : " + department);

        //Password length
        this.defaultPasswordLength = 8;

        //Call a method the returns a random password
        this.password = this.randomPassword(defaultPasswordLength);
        System.out.println("Your password is : " + this.password);
    }

    //Method that ask for the department
    //Return the department
    private String setDepartment() {
        System.out.println("Department codes : \n1 Sales\n2 Development\n3 Accounting\n0 none\nEnter department code : ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) return "sales";
        else if (depChoice == 2) return "dev";
        else if (depChoice == 3) return "acct";
        else return "";

    }

    //Generate randome password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%*-&";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }

    //Set the mailBoxCapacity

    //Set the alternateEmail

    //Change password

}
