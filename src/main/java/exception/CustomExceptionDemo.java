package exception;

public class CustomExceptionDemo {
    public void throwCustomException(boolean errorCondition) throws CustomException {
        if (errorCondition) {
            throw new CustomException("Что-то пошло не так");
        } else {
            System.out.println("Исключение не вызвано");
        }
    }
    public void handleCustomException(boolean errorCondition) {
        try {
            throwCustomException(errorCondition);
        } catch (CustomException e) {
            System.out.println("Вызов кастомного исключения");
        }
    }
    public static void main(String[] args) {
        CustomExceptionDemo demo = new CustomExceptionDemo();
        demo.handleCustomException(true);
        demo.handleCustomException(false);
    }
}




