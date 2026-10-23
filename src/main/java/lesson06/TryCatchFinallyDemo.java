package lesson06;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 1;
            System.out.println(a / b);

           // String s = null;
            //System.out.println(s.length());

            int[] array = {1,2,3};
            System.out.println(array[100]);
            throw new IllegalStateException("Ngoại lệ ko xác định");
        } catch (ArithmeticException exception) {
            // System.out.println("Không thể chia cho 0");
            System.out.println("b");
        }catch (NullPointerException | ArrayIndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println("c");
        }

    }
}
