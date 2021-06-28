package CompanyModel;

public class Accountant extends Employees{
    public Accountant(int id, String name, String position, int numOfDaysWorked) {
        super(003, "charles", "cleaner", 20);
        this.employeeId = id;
        this.employeeName = name;
        this.employeePosition = position;
        this.numOfDaysWorked = numOfDaysWorked;
    }
    public void markAttendance (Employees numOfDaysWorked) {
        if(numOfDaysWorked.numOfDaysWorked >= 26) {
            System.out.println("You're due for the monthly pay");
        } else {
            System.out.println("You will not be paid for the month");
        }
    }
}
