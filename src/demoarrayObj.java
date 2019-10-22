import java.util.Scanner;
public class demoarrayObj {
    public static void main(String[] args){
        /*Student[] s=new Student[4]; //an array of Objects
        Scanner inp =new Scanner(System.in);
        System.out.println("Enter students details one by one");
        for (int j=0; j<3; j++) {
            s[j]=new Student();
            int id= inp.nextInt();
            inp.nextLine();// to remove leftover newline character
            String name = inp.nextLine();
            String course=inp.nextLine();
            s[j].setValues(id,name,course); }//important
        for (int j=0; j<3; j++){ //print
            System.out.println("Student: "+Student.incrementCount()+":");
            s[j].getValues(); }*/



        Student s4=new Student();
        int x= 4;
        s4.setID(x);//setter method to set value for id
        s4.setName("Bob");//setter method to set value for name
        s4.setCourse("CIS2348");//setter method to set value for course
        int y=s4.getID();//access the value of ID(Accessor/getter
        String n=s4.getName();
        String c=s4.getCourse();
        System.out.println("S4");
        System.out.println("ID "+y+" Name "+n+" Course "+c);
    }
}
/*
1
alice
java
2
bob
python
3
robert
c++
 */