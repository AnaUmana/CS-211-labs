package taskmanager;

public class TaskList {
    private Task[] tasks;
    private int size;
    
    /**
     * This is the Constructor
     * @param capacity
     * This is used to io initialize the TaskList
     */
    public TaskList(int capacity) {
        tasks = new Task [capacity];
        size = 0;
    }

    public void addTask(Task task) {
        if (size < tasks.length) {
            tasks[size++] = task;
        } else {
            System.out.println("Task list is fll. Cannot add more tasks.");
        }
    }
        public Task[] getAllTasks() {
            Task[] allTasks = new Task[size];
            System.arraycopy(tasks, 0, allTasks, 0, size);
            for (int i = 0; i<allTasks.length; i++) {
                System.out.println(allTasks[i].toString());

            }
            return allTasks;
        }
    }

