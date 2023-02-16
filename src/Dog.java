public class Dog extends Animal implements BattleAnimal {
    private int wins = 0;
    private int looses = 0;
    private int draws = 0;

    public Dog(String name) {
        super(name, "wow, grrr...");
    }
    public Dog(String name, String sound, int wins, int looses, int draws) {
        super(name, sound);
        this.wins = wins;
        this.looses = looses;
        this.draws = draws;
    }

    protected String getAggressiveSound() {
        return String.format("%s, %s", this.getSound().repeat(2), "nom ".repeat(3));
    }

    public int getWins() {
        return wins;
    }

    public int getLooses() {
        return looses;
    }

    public int getDraws() {
        return draws;
    }
}
