package exception;

public class Second {

    public static void main(String[] args) {
        System.out.println(divide(1,2));
        try{
           System.out.println(divide(1,0));
        } catch (ArithmeticException ex){
           System.out.println("Ноль в знаменателе!");
        }

        System.out.println(createPositiveNumber(1));
        try {
            System.out.println(createPositiveNumber(-1));
        } catch (IllegalArgumentException ex){
            System.out.println("Отрицательное число");
        }

        System.out.println(isTrue(true));

        try{
            System.out.println(isTrue(false));
        } catch (IllegalArgumentException ex){
            System.out.println("False!");
        }

    }

    public static double divide(double a, double b){
        if (b == 0){
            throw new ArithmeticException("Ноль в знаменателе!");
        }
        return a / b;
    }

    public static int createPositiveNumber(int number){
        if(number < 0){
            throw new IllegalArgumentException("Отрицательное число");
        }
        return number;
    }

    public static boolean isTrue(boolean result){
        if(!result){
            throw new IllegalArgumentException("False!");
        }
        return result;
    }

}
