package java_advanced_01.day21.practice.prob4;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.*;

@AllArgsConstructor
@ToString
public class Account implements Serializable {
    @Serial
    private static final long serialVersionUID = 42L;

    private String owner;
    private transient int balance;

    @Serial
    private void writeObject(ObjectOutputStream outputStream) throws IOException {
        outputStream.defaultWriteObject();
        outputStream.writeObject(this.balance); // transient 필드 수동 직렬화
    }

    @Serial
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.balance = (int)objectInputStream.readObject(); // transient 필드 수동 역직렬화
    }



}
