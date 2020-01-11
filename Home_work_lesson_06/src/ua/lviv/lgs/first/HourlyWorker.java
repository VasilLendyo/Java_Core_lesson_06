package ua.lviv.lgs.first;

public class HourlyWorker implements Salary{
	
	@Override
	public void salary() {	
		int payment = perHour * hourInDay * DayInMonth;
		System.out.println("First worker salary receives " + payment + " dollars");
		
	}
	
	private int perHour;
	private int hourInDay;
	private int DayInMonth;

	public HourlyWorker(int perHour, int hourInDay, int dayInMonth) {
		super();
		this.perHour = perHour;
		this.hourInDay = hourInDay;
		this.DayInMonth = dayInMonth;
	}
	
	



	
	

}
