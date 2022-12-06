package baseball;

import java.util.List;

public class Judge {

    private int strike;
    private int ball;

    public Judge(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public void check(UserNumber userNumbers, List<Integer> computerNumbers) {
        for (int userNumber : userNumbers.getUserNumbers()) {
            findContain(userNumber, computerNumbers);
        }
    }

    private void findContain(int userNumber, List<Integer> computerNumbers) { // 포함하고 있는지 먼저 확인
        if (computerNumbers.contains(userNumber)) {
            findStrikeBall(userNumber, computerNumbers);
        }
    }

    private void findStrikeBall(int userNumber, List<Integer> computerNumbers) { // 같은 자리에 있는지도 확인
        for (int computerNumber : computerNumbers) {
            if (userNumber == computerNumber) {
                strike++;
            }
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
