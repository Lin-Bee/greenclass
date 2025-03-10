package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService {
	Scanner sc = new Scanner(System.in);
	List<Emp> empList = new ArrayList<>();

	public EmpService(){
		Emp e1 = new Emp(0001,"김이름","디자인부","010-4567-8989",20000);
		Emp e2 = new Emp(0002,"박이름","개발부","010-4567-1234",5000);
		Emp e3 = new Emp(0003,"김나마","디자인부","010-4567-0000",2000);
		Emp e4 = new Emp(0004,"이고기","개발부","010-4567-4567",8000);
		Emp e5 = new Emp(0005,"나마에","회계부","010-4567-4444",10000);
		Emp e6 = new Emp(0006,"네이무","회계부","010-4567-0004",3000);

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
	}

	//로그인하는 기능
	public void login(){
		boolean isRunning = true;
		while (isRunning){ //반복될거야
			//사번과 전화번호를 입력받아 두 값이 일치할때
			System.out.print("사번 : ");
			int loginId = sc.nextInt();
			System.out.println("비밀번호(연락처의 마지막 4자리) :");
			String loginCell = sc.next();
			for (int i = 0; i <empList.size() ; i++) {//리스트전체까지
				int lastFour = (empList.get(i).getCell().length());
				String password = empList.get(i).getCell().substring((lastFour-4),lastFour)/*뒤에서 4개가 같을때*/;
				if(empList.get(i).getComNum() == loginId && password.equals(loginCell)){
					System.out.println("로그인 하였습니다.");
					System.out.println("'"+empList.get(i).getName()+"' 님 반갑습니다");
					isRunning = false;
					break;
				}else {
					System.out.println("사번 혹은 비밀번호가 일치하지 않습니다");
					break;
				}
			}
		}
	}

	//키보드로 부서명 월급정보출력
	public void payInfo(){
		int paySum = 0;
		int cntEmp = 0;
		System.out.print("부서명 : ");
		String showDept = sc.next();
		System.out.println("==개발부 월급 현황==");
		for (Emp emp :empList){
			if(emp.getDept().equals(showDept)){
				paySum = paySum+emp.getPay();
				cntEmp = cntEmp+1;
				System.out.println("이름 :"+ emp.getName() + ", 월급 : "+emp.getPay());
			}
		}
		double payAvg = (double)(paySum/cntEmp);
		System.out.println("개발부서의 월급 총액은"+ paySum + "원이며, 평균 급여는" + payAvg + "원 입니다.");
	}

	//키보드로 부서명 입력후 모든 사원의 월급 인상
	public void payUp(){
		int cp;
		System.out.print("부서명 : ");
		String checkDept = sc.next();
		System.out.print("인상급여 : ");
		int changePay = sc.nextInt();
		System.out.println(checkDept+" 각 사원의 급여가 각각" + changePay + "원씩 인상됩니다.");
		System.out.println("==월급 인상 후 "+checkDept+"월급 현황==");
		for (Emp emp :empList){
			if(emp.getDept().equals(checkDept)){
				cp = emp.getPay()+changePay;//cp는 선언만함
				emp.setPay(cp);             //set으로 넣어줌
				System.out.println("이름 :"+ emp.getName() + ", 월급 : "+cp);
			}
		}
	}

}
