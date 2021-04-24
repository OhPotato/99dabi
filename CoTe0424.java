import java.util.Scanner;

public class CoTe0424 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇권을 정렬할 까요?");
		int n = sc.nextInt();
		System.out.println(n+"권의 책을 입력합니다.");
		int bookList[]= new int[n]; 
		
		for(int i =0; i<n;i++) {
			System.out.print(i+"번째 책을 입력해 주세요 : ");
			bookList[i]=sc.nextInt();
		}
		//System.out.println(bookList);
		int cnt=0;
		boolean run=true;
		int i=n,j; 
		while(run) {
			
			j=1;
			 while(j<n) {
				 if(bookList[j]==i) {
					 if(bookList[j-1]==(i-1)) {
//						 System.out.println(bookList[j]+"-1 == "+bookList[j-1]);
//						 System.out.println(j+"통과");
//						 System.out.println("cnt="+cnt);
//						 System.out.println();
//					 
					 }else if(bookList[0]==n) {
						 cnt=n-1;
//						 System.out.println("cnt="+cnt);
//						 System.out.println();
						 run=false;
						 break;
					}
					 else {
						// System.out.println(bookList[j]+"-1 != "+bookList[j-1]);
						 
						 cnt=bookList[j]-1;
						 //System.out.println("cnt="+cnt);
						 run=false;
						 break;
					 }
				 }				 
				 j++;
			 }
			i--;
			if(i==0) {
				break;
			}
		}
	System.out.println("\n 정렬 횟수 : "+cnt);	
	}
}
