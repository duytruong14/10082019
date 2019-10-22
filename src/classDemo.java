public class classDemo {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(); Rectangle2 r2 = new Rectangle2();
        r1.setDimensions();
        System.out.println("Rectangle");
        r1.getDimensions();
        r2.setDimensions(20.5, 10.5);
        System.out.println("Rectangle2");
        r2.getDimensions();
//r1.length=3.5;
        r1.diagonal=11.5;
        System.out.println("Rectangles's diagonal is: "+r1.diagonal); }
}
//only name method can access the private variable that were set up in the method
