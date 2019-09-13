import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game{
    private String [] movies = {"the shawshank redemption", "the godfather",
            "the dark knight", "schindler's list"};

    public Game() {         //throws FileNotFoundException
                            //File movies = new File("movies.txt");
                            //Scanner fileScanner = new Scanner(movies);
                                // String [] args = {fileScanner.nextLine()};
        int randNum = (int) (Math.random() * 4);
        System.out.println(randNum);
        String movie = this.movies[randNum];
        System.out.println(movie);
        int titleLength = movie.length();
        System.out.println(titleLength);
        String maskedString = movie.replaceAll("[a-zA-Z0-9]","_");
        System.out.println(maskedString);
                        // System.out.println(fileScanner.nextLine());
    }







        //int movieName = movie.split(" ").length;

    }
