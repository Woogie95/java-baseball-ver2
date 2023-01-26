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

    public MatchCount addAllCount(UserNumber userNumber, List<Integer> computerNumbers) {
        if (userNumber.isEqualsNumbersContains(computerNumbers)) { // 포함하고 있냐
            return new MatchCount(this.strike + userNumber.findNumberLocationEquals(computerNumbers),
                    this.ball + userNumber.findNumberLocationUnequals(computerNumbers));
        }
        return new MatchCount();
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

}
