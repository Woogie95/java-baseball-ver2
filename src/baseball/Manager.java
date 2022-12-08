package baseball;

import java.util.List;

public class Manager {

    public void runBaseball() { //옛날과 다를게 없다.
        Output.printBaseBallStartMessage();
        boolean isBaseballRestart = true;
        while (isBaseballRestart) {
            List<Integer> computerNumber = ComputerNumber.computerRandomNumber();
            isBaseballRestart = false;
            while (true) {
                Result result = new Result();
                result.findResult(new UserNumber(Input.inputNumber()), computerNumber);
                Comparison.compare(result);
                if (isRestart(result)) {
                    break;
                }
                isBaseballRestart = true;
            }
        }

    }

    public boolean isRestart(Result result) {
        if (result.getStrike() == 3) {
            Output.printBaseBallEndMessage();
            return isRetry();
        }
        return false;
    }

    public boolean isRetry() {
        return Input.inputRestartNumber().equals("1");
    }

}


