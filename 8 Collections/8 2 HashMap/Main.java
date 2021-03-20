import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        HashMap<Integer, String> myFoods = new HashMap<>();
        myFoods.put(8, "Burger");
        myFoods.put(88, "Pizza");
        myFoods.put(888, "Pecel");
        myFoods.remove(888);

        for(int key : myFoods.keySet()){
            System.out.println(myFoods.get(key));
        }
    }
}