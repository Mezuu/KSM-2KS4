public class Main{
    public static void main(String[] args){
        // Kode di bawah akan menghasilkan error
        Account myAccount1 = new Account("Gotham", -777);

        // Gunakan try dan catch
        // Account myAccount2 = new Account("Gilgamesh", 777);
        // try{
        //     myAccount2.setBalance(-777);
        // }
        // catch(Exception e){
        //     System.out.println(String.format("Error : %s", e.getMessage()));
        // }
        // finally{
        //     System.out.println(String.format("Nama myAccount2 : %s", myAccount2.getName()));
        //     System.out.println(String.format("Saldo myAccount2 : %.2f", myAccount2.getBalance()));
        //     System.out.println(myAccount2.toString());
        }
    }
}