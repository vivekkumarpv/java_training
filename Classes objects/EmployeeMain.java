class Employee{
    String employeeName;
    int employeeId;
    String email;
    public void printEmployee(){
        System.out.println("Employee name: "+employeeName);
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Employee Email: "+email);
    }
}
class EmployeeMain{
    public static void main (String[]args){
        Employee e1=new Employee();
        e1.employeeName="Vivek Kumar";
        e1.employeeId= 248784;
        e1.email="vivekkumar@ust.com";
        Employee e2= new Employee();
        e2.employeeName="anagha";
        e2.employeeId= 12345;
        e2.email="anagha@ust.com";
        e1.printEmployee();
        e2.printEmployee();
        


    }
}