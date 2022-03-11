package movies;

import Util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        int userInput;
        Movie[] myMovies = MoviesArray.findAll();
        Boolean moovieBoolean = true;
        Input UwU = new Input("UwU");
        do {
            printMenu("What would you like to do?\n0- exit\n1- view all movies\n 2- view movies in the animated category\n" +
                    "3- view movies in the drama category\n4- view movies in the horror category\n5- view movies in the scifi category\n6- add a movie!\n");
            userInput = UwU.getInt("Enter your choice: ");
            if(userInput == 0) {
                System.out.println("Have a nice day!");
                moovieBoolean = false;
            }
            doMenuOption(userInput, myMovies, UwU);
        } while (moovieBoolean == true);

    }
    public static void printMenu(String menu){
        System.out.print(menu);
    }
    public static void doMenuOption(int choice, Movie[]myMovies, Input UwU){

         if(choice == 2){
            System.out.println(Arrays.toString(Movie.showCategory(myMovies, "animated")));
        }else if(choice == 1){
            System.out.println(Arrays.toString(myMovies));
        }else if(choice == 3){
            System.out.println(Arrays.toString(Movie.showCategory(myMovies, "drama")));
        }else if(choice == 4){
            System.out.println(Arrays.toString(Movie.showCategory(myMovies, "horror")));
        }else if(choice == 5){
            System.out.println(Arrays.toString(Movie.showCategory(myMovies, "scifi")));
        }else if(choice == 6){
            String movieName = UwU.getString("Please enter the movie name");
            String category = UwU.getString("Please enter the category");
            Movie daMovie = new Movie(movieName, category);
            myMovies = Movie.addMovie(myMovies, daMovie);
        }
    }
}
