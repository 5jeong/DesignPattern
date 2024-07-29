package prototype.ex1;

import prototype.ex1.framework.ConcreateProduct;
import prototype.ex1.framework.Product;

public class UnderlinePen extends ConcreateProduct {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int ulen = s.length();
        System.out.println(s);
        for (int i = 0; i < ulen; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

}
