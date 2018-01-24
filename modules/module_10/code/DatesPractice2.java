import java.time.*;

class DatesPractice2 {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		//Add a year
		LocalDate nextYear = d.plusYears(1);
		// Subtract two months
		LocalDate fourMonthsAgo = d.minusMonths(4);
		// Add two weeks
		LocalDate twoWeeksFromNow = d.plusWeeks(2);
		// Subtract a day
		LocalDate yesterday = d.minusDays(1);

		System.out.println("now: " + d);
		System.out.println("next year: " +  nextYear);
		System.out.println("four months ago: " + fourMonthsAgo);
		System.out.println("two weeks from now: " + twoWeeksFromNow);
		System.out.println("yesterday: " + yesterday);
	}
}