public class Main{
    public static void main(String[] args){
        Employee myEmployee1 = new Employee("Dadang", 41);
        System.out.println(String.format("Nama myEmployee1 : %s", myEmployee1.getName()));
        System.out.println(String.format("Umur myEmployee1 : %d", myEmployee1.getAge()));
        System.out.println(String.format("Gaji myEmployee1 : %.1f", myEmployee1.getSalary()));
        System.out.println(String.format("Jam kerja myEmployee1 : %.1f", myEmployee1.getWorkHours()));
        System.out.println(myEmployee1.toString() + "\n");

        Employee myEmployee2 = new Employee("Dodi", 42, 24);
        System.out.println(String.format("Nama myEmployee2 : %s", myEmployee2.getName()));
        System.out.println(String.format("Umur myEmployee2 : %d", myEmployee2.getAge()));
        System.out.println(String.format("Gaji myEmployee2 : %.1f", myEmployee2.getSalary()));
        System.out.println(String.format("Jam kerja myEmployee2 : %.1f", myEmployee2.getWorkHours()));
        System.out.println(myEmployee2.toString() + "\n");

        Employee myEmployee3 = new Employee("Deni", 43, 23, 20.5);
        System.out.println(String.format("Nama myEmployee3 : %s", myEmployee3.getName()));
        System.out.println(String.format("Umur myEmployee3 : %d", myEmployee3.getAge()));
        System.out.println(String.format("Gaji myEmployee3 : %.1f", myEmployee3.getSalary()));
        System.out.println(String.format("Jam kerja myEmployee3 : %.1f", myEmployee3.getWorkHours()));
        System.out.println(myEmployee3.toString());
    }
}