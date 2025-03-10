package Practice;

public class PhoneTest {
	public static void main(String[] args) {
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();

		phone1.setBrand("샘숭");
		phone1.setModel("아이스크림폰");
		phone1.setColor("초코");
		phone1.setPrice(5000);
		phone1.setPhNumber("010-4568-4568");

		System.out.println(phone1.brand);
		System.out.println(phone1.model);
		System.out.println(phone1.color);
		System.out.println(phone1.price);
		System.out.println(phone1.phNumber);
		System.out.println();

		phone2.phoneInfo("LG","폴더폰","딸기",900,"010-5985-1235");
		phone2.printInfo();
	}
}
