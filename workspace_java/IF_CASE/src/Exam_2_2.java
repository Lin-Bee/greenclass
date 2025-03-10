import java.util.Scanner;

public class Exam_2_2 {
	public static void main(String[] args) {
		int x,y;

		Scanner sc = new Scanner(System.in);
		System.out.println("x축, y축 좌표를 입력해주세요");
		x = sc.nextInt();
		y = sc.nextInt();
		//5050,100100 그러니까 x랑 y가 각각 50~100사이에 있는지 판단하라

		if(x>=50&&x<=100 && y>=50&&y<=100){
			System.out.println("사각형안에 점이 있습니다");
		}else{
			System.out.println("사각형안에 점이 없습니다");
		}

	}
}
