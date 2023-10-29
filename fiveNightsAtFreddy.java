import java.util.Random;

public class fiveNightsAtFreddy {
    interface Animatronic {
        void create();
    }
    class Freddy implements Animatronic {
        public void create() {
            System.out.println("Creating Freddy! ur ur ur");
        }
    }
    class Foxy implements Animatronic {
        public void create() {
            System.out.println("Creating Foxy! dum dum durum dum");
        }
    }
    abstract class AnimatronicFactory {
        abstract Animatronic createAnimatronic();

        void operation() {
            Animatronic animatronic = createAnimatronic();
            animatronic.create();
        }
    }
    class RandomAnimatronicFactory extends AnimatronicFactory {

        @Override
        Animatronic createAnimatronic() {
            Random random = new Random();
            if (random.nextBoolean()) {
                return new Freddy();
            } else {
                return new Foxy();
            }
        }
    }


}