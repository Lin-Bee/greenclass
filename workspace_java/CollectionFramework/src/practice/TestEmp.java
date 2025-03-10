package practice;

import java.util.Scanner;

public class TestEmp {
	public static void main(String[] args) {
		EmpService empService = new EmpService();
		empService.login();
		empService.payInfo();
		empService.payUp();
	}
}
