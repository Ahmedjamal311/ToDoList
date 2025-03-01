import java.time.LocalDate;
import java.util.Comparator;

import components.queue.Queue;
import components.queue.Queue1L;

/**
 *
 * ToDoList component proof of concept.
 *
 * @author Ahmed Jamal
 */
public final class ProofOfConcept {
    /**
     *
     */
    private Queue<Task> list;

    /**
     * @param description
     *            the task that needs to be completed
     * @param date
     *            the date the task needs to be completed
     */
    public record Task(String description, LocalDate date) {
    }

    /**
     *
     */
    private ProofOfConcept() {
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
            public int compare(ProofOfConcept.Task o1, ProofOfConcept.Task o2) {
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
            public int compare(ProofOfConcept.Task o1, ProofOfConcept.Task o2) {
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

    /**
     * reports what task is at a the given index.
     *
     * @param index
     *            is the index of the task
     * @return the task at the given index
     */
    public String descriptionCheck(int index) {
        int currentIndex = 0;
        String answer = "";
        for (Task description : this.list) {
            if (currentIndex == index) {
                answer = description.description;
            }
            currentIndex++;
        }
        return answer;
    }

    /**
     * reports what date is at a the given index.
     *
     * @param index
     *            is the index of the task
     * @return the task at the given index
     */
    public LocalDate dateCheck(int index) {
        int currentIndex = 0;
        LocalDate answer = null;
        for (Task date : this.list) {
            if (currentIndex == index) {
                answer = date.date;
            }
            currentIndex++;
        }
        return answer;
    }

    /**
     * reports what entry is at a the given index.
     *
     * @param index
     *            is the index of the task
     * @return the task at the given index
     */
    public Task entryCheck(int index) {
        this.list.rotate(index);
        Task task = this.list.front();
        this.list.sort(new Comparator<Task>() {
            @Override
            public int compare(ProofOfConcept.Task o1, ProofOfConcept.Task o2) {
                return o1.date().compareTo(o2.date());
            }
        });
        return task;
    }

    @Override
    public String toString() {
        return this.list.toString();
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {
        ProofOfConcept list = new ProofOfConcept();

        final int year = 2025;
        final int month = 2;
        final int removedIndex = 3;
        final int day1 = 20;
        final int day2 = 25;
        final int day3 = 26;
        final int day4 = 27;

        list.addTask(new Task("Trash", LocalDate.of(year, month, day1)));
        list.addTask(new Task("Hello", LocalDate.of(year, month, day2)));
        list.addTask(new Task("Bye", LocalDate.of(year, month, day3)));
        list.addTask(new Task("Hi", LocalDate.of(year, month, day4)));
        Task removed = list.removeTask(removedIndex);
        String descriptionCheck = list.descriptionCheck(0);
        LocalDate dateCheck = list.dateCheck(0);

        System.out.println(list.entryCheck(2)); //Should print "bye" entry
        System.out.println(removed); //Should print "Hi, 2025,2,27"
        System.out.println(descriptionCheck); //Should print "Trash"
        System.out.println(dateCheck); //Should print 2025,2,20
        System.out.println(list.length()); //should be 3
        System.out.println(list); //Prints the rest of entries which
        //should be evrything added - minus the hi entry
    }
}
