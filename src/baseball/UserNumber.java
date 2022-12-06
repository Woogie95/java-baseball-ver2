package baseball;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UserNumber {

    private final List<Integer> userNumbers;

    public UserNumber(String userNumber) {
        this.userNumbers = validate(userNumber);
    }

    public List<Integer> validate(String userNumber) {
        List<String> tempNumbers = divideUserNumber(userNumber);
        return validateUserNumberType(validateUserNumberBlank(validateUserNumberOverlap(validateUserNumberLength
                (tempNumbers))));
    }

    public List<String> divideUserNumber(String userNumber) { // 입력된 숫자 나누기
        List<String> tempNumbers = new ArrayList<>();
        for (int i = 0; i < userNumber.length(); i++) {
            tempNumbers.add(String.valueOf(userNumber.charAt(i)));
        }
        return tempNumbers;
    }

    public List<String> validateUserNumberLength(List<String> tempNumbers) { // 길이 확인
        if (tempNumbers.size() != 3) {
            throw new IllegalArgumentException("입력한 숫자가 3개가 아닙니다.");
        }
        return tempNumbers;
    }

    public List<String> validateUserNumberOverlap(List<String> tempNumbers) { // 중복 확인
        Set<String> tempUserNumber = new LinkedHashSet<>(tempNumbers);
        if (tempUserNumber.size() != 3) {
            throw new IllegalArgumentException("입력한 숫자에 중복 숫자가 포함되어 있습니다.");
        }
        return tempNumbers;
    }

    public List<String> validateUserNumberBlank(List<String> tempNumbers) { // 공백 확인
        if (tempNumbers.contains(" ")) {
            throw new IllegalArgumentException("입력한 숫자에 공백이 포함되어 있습니다.");
        }
        return tempNumbers;
    }

    public List<Integer> validateUserNumberType(List<String> tempNumbers) { // 타입 체크 하고 반환
        List<Integer> userNumber = new ArrayList<>();
        for (String tempNumber : tempNumbers) {
            try {
                userNumber.add(Integer.parseInt(tempNumber));
            } catch (IllegalArgumentException exceptionMessage) {
                throw new IllegalArgumentException("입력한 값이 숫자가 아닙니다.");
            }
        }
        return userNumber;
    }

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

}