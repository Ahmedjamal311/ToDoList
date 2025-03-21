import java.time.LocalDate;

/**
 * @param description
 *            the task that needs to be completed
 * @param date
 *            the date the task needs to be completed
 */
record Task(String description, LocalDate date) {

}
