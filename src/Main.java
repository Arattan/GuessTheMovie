import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //TODO Implement an Input Scanner which reads a player's guess(es)
        //TODO Implement the while loop measuring
        //TODO Need to create a game object on start up which randomly chooses a movie from the list
        //TODO Where will the movie list be kept? The Game should have a File Scanner to find the names from the list.
        System.out.println("Welcome to Guess The Movie!");
        System.out.println("Guess a letter: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());
        Game game = new Game();



        //} catch (FileNotFoundException exception){
            //throw exception;
        }


    }

