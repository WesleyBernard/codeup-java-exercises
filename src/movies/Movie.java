package movies;

import java.util.Arrays;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public static Movie[]addMovie(Movie[] movieArray, Movie movie){
        Movie[] newArray = Arrays.copyOf(movieArray, movieArray.length + 1);
        newArray[newArray.length - 1] = movie;
        System.out.println("movie added! :)");
        return newArray;
    }
    public static Movie[]showCategory(Movie[] movieArray, String category){
        Movie[] categoryArray;
        int index = 0;
        for (int i = 0; i < movieArray.length; i++) {
            if (movieArray[i].category.equalsIgnoreCase(category)){
                index++;
            }
        }
        categoryArray = new Movie[index];
        index = 0;
        for (Movie movie : movieArray){
            if (movie.category.equalsIgnoreCase(category)){
                categoryArray[index] = movie;
                index++;
            }
        }
        return categoryArray;
    }

    @Override
    public String toString() {
        return this.name + " Category " + this.category + "\n";
    }
}
