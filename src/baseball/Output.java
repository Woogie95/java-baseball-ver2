package baseball;

public class Output {

    public static void printNumberBaseballGameStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printResult(MatchCount matchCount) {
        printNoneMessage(matchCount);
        printStrikeMessage(matchCount);
        printBallMessage(matchCount);
        printStrikeBallMessage(matchCount);
    }

    public static void printNoneMessage(MatchCount matchCount) {
        if (matchCount.getStrike() == 0 && matchCount.getBall() == 0) {
            System.out.println("낫싱");
        }
    }

    public static void printStrikeMessage(MatchCount matchCount) {
        if (matchCount.getStrike() > 0 && matchCount.getBall() == 0) {
            System.out.println(matchCount.getStrike() + "스트라이크");
        }
    }

    public static void printBallMessage(MatchCount matchCount) {
        if (matchCount.getStrike() == 0 && matchCount.getBall() > 0) {
            System.out.println(matchCount.getBall() + "볼");
        }
    }

    public static void printStrikeBallMessage(MatchCount matchCount) {
        if (matchCount.getStrike() > 0 && matchCount.getBall() > 0) {
            System.out.println(matchCount.getStrike() + "스트라이크" + " " + matchCount.getBall() + "볼");
        }
    }

    public static boolean printGameExitMessage(MatchCount matchCount) {
        if (matchCount.getStrike() == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료" + "\n" + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            return true;
        }
        return false;
    }

}
