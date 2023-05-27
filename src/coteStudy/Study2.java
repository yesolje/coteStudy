package coteStudy;

public class Study2 {

	public static void main(String[] args) {
		//1번 문제
		///화폐를 조합해서 K원을 만드는 경우의 수 중 화폐개수를 최소로 했을 때 필요한 화폐의 수를 구해라
		//참고로, 화폐는 [1,5,10,50,100,500,1000,5000,10000,50000] 이 무한히 주어진다.
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
		
		//2번 문제
		//연도가 주어졌을 때, 윤년이면 true, 아니면 false을 출력하는 프로그램을 작성하시오.
		//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
		int year = 1900;
		boolean result2 = false;
		if(year%4==0 && year%100!=0) {
			result2=true;
		}else if(year%400==0 ) {
			result2=true;
		}
		System.out.println(result2);
		
		//3번 문제
		//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
		int mynumber = 3;
		for(int i=1;i<10;i++) {
			System.out.println(mynumber+"*"+i+"="+i*mynumber);
		}
		
		//4번 문제
		//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		//ex)[2,5,1,9,3] -> 최소값 1 최대값9
		
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
		//5번 문제
		//알파벳 소문자로 이뤄진 단어가 주어질 때 이 단어가 앞으로 읽을 때와 뒤에서 읽을 때가 같은지 확인하는 프로그램을 작성하시오
		//ex)lol , level -> 같음   king, july-> 다름
		String word = "lotel";
		int wordLength = word.length();
		//System.out.println(word.substring(0,1));//12
		//System.out.println(word.substring(3,4));//23
		if(wordLength%2==0) {
			for(int i=0;i<wordLength/2+1;i++) {
				String a = word.substring(i,i+1);
				String b = word.substring(wordLength-1-i,wordLength-i);
				if(!a.equals(b)) {
					System.out.println("같지않다1");
					break;
				}
			}
			
		}else {
			for(int i=0;i<wordLength/2-0.5;i++) {
				String a = word.substring(i,i+1);
				String b = word.substring(wordLength-1-i,wordLength-i);
				if(!a.equals(b)) {
					System.out.println("같지않다3");
					break;
				}
			}
			
		}
		
		
		

	}

}
