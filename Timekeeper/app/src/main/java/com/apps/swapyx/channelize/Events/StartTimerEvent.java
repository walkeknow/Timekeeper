package com.apps.swapyx.channelize.Events;


import com.apps.swapyx.channelize.TimerMode;


public class StartTimerEvent {

    public static TimerMode timerMode;

    public StartTimerEvent(TimerMode timerMode) {
        StartTimerEvent.timerMode = timerMode;
    }
}
