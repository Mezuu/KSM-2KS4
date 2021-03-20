public class Main{
    public static void main(String[] args){
        Register myRegister1 = Register.getInstance();
        myRegister1.register("John Dwayne");

        Register myRegister2 = Register.getInstance();
        myRegister2.register("Keanu Reeves");

        Register myRegister3 = Register.getInstance();
        for(int i = 0; i < myRegister3.getNames().size(); i++){
            System.out.println(myRegister3.getNames().get(i));
        }
    }
}