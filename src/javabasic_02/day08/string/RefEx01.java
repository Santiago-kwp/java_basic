package javabasic_02.day08.string;

public class RefEx01 {
    public static void main(String[] args) {

        // 아직 힙 영역에 메모리가 할당되지는 않은 상태
        String refVar1 = null;
        String refVar2 = null;

        refVar1 = new String("자바"); // 힙 영역에 생성
        refVar2 = "자바";                // 리터럴 pool에 생성
        String refVar3 = "자바";         // refVar2와 같은 주소를 참조하고 있음
        String refVar4 = null;


        System.out.println(refVar1 == refVar2); // false
        System.out.println(refVar1 == refVar3); // false
        System.out.println(refVar2 == refVar3); // true
        System.out.println("------------------");
        System.out.println(refVar1.equals(refVar2));  // true
        System.out.println(refVar1.equals(refVar3));  // true
        System.out.println(refVar2.equals(refVar3));  // true

        System.out.println("--------------NullPointerException");
        System.out.println(refVar4); // null -> 아직 객체의 공간을 할당받지 못한 상태 (인스턴스가 아니므로 힙 영역에 메모리 할당이 안된 상태)
        System.out.println(refVar4.length()); // java.lang.NullPointerException: Cannot invoke "String.length()" because "refVar4" is null



    }
}
