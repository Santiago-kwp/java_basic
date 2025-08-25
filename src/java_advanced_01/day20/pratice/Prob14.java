package java_advanced_01.day20.pratice;

import java.io.*;
import java.util.Arrays;

//문제 : 정수 배열 {5,10,15,20} 을 array.dat에 저장한 후 다시 읽어 합계와 평균을 구하고 평균을 기준으로 정렬하여 콘솔에 출력하세요
public class Prob14 {
    public static void main(String[] args) {

        // 1. 정수 배열 {5, 10, 15, 20} ==> resource
        int[] array = new int[4];
        String fileName = "C:/Temp/array.dat";

        // 2. 배열을 파일에 저장 로직 구현

        // 3. 저장한 파일에서 배열 읽기



        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))){

            objectOutputStream.writeObject(new int[]{5, 10, 15, 20});

            objectOutputStream.flush();

            int[] arrays = (int[]) objectInputStream.readObject();
            int sum = Arrays.stream(arrays).reduce(0, Integer::sum);
            double avg = Arrays.stream(arrays).average().orElse(0.0);
            Arrays.sort(arrays);
            System.out.println(Arrays.toString(arrays));











        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
