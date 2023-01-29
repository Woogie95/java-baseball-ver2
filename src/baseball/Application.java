package baseball;

public class Application {
    public static void main(String[] args) {
        try {
            BaseballManager baseballManager = new BaseballManager();
            baseballManager.runBaseballGame();
        } catch (NumberFormatException msg) {
            System.out.println(msg.getMessage());
        } catch (IllegalArgumentException msg) {
            System.out.println(msg.getMessage());
        } catch (Exception msg) {
            System.out.println("알수 없는 예외가 발생하였습니다.");
        }
    }

}
