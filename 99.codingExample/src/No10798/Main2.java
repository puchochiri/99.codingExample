package No10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()); //공백단위로 읽어드릴수 있는 라인 추가
        int c = Integer.parseInt(st.nextToken()); //한줄에서 공백 단위로 읽음
        int d = Integer.parseInt(st.nextToken()); //한줄에서 공백 단위로 읽음
        System.out.println(c + " " + d);

        st = new StringTokenizer(br.readLine(),","); // , 단위로 읽어드릴수 있는 라인 추가
        int e = Integer.parseInt(st.nextToken()); //한줄에서 , 단위로 읽음
        int f = Integer.parseInt(st.nextToken()); //한줄에서 , 단위로 읽음
        System.out.println(e + " " + f);
	}
}