import java.time.LocalDateTime;
import java.util.Scanner;

public class ScannerTest1 {
	public static void main(String[] args) {
		//해볼만한? 생각나는...? 예시...?
		//나이 계산하기용 내가.. 몇살이지 어제 혜원씨의 태국같은거
		//만나이는 연월일까지 다 따져야하잖아
		//현재연도-내 연도 당신 몇살임
		//현재연도, 받을연도, 나이  - 3개정도? 변수인가?
		//나중에 추가될수있는거하고나면 if 생일지나면을 계산할수있으면 만나이여부 추가할수있고
		//배열하고나면 띠가 될라나?
		//주? 일도 계산가능

		Scanner sc = new Scanner(System.in);

		int thisYear;
		int birthYear;
		int nowAge;

		thisYear = 2024;

		System.out.println("당신의 태어난 연도를 입력하세요");
		birthYear = sc.nextInt();

		nowAge = thisYear - birthYear;
		System.out.println("당신은" + nowAge + "살 입니다.");
	}
}
// 연도 어떻게 땡겨오더라 localtime쓴거같긴한데
// 형태를 yyyy-mm-dd로 변경해서 어떻게 데려온거같은데
// 어떻게 데려오더라
// 1. 너는 언제태어났다
// 2. 너의 다음생일은 이만큼 남았다.
// 3. 너는 몇살이다
// 여기서설정할 변수는 1.오늘 날짜  2.태어난날짜
// 시간의 기준은.. 걍한국