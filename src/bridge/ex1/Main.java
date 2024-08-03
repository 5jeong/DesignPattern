package bridge.ex1;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Korea."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        d1.display();
        System.out.println();
        d2.display();
        System.out.println();
        d3.display();
        System.out.println();
        d3.multiDisplay(5);

        RandomCountDisplay randomCountDisplay = new RandomCountDisplay(new StringDisplayImpl("Hello, Korea."));
        randomCountDisplay.randomDisplay(10);

//        CountDisplay countDisplay = new CountDisplay(new FileDisplayImpl("star.txt"));
//        countDisplay.multiDisplay(3);
    }
}
