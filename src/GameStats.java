public class GameStats {
    private final int rate;
    private final int timeGame;
    private final int yearGame;
    private final int version;
    private final String lang;
    private final String name;

    public static class Builder {
        private final int rate;
        private final int timeGame;

        private int yearGame = 0;
        private int version = 0;
        private String lang = null;
        private String name = null;

        public Builder(int rate, int timeGame) {
            this.rate = rate;
            this.timeGame = timeGame;
        }

        public Builder yearGame(int val) {
            yearGame = val;
            return this;
        }
        public Builder version(int val) {
            version = val;
            return this;
        }
        public Builder lang(String val) {
            lang = val;
            return this;
        }
        public Builder name(String val) {
            name = val;
            return this;
        }
        public GameStats build() {
            return new GameStats(this);
        }
    }
    private GameStats(Builder builder) {
        rate = builder.rate;
        timeGame = builder.timeGame;
        yearGame = builder.yearGame;
        version = builder.version;
        lang = builder.lang;
        name = builder.name;
    }
    public void printGame() {
        System.out.printf("%s %s %s %s %s %s", rate, timeGame, yearGame, version, lang, name);
    }
}
