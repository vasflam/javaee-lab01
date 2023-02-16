public class Cock extends Animal implements BattleAnimal {
    static final int COCK_WINS = 1000;
    static final int COCK_LOOSES = 0;
    static final int COCK_DRAWS = 10;

    Cock(String nickname) {
        super(nickname);
    }

    Cock(String nickname, String sound) {
        super(nickname, sound);
    }

    /**
     * realize abstract method example
     */
    protected String getAggressiveSound() {
        return "*he never lost control* co co co";
    }

    @Override
    public void doAggressiveSound() {
        System.out.printf(
                "%s the Cock:\n\t%s\n",
                nickname,
                getAggressiveSound()
        );
    }

    public int getWins() {
        return COCK_WINS;
    }

    public int getLooses() {
        return COCK_LOOSES;
    }

    public int getDraws() {
        return COCK_DRAWS;
    }
}
