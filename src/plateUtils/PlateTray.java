package plateUtils;

import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;

public abstract class PlateTray {

    final int MAX_CAPACITY = 10;
    private final ArrayBlockingQueue<Plate> plates = new ArrayBlockingQueue<Plate>(MAX_CAPACITY);

    public Plate takePlate() throws InterruptedException {
        return plates.take();
    }

    public  void putPlate(Plate plate) throws InterruptedException {
        Objects.requireNonNull(plate);
        plates.put(plate);
    }

}
