package java_advanced_01.day15;


import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class boj1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        Set<String> unseen = new HashSet<String>(); // 조회를 빠르게 하기 위해 HashSet 사용 : 시간복잡도 O(1)
        Set<String> ans = new TreeSet<String>();   // 사전순으로 출력하기 위해 TreeSet 사용
        String s;
        while (N-- > 0) {
            unseen.add(br.readLine());
        }
        while (M-- > 0) {
            s = br.readLine();
            if (unseen.contains(s))
                ans.add(s);
        }
        bw.write(Integer.toString(ans.size())+"\n");
        for (String an : ans) {
            bw.write(an+"\n");
        }
        bw.flush();
    }
}
