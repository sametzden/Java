package javaornek1;

public class Company {
    
    private Employee[] employees = new Employee[5];


    public void addEmployee(int index , Employee employee){
        employees[index] = employee;
    }

    public Employee[] getEmployees(){
        return employees;
    }

    public int calculateTotalSalary(Employee[] employees){
        int totalSalary = 0;
        for(Employee employee : employees){
            totalSalary+= employee.getSalary();
        }
        return totalSalary;
    }

    public Employee findOldestEmployee(Employee[] employees){
        int oldestAge = 0;
        Employee tEmployee = null;
        for(Employee employee : employees){
            int currentAge = employee.getAge();
            if(currentAge > oldestAge){
                oldestAge = currentAge;
                tEmployee = employee;
            }
        }
        return tEmployee;

    }

}
