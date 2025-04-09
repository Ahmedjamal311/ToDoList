import java.time.LocalDate;

/**
 *
 */
public interface ToDoList extends ToDoListKernel {
    /**
     * reports what description is at a the given index.
     *
     * @param index
     *            is the index of the task
     * @requires index <= the length of this
     * @ensures the value returns a description at the given index
     * @return a string of the description at the given index
     */
    String descriptionCheck(int index);

    /**
     * reports what date is at a the given index.
     *
     * @param index
     *            is the index of the task
     * @requires index <= the length of this
     * @ensures the value returns a LocalDate at the given index
     * @return a Localdate at the given index
     */
    LocalDate dateCheck(int index);

    /**
     * reports what entry is at a the given index.
     *
     * @param index
     *            is the index of the task
     * @requires index <= the length of this
     * @ensures the value returns a Task (description, date) at the given index
     * @return the task at the given index
     */
    Task entryCheck(int index);

}
