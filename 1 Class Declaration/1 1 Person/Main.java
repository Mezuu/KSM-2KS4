public class Main{
    public static void main(String[] args){
        Person myPerson1 = new Person("Ahmad", 20);
        System.out.println(String.format("Nama myPerson1 : %s", myPerson1.name));
        System.out.println(String.format("Umur myPerson1 : %s", myPerson1.age));
        System.out.println(String.format("Hello myPerson1 : %s", myPerson1.sayHello()));
        System.out.println(myPerson1.toString());
    }
}