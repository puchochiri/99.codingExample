package No2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args)  {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String N = st.nextToken();
			
			int B = Integer.parseInt(st.nextToken());
			br.close();
			
			int tmp = 1;
			int sum = 0;
		
			for (int i = N.length()-1; i >= 0; i--) {
				char C = N.charAt(i);
				
				if('A' <= C && C <= 'Z') {
					sum += (C - 'A' + 10) * tmp;
					//A=65 Z=90
				} else {
					sum += (C - '0') * tmp;
				}
				tmp *= B;

				
			}
			System.out.println(sum);

			
		} catch (Exception e) {
			// TODO: handle exception
		}

		
		

	}

}
