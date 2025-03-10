package OffLimits2;

import OffLimits1.Orange;

public class OrangeTest2 {
	public static void main(String[] args) {
		Orange orange = new Orange();
		//a b 안됨
		orange.c=4;
		//aaa bbb 안됨
		orange.ccc();
	}
}
