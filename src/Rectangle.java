public class Rectangle {
    private double length; // can be accessed by the member of the same class
    private double width; // can not be accessed by the code outside the class
    public double diagonal; // can be accessed by memebers of the class and ouside code
    public void setDimensions(){ length=10.5;
        width=5.5;
    }
    public void getDimensions(){
        System.out.println("Length of the Rectangle: " +length);
        System.out.println("Width of the Rectangle: " +width);
    }

}

