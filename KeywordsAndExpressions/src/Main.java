public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Student s = new Student("S92300" + i,
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
    }
}
