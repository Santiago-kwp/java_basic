package javabasic_01.day06;

public class mergeSortEx {

    // 정렬된 두 부분 배열을 병합하는 함수
    public static void merge(int[] arr, int left, int mid, int right) {
        // 좌측 부분 배열의 크기
        int n1 = mid - left + 1;
        // 우측 부분 배열의 크기
        int n2 = right - mid;

        // 임시 배열 생성
        int[] L = new int[n1];
        int[] R = new int[n2];

        // 데이터 복사
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // 병합 과정: 투 포인터 사용
        int i = 0; // L[]의 현재 인덱스
        int j = 0; // R[]의 현재 인덱스
        int k = left; // arr[] (원본 배열)의 현재 인덱스

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) { // 더 작은 값을 원본 배열에 넣음
                arr[k++] = L[i++];

            } else {
                arr[k++] = R[j++];
            }
        }

        // L[]에 남은 요소들을 모두 복사
        while (i < n1) {
            arr[k++] = L[i++];
        }

        // R[]에 남은 요소들을 모두 복사
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    // 병합 정렬의 재귀적인 분할 및 병합 함수
    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
            // 중간 지점 찾기
            int mid = (left + right-1) / 2;

            // 좌측 절반 정렬
            sort(arr, left, mid);
            // 우측 절반 정렬
            sort(arr, mid + 1, right);

            // 정렬된 두 절반을 병합
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] data = {12, 11, 13, 5, 6, 7, 9, 30, 200};
        System.out.println("정렬 전 배열:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();

        sort(data, 0, data.length - 1);

        System.out.println("정렬 후 배열:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println(); // 출력: 5 6 7 9 11 12 13 30 200
    }
}