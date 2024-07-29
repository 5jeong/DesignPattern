package flyweight.ex1;

import flyweight.BigChar;
import flyweight.BigCharFactory;

public class BigString2 {
    // '큰 문자'의 배열
    private BigChar[] bigchars;


    public BigString2(String string){
        initShared(string);
    }
    // 생성자
    public BigString2(String string, boolean shared) {
        if(shared){
            initShared(string);
        }else{
            initUnshared(string);
        }
    }

    private void initUnshared(String string) {
        bigchars = new BigChar[string.length()];
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = new BigChar(string.charAt(i));
        }
    }

    private void initShared(String string) {
        BigCharFactory factory = BigCharFactory.getInstance();
        bigchars = new BigChar[string.length()];
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    // 표시
    public void print() {
        for (BigChar bc: bigchars) {
            bc.print();
        }
    }
}
