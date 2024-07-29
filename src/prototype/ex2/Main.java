package prototype.ex2;

import prototype.ex2.framework.Manager;
import prototype.ex2.framework.Product;

public class Main {
    public static void main(String[] args) {
        //준비
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        //등록
        manager.register("strong message",upen);
        manager.register("warning box",mbox);
        manager.register("slash box",sbox);

        //생성과 사용
        Product p1 = manager.create("strong message");
        p1.use("Hello, world");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world");

        Product p1Copy = p1.createCopy();
        Product p2Copy = p2.createCopy();
        Product p3Copy = p3.createCopy();

    }
}