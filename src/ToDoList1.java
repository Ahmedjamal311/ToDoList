import java.util.Comparator;

import components.queue.Queue;
import components.queue.Queue1L;

/**
 *
 */
public final class ToDoList1 extends ToDoListSecondary {
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
     * @param copy
     *            the list we want to copy from
     */
    @Override
    public void transferFrom(Queue<Task> copy) {
        this.list.clear();
        while (copy.length() > 0) {
            Task removed = copy.dequeue();
            this.list.enqueue(removed);
            this.list.sort(new Comparator<Task>() {
                @Override
                public int compare(Task o1, Task o2) {
                    return o1.date().compareTo(o2.date());
                }
            });
        }
        copy.clear();
    }

    /**
     * clears the information in this.
     */
    @Override
    public void clear() {
        while (this.list.length() > 0) {
            this.list.dequeue();
        }
    }

    /**
     * creates a new instance of this.
     */
    @Override
    public ToDoList1 newInstance() {
        return new ToDoList1();
    }
}
