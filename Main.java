public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.title = "SPIDERMAN-BRAND NEW DAY";
        movie1.genre = "Sci-Fi";
        movie1.duration = 148;

        Movie movie2 = new Movie();
        movie2.title = "DEADPOOL";
        movie2.genre = "Comedy";
        movie2.duration = 99;

        Movie movie3 = new Movie();
        movie3.title = "ANNABELLE";
        movie3.genre = "Thriller";
        movie3.duration = 132;

        movie1.displayInfo();
        movie2.displayInfo();
        movie3.displayInfo();
    }
}
