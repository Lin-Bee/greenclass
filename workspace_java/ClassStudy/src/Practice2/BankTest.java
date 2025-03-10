package Practice2;

public class BankTest {
	public static void main(String[] args) {
		//bank 클래스에 대한 객체를 5개 저장할 수 있는 banKArr을 생성
		//bank 클래스에 대한 객체 5개를 담을 수 있는 공간
		Bank[] banksArr = new Bank[5];
		//bank클래스에 대한 객체를 5개 생성, 초기값만 맘대로
		banksArr[0] = new Bank("고길동",0,"1254-8956-5786");
		banksArr[1] = new Bank("고정동",14562,"1254-4563-4568");
		banksArr[2] = new Bank("홍길동",500000,"1254-8956-1427");
		banksArr[3] = new Bank("송동동",6512,"1254-3783-7867");
		banksArr[4] = new Bank("고길통",7895,"1254-5427-3245");

		//bankArr 배열에 저장된 모든 계좌의 예금액 합을 출력
		int sum1=0;
		for (int i = 0; i <banksArr.length ; i++) {
			sum1 = sum1+banksArr[i].getBalance();
		}
		System.out.println("예금액의 합 : "+ sum1);
		int sum2=0;
		for(Bank bank:banksArr){
			sum2 = sum2+bank.getBalance();
		}
		System.out.println("예금액의 합 : "+ sum2);

		//bankArr에 저장된 모든 계좌정보중에
		// 계좌주가 송동동인 계좌정보를찾고 Bank.getOwner
		//예금액을 20%인상시키는 코드 작성 Bank.getBalance*1.2

		for (int i = 0; i < banksArr.length; i++) {
			if(banksArr[i].getOwner().equals("송동동")){
				int result = (int)(banksArr[i].getBalance()*1.2);
				banksArr[i].setBalance(result);
			}
		}
		for (Bank bank:banksArr){
			if(bank.getOwner().equals("송동동")){
				int result = (int)(bank.getBalance()*1.2);
				bank.setBalance(result);
			}
		}

	}
}
