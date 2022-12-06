package baseball;

public class Comparison {

    public static void compare(Judge judge) {
        compareStrike(judge);
        compareBall(judge);
        compareStrikeWithBall(judge);
        compareNothing(judge);
    }

    private static void compareStrike(Judge judge) {
        if (judge.getBall() == 0 && judge.getStrike() < 0) {
            Output.printStrikeCaseMessage(judge);
        }
    }

    private static void compareBall(Judge judge) {
        if (judge.getBall() > 0 && judge.getStrike() == 0) {
            Output.printBallCaseMessage(judge);
        }
    }

    private static void compareStrikeWithBall(Judge judge) {
        if (judge.getBall() > 0 && judge.getStrike() > 0) {
            Output.printStrikeWithBallCaseMessage(judge);
        }
    }

    private static void compareNothing(Judge judge) {
        if (judge.getBall() == 0 && judge.getStrike() == 0) {
            Output.printNothingMessage();
        }
    }

}
