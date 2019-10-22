public class student2 {
    private int id;
    private String name;
    private String course;
    private static int count = 0;

    public student2(int a, String b, String c) {
        id = a;
        name = b;
        course = c;
        count++;
    }

    public void getData() {
        System.out.println("Id " + id);
        System.out.println("name " + name);
        System.out.println("course " + course);
        System.out.println("count " + count);
    }
}
