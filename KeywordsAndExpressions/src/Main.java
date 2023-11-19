public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Rei";
                        case 2 -> "Asuka";
                        case 3 -> "Mari";
                        case 4 -> "Shinji";
                        case 5 -> "Kaworu";
                        default -> "Anon";
                    },
                    "03/30/2001",
                    "Eva Piloting");

            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Misato", "05/08/1986", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Ritsuko", "11/21/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);
    }
}
