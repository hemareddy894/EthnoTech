//list of student names using Arraylist
import java.util.*;
public class Arraylist2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
		int n = sc.nextInt();
        sc.nextLine(); 
        for(int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            names.add(name);
		}
		System.out.println("\nStudent Names:");
        for(String name : names) {
            System.out.println(name);
        }

        sc.close(); 
    }
}