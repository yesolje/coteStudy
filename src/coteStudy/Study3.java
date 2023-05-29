package coteStudy;

public class Study3 {

	public static void main(String[] args) {
		//1번 문제
		//알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
		//포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
		//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
		String word = "baekjoon";
		System.out.println("a  b c d e f g h i j k l m n o p q r s t u v w x y z");
		int [] result = new int[26];
		for(int i=0;i<result.length;i++) {
			result[i] = -1;
		}
		for(int i=0;i<word.length();i++) {
			char temp = word.charAt(i); //b
			int tempASCI = (int)temp;//98
			int x = tempASCI - 97; //1
			if(result[x]==-1 ) {
				result[x] = i;
			}
		}
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		System.out.println();
		
		//2번 문제
		//알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
		String input = "0";
		char temp2 = input.charAt(0);
		int ASCI2 = (int)temp2;
		System.out.println(ASCI2);
		
		//3번 문제
		//N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
		// 1 1 1      3 3 3     4 4 4
		// 2 2 2  +   4 4 4   = 6 6 6
		// 0 1 0      5 5 100   5 6 100
		int N = 3;
		int M = 3;
		int [][] arr1= new int[N][M];
		int [][] arr2= new int[N][M];
		int [][] arrResult = new int[N][M];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				arrResult[i][j] = arr1[i][j]+ arr2[i][j];
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(arrResult[i][j]+ " ");
			}
			System.out.println();
		}
		//4번 문제
		//B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
		//10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
		//A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
		//36진법 ZZZZZ 를 10진법으로 변환하라
		
		//2진법 110 => 2^2*1 + 2^1*1 + 2^0*0 = 4+ 2+ 0 = 6 
		String mynumber = "ZZZZZ";
		int arithmetic = 36;
		int result2 = 0;
		for(int i =0;i<mynumber.length();i++) {
			char temp = mynumber.charAt(i);
			int tempNum;
			if((int)temp >=65 && (int)temp <=90) { //대문자 알파벳이 오는 경우
				tempNum = (int)temp - 55;
			}else { //숫자가 오는 경우                             
				tempNum = (int)temp-48;
			}
			int dd = (int)Math.pow(arithmetic,mynumber.length()-1-i);
			result2 += dd*tempNum;
		}
		System.out.println(result2);
		System.out.println("****************");
		//5번 문제
		//N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
		int[] myarr = {5,4,3,2,1};
		for(int i=1;i<myarr.length;i++) {
			for(int j=0;j<myarr.length-i;j++) {
				if(myarr[j] > myarr[j+1]) {
					int temp = myarr[j];
					myarr[j] = myarr[j+1];
					myarr[j+1] = temp;
				}
			}
		}
		for(int m=0;m<myarr.length;m++) {
			System.out.print(myarr[m]);
		}
	}
	
	
	
	

}
