import java.time.*;

class DatesExercise1 {

	public static void main(String[] args) {
		LocalDate myNextBirthday = LocalDate.of(2018, 12, 7);
		System.out.println(myNextBirthday);
		for (int i = 0; i < 10; i++) {
			LocalDate b = myNextBirthday.plusYears(i);
			System.out.println(b.getYear() + ": " + b.getDayOfWeek());
		}
	}
}