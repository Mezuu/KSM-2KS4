public class Main{
    public static void main(String[] args){
        Square mySquare = new Square(6);
        System.out.println(String.format("Sisi mySquare : %.1f", mySquare.getSide()));
        System.out.println(String.format("Luas mySquare : %.1f", mySquare.getArea()));
        System.out.println(String.format("Keliling mySquare : %.1f", mySquare.getPerimeter()));
        System.out.println(mySquare.toString());
    }
}