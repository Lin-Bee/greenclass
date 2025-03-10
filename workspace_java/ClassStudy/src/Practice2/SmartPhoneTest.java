package Practice2;

import java.util.Arrays;

public class SmartPhoneTest {
	public static void main(String[] args) {
		//스마트폰 5개를 저장할 수 있는 배열 phoneArr를 생성
		//자료형[]배열명 = new 자료형[갯수]
		//String[] phones = new String[5]; 이건 스트링
		SmartPhone[] phoneArr = new SmartPhone[5]; //이건 스마트폰이라는 배열

		//스마트폰 객체 생성
		SmartPhone p1 = new SmartPhone("s1",10000,23.5);
		SmartPhone p2 = new SmartPhone("s11",1300,15.5);
		SmartPhone p3 = new SmartPhone("s20",10400,4.5);
		SmartPhone p4 = new SmartPhone("s57",10060,52.5);
		SmartPhone p5 = new SmartPhone("s15",650,21.5);

		phoneArr[0] = p1;
		phoneArr[1] = p2;
		phoneArr[2] = p3;
		phoneArr[3] = p4;
		phoneArr[4] = p5;

		//Arr배열에 저장된 모든 폰의 모델명,가격,크기를 출력
		for (int i = 0; i < phoneArr.length ; i++) {
			phoneArr[i].printInfo();
		}
		//Arr배열에 저장된 0번째의 저장된 폰의 가격
		System.out.println(" 0번째의 저장된 폰의 가격 :"+phoneArr[0].getPrice());

		//Arr배열에서 크기가 13inch이상인 폰의 모델명을 출력하시오
		//1. phoneArr[i].getinch() 가 13이상인 걸찾아서
		//2.true 일때 phoneArr[i].getname() 을 출력하시오
		for (int i = 0; i < phoneArr.length ; i++) {
			if(phoneArr[i].getInch()>=13){
				System.out.println(phoneArr[i].getModelName());
			}
		}
		//for-each구문은 for( 담아둘것: 돌릴데이터)
		for(SmartPhone s:phoneArr){ //자료형 임시 : 돌릴array
			if(s.getInch()>=13){
				System.out.println(s.getModelName());
			}
		}



	}
}
