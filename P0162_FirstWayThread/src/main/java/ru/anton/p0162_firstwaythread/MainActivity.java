package ru.anton.p0162_firstwaythread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView tv01;
    MyEventProducer eventProducer = new MyEventProducer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        // найдем View-элементы
        tv01 = (TextView) findViewById(R.id.tv01);
        eventProducer.addMyListener(new MyListener()
        {
            public void myHap(MyEvent myEvent)
            {
                System.out.println("myHap() " + myEvent.getMessage());
                tv01.setText("myHap() " + myEvent.getMessage());
            }
            public void myWillHap(MyEvent myEvent)
            {
                System.out.println("myWillHap() " + myEvent.getMessage());
                tv01.setText("myWillHap() " + myEvent.getMessage());
            }
        });
        eventProducer.doWork("my-job");

    }
}
