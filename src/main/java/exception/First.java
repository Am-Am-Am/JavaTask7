package exception;

public class First {

    public static void main(String[] args) {
        try{
            divideByZero();
        } catch (ArithmeticException ex){
            System.out.println("На ноль не делим!");
        }

        try {
            playWithNullPointer();
        } catch (NullPointerException ex){
            System.out.println("Пустой импорт");
        }

        try {
            accessToUnexistingElement();
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Выход за пределы массива");
        }




        try{
            tryToCreateFunnyArray();
        } catch (NegativeArraySizeException ex){
            System.out.println("Не в ту сторону");
        }

        try{
            searchSomethingOutString();
        } catch(StringIndexOutOfBoundsException ex){
            System.out.println("Нет такого индекса");
        }


        System.out.println("Ура! Меня снова печают");
    }


    public static void divideByZero() {
        int a = 777 / (666 - 666);
    }

    public static void accessToUnexistingElement(){
        int[] arr = {1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length+1; i++) {
            System.out.printf("%d,", arr[i]);
        }
    }

    public static void playWithNullPointer() {
        String importantData = null;
        if(importantData == null){
            throw new NullPointerException();
        }
        System.out.println("important is " + importantData);

    }
//
    public static void tryToCreateFunnyArray() {
        int i[] = new int[-5];
    }
//
    public static void searchSomethingOutString() {
        String secret = "Пин-код от карты: 123";
        secret.charAt(22);
    }

}
