public class Main{
    public static void main(String[] args){
        Square mySquare = new Square(5, "red", true);
        System.out.println(String.format("Sisi mySquare : %.1f", mySquare.getSide()));
        System.out.println(String.format("Luas mySquare : %.1f", mySquare.getArea()));
        System.out.println(String.format("Keliling mySquare : %.1f", mySquare.getPerimeter()));
        System.out.println(mySquare.toString());

        Rectangle myRectangle = new Rectangle(5, 3, "blue", false);
        System.out.println(String.format("Panjang myRectangle : %.1f", myRectangle.getWidth()));
        System.out.println(String.format("Lebar myRectangle : %.1f", myRectangle.getHeight()));
        System.out.println(String.format("Luas myRectangle : %.1f", myRectangle.getArea()));
        System.out.println(String.format("Keliling myRectangle : %.1f", myRectangle.getPerimeter()));
        System.out.println(myRectangle.toString());
    }
}