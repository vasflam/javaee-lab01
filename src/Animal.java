public abstract class Animal {
    protected String nickname = "unknown";
    protected String sound = "gr...grrr...";

    public Animal() {
    }

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    public Animal(String nickname, String sound) {
        this.nickname = nickname;
        this.sound = sound;
    }

    public String getNickname() {
        return nickname;
    }

    public String getSound() { return sound; }

    public void setNickname(String nickname) { this.nickname = nickname; }

    public void setSound(String nickname) { this.sound = sound; }

    protected abstract String getAggressiveSound();

    public void doSound() {
        System.out.printf(
            "%s:\n\t%s!\n\t*silence*\n\t%s\n",
            nickname,
            sound,
            sound
        );
    }

    public void doAggressiveSound() {
        System.out.printf(
            "%s:\n\t*aggressive* %s",
            nickname,
            this.getAggressiveSound()
        );
    }
}
