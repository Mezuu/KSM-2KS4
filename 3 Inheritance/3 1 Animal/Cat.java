public class Cat extends Animal{
    private String sex;

    public Cat(String name, int age, String color, String sex){
        super(name, age, color);
        this.sex = sex;
        legs = 4;
    }
    public String sound(){
        return "Meow!";
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }

    @Override
    public String toString(){
        return String.format("Cat[%s, sex=%s]", super.toString(), sex);
    }
}