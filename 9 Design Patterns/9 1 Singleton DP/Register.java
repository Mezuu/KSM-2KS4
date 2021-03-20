import java.util.ArrayList;

public class Register{
    private ArrayList<String> names;
    private static Register instance;

    private Register(){
        names = new ArrayList<>();
    };
    public void register(String name){
        names.add(name);
    }
    public ArrayList getNames(){
        return names;
    }
    public static Register getInstance(){
        if(instance == null){
            instance = new Register();
        }
        return instance;
    }
}