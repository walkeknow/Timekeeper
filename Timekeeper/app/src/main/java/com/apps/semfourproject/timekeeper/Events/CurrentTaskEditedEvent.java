package com.apps.semfourproject.timekeeper.Events;

import com.apps.semfourproject.timekeeper.ToDoItem;

public class CurrentTaskEditedEvent {
    public static ToDoItem editedItem;
    public CurrentTaskEditedEvent(ToDoItem editedItem) {
        CurrentTaskEditedEvent.editedItem = editedItem;
    }
}
