package practice;

public class ExceptionHandlingExample {
    public static void main(String[] args) throws Exception {
        multipleCatchBlock();
        tryCatchFinally();
        tryFinally();
        exceptionPropagation();
        throwable();
        nestedTry();
    }

    private static void nestedTry() {
        try {

            int a[] = { 1, 2, 3, 4, 5 };
            System.out.println(a[5]);
            try {
                int x = a[2] / 0;
            }
            catch (ArithmeticException e2) {
                System.out.println("division by zero is not possible");
            }
        }
        catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println("Element at such index does not exists");
        }
    }

    private static void throwable() throws Exception {


        try {
            divide(2, 0);
        } catch (Throwable e) {

            System.out.println("Message String = "
                    + e.getMessage());
        }
    }

    public static void divide(int a, int b)
            throws Throwable {
        int c = a / b;
        System.out.println("Result:" + c);
    }

    private static void exceptionPropagation() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }

    private static void n() {
        m();
    }

    private static void m() {
        int data = 50 / 0;
    }

    private static void multipleCatchBlock() {
        try {
            int a[] = new int[5];

            System.out.println(a[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
    }

    private static void tryFinally() {
        String str;
        try {
            str = null;
        } finally {
            System.out.println("finally");
        }
    }

    private static void tryCatchFinally() {
        int a = 5;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("end");
        }
    }
}
