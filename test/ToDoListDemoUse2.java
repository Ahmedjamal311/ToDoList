import java.time.LocalDate;

/**
 *
 */
public final class ToDoListDemoUse2 {

    /**
     *
     */
    private ToDoListDemoUse2() {

    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        final int year = 2025;
        final int month = 4;
        final int day18 = 18;
        final int day17 = 17;
        final int day22 = 22;
        final int day21 = 21;
        final int day26 = 26;
        ToDoList chores = new ToDoList1();
        chores.addTask(new Task("Laundary", LocalDate.of(year, month, day18)));
        chores.addTask(new Task("Grocery", LocalDate.of(year, month, day17)));
        chores.addTask(new Task("Cooking", LocalDate.of(year, month, day22)));
        chores.addTask(new Task("Vaccum", LocalDate.of(year, month, day21)));
        chores.addTask(new Task("Dusting", LocalDate.of(year, month, day26)));
        for (int i = 0; i < chores.length(); i++) {
            System.out.println(chores.entryCheck(i));
        }
    }
}
