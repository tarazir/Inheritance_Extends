public class Teacher extends Employee {

    public String getClassNumber() {
        return "G-116";
    }

    public String getVacationForm() {
        return "Red";
    }

    public double getSalary() {
        return super.getSalary() + 5_000;
    }
}
