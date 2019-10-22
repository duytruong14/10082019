import java.util.ArrayList;
import java.util.Scanner;
public class arrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner inp = new Scanner(System.in);
        int x;
        char choice = 'Y';
        System.out.println("Enter numbers one by one");
        while ((choice != 'N')) {
            x = inp.nextInt();
            numbers.add((int) x); // to add elements to the list, type casting is required as numbers is of type Integer Class
            System.out.println("Do you want to add one more number?");
            inp.nextLine(); //String str=inp.nextLine();
            choice = inp.nextLine().charAt(0);
        }
        int s = numbers.size();
        for (int j = 0; j < s; j++)
            System.out.println(numbers.get(j));//to read element at index j
    }
}
