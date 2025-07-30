package day06;
// == , != 연산자는 변수의 값이 같은지, 아닌지를 조사한다.
// 참조 타입 변수의 값은 객체의 주소(번지)를 저장하므로 (main()의 스택 프레임내에)
// 참조 타입 변수의 ==, != 비교는 주소값을 비교하는 것이다.

public class PrimitiveEqualType {

    public static void main(String[] args) {
        // 정수형 배열 arr1, arr2, arr3 선언 ~ 아직 메모리에 값 할당X
        int[] arr1;
        int[] arr2;
        int[] arr3;

        // 정수형 배열 arr1, arr2, arr3의 메모리 생성 -> new를 통한 힙 영역 내 인스턴스 생성 하면서
        // arr1, arr2, arr3의 new 키워드를 통해 생긴 주소값을 메인 프레임의 참조변수에 저장
        // 인스턴스가 만들어지면서 0으로 초기화된다.

        arr1 = new int[3];
        arr2 = new int[3];
        arr3 = new int[3];

        System.out.println(arr1.length); // 3
        System.out.println(arr2.length); // 3
        System.out.println(arr3.length); // 3

        // arr3에 차례차례 1,2,3을 할당하고, 결과를 입력하자
        arr1[2] = 3;
        arr1[0] = 1;
        arr1[1] = 2;


        // arr3에 값을 차례로 itar, iter 방식을 통해서 5,6,7  값을 할당하고, 할당한 값을 확인하는 iter, itar

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i + 5;
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.printf("%d ", arr3[i]);
        }
        System.out.println();
        
        // iter 방식

        for (int i : arr3) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        // 주소값 비교
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);
        System.out.println("============================================");
        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);
        System.out.println(arr1 == arr3);
        System.out.println("========주소값 복사하여 다른 참조변수에 할당=======");
        arr2 = arr3;
        System.out.println("========주소값 비교=======");
        System.out.println(arr2 == arr3);





    }
}
