import java.time.*;

class DatesPractice4 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate christmas = LocalDate.of(2018, 12, 25);
		System.out.println("days until christmas: " + now.until(christmas));
	}
}