package templateMethod.ex4;

public interface AbstractDisplay {
    // open, print, close는 하위 클래스에 구현을 맡기는 추상 클래스
    void open();
    void print();
    void close();

    // display는 AbstractDisplay에서 구현하는 메소드
    public default void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
