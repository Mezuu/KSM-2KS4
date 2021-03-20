import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<String> myColors = new ArrayList<>();
        myColors.add("Res");
        myColors.add("Green");
        myColors.add("Yellow");
        myColors.set(0, "Red");

        int myColorsLength = myColors.size();
        for(int i = 0; i < myColorsLength ; i++){
            System.out.println(myColors.get(i));
        }
    }
}