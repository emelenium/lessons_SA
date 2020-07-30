package ru.anton.p0162_firstwaythread;

import java.util.ArrayList;

public class MyEventProducer {
    private ArrayList<MyListener> listeners = new ArrayList<MyListener>();
    public void addMyListener(MyListener listener)
    {
        listeners.add(listener);
    }
    public MyListener[] getMyListeners()
    {
        return listeners.toArray(new MyListener[listeners.size()]);
    }

    public void removeMyListener(MyListener listener)
    {
        listeners.remove(listener);
    }

    protected void fireMyWillHap(String message)
    {
        MyEvent ev = new MyEvent(this, message);
        for(MyListener listener : listeners)
            listener.myWillHap(ev);
    }

    protected void fireMyHap(String message)
    {
        MyEvent ev = new MyEvent(this, message);
        for(MyListener listener : listeners)
            listener.myHap(ev);
    }

    public void doWork(String workName)
    {
        fireMyWillHap("begin work " + workName);
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
        }
        fireMyHap("end work" + workName);
    }
}
