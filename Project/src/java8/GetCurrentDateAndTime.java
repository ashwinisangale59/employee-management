package java8;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GetCurrentDateAndTime {
	public static void main(String[] args) {
		LocalDate datee = LocalDate.now();
		System.out.println(datee);

		LocalDateTime da = LocalDateTime.now();
		System.out.println(da);

		// Format date to string
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter dat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatted = date.format(dat);
		System.out.println(formatted);

		// 83. Parse string to date
		String str = "16-08-2020";
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate dte = LocalDate.parse(str, format);
		System.out.println(dte);

		// Add days to date

		LocalDate now = LocalDate.now();

		LocalDate today = now.plusDays(12);
		System.out.println(today);
		LocalDate last = now.minusDays(2);
		System.out.println(last);

		LocalDate ds = now.minusMonths(2);
		System.out.println(ds);

		// 85. Calculate difference between two dates
		LocalDate date1 = LocalDate.now();

		LocalDate date2 = LocalDate.of(2023, 2, 21);

		Period period = Period.between(date2, date1);
		System.out.println("Days between" + period.getDays() + " Month between " + period.getMonths() + " year between "
				+ period.getYears());

		long between = ChronoUnit.DAYS.between(date2, date1);
		long between2 = ChronoUnit.MONTHS.between(date2, date1);
		System.out.println(" Days between: " + between + " Months" + between2);

		// 86. Get day of week from date
		LocalDate local = LocalDate.now();
          DayOfWeek day=local.getDayOfWeek();
          
          System.out.println(day.name() + " day of week from date and day is a " +day.getValue());
		
		//Sort dates in list
          List<LocalDate> dates = Arrays.asList(
                  LocalDate.of(2025, 8, 16),
                  LocalDate.of(2023, 5, 10),
                  LocalDate.of(2024, 12, 25),
                  LocalDate.of(2022, 1, 1));          
          
          List<LocalDate> ascending = dates.stream()
                  .sorted()
                 .collect(Collectors.toList());
          
          List<LocalDate> descending = dates.stream()
                  .sorted(Comparator.reverseOrder())
                  .collect(Collectors.toList());

System.out.println("Ascending: " + ascending);
System.out.println("Descending: " + descending);
	}
}
