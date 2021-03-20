public class Dog extends Animal{
    private String race;

    public Dog(String name, int age, String color, String race){
        super(name, age, color);
        this.race = race;
        legs = 4;
    }
    public String sound(){
        return "Gukguk!";
    }
    public String getRace(){
        return race;
    }
    public void setRace(String race){
        this.race = race;
    }

    @Override
    public String toString(){
        return String.format("Dog[%s, race=%s]", super.toString(), race);
    }
}