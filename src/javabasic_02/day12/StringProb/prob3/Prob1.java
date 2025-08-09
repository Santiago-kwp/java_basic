package javabasic_02.day12.StringProb.prob3;

import java.util.ArrayList;

public class Prob1 {
	public static void main(String[] args) {
		Prob1 p = new Prob1();
//		String addr = "서울시,강남구,싹아트홀,신세계아이앤씨";
		String addr = "hello+world+java+++we+are+the++world";
//		String[] addrArr = p.split(addr, ',');
		String[] addrArr = p.split(addr, '+');
		System.out.println("배열 크기 : " + addrArr.length);
		for(int i=0; i<addrArr.length; i++){
			System.out.print(addrArr[i] + " ");
		}
		System.out.println();
		for (String str : addr.split("\\+")) {
            System.out.print(str+ " ");
        }
	}

	public String[] split(String str, char separator){
		ArrayList<String> strs= new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			 if (str.charAt(i) != separator) {
				sb.append(str.charAt(i));
			 } else {
				 strs.add(sb.toString());
				 sb = new StringBuilder();
			 }
			 // 마지막에 남아있는거 다 넣기
			if (i == str.length()-1) strs.add(sb.toString());

		}

		return strs.toArray(new String[0]);
		
	}
}



















