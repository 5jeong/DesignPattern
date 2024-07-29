package flyweight;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar {
    // 문자의 이름
    private char charname;
    // 큰 문자를 표현하는 문자열('#' '.' '\n'으로 이루어진 열)
    private String fontdata;

    // 생성자
    public BigChar(char charname) {
        this.charname = charname;
        try {
            String filename = "src/flyweight/big" + charname + ".txt";
//            System.out.println("Reading file: " + filename);
            StringBuilder sb = new StringBuilder();
            for (String line: Files.readAllLines(Path.of(filename))) {
                sb.append(line);
                sb.append("\n");
            }
            this.fontdata = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
            this.fontdata = charname + "?";
        }
    }

    // 큰 문자를 표시한다
    public void print() {
        System.out.print(fontdata);
    }
}