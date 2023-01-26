package baseball;

import java.util.ArrayList;
import java.util.List;

public class UserNumber {

    private final List<Integer> userNumbers;

    public UserNumber(List<String> userNumbers) {
        this.userNumbers = validate(userNumbers);
    }

    public boolean isEqualsNumbersContains(List<Integer> computerNumbers) {
        for (int userNumber : this.userNumbers) { // 컴퓨터숫자 안에 유저 숫자를 포함하고 있냐 true
            return computerNumbers.contains(userNumber);
        }
        return false;
    }

    public int findNumberLocationEquals(List<Integer> computerNumbers) { // 숫자의 위치가 같냐 ?
        int strike = 0;
        for (int i = 0; i < this.userNumbers.size(); i++) {
            if (this.userNumbers.get(i).equals(computerNumbers.get(i))) {
                strike++;
            }
        }
        return strike;
    }

    public int findNumberLocationUnequals(List<Integer> computerNumbers) {
        int ball = 0;
        for (int i = 0; i < this.userNumbers.size(); i++) {
            if (!this.userNumbers.get(i).equals(computerNumbers.get(i))) {
                ball++;
            }
        }
        return ball;
    }

    public List<Integer> validate(List<String> tempUserNumbers) {
        validateUserNumbersSize(tempUserNumbers);
        validateNumberBlank(tempUserNumbers);
        validateNumberOverlap(tempUserNumbers);
        List<Integer> userNumbers = validateUserNumberType(tempUserNumbers);
        validateNumberRange(userNumbers);
        return userNumbers;
    }

    public void validateUserNumbersSize(List<String> tempUserNumbers) {
        if (tempUserNumbers.size() != 3) {
            throw new IllegalArgumentException("입력한 숫자가 3개가 아닙니다.");
        }
    }

    public void validateNumberBlank(List<String> tempUserNumbers) {
        if (tempUserNumbers.contains(" ")) {
            throw new IllegalArgumentException("입력한 값안에 공백이 포함되어 있습니다.");
        }
    }

    public void validateNumberOverlap(List<String> tempUserNumbers) {
        for (int i = 1; i < tempUserNumbers.size(); i++) {
            if (tempUserNumbers.get(i - 1).equals(tempUserNumbers.get(i))) {
                throw new IllegalArgumentException("중복되는 값이 있습니다.");
            }
        }
    }

    public List<Integer> validateUserNumberType(List<String> tempUserNumbers) {
        List<Integer> userNumbers = new ArrayList<>();
        try {
            for (String number : tempUserNumbers) {
                userNumbers.add(Integer.parseInt(number));
            }
        } catch (NumberFormatException msg) {
            throw new NumberFormatException("올바른 숫자가 아닙니다.");
        }
        return userNumbers;
    }

    public void validateNumberRange(List<Integer> tempUserNumbers) {
        for (int userNumber : tempUserNumbers) {
            if (userNumber < 1 || userNumber > 9) {
                throw new IllegalArgumentException("숫자가 1~9 범위가 아닙니다.");
            }
        }
    }

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

}
