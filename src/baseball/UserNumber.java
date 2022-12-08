package baseball;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static baseball.ComputerNumber.*;

public class UserNumber {

    public static final int DEFAULT_VALUE = 0;

    private static final String BLANK = " ";

    private final List<Integer> userNumbers;

    public UserNumber(String userNumber) {
        this.userNumbers = validate(userNumber);
    }

    public List<Integer> validate(String userNumber) {
        List<String> tempNumbers = divideUserNumber(userNumber);
        validateUserNumberBlank(validateUserNumberOverlap(validateUserNumberLength(tempNumbers)));
        return validateUserNumberRange(validateUserNumberType(tempNumbers));
    }

    public int findTotalContain(List<Integer> computerNumber) {
        int total = DEFAULT_VALUE;
        for (int userNumber : userNumbers) {
            if (computerNumber.contains(userNumber)) {
                total += MINIMUM_VALUE;
            }
        }
        return total;
    }

    public int findStrike(List<Integer> computerNumber) {
        int strike = DEFAULT_VALUE;
        for (int i = 0; i < userNumbers.size(); i++) {
            if (computerNumber.contains(userNumbers.get(i))) {
                strike += findLocation(strike, userNumbers.get(i), computerNumber.get(i));
            }
        }
        return strike;
    }

    private int findLocation(int strike, int userNumber, int computerNumber) {
        if (userNumber == computerNumber) {
            return MINIMUM_VALUE;
        }
        return strike;
    }

    private List<String> divideUserNumber(String userNumber) {
        List<String> tempNumbers = new ArrayList<>();
        for (int i = 0; i < userNumber.length(); i++) {
            tempNumbers.add(String.valueOf(userNumber.charAt(i)));
        }
        return tempNumbers;
    }

    private List<String> validateUserNumberLength(List<String> tempNumbers) {
        if (tempNumbers.size() < MAXIMUM_STORAGE_SIZE || tempNumbers.size() > MAXIMUM_STORAGE_SIZE) {
            throw new IllegalArgumentException("입력한 숫자가 3개가 아닙니다.");
        }
        return tempNumbers;
    }

    private List<String> validateUserNumberOverlap(List<String> tempNumbers) {
        Set<String> tempUserNumber = new LinkedHashSet<>(tempNumbers);
        if (tempUserNumber.size() < MAXIMUM_STORAGE_SIZE) {
            throw new IllegalArgumentException("입력한 숫자에 중복 숫자가 포함되어 있습니다.");
        }
        return tempNumbers;
    }

    private void validateUserNumberBlank(List<String> tempNumbers) {
        if (tempNumbers.contains(BLANK)) {
            throw new IllegalArgumentException("입력한 숫자에 공백이 포함되어 있습니다.");
        }
    }

    private List<Integer> validateUserNumberType(List<String> tempNumbers) {
        List<Integer> userNumber = new ArrayList<>();
        for (String tempNumber : tempNumbers) {
            try {
                userNumber.add(Integer.parseInt(tempNumber));
            } catch (NumberFormatException exceptionMessage) {
                throw new NumberFormatException("입력한 값이 숫자가 아닙니다.");
            }
        }
        return userNumber;
    }

    private List<Integer> validateUserNumberRange(List<Integer> userNumbers) {
        for (int userNumber : userNumbers) {
            if (userNumber < MINIMUM_VALUE || userNumber > MAXIMUM_VALUE) {
                throw new IllegalArgumentException("입력한 숫자가 1~9까지 범위를 벗어났습니다.");
            }
        }
        return userNumbers;
    }

}