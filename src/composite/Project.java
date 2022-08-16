package composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer first = new composite.JavaDeveloper();
        Developer second = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.addDeveloper(first);
        team.addDeveloper(second);
        team.removeDeveloper(first);
        team.addDeveloper(cppDeveloper);

        team.createProject();
    }
}
