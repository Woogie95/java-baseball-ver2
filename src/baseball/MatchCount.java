package baseball;

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

    public void findEqualNumber(UserNumber userNumber) {
        if () { // true 면 strike + 1

            new MatchCount(this.strike + 1, this.ball);
            new MatchCount(this.strike + 1, this.ball +1);
            new MatchCount(this.strike, this.ball+1);
        }


    }


    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

}
