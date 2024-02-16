public class Main {

    public static void main(String[] args) {
        int i = count(10);
        System.out.println("Count complete! Last value of counter: " + i);

        Printer printer = new Printer(true);
        printer.print("Hello world");
    }

    static int count(int to) {
        int i;
        for (i = 1; i <= to; i++) {
            System.out.println(i);
        }
//        throw new NullPointerException("This is our exeption for testing!");
        System.out.println("Out of the loop");
        return i;
    }
}

class Printer {
    private boolean ready;

    Printer(boolean readyBoolean) {
        ready = readyBoolean;
    }

    void print(String message) {
        System.out.println("Printing to console: " + message);
    }
}