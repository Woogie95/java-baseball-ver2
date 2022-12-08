package baseball;

public class Comparison {

    public static void compare(Result result) {
        compareStrike(result);
        compareBall(result);
        compareStrikeWithBall(result);
        compareNothing(result);
    }

    private static void compareStrike(Result result) {
        if (result.getBall() == 0 && result.getStrike() < 0) {
            Output.printStrikeCaseMessage(result);
        }
    }

    private static void compareBall(Result result) {
        if (result.getBall() > 0 && result.getStrike() == 0) {
            Output.printBallCaseMessage(result);
        }
    }

    private static void compareStrikeWithBall(Result result) {
        if (result.getBall() > 0 && result.getStrike() > 0) {
            Output.printStrikeWithBallCaseMessage(result);
        }
    }

    private static void compareNothing(Result result) {
        if (result.getBall() == 0 && result.getStrike() == 0) {
            Output.printNothingMessage();
        }
    }

}
