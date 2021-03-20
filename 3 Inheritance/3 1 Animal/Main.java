public class Main{
    public static void main(String[] args){
        Dog myDog = new Dog("Cilok", 3, "Coklat", "Chihuahua");
        System.out.println(String.format("Nama myDog : %s", myDog.getName()));
        System.out.println(String.format("Umur myDog : %d", myDog.getAge()));
        System.out.println(String.format("Warna myDog : %s", myDog.getColor()));
        System.out.println(String.format("Kaki myDog : %d", myDog.getLegs()));
        System.out.println(String.format("Ras myDog : %s", myDog.getRace()));
        System.out.println(myDog.toString() + "\n");

        Cat myCat = new Cat("Cimol", 3, "Coklat", "Cewek");
        System.out.println(String.format("Nama myCat : %s", myCat.getName()));
        System.out.println(String.format("Umur myCat : %d", myCat.getAge()));
        System.out.println(String.format("Warna myCat : %s", myCat.getColor()));
        System.out.println(String.format("Kaki myCat : %d", myCat.getLegs()));
        System.out.println(String.format("Jenis Kelamin myCat : %s", myCat.getSex()));
        System.out.println(myCat.toString());
    }
}