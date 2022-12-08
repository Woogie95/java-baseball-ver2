package baseball;
//리드미 x
//기능구현 x
//예외처리 x
//네이밍 x
//상수처리 x
//테스트 코드 x

//기본 들여쓰기 2까지, 메소드 라인 15까지
//if문 else 지양하기
//for문 fori 지양하기
public class Application {
    public static void main(String[] args) {
        try {
            Manager manager = new Manager();
            manager.runBaseball();
        } catch (IllegalArgumentException msg) { // NumberFormatException 이 Illegal 상속 받고 있으므로 Illegal 로 catch
            System.out.println(msg.getMessage());
        } catch (Exception msg) {
            System.out.println("알수 없는 예외가 발생하였습니다.");
        }
    }

}