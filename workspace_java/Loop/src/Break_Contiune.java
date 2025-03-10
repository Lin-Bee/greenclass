public class Break_Contiune {
	public static void main(String[] args) {
		// 반복문과 continue; break와 멈춰
		int i = 1;
		while (i<6){
			if(i==3){
				break;
			}
			System.out.println(i);  // 1
			i++; // 2
			     // 3이되면 break가 되라그래서
		} //출력 결과가 1 2 가 됨


		//continue;
		//가장 가까운 반복문의 마지막으로 이동한다
		int a = 1;
		while(a<6){
			a++;
			if(a==3){
				continue;//가장 가까운 반복문의
				         // 마지막으로 이동한다▼
			}
			System.out.println("a : "+a);//가장 가까운 반복문의 마지막으로 이동한다
			// 2 () 4 5 6
		}

	}
}

