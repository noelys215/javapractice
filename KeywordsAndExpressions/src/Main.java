import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type or Q to Quit ");
            String type = s.nextLine();
            if ("Qq".contains(type)) break;
            System.out.print("Enter Movie Title ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}