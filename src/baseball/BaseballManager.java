package baseball;

import java.util.List;

public class BaseballManager {

    public void runBaseballGame() {
        Output.printNumberBaseballGameStartMessage(); // 시작 메시지
        boolean startGame = true;
        while (startGame) {
            List<Integer> computerNumbers = ComputerNumber.createComputerRandomNumbers();
            System.out.println("컴퓨터 숫자" + computerNumbers);
            startGame = false;


            boolean repeat = true;
            while (repeat) {
                System.out.println("컴퓨터 숫자" + computerNumbers);
                List<String> userNumbers = UserNumberFactory.createUserNumbers(Input.inputUserNumber());
                UserNumber userNumber = new UserNumber(userNumbers);
                MatchCount matchCount = new MatchCount();
                MatchCount newMatchCount = matchCount.addAllCount(userNumber, computerNumbers);
                Output.printResult(newMatchCount);

                // TODO - 컴퓨터 숫자 바뀌지 않고 일단 반복
                if (Output.printGameExitMessage(newMatchCount)) {
                    repeat = false;
                }
            }


            // TODO - 1 or 2 입력했을 때 시작 및 종료 여부
            StartNumber startNumber = new StartNumber(Input.inputRestartNumber());
            if (startNumber.isReStartGame()) {
                startGame = true;
            }


        }
    }

    // TODO - 재시작 기능 나누기
    public boolean asd(StartNumber startNumber) {
        if (startNumber.isReStartGame()) { // 1이냐 그럼 트루고 다시 시작
            return true;
        }
        return false;
    }

}
