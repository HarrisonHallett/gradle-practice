import java.util.Random;
class Dice {
    public int roll(int sides) {
        return new Random().nextInt(sides);
    }
}