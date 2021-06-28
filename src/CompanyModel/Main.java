package CompanyModel;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        //objects of the company class
        Company companyName = new Company();
        Company companyAddress = new Company();



        //object of the Ceo class
        Ceo ceo = new Ceo(001,"Richard", "CEO", 30);

        System.out.println(ceo.employeeName);
        System.out.println(companyAddress.companyAddress);
        System.out.println(companyName.companyName);

        //object of the Accountant class
        Accountant accountant = new Accountant(002,"tolu","Acoountant",26);
        Employees cleaner = new Employees(003,"Charles", "Cleaner", 20);
        Applicant first = new Applicant("David","Clerk", 5);
        Applicant second = new Applicant("paul","Secretary", 2);
        Applicant third = new Applicant("peter","cleaner", 3);
        ArrayList<String> employee = new ArrayList<>();
        employee.add(ceo.employeeName);
        employee.add(accountant.employeeName);
        employee.add(cleaner.employeeName);
        ceo.Hire(first);
        ceo.Hire(second);
        ceo.Hire(third);
        accountant.markAttendance(ceo);
        accountant.markAttendance(accountant);
        accountant.markAttendance(cleaner);
        //System.out.println("Welcome to " + companyName + " located at " + companyAddress);
    }
}
