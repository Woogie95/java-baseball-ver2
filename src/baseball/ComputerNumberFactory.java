package baseball;

import java.util.*;

public class ComputerNumberFactory {

    private static final int COMPUTER_NUMBERS_MAX_SIZE = 3;
    private static final int COMPUTER_NUMBER_RANDOM_MIN_VALUE = 1;
    private static final int COMPUTER_NUMBER_RANDOM_MAX_VALUE = 9;

    private static final Random COMPUTER_RANDOM_NUMBER = new Random();

    public static List<Integer> createComputerRandomNumbers() {
        Set<Integer> computerNumbers = new LinkedHashSet<>();
        while (computerNumbers.size() < COMPUTER_NUMBERS_MAX_SIZE) {
            computerNumbers.add(COMPUTER_RANDOM_NUMBER.nextInt(COMPUTER_NUMBER_RANDOM_MAX_VALUE)
                    + COMPUTER_NUMBER_RANDOM_MIN_VALUE);
        }
        return new ArrayList<>(computerNumbers);
    }
}
