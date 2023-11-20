public class Main extends Object {
    public static void main(String[] args) {
        Student asuka = new Student("Asuka", 19);
        System.out.println(asuka.toString());

        PrimarySchoolStudent shinji = new PrimarySchoolStudent("Shinji", 8, "Yui");
        System.out.println(shinji);
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", is " + 8 + ".";
    }
}

class PrimarySchoolStudent extends Student {
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s child, " + super.toString();
    }
}