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

        Object unkownObject = Movie.getMovie("S", "Start Wars");
        if (unkownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unkownObject;
            c.watchComedy();
        } else if (unkownObject instanceof Adventure) {
            ((Adventure) unkownObject).watchAdventure();
        } else if (unkownObject instanceof SciFi scifi) {
            scifi.watchSciFi();
        }
    }
}
