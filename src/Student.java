
public class Student {
    private int id; private String name;
    private String course;
    private static int scount; // static belongs to the whole class only one memory location will be created
    public void setValues(int a, String n, String b1){
        id=a;
        name=n;
        course=b1;
    }
    public void getValues(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Course: "+course);
    }
    public void setID(int x){ //setter method mutator
        id=x;
    }
    public void setName(String str1){
        name=str1;
    }
    public void setCourse(String str2){
        course=str2; }
    public int getID(){ //getter method1 or accessor
        return id;
    }
    public String getName(){//getter method2
        return name;
    }
    public String getCourse(){//getter method2
        return course; }
    public static int incrementCount(){ //static member does not associated with any object
        scount= scount+1;
        return (scount); }
}
