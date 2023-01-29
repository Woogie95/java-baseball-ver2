package baseball;

import static baseball.MatchCount.DEFAULT_BALL_NUMBER;
import static baseball.MatchCount.DEFAULT_STRIKE_NUMBER;

public class Output {

    public static final int STRIKE_MAX_VALUE = 3;

    public static void printNumberBaseballGameStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printResult(MatchCount matchCount) {
        printNoneMessage(matchCount);
        printStrikeMessage(matchCount);
        printBallMessage(matchCount);
        printStrikeBallMessage(matchCount);
    }

    private static void printNoneMessage(MatchCount matchCount) {
        if (matchCount.getStrike() == DEFAULT_STRIKE_NUMBER && matchCount.getBall() == DEFAULT_BALL_NUMBER) {
            System.out.println("낫싱");
        }
    }

    private static void printStrikeMessage(MatchCount matchCount) {
        if (matchCount.getStrike() > DEFAULT_STRIKE_NUMBER && matchCount.getBall() == DEFAULT_BALL_NUMBER) {
            System.out.println(matchCount.getStrike() + "스트라이크");
        }
    }

    private static void printBallMessage(MatchCount matchCount) {
        if (matchCount.getStrike() == DEFAULT_STRIKE_NUMBER && matchCount.getBall() > DEFAULT_BALL_NUMBER) {
            System.out.println(matchCount.getBall() + "볼");
        }
    }

    private static void printStrikeBallMessage(MatchCount matchCount) {
        if (matchCount.getStrike() > DEFAULT_STRIKE_NUMBER && matchCount.getBall() > DEFAULT_BALL_NUMBER) {
            System.out.println(matchCount.getStrike() + "스트라이크" + " " + matchCount.getBall() + "볼");
        }
    }

    public static boolean printGameExitMessage(MatchCount matchCount) {
        if (matchCount.getStrike() == STRIKE_MAX_VALUE) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료" + "\n" + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            return true;
        }
        return false;
    }

}
