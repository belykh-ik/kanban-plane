package ru.my.java.manager;

import java.util.List;
import java.util.Map;

import ru.my.java.tasks.Epic;
import ru.my.java.tasks.Subtask;
import ru.my.java.tasks.Task;

public interface TaskManager {
    int addTask(Task task);

    int addEpic(Epic epic);

    Integer addNewSubtask(Subtask subtask);

    List<Map<Integer, ? extends Task>> viewTasks();

    void removeAllTasks();

    Task getTaskById(int taskId);

    Epic getEpicById(int epicId);

    Subtask getSubtasksByEpic(Epic epic);

    Subtask getSubtasksById(int id);

    List<Task> getHistory();

    void removeTaskById(int taskId);

    void removeEpicById(int id);

    void removeSubtaskById(int id);

    void removeSubtask(Subtask subtask);

    void removeEpic(Epic epic);

    Task updateTask(Task task);

    Epic updateEpic(Epic epic);

    Subtask updateSubTask(Subtask subtask);

    Map<Integer, Task> getTasks();

    Map<Integer, Epic> getEpics();

    Map<Integer, Subtask> getSubTasks();
}
