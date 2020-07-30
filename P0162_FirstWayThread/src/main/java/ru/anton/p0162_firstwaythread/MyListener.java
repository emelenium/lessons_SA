package ru.anton.p0162_firstwaythread;

import java.util.EventListener;

public interface MyListener extends EventListener {

    public void myWillHap(MyEvent myEvent);
    public void myHap(MyEvent myEvent);
}

