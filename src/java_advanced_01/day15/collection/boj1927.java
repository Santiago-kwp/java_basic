package java_advanced_01.day15.collection;

import java.io.*;
import java.util.*;


public class boj1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        AbstractQueue<Long> q = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());
        long x = 0;

        while(N-- > 0) {
            x = Long.parseLong(br.readLine());
            if (x == 0) {
                if (q.isEmpty()) bw.write("0\n");
                else {
                    bw.write(q.remove().toString()+"\n");
                }
            } else {
                q.add(x);
            }

        }
        bw.flush();
    }
}
