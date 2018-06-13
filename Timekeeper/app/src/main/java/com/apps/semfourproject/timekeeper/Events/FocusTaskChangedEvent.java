package com.apps.semfourproject.timekeeper.Events;

import com.apps.semfourproject.timekeeper.ToDoItem;

public class FocusTaskChangedEvent {
    public static ToDoItem currentFocusTask;
    public static ToDoItem previousFocusTask;

    public FocusTaskChangedEvent(ToDoItem item) {
        long id = item.getToDoId();
        if (currentFocusTask != null && id != currentFocusTask.getToDoId()) {
            previousFocusTask = currentFocusTask;
        }
        currentFocusTask = item;
    }
}
