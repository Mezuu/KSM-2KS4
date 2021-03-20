public class Employee{
    private String name;
    private int age;
    private double salary;
    private double workHours;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
        salary = 20;
        workHours = 37.5;
    }
    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
        workHours = 37.5;
    }
    public Employee(String name, int age, double salary, double workHours){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workHours = workHours;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getWorkHours(){
        return workHours;
    }
    public void setWorkHours(double workHours){
        this.workHours = workHours;
    }
    public String toString(){
        return String.format("Employee[name=%s, age=%d, salary=%.1f, workHours=%.1f]", name, age, salary, workHours);
    }
}