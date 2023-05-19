package test;

import test.EchoT;

public class EchoTestDriveT {

	public static void main(String[] args) {
		EchoT e1 = new EchoT();
		EchoT e2 = e1;
		int x = 0;
		while (x < 4) {
			e1.hello();
			e1.count = e1.count + 1;
			if(x > 0) {
				e2.count = e2.count + 1;
			}
			if (x > 1) {
				e2.count = e2.count + e1.count;
			}
			x = x + 1;
		}
		System.out.println(e2.count);
	}

}
