import java.time.LocalDate;


public class Employee_details extends Person{
    String emp_id;
    double salary;
    public Employee_details(String name,LocalDate dob,String emp_id,double salary){
      super(name,dob);
        this.emp_id=emp_id;
        this.salary=salary;
    }
     public void displayDetails(){
        System.out.println("Emp_id:"+emp_id);
        System.out.println("Salary:"+salary);
     }
     public static void main(String[] args){
   
        LocalDate dob=LocalDate.of(2000, 05, 24);
        Employee_details e1=new Employee_details("Keerthi",dob,"ED101",60000.5);
        e1.display();
        LocalDate currDate=LocalDate.now();     
        e1.displayAge(currDate);
        e1.displayDetails();
     }
}