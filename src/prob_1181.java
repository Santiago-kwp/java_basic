import java.util.Scanner;
import java.util.TreeSet;


class Word implements Comparable<Word>{
    private String str;
    public Word(String str) {this.str = str;}

    @Override
    public int compareTo(Word w) {
        // 1. 길이가 짧은 것부터 정렬
        if (this.str.length() != w.str.length()) {
            return this.str.length() - w.str.length();
        }
        // 2. 길이가 같으면 사전 순으로 정렬
        return this.str.compareTo(w.str);
    }

    @Override
    public String toString() {
        return this.str;
    }
}

public class prob_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        TreeSet<Word> tree = new TreeSet<>();
        sc.nextLine();
        while(N-- > 0) {
            System.out.println(N);
            tree.add(new Word(sc.nextLine()));
        }


        for (Word wd:tree)
            System.out.println(wd);
    }
}
