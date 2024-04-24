import java.util.Arrays;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            int c = calculate(4,5);
            System.out.println(c);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
     }

     public static int calculate(int x, int y) throws Exception {
        if (y == 0) {
            throw new Exception("Y khac 0");
        }
        return  x / y;
     }
}
