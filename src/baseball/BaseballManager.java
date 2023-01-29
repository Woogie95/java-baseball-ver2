package baseball;

import java.util.List;

public class BaseballManager {

    public void runBaseballGame() {
        Output.printNumberBaseballGameStartMessage();
        boolean startGame = true;
        while (startGame) {
            List<Integer> computerNumbers = ComputerNumberFactory.createComputerRandomNumbers();
            System.out.println("컴퓨터 숫자" + computerNumbers);
            boolean repeat = true;
            while (repeat) {
                MatchCount matchCount = new MatchCount();
                UserNumber userNumber = new UserNumber(Input.inputUserNumber());
                MatchCount newMatchCount = matchCount.addAllCount(userNumber, computerNumbers);
                Output.printResult(newMatchCount);
                repeat = hasThreeStrike(newMatchCount);
            }
            startGame = isRetrySelect();
        }
    }

    public boolean hasThreeStrike(MatchCount newMatchCount) {
        return !Output.printGameExitMessage(newMatchCount);
    }

    public boolean isRetrySelect() {
        RestartNumber startNumber = new RestartNumber(Input.inputRestartNumber());
        return startNumber.isReStartGame();
    }

}
