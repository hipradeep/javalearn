package practice;

    public class ThrowsKeywords {
        public static void main(String[] args) {

            try{
                System.out.println(area(-5));
            }catch (Exception e){
                System.out.println("Exception");
            }

        }

        static double area(int r) throws ArithmeticException{
            if (r<0){
                throw new ArithmeticException();
            }
            return Math.PI*r*r;
        }
    }
