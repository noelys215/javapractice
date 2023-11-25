public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Indiana Jones");
        movie.watchMovie();

        Horror theWitch = (Horror) Movie.getMovie("H", "The Witch");
        theWitch.watchMovie();

        Object comedy = Movie.getMovie("C", "The Hangover");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("c", "Airplane");
        airplane.watchMovie();
    }
}
