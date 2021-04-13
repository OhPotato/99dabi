package cordingTest;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int list[] = {300,60,10};
		//int cnt=0;
		int cnt[]=new int[3];
		int midT=0;
		System.out.println("시간을 입력하세요. : ");
		int time=Integer.parseInt(sc.nextLine());
		if(time%10==0) {
			midT=time;
			for(int i = 0; i<list.length;i++) {
				//cnt+=(int)(midT/list[i]);
				cnt[i]+=(int)(midT/list[i]);
				midT=midT%list[i];
				if(midT==0) {
					break;
				}
				//System.out.println(cnt);
			}
			for(int i = 0; i<cnt.length;i++)
				System.out.print(cnt[i]+" ");
		}else {
			System.out.println(-1);
		}
	}
}
