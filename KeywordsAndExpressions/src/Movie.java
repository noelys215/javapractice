public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println("Title: " + title + "\nGenre: " + instanceType + " film.");
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new SciFi(title);
            case 'H' -> new Horror(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Pleasant Scene", "Scary Music", "Something Bad Happens");
    }

    public void watchAdventure() {
        System.out.println("Watching an adventure!");
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Something Funny Occurs", "Something Funnier Occurs", "Happy Ending");
    }

    public void watchComedy() {
        System.out.println("Watching a comedy!");
    }
}

class SciFi extends Movie {
    public SciFi(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Aliens Land", "NASA Hunts Aliens", "Weird Ending");
    }

    public void watchSciFi() {
        System.out.println("Watching a SciFi thriller!");
    }
}

class Horror extends Movie {
    public Horror(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Creepy Music", "Evil Cult", "Teens get captured");
    }

    public void watchHorror() {
        System.out.println("Watching a Horror!");
    }
}