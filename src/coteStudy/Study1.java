package coteStudy;

import java.util.ArrayList;

public class Study1 {
	public static void main(String[] args) {

	
	//1�� ����
	//String Ÿ���� ���ڿ��� �޾��� �� ���ڿ��� �ݴ�� ����ϴ� ����
	//ex) input -> telephone  output -> enohpelet
		
	String mytext = "telephone";
	String result = "";
	
	for(int i=0;i<mytext.length();i++) {
		String alphabet = mytext.substring(mytext.length()-(i+1),mytext.length()-i);
		result = result.concat(alphabet);
		
	}
	System.out.println(result);
	
	///////////////////////////////////////////////////////////////////////////////////
	//2�� ����
	//���ڿ��� �Է����� �ָ� ���ڿ��� ù ���ڿ� ������ ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	String mytext2 = "badminton";
	
	String result2 ="";
	
	int mytextLength = mytext2.length();
	
	result2 = mytext2.substring(0,1);
	
	result2 = result2.concat(mytext2.substring(mytextLength-1,mytextLength));
	
	System.out.println(result2);
	
	
	///////////////////////////////////////////////////////////////////////////////////
	//3�� ����
	//���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����. �� ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	//�� �� �ڿ� ������ �پ� ���� ���� �ִ�
	//ex) Hello my name is Je   ----> 5 / My leg  ----> 2
	
	String mytext3 = " oddoong oddoong is love ";
	
	String trimtext = mytext3.trim();
	
	String [] array = trimtext.split(" ");
	
	System.out.println(array.length);

	///////////////////////////////////////////////////////////////////////////////////
	//4�� ����
	//���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ ���̰� ª�� �ͺ��� ���̰� ������ ���� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�
	//��, ���� �ܾ ���� ��� �����Ѵ�.
	//ex)[apple, rose, hat , hat ,civilization, yes] -> [hat,yes ,rose , apple , civilization]
	
	
	//(1)�ߺ����� : 0,1 0,2 0,3 0,4 0,5 1,0 
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
	
	//���̰� ª�� �ͺ���. ������ ���� ������ ����
	
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
	//5�� ����
	//���ĺ����θ� �̷���� �ܾ �Է¹޾�, �� ���̸� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	String mytext4 = "ttttTttttT";
	String [] array2 = mytext4.split("");
	
	System.out.println(array2.length);
	
	
	
	}
}
