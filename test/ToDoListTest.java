
/**
 *
 */

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

/**
 *
 */
public class ToDoListTest {
    /**
     *
     */
    private static final int YEAR = 2025;

    /**
     *
     */
    private static final int MONTH = 4;

    /**
     *
     */
    private static final int DAY_17 = 17;

    /**
     *
     */
    private static final int DAY_16 = 16;

    /**
     *
     */
    private static final int DAY_15 = 15;

    /**
     *
     */
    @Test
    public void createNewRepTest() {
        ToDoList t = new ToDoList1();
        assertEquals(t.newInstance(), t);
    }

    /**
     *
     */
    @Test
    public void transferFromTestOne() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        ToDoList t3 = new ToDoList1();
        t2.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        t3.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        t1.transferFrom(t3);
        assertEquals(t1.newInstance(), t3);
        assertEquals(t1, t2);
    }

    /**
     *
     */
    @Test
    public void transferFromTestMultiple() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        ToDoList t3 = new ToDoList1();
        t2.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t3.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t3.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.transferFrom(t3);
        assertEquals(t1.newInstance(), t3);
        assertEquals(t1, t2);
    }

    /**
     *
     */
    @Test
    public void transferFromTestEmpty() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t1.transferFrom(t2);
        assertEquals(t1, t2);
    }

    /**
     *
     */
    @Test
    public void newInstanceTestEmpty() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        assertEquals(t1.newInstance(), t2.newInstance());
    }

    /**
     *
     */
    @Test
    public void newInstanceTestMultiple() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t1.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        assertEquals(t1.newInstance(), t2.newInstance());
    }

    /**
     *
     */
    @Test
    public void newInstanceTestOne() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        assertEquals(t1.newInstance(), t2.newInstance());
    }

    /**
     *
     */
    @Test
    public void clearTestEmpty() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t1.clear();
        t2.clear();
        assertEquals(t1, t2);
    }

    /**
     *
     */
    @Test
    public void clearTestMultiple() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t1.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.clear();
        t2.clear();
        assertEquals(t1, t2);
    }

    /**
     *
     */
    @Test
    public void clearTestOne() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.clear();
        t2.clear();
        assertEquals(t1, t2);
    }

    /**
     *
     */
    @Test
    public void addTaskTestTwo() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t1.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        assertEquals(t1, t2);
    }

    /**
     *
     */
    @Test
    public void addTaskTestOne() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        assertEquals(t1, t2);
    }

    /**
     *
     */
    @Test
    public void addTaskTestMultiple() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t1.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t2.addTask(new Task("Grocery", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        t1.addTask(new Task("Grocery", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        assertEquals(t1, t2);
    }

    /**
     *
     */
    @Test
    public void removeTaskTestOne() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t2.removeTask(0);
        t1.removeTask(0);
        assertEquals(t1, t2);
    }

    /**
     *
     */
    @Test
    public void removeTaskTestEmpty() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t2.removeTask(0);
        t1.removeTask(0);
        assertEquals(t1, t2);
    }

    /**
     *
     */
    @Test
    public void removeTaskTestMultiple() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t1.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t2.addTask(new Task("Grocery", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        t1.addTask(new Task("Grocery", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        t2.removeTask(0);
        t1.removeTask(0);
        t2.removeTask(1);
        t1.removeTask(1);
        assertEquals(t1, t2);
    }

    /**
     *
     */
    @Test
    public void lengthTestEmpty() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        assertEquals(t1.length(), t2.length());
    }

    /**
     *
     */
    @Test
    public void lengthTestOne() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        assertEquals(t1.length(), t2.length());
    }

    /**
     *
     */
    @Test
    public void lengthTestMultiple() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t1.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t2.addTask(new Task("Grocery", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        t1.addTask(new Task("Grocery", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        assertEquals(t1.length(), t2.length());
    }

    /**
     *
     */
    @Test
    public void descriptionCheckTestTwo() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        assertEquals(t1.descriptionCheck(1), t2.descriptionCheck(1));
        assertEquals(t1.descriptionCheck(0), t2.descriptionCheck(0));
    }

    /**
     *
     */
    @Test
    public void descriptionCheckTestOne() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        assertEquals(t1.descriptionCheck(0), t2.descriptionCheck(0));
    }

    /**
     *
     */
    @Test
    public void descriptionCheckTestMultiple() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t1.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t2.addTask(new Task("Grocery", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        t1.addTask(new Task("Grocery", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        assertEquals(t1.descriptionCheck(1), t2.descriptionCheck(1));
        assertEquals(t1.descriptionCheck(0), t2.descriptionCheck(0));
        assertEquals(t1.descriptionCheck(2), t2.descriptionCheck(2));
    }

    /**
     *
     */
    @Test
    public void dateCheckTestTwo() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        assertEquals(t1.dateCheck(1), t2.dateCheck(1));
        assertEquals(t1.dateCheck(0), t2.dateCheck(0));
    }

    /**
     *
     */
    @Test
    public void dateCheckTestOne() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        assertEquals(t1.dateCheck(0), t2.dateCheck(0));
    }

    /**
     *
     */
    @Test
    public void dateCheckTestMultiple() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t1.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t2.addTask(new Task("Grocery", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        t1.addTask(new Task("Grocery", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        assertEquals(t1.dateCheck(1), t2.dateCheck(1));
        assertEquals(t1.dateCheck(0), t2.dateCheck(0));
        assertEquals(t1.dateCheck(2), t2.dateCheck(2));
    }

    /**
     *
     */
    @Test
    public void entryCheckTestTwo() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        assertEquals(t1.entryCheck(1), t2.entryCheck(1));
        assertEquals(t1.entryCheck(0), t2.entryCheck(0));
    }

    /**
     *
     */
    @Test
    public void entryCheckTestOne() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        assertEquals(t1.entryCheck(0), t2.entryCheck(0));
    }

    /**
     *
     */
    @Test
    public void entryCheckTestMultiple() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t1.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t2.addTask(new Task("Grocery", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        t1.addTask(new Task("Grocery", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        assertEquals(t1.entryCheck(1), t2.entryCheck(1));
        assertEquals(t1.entryCheck(0), t2.entryCheck(0));
        assertEquals(t1.entryCheck(2), t2.entryCheck(2));
    }

    /**
     *
     */
    @Test
    public void equalsTestEmpty() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        assertEquals(t1.equals(t2), true);
    }

    /**
     *
     */
    @Test
    public void equalsTestOne() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        assertEquals(t1.equals(t2), true);
    }

    /**
     *
     */
    @Test
    public void equalsTestMultiple() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t1.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t2.addTask(new Task("Grocery", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        t1.addTask(new Task("Grocery", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        assertEquals(t1.equals(t2), true);
    }

    /**
     *
     */
    @Test
    public void toStringTestTwo() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t1.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.toString();
        t2.toString();
        assertEquals(t1, t2);
    }

    /**
     *
     */
    @Test
    public void toStringTestOne() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.toString();
        t2.toString();
        assertEquals(t1, t2);
    }

    /**
     *
     */
    @Test
    public void toStringTestMultiple() {
        ToDoList t1 = new ToDoList1();
        ToDoList t2 = new ToDoList1();
        t2.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t1.addTask(new Task("Trash", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_17)));
        t2.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t1.addTask(new Task("Bill", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_16)));
        t2.addTask(new Task("Grocery", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        t1.addTask(new Task("Grocery", LocalDate.of(ToDoListTest.YEAR,
                ToDoListTest.MONTH, ToDoListTest.DAY_15)));
        t1.toString();
        t2.toString();
        assertEquals(t1, t2);
    }
}
