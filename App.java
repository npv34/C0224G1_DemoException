import exception.MyException;
import exception.TriangleException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();
        System.out.println("Enter z: ");
        int z = scanner.nextInt();
        try {
            int result = perimeter(x, y, z);
            System.out.println(result);
        }catch (MyException | TriangleException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Xin chao moi nguoi");
        }

    }

    public static int perimeter(int x, int y, int z) throws MyException, TriangleException {
        if (x <= 0 || y <= 0 || z <= 0) {
            throw new MyException("Cac canh tam giac phai lon hon 0");
        }

        if (x + y <= z || x + z <= y || y + z <= x) {
            throw new TriangleException("Day khong phai la so do cua mot tam giac");
        }

        return  x + y + z;
    }

}

/*
  -b1: Xac dinh duoc co xay ra ngoai le hay k?
  -b2: Xu ly  ngoai le -> try_catch
Debug:
- Doc message error -> xac dinh bug: bug j, dong  bao nhieu
- Xu dung tool -> xem lai luong chay chuong trinh
 */
