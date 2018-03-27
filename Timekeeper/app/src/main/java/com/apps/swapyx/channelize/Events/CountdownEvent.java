package com.apps.swapyx.channelize.Events;

public class CountdownEvent {
    public static int remainingTime;

    public CountdownEvent(int remainingTime) {
        CountdownEvent.remainingTime = remainingTime;
    }
}
