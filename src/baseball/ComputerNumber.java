package baseball;

import java.util.*;

public class ComputerNumber {

    public static final int MINIMUM_VALUE = 1;
    public static final int MAXIMUM_VALUE = 9;
    public static final int MAXIMUM_STORAGE_SIZE = 3;

    public static List<Integer> computerRandomNumber() {
        Set<Integer> tempRandomNumber = new LinkedHashSet<>();
        Random random = new Random();
        while (tempRandomNumber.size() != MAXIMUM_STORAGE_SIZE) {
            tempRandomNumber.add(random.nextInt(MAXIMUM_VALUE) + MINIMUM_VALUE);
        }
        return new ArrayList<>(tempRandomNumber);
    }

}
