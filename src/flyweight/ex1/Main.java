package flyweight.ex1;

import flyweight.BigString;

public class Main {
    private static BigString2[] bsarray = new BigString2[10000];

    public static void main(String[] args) {
        System.out.println("공유한 경우:");
        testAllocation(true);
        System.out.println("공유하지 않는 경우:");
        testAllocation(false);
    }

    public static void testAllocation(boolean shared) {
        for (int i = 0; i < bsarray.length; i++) {
            bsarray[i] = new BigString2("1212123", shared);
        }
        showMemory();
    }

    public static void showMemory() {
        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("사용 메모리 = " + used);
    }
}
