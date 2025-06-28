package javaornek1;

public class Employee extends Person{
    private int salary;

    public Employee(String name, int age , int salary){
        super(name, age);
        this.salary = salary;
    }

    public void setSalary(int newSalary){
        salary = newSalary;
    }

    public int getSalary(){
        return salary;
    }
}
