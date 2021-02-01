// Programmer: Mr. Tarazi, ASK HS Technology Teacher
// Date: February 1st, 2021
// Objective: A Java Program to demonstrate concept of Inheritance and Super Keyword.

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Methods for the Employee Object
        Employee emp1 = new Employee();
        System.out.println("Employee Working hours: " + emp1.getHours());
        System.out.println("Employee Salary: " + emp1.getSalary());
        System.out.println("Employee Vacation Days: " + emp1.getVacationDays());
        System.out.println("Employee Vacation Form: " + emp1.getVacationForm());

        Teacher tch1 = new Teacher();
        System.out.println(tch1.getSalary());
        System.out.println(tch1.getVacationForm());
        System.out.println(tch1.getClassNumber());
    }
}
