package dev.lpa;

interface Player {
    String name();
}

record BaseballPlayer(String name, String position) implements Player {
}

record FootballPlayer(String name, String position) implements Player {
}

record VolleyballPlayer(String name, String position) implements Player {

}

public class Main {
    public static void main(String[] args) {
        var philly = new Affiliation("city", "Philadelphia, PA", "US");
        BaseballTeam phillies1 =
                new BaseballTeam("Philadelphia Phillies");
        BaseballTeam yankees1 =
                new BaseballTeam("New York Yankees");
        scoreResult(phillies1, 3, yankees1, 5);

        SportsTeam phillies2 =
                new SportsTeam("Philadelphia Phillies");
        SportsTeam yankees2 =
                new SportsTeam("New York Yankees");
        scoreResult(phillies2, 3, yankees2, 5);


        Team<BaseballPlayer, Affiliation> phillies =
                new Team<>("Philadelphia Phillies", philly);
        Team<BaseballPlayer, Affiliation> yankees =
                new Team<>("New York Yankees");
        scoreResult(phillies, 3, yankees, 5);
        var gunter = new BaseballPlayer("Gunther Walter", "Midfielder");

        SportsTeam afc1 = new SportsTeam("Adelaide Crows");
        Team<FootballPlayer, String> afc = new Team<>("Adelaide Crows", "City og Adelaide, South Australia, AU");
        var tex = new FootballPlayer("Tex Walker", "Forwards");
        afc.addTeamMember(tex);

        var rory = new FootballPlayer("Rory McDonald", "Center Midfielder");
        afc.addTeamMember(rory);
        afc.listTeamMembers();

        Team<VolleyballPlayer, Affiliation> adelaide = new Team<>("Adelaide Storm");
        adelaide.addTeamMember(new VolleyballPlayer("N. Roberts", "Setter"));
        adelaide.listTeamMembers();

        var camberra = new Team<VolleyballPlayer, Affiliation>("Canberra Heat");
        camberra.addTeamMember(new VolleyballPlayer("B. Blunt", "Opposite"));
        camberra.listTeamMembers();

        scoreResult(camberra, 0, adelaide, 1);
//        Team<Integer> melbourneVB = new Team<>("Melbourne Vipers");
    }

    public static void scoreResult(BaseballTeam team1, int t1_score,
                                   BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int t1_score,
                                   SportsTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_score,
                                   Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

}
