import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game{
    String name;

    public Game() throws FileNotFoundException {

        File movies = new File("movies.txt");
        Scanner fileScanner = new Scanner(movies);

        while(fileScanner.hasNextLine()){
            System.out.println(fileScanner.nextLine());
        }
    }
}
