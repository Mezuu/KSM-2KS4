public class Main{
    public static void main(String[] args){
        // Code di bawah akan menghasilkan error
        // Person myPerson1 = new Person("Ahmad", 20);
        // System.out.println(String.format("Nama myPerson1 : %s", myPerson1.name));
        // System.out.println(String.format("Umur myPerson1 : %s", myPerson1.age));
        // System.out.println(String.format("Hello myPerson1 : %s", myPerson1.sayHello()));
        // System.out.println(myPerson1.toString());

        // Code yang benar
        Person myPerson2 = new Person("Beni", 21);
        System.out.println(String.format("Nama myPerson2 : %s", myPerson2.getName()));
        System.out.println(String.format("Umur myPerson2 : %s", myPerson2.getAge()));
        System.out.println(String.format("Hello myPerson2 : %s", myPerson2.sayHello()));
        System.out.println(myPerson2.toString());
    }
}