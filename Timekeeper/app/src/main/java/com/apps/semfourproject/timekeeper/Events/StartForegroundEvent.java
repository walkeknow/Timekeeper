package com.apps.semfourproject.timekeeper.Events;

public class StartForegroundEvent {
    public static boolean startForeground = false;

    public StartForegroundEvent(boolean b) {
        startForeground = b;
    }
}
