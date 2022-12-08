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
    public static void main(String[] args) { //구현능력 부족하다. 내가 만든 클래스를 활용해서 만들려니 처음 의도(계획)과 달라지니 연결 불가능
        try { //숫자야구 5번은 넘게 했다.
            Manager manager = new Manager(); //쉽게 생각했다.
            manager.runBaseball(); //만든 부분에 대해서만 피드백을 할 것 이다.
        } catch (IllegalArgumentException exceptionMessage) {
            throw new IllegalArgumentException(exceptionMessage.getMessage());

        }
    }
}