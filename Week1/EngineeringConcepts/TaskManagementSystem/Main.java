package EngineeringConcepts.TaskManagementSystem;

public class Main {

    public static void main(String[] args) {

        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(101, "Design Homepage", "Pending"));
        taskList.addTask(new Task(102, "Develop Login", "In Progress"));
        taskList.addTask(new Task(103, "Testing", "Pending"));

        System.out.println("\nTask List");

        taskList.displayTasks();

        System.out.println("\nSearching Task");

        taskList.searchTask(102);

        System.out.println("\nDeleting Task");

        taskList.deleteTask(102);

        System.out.println("\nUpdated Task List");

        taskList.displayTasks();
    }
}