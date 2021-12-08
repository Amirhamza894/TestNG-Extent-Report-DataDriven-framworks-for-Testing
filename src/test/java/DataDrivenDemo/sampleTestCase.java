package DataDrivenDemo;

import java.io.IOException;
import java.util.ArrayList;

public class sampleTestCase {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		dataDriven d = new dataDriven();
		ArrayList data = d.getData("Profile");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}

}
