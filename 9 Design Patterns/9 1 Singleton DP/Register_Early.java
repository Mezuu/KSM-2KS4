import java.util.ArrayList;

public class Register_Early {
    private ArrayList<String> names;
    private static Register_Early instance = new Register_Early();

    private Register_Early(){
        names = new ArrayList<>();
    }
    public void register(String name){
        names.add(name);
    }
    public ArrayList getNames(){
        return names;
    }
    public static Register_Early getInstance(){
        return instance;
    }
}
