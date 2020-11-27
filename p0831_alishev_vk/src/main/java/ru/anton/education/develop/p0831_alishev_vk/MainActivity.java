package ru.anton.education.develop.p0831_alishev_vk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView plList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        findViewById(R.id.tv_pl_names);
        String[] names = {"Java", "Python", "Ruby", "JavaScript", "Matlab"};
        plList.setText("");
        for(String name : names){
            plList.append(name+"\n");
        }
    }
}