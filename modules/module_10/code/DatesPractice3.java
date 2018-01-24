import java.time.*;

class DatesPractice3 {

	public static void main(String[] args) {
		LocalDateTime l = LocalDateTime.now();
		LocalDateTime someTime = l.plusYears(1).minusDays(1);

		System.out.println("some time: " + someTime);
	}
}