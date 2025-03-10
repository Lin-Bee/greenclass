public class While_5 {
	public static void main(String[] args) {
		//1~5까지의 합을 구하세요
		int i = 1;
		int sum = 0;
		while (i<6){
			//System.out.println(i); sum = 0+1;
			//System.out.println((i)+i); sum = (0+1)+1 = sum1(가칭)
			//System.out.println((i+i)+i) = (sum1)+1 = sum2(가칭);
			//System.out.println(((i+i)+i)+i) = (sum2)+1 = sum3(가칭);
			//System.out.println((((i+i)+i)+i)+i); = (sum3)+1;
			//한줄 한줄이 넘어가면서 sum의 값이 sum+i로증가
			sum = sum+i;
			//sum 은
			i++;
		}
		System.out.println(sum);
	}
}
