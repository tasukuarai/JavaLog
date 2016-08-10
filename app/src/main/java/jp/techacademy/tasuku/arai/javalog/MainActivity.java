package jp.techacademy.tasuku.arai.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    // ここを追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("荒井", 24, "GAME");
        Human human2 = new Human("石井", 48, "釣り");

        human.say();
        human.think();

        human2.say();
        human2.think();
    }

}
