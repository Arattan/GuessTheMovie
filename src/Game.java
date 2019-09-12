import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game{
    String name;

    public Game() throws FileNotFoundException {

        File movies = new File("movies.txt");
        Scanner fileScanner = new Scanner(movies);
        int movie = (int) (Math.random() * 24) + 1;

        while(fileScanner.hasNextLine()){
            System.out.println(fileScanner.nextLine());
        }
    }
}
