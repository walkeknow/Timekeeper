package com.apps.semfourproject.timekeeper.Events;


import com.apps.semfourproject.timekeeper.TimerMode;


public class StartTimerEvent {

    public static TimerMode timerMode;

    public StartTimerEvent(TimerMode timerMode) {
        StartTimerEvent.timerMode = timerMode;
    }
}
