package coteStudy;

public class Study2 {

	public static void main(String[] args) {
		//1�� ����
		///ȭ�� �����ؼ� K���� ����� ����� �� �� ȭ�󰳼��� �ּҷ� ���� �� �ʿ��� ȭ���� ���� ���ض�
		//�����, ȭ��� [1,5,10,50,100,500,1000,5000,10000,50000] �� ������ �־�����.
		int [] bill = {1,5,10,50,100,500,1000,5000,10000,50000}; 
		int insert = 4790;
		int result =0;
		for(int i=0;i<bill.length;i++) {
			if(insert>=bill[(bill.length-1)-i]) {
				insert -= bill[(bill.length-1)-i];
				result ++;
				i--;
			}
		}
		System.out.println(result);
		
		//2�� ����
		//������ �־����� ��, �����̸� true, �ƴϸ� false�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
		int year = 1900;
		boolean result2 = false;
		if(year%4==0 && year%100!=0) {
			result2=true;
		}else if(year%400==0 ) {
			result2=true;
		}
		System.out.println(result2);
		
		//3�� ����
		//N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
		int mynumber = 3;
		for(int i=1;i<10;i++) {
			System.out.println(mynumber+"*"+i+"="+i*mynumber);
		}
		
		//4�� ����
		//N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//ex)[2,5,1,9,3] -> �ּҰ� 1 �ִ밪9
		
		int[] arr = {2,5,1,9,3};
		int max;
		int min;
		max = arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				max=arr[i+1];
			}
		}
		System.out.println("max:"+max);
		min = arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				min=arr[i];
			}
		}
		System.out.println("min:"+min);
		//5�� ����
		//���ĺ� �ҹ��ڷ� �̷��� �ܾ �־��� �� �� �ܾ ������ ���� ���� �ڿ��� ���� ���� ������ Ȯ���ϴ� ���α׷��� �ۼ��Ͻÿ�
		//ex)lol , level -> ����   king, july-> �ٸ�
		String word = "lotel";
		int wordLength = word.length();
		//System.out.println(word.substring(0,1));//12
		//System.out.println(word.substring(3,4));//23
		if(wordLength%2==0) {
			for(int i=0;i<wordLength/2+1;i++) {
				String a = word.substring(i,i+1);
				String b = word.substring(wordLength-1-i,wordLength-i);
				if(!a.equals(b)) {
					System.out.println("�����ʴ�1");
					break;
				}
			}
			
		}else {
			for(int i=0;i<wordLength/2-0.5;i++) {
				String a = word.substring(i,i+1);
				String b = word.substring(wordLength-1-i,wordLength-i);
				if(!a.equals(b)) {
					System.out.println("�����ʴ�3");
					break;
				}
			}
			
		}
		
		
		

	}

}
