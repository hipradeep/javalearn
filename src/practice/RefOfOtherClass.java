package practice;

public class RefOfOtherClass {

    public static void main(String[] args) {
        Movie movie=new Movie();
        movie.movieName="Baahubali: The Beginning";
        movie.releaseDate=2015;
        movie.starCast="Prabhas, Rana Daggubati, Anushka Shetty, Tamannaah";

        System.out.println("Movie ");
        System.out.println("Name : "+ movie.getMovieName());
        System.out.println("Release Date : "+ movie.getReleaseDate());
        System.out.println("Star Cast : "+ movie.getStarCast());

    }
}
class Movie{
    String movieName;
    int releaseDate;
    String starCast;

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getStarCast() {
        return starCast;
    }

    public void setStarCast(String starCast) {
        this.starCast = starCast;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
