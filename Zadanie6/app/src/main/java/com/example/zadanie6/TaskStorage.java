package com.example.zadanie6;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {
    private static final TaskStorage taskStorage = new TaskStorage();
    private final List<Task> tasks;

    public static TaskStorage getInstance() {return taskStorage;}

    private TaskStorage()
    {
        tasks = new ArrayList<>();
        for(int i=1;i<=100;i++)
        {
            Task task = new Task();
            task.setName("Zadanie #"+i);
            task.setDone(i%3==0);
            tasks.add(task);
        }
    }

    public List<Task> getTasks(){
        return tasks;
    }

    public Task getTasks(UUID taskId)
    {
        for(Task task : tasks)
        {
            if(task.getId()==taskId) {
                return task;
            }
        }
        return null;
    }
}