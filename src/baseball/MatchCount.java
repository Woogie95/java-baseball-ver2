package baseball;

import java.util.List;

public class MatchCount {

    private final int strike;
    private final int ball;

    public MatchCount() {
        this.strike = 0;
        this.ball = 0;
    }

    public MatchCount(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public void findEqualNumbers(UserNumber userNumber, List<Integer> computerNumber) {
        if (userNumber.isEqualsNumbersContains()) { // 포함하고 있냐
            if (userNumber.isNumberLocationEquals()){

            }
        }

    }


    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

}
