public class Person{
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String sayHello(){
        return String.format("Hello, my name is %s", name);
    }
    public String toString(){
        return String.format("Person[name=%s, age=%d]", name, age);
    }
}