package CompanyModel;

public class Ceo extends Employees {
    public Ceo(int id, String name, String position, int numOfDaysWorked){
        super(003, "charles", "cleaner", 20);
        this.employeeId = id;
        this.employeeName = name;
        this.employeePosition = position;
        this.numOfDaysWorked = numOfDaysWorked;
    }
    public void Hire(Applicant app){
        if(app.yearsOfExperience >= 3){
            System.out.println("hire");
        } else{
            System.out.println("not hired");
        }
    }
    public void Fire(Employees fired) {

    }
}
