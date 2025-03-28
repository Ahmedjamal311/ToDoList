import components.standard.Standard;

/**
 *
 */
public interface ToDoListKernel extends Standard<ToDoList> {

    /**
     * Adds an array of two strings on being the task ad one being the due date.
     *
     * @param task
     *            the string of the task that needs to be added
     * @ensures this.length = this + task
     * @updates this
     */
    void addTask(Task task);

    /**
     * removes the (task, due date) from the list from a certain index.
     *
     * @param index
     *            the index
     * @return a task object with task and date
     * @requires index <= the length of this
     * @ensures this = #this - task
     * @updates this
     */
    Task removeTask(int index);

    /**
     * returns the length of the queue (@this) (number of tasks).
     *
     * @return length of the list (number of tasks)
     * @ensures length >= 0
     */
    int length();

}
