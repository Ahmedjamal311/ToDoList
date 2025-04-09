import java.util.Comparator;

import components.naturalnumber.NaturalNumberSecondary;
import components.queue.Queue;
import components.queue.Queue1L;

/**
 *
 */
public final class ToDoList1 extends NaturalNumberSecondary {
    /**
    *
    */
    private Queue<Task> list;

    /**
     *
     */
    private ToDoList1() {
        this.list = new Queue1L<>();
    }

    /**
     * Adds an array of two strings on being the task ad one being the due date.
     *
     * @param task
     *            the string of the task that needs to be added
     * @updates this
     */
    public void addTask(Task task) {
        this.list.enqueue(task);
        this.list.sort(new Comparator<Task>() {
            @Override
            public int compare(ToDoList1.Task o1, ToDoList1.Task o2) {
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
    public Task removeTask(int index) {
        this.list.rotate(index);
        Task task = this.list.dequeue();
        this.list.sort(new Comparator<Task>() {
            @Override
            public int compare(ToDoList1.Task o1, ToDoList1.Task o2) {
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
    public int length() {
        return this.list.length();
    }
}
