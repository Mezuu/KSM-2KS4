public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        super();
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color){
        super(color);
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
    
    @Override
    public String toString(){
        return String.format("Square[%s, width=%.1f, height=%.1f]", super.toString(), width, height);
    }
}