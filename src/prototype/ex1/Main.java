package prototype.ex1;

import com.sun.source.tree.Tree;
import java.util.HashSet;
import java.util.TreeSet;
import prototype.ex1.framework.Manager;
import prototype.ex1.framework.Product;

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

        System.out.println();
        Product p1Copy = p1.createCopy();
        p1Copy.use("Example");
        System.out.println();
        Product p2Copy = p2.createCopy();
        p2Copy.use("Example");
        System.out.println();
        Product p3Copy = p3.createCopy();
        p3Copy.use("Example");

        TreeSet<Integer> treeSet = new TreeSet();




    }
}
