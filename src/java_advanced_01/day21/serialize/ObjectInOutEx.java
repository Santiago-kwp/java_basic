package java_advanced_01.day21.serialize;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
class User implements Serializable {
    private static final long serialVersionUID = 42L;
    private String name;
    private transient int age; // transient 키워드는 직렬화 대상에서 필드를 제외한다.
    public static int counter = 0; // static 필드도 직렬화 대상에서 제외한다.

}

@NoArgsConstructor
@AllArgsConstructor
@Data
class Product implements Serializable{
    private String pname;
    private int price;

}

public class ObjectInOutEx {
    public static void main(String[] args) throws Exception {
        // 1.  C:/Temp/object.dat 에 파일 객체에 파일입력 객체를 생성해주세요.
        String fileName = "C:/Temp/object.dat";

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);

        // 2. 생성된 파일 입력스트림 객체에 객체 출력 스트림 객체를 끼워주세요
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        // 3. 객체 생성
        User user = new User("신세계", 20);
        Product product = new Product("노트북", 1500000);
        int[] arr1 = {10, 20, 30};
        List<Product> products = Arrays.asList(product);

        // 4. 위 4개의 객체를 object.dat 파일에 저장
        objectOutputStream.writeObject(products);
        objectOutputStream.writeObject(arr1);
        objectOutputStream.writeObject(product);
        objectOutputStream.writeObject(user);

        // 5.
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.flush();
        fileOutputStream.close();

        // 파일에서 읽어서 객체를 복원시켜주세요.
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        try {
            while(true) {
                Object object = objectInputStream.readObject();
                System.out.println(object);
            }
        } catch (EOFException e) {
            System.out.println("파일의 끝");
        } finally {
            objectInputStream.close();
            fileInputStream.close();
        }


        // 파일에서 읽어서 ObjectInputStream
        /*FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        List<Product> listProductRead = (List<Product>) objectInputStream.readObject();
        int[] arr1Read = (int[]) objectInputStream.readObject();
        Product productRead = (Product) objectInputStream.readObject();
        User userRead = (User) objectInputStream.readObject();

        listProductRead.stream().forEach(System.out::println);
        Arrays.stream(arr1Read).forEach(i -> System.out.print(i + " "));
        System.out.println(productRead);
        System.out.println(userRead);

        objectInputStream.close();
        fileInputStream.close();
*/
    }
}
