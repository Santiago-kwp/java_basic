package java_advanced_01.day17.anonymousClass.lambdaEx.lambda03;

public class Button {
    // 정적 멤버 인터페이스 (함수형 인터페이스로 정의)
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener; // 버튼의 멤버 변수
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }

    public static void main(String[] args) {
        Button buttonOK = new Button();

        // Ok 버튼 객체에 람다식을 주입
        buttonOK.setClickListener(
                ()-> {
                    System.out.println("Ok 버튼을 클릭");
                }
        );

        // Ok 버튼 클릭
        buttonOK.click();

        // Cancel 버튼 만들기
        Button buttonCancel = new Button();

        // Cancel 버튼 객체에 람다식 주입
        buttonCancel.setClickListener(
                () -> {
                    System.out.println("Cancel 버튼을 클릭");
                }
        );

        // Cancel 버튼 클릭
        buttonCancel.click();


    }
}
