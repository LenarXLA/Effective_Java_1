public class Main {
    public static void main(String[] args) {
        GameStats gameStats = new GameStats.Builder(95, 40).lang("ENG").version(2).build();
        gameStats.printGame();
    }
}
