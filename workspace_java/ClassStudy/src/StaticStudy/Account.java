package StaticStudy;

public class Account {
	String owner;
	int money;
	static double iyul;

	public Account(){}

	public Account(String owner){
		this.owner = owner;
		money = 50000;
	}

	static {
		iyul = 10.0;
	}

}
