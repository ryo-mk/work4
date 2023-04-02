public class BaseballPlayer {

    private final String name;
    private final int age;
    private final String team;

    public BaseballPlayer(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", team='" + team + '\'' +
                '}';
    }
}
