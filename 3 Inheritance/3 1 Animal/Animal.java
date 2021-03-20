public class Animal{
    private String name;
    private int age;
    private String color;
    protected int legs;

    public Animal(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
        legs = 0;
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
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getLegs(){
        return legs;
    }
    public void setLegs(int legs){
        this.legs = legs;
    }
    public String toString(){
        return String.format("Animal[name=%s, age=%d, color=%s, legs=%d", name, age, color, legs);
    }
}