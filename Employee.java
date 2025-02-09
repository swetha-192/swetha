public class Employee {

private String name;

private int age;

private double salary;

// Constructor

public Employee (String name, int age, double salary) {

this.name = name;

this.age = age;

this.salary = salary;

}


// Method to display employee details

public void displayDetails() {

System.out.println("Name: " + name);

System.out.println("Age: " + age);

System.out.println("Salary:" + salary);

}

// Method to calculate employee bonus 

public double calculateBonus(Double bonusPercentage) {

return salary * (bonusPercentage /100);

}

public static void main(String[] args) {

// Create an Employee object

Employee employee = new

Employee("John Doe", 30, 50000.0);

// Invoke methods

employee.displayDetails();

Double bonus = employee.calculateBonus(10.0);

System.out.println("Bonus: " + bonus);

}

}