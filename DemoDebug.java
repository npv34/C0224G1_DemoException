public class DemoDebug {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;

        for (int i = 5; i >= 0; i--) {
            y = x / i;
            System.out.println("x / " + i + " = " + y);
        }
    }
}
