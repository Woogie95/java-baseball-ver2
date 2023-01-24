package baseball;

import java.util.*;

public class ComputerNumber {

    private static final Random COMPUTER_RANDOM_NUMBER = new Random();

    public static List<Integer> createComputerRandomNumbers() {
        Set<Integer> computerNumbers = new LinkedHashSet<>();
        while (computerNumbers.size() < 6) {
            computerNumbers.add(COMPUTER_RANDOM_NUMBER.nextInt(9) + 1);
        }
        return new ArrayList<>(computerNumbers);
    }
}
