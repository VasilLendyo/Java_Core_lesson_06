package ua.lviv.lgs.first;

public class Main {

	public static void main(String[] args) {
		
		HourlyWorker hw = new HourlyWorker(20, 8,20);
		hw.salary();
		
		MounthlyWorker mw = new MounthlyWorker();
		mw.salary();

	}

}
