package ru.my.java.manager;

import java.util.List;

import ru.my.java.tasks.Task;

public interface HistoryManager {
    void add(Task task);

    void remove(Integer id);

    void clear();

    List<Task> getHistory();

    List<Task> getTasksInList();
}
