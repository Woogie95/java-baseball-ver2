package baseball;

import java.util.List;

public class MatchCount {

    public static final int DEFAULT_BALL_NUMBER = 0;
    public static final int DEFAULT_STRIKE_NUMBER = 0;

    private final int strike;
    private final int ball;

    public MatchCount() {
        this.strike = DEFAULT_STRIKE_NUMBER;
        this.ball = DEFAULT_BALL_NUMBER;
    }

    public MatchCount(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public MatchCount addAllCount(UserNumber userNumber, List<Integer> computerNumbers) {
        if (userNumber.hasUserNumbersToComputerNumbers(computerNumbers)) {
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
