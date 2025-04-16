import java.time.LocalDate;

/**
 *
 */
public final class ToDoListDemoUse1 {

    /**
     *
     */
    private ToDoListDemoUse1() {

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        final int year = 2025;
        final int month = 4;
        final int day18 = 18;
        final int day15 = 15;
        final int day25 = 25;
        ToDoList homework = new ToDoList1();
        homework.addTask(new Task("Portfolio Project",
                LocalDate.of(year, month, day15)));
        homework.addTask(
                new Task("Project 10", LocalDate.of(year, month, day18)));
        homework.addTask(
                new Task("SW Final", LocalDate.of(year, month, day25)));
        homework.addTask(
                new Task("STAT Final", LocalDate.of(year, month, day25)));
        homework.addTask(
                new Task("FNDS Final", LocalDate.of(year, month, day25)));
        for (int i = 0; i < homework.length(); i++) {
            System.out.println(homework.entryCheck(i));
        }
    }
}
