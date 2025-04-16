public class Dcis {                               //Must have a public class
      private String name;
      private String department;

  public Dcis() {                       //Must have a public default constructor
    }
  public Dcis(String name,String department) {
       this.name = name;
       this.department = department;
}
   public String getName() {                      //Getter for name
     return name;
}
   public void setName(String newName) {           //Setter for name
     this.name = newName;
}
  public String getDepartment() {                 //Getter for department
    return department;
}
  public void setDepartment(String newDepartment) {     //Setter for department
  this.department = newDepartment;
}
    public static void main(String[] args) {
        Dcis.setName = ("Jack");
        Dcis.setDepartment = ("QA");
    }
         System.out.println("Name:"+Dcis.setName());
         System.out.println("Department:"+Dcis.setName());
}



















































































/*ublic class DCIS {
         private String name;
         private String department;
}
    public DCIS() {
    }
   public DCIS(String name,String department) {
   this.name = name;
   this.department = department;
}
  public String getName() {
  this
*/
/*
Employee emp1 = new Employee();
emp1.setName = ("Angel");
emp1.setDepartment =("Engineering");

Employee emp2 = new Employee();
emp2.setName = ("Raj");
emp2.setDepartment = ("QA");

Employee emp3 = new Employee();
emp3.setName = ("Vaishnavi");
emp3.setDepartment =("Engineering");

Employee emp4 = new Employee();
emp4.setName = ("Bala");
emp4.setDepartment = ("QA");
}
 }
}*/