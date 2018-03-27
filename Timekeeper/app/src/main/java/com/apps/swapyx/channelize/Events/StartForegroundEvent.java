package com.apps.swapyx.channelize.Events;

public class StartForegroundEvent {
    public static boolean startForeground = false;

    public StartForegroundEvent(boolean b) {
        startForeground = b;
    }
}
