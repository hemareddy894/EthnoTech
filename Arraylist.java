import java.util.*;
public class Arraylist{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> playlist = new ArrayList<>();
        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for(int i = 0; i < n; i++) {
            System.out.print("Enter song name: ");
            String song = sc.nextLine();
            playlist.add(song);
        }

        System.out.println("\nPlaylist:");

        for(String song : playlist) {
            System.out.println(song);
        }

        sc.close();
    }
}