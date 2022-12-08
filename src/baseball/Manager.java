package baseball;

import java.util.List;

import static baseball.ComputerNumber.MAXIMUM_STORAGE_SIZE;

public class Manager {

    public void runBaseball() {
        Output.printBaseBallStartMessage();
        boolean restart = true;
        while (restart) {
            List<Integer> computerNumbers = ComputerNumber.createComputerRandomNumber();
            System.out.println(computerNumbers);
            boolean retry = true;
            while (retry) {
                UserNumber userNumber = new UserNumber(Input.inputNumber());
                int total = userNumber.findTotalContain(computerNumbers);
                int strike = userNumber.findStrike(computerNumbers);
                int ball = total - strike;
                Count.count(ball, strike);
                retry = !isGameStart(strike);
            }
            Output.printBaseBallEndMessage();
            restart = isSelectRetry();
        }
    }

    private boolean isGameStart(int strike) {
        return strike == MAXIMUM_STORAGE_SIZE; // 3 3
    }

    private boolean isSelectRetry() {
        return Input.inputRestartNumber().equals("1");
    }

}


