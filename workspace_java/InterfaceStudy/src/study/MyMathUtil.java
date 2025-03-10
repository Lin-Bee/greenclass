package study;

public class MyMathUtil implements MathUtil{
	@Override
	public boolean isEven(int a, int b, int c) {
		boolean sumThree = (a+b+c)%2==0 && (a+b+c)%5==0;
		return sumThree;
	}

	@Override
	public double getSumFromOne(int num) {
		double sumNum = 0;
		for (int i = 1; i < num+1 ; i++) {
			sumNum = num+i;
			}
		return (int)sumNum;
	}

	@Override
	public double getCircleArea(int rad) {
		rad = 3;
		if(rad>=0){
			double circle = ((rad*rad)*Math.PI);
			return circle;
		}else{
			return 0;
		}
	}
}
