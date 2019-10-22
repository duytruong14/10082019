public class Rectangle2 {
    private double length;
    private double width;
    public void setDimensions(double x, double y){
        length=x;
        width=y;
    }
    //public Rectangle2(double a,double b){
    //it is automatic assigns value to the fields when an objects is
    // length=a;
    // width=b;
    //}
    public void getDimensions(){
        System.out.println("Length of the Rectangle: " +length);
        System.out.println("Width of the Rectangle: " +width);
    }


}
