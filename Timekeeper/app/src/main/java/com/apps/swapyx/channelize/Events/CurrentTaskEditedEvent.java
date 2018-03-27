package com.apps.swapyx.channelize.Events;

import com.apps.swapyx.channelize.ToDoItem;

public class CurrentTaskEditedEvent {
    public static ToDoItem editedItem;
    public CurrentTaskEditedEvent(ToDoItem editedItem) {
        CurrentTaskEditedEvent.editedItem = editedItem;
    }
}
