class Player {
    String name;
    int level;

    Player(String name, int level) {
        this.name = name;
        this.level = level;
    }

    void info() {
        System.out.println(name + " (Level " + level + ")");
    }
}

public class ClassExample {
    public static void main(String[] args) {
        Player p = new Player("Hevox", 1);
        p.info();
    }
}
