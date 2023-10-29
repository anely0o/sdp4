import java.util.Random;

public class Main {
    public static void main(String[] args) {
        fiveNightsAtFreddy factory = new fiveNightsAtFreddy();
        fiveNightsAtFreddy.AnimatronicFactory animatronicFactory = factory.new RandomAnimatronicFactory();
        animatronicFactory.operation();
    }
}