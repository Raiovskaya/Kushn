package randomizer;

import java.util.Random;

public class ClassicRandom implements MyRandom {
    final Random random = new Random();

    @Override
    public int getRandom() {
        return random.nextInt(1000);
    }
}
