import java.util.Comparator;

import components.queue.Queue;
import components.queue.Queue1L;

/**
 * @convention tasks are always sorted by date (earliest to latest)
 * @coresspondence the queue represents a to do list.
 */
public final class ToDoList1 extends ToDoListSecondary {
    /**
    *
    */
    private Queue<Task> list;

    /**
     *
     */
    public ToDoList1() {
        this.list = new Queue1L<>();
    }

    /**
     * Adds an array of two strings on being the task ad one being the due date.
     *
     * @param task
     *            the string of the task that needs to be added
     * @updates this
     */
    @Override
    public void addTask(Task task) {
        this.list.enqueue(task);
        this.list.sort(new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.date().compareTo(o2.date());
            }
        });
    }

    /**
     * removes the (task, due date) from the list from a certain index.
     *
     * @param index
     *            the index
     * @return a task object with task and date
     * @updates this
     */
    @Override
    public Task removeTask(int index) {
        this.list.rotate(index);
        Task task = this.list.dequeue();
        this.list.sort(new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.date().compareTo(o2.date());
            }
        });
        return task;
    }

    /**
     * returns the length of the queue (@this) (number of tasks).
     *
     * @return length of the list (number of tasks)
     */
    @Override
    public int length() {
        return this.list.length();
    }

    /**
     * transfers the information from copy to this and clears copy.
     *
     * @param source
     *            the list we want to copy from
     */
    @Override
    public void transferFrom(ToDoList source) {
        ToDoList1 localSource = (ToDoList1) source;
        this.list = localSource.list;
        localSource.createNewRep();
    }

    /**
     * clears the information in this.
     */
    @Override
    public void clear() {
        this.createNewRep();
    }

    /**
     * creates a new instance of this.
     */
    @Override
    public ToDoList newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    /**
     *
     */
    private void createNewRep() {
        this.list = new Queue1L<>();
    }
}
