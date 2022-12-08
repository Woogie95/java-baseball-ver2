package baseball;

import java.util.List;

public class Result {

    private int strike;
    private int ball;

    public Result() {
        this.strike = 0;
        this.ball = 0;
    }

    public void findResult(UserNumber userNumbers, List<Integer> computerNumbers) {
        for (int userNumber : userNumbers.getUserNumbers()) {
            if (computerNumbers.contains(userNumber)) {
                findStrike(userNumber, computerNumbers);
            }
        }
    }

    private void findStrike(int userNumber, List<Integer> computerNumbers) {
        for (int computerNumber : computerNumbers) {
            if (userNumber == computerNumber) {
                strike++;
            }
            findBall(userNumber, computerNumber);
        }
    }

    private void findBall(int userNumber, int computerNumber) {
        if (userNumber != computerNumber) {
            ball++;
        }
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

}