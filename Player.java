package view;

public class Player {
    private String name;
    private String age;
    private String rank;

    public Player(String name, String age, String rank) {
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
