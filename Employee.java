import java.io.*;


public class Employee {
    String name;
    
    //Constructor
    Employee(String name){
        this.name=name;

    }
    void  display (){
        IO.print("name:"+name);
    }
    public  static  void main(String[]args){
        Employee e1= new Employee("john");
        e1.display();
    }
}
