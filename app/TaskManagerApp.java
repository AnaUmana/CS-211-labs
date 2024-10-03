package app;

import taskmanager.Task;
import taskmanager.TaskList;

public class TaskManagerApp {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.print("Max Task List Size  Not Given");
            return;
        }

        int taskListSize = Integer.parseInt(args[0]);
        TaskList taskList = new TaskList(taskListSize);

        Task t1 = new Task(Integer.parseInt(args[1]), args[2], args[3]);
        Task t2 = new Task(2, "Task2", "this is the new task");
        taskList.addTask(t1);
        taskList.addTask(t2);

        taskList.getAllTasks();
    }
    
}
