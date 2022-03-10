package movies;

import Util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] myMovies = MoviesArray.findAll();
        for (Movie movie : myMovies){
            System.out.println(movie.getName());
        }
    }
}
