package EngineeringConcepts.TaskManagementSystem;

public class TaskLinkedList {

    private Task head;

    // Add Task
    public void addTask(Task task) {

        if (head == null) {
            head = task;
            System.out.println("Task Added Successfully.");
            return;
        }

        Task current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = task;

        System.out.println("Task Added Successfully.");
    }

    // Search Task
    public void searchTask(int id) {

        Task current = head;

        while (current != null) {

            if (current.getTaskId() == id) {

                System.out.println("Task Found");
                System.out.println(current);
                return;
            }

            current = current.next;
        }

        System.out.println("Task Not Found.");
    }

    // Display Tasks
    public void displayTasks() {

        if (head == null) {
            System.out.println("No Tasks Available.");
            return;
        }

        Task current = head;

        while (current != null) {

            System.out.println(current);
            System.out.println("---------------------");

            current = current.next;
        }
    }

    // Delete Task
    public void deleteTask(int id) {

        if (head == null) {
            System.out.println("Task List is Empty.");
            return;
        }

        if (head.getTaskId() == id) {
            head = head.next;
            System.out.println("Task Deleted Successfully.");
            return;
        }

        Task current = head;

        while (current.next != null && current.next.getTaskId() != id) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Task Not Found.");
            return;
        }

        current.next = current.next.next;

        System.out.println("Task Deleted Successfully.");
    }
}