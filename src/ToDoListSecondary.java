import java.time.LocalDate;

/**
 *
 */
public abstract class ToDoListSecondary implements ToDoList {

    /**
     * reports what task is at a the given index.
     *
     * @param index
     *            is the index of the task
     * @return the task at the given index
     */
    @Override
    public String descriptionCheck(int index) {
        Task removed = this.removeTask(index);
        String description = removed.description();
        this.addTask(removed);
        return description;
    }

    /**
     * reports what date is at a the given index.
     *
     * @param index
     *            is the index of the task
     * @return the task at the given index
     */
    @Override
    public LocalDate dateCheck(int index) {
        Task removed = this.removeTask(index);
        LocalDate date = removed.date();
        this.addTask(removed);
        return date;
    }

    /**
     * reports what entry is at a the given index.
     *
     * @param index
     *            is the index of the task
     * @return the task at the given index
     */
    @Override
    public Task entryCheck(int index) {
        Task removed = this.removeTask(index);
        this.addTask(removed);
        return removed;
    }

    /**
     * @return this as a String
     */
    @Override
    public String toString() {
        String toString = "";
        for (int i = 0; i < this.length(); i++) {
            Task removed = this.removeTask(i);
            toString += removed.toString();
            this.addTask(removed);
        }
        return toString;
    }

    /**
     * @param o
     *            an object of the given ToDoList to compare
     * @return a boolean whether this equals the given ToDoList
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (this == o) {
            return true;
        }

        if (!(o instanceof ToDoList)) {
            return false;
        }

        ToDoList t = (ToDoList) o;
        Boolean equals = true;
        if (!(this.length() == t.length())) {
            equals = false;
        } else {
            for (int i = 0; i < this.length(); i++) {
                Task r1 = this.removeTask(i);
                Task r2 = t.removeTask(i);
                if (!(r1.equals(r2))) {
                    equals = false;
                }
                this.addTask(r1);
                t.addTask(r2);
            }
        }
        return equals;
    }
}
