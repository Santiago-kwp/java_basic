package java_advanced_01.day14.exceptionEx;

public class ExceptionEx01 {
    public static void main(String[] args) {
        String[] array = {"100","lOO"};

        // array에서 값을 추출해서 숫자로 바꾸어 출력하려고 한다.
        // 해당 예외사항을 예측하여 처리하세요.
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.println(Integer.parseInt(array[i]));
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        catch (NumberFormatException e1) {
            System.out.println(e1.getMessage());
            e1.printStackTrace();
        }

    }
}
