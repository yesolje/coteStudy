package coteStudy;

public class Study3 {

	public static void main(String[] args) {
		//1�� ����
		//���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, 
		//���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
		
		//2�� ����
		//���ĺ� �ҹ���, �빮��, ���� 0-9�� �ϳ��� �־����� ��, �־��� ������ �ƽ�Ű �ڵ尪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		String input = "0";
		char temp2 = input.charAt(0);
		int ASCI2 = (int)temp2;
		System.out.println(ASCI2);
		
		//3�� ����
		//N*Mũ���� �� ��� A�� B�� �־����� ��, �� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
		//4�� ����
		//B���� �� N�� �־�����. �� ���� 10�������� �ٲ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//10������ �Ѿ�� ������ ���ڷ� ǥ���� �� ���� �ڸ��� �ִ�. �̷� ��쿡�� ������ ���� ���ĺ� �빮�ڸ� ����Ѵ�.
		//A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
		//36���� ZZZZZ �� 10�������� ��ȯ�϶�
		
		//2���� 110 => 2^2*1 + 2^1*1 + 2^0*0 = 4+ 2+ 0 = 6 
		String mynumber = "ZZZZZ";
		int arithmetic = 36;
		int result2 = 0;
		for(int i =0;i<mynumber.length();i++) {
			char temp = mynumber.charAt(i);
			int tempNum;
			if((int)temp >=65 && (int)temp <=90) { //�빮�� ���ĺ��� ���� ���
				tempNum = (int)temp - 55;
			}else { //���ڰ� ���� ���                             
				tempNum = (int)temp-48;
			}
			int dd = (int)Math.pow(arithmetic,mynumber.length()-1-i);
			result2 += dd*tempNum;
		}
		System.out.println(result2);
		System.out.println("****************");
		//5�� ����
		//N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
