package coteStudy;

import java.util.ArrayList;

public class Study1 {
	public static void main(String[] args) {

	
	//1번 문제
	//String 타입의 문자열을 받았을 때 문자열을 반대로 출력하는 로직
	//ex) input -> telephone  output -> enohpelet
		
	String mytext = "telephone";
	String result = "";
	
	for(int i=0;i<mytext.length();i++) {
		String alphabet = mytext.substring(mytext.length()-(i+1),mytext.length()-i);
		result = result.concat(alphabet);
		
	}
	System.out.println(result);
	
	///////////////////////////////////////////////////////////////////////////////////
	//2번 문제
	//문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
	String mytext2 = "badminton";
	
	String result2 ="";
	
	int mytextLength = mytext2.length();
	
	result2 = mytext2.substring(0,1);
	
	result2 = result2.concat(mytext2.substring(mytextLength-1,mytextLength));
	
	System.out.println(result2);
	
	
	///////////////////////////////////////////////////////////////////////////////////
	//3번 문제
	//영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 
	//단 앞 뒤에 공백이 붙어 있을 수도 있다
	//ex) Hello my name is Je   ----> 5 / My leg  ----> 2
	
	String mytext3 = " oddoong oddoong is love ";
	
	String trimtext = mytext3.trim();
	
	String [] array = trimtext.split(" ");
	
	System.out.println(array.length);

	///////////////////////////////////////////////////////////////////////////////////
	//4번 문제
	//알파벳 소문자로 이루어진 N개의 단어가 들어오면 길이가 짧은 것부터 길이가 같으면 사전 순으로 정렬하는 프로그램을 작성하시오
	//단, 같은 단어가 있을 경우 삭제한다.
	//ex)[apple, rose, hat , hat ,civilization, yes] -> [hat,yes ,rose , apple , civilization]
	
	
	//(1)중복제거 : 0,1 0,2 0,3 0,4 0,5 1,0 
	ArrayList<String> myarray = new ArrayList();
	ArrayList<String> resultarray = new ArrayList();
	
	myarray.add("apple");
	myarray.add("rose");
	myarray.add("hat");
	myarray.add("hat");
	myarray.add("civilization");
	myarray.add("yes");
	
	System.out.println("-----------------");
	
	for(int i=0;i<myarray.size();i++) {
		for(int j=0;j<myarray.size();j++) {
			if(i!=j) {
				if(myarray.get(i).equals(myarray.get(j))) {
					myarray.set(j, "");
				}
			}
		}
	}
	for(int i=0;i<myarray.size();i++) {
		if(myarray.get(i).equals("")) {
			myarray.remove(i);
		}
	}
	System.out.println(myarray);
	
	//길이가 짧은 것부터. 같으면 사전 순으로 정렬
	
	for(int i=1;i< myarray.size();i++) {
		for(int j=0;j<myarray.size()-i;j++) {
			if(myarray.get(j).length() > myarray.get(j+1).length()) {
				String temp = myarray.get(j);
				myarray.set(j, myarray.get(j+1));
				myarray.set(j+1, temp);
			}
		}
	}
	
	resultarray = myarray;
	System.out.println(resultarray);
	
	///////////////////////////////////////////////////////////////////////////////////
	//5번 문제
	//알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
	
	String mytext4 = "ttttTttttT";
	String [] array2 = mytext4.split("");
	
	System.out.println(array2.length);
	
	
	
	}
}
