package cn.reflect.chronometer;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {
    private Chronometer chronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chronometer = (Chronometer) findViewById(R.id.chronometer);
        //setFormat设置用于显示的格式化字符串。
        //格式化字符串:如果指定，计时器将根据这个字符串来显示，替换字符串中第一个“%s”为当前"MM:SS"或 "H:MM:SS"格式的时间显示。
        chronometer.setFormat("计时：%s");
    }

    /** 开始计时 */
    public void onStart(View view) {
        chronometer.start();
    }

    /** 停止计时 */
    public void onStop(View view) {
        chronometer.stop();
    }

    /** 重置 */
    public void onReset(View view) {
        //setBase 设置基准时间
        //设置参数base为SystemClock.elapsedRealtime()即表示从当前时间开始重新计时）。
        Log.e("dss", "SystemClock.elapsedRealtime()=" + SystemClock.elapsedRealtime());
        chronometer.setBase(SystemClock.elapsedRealtime() + 30 * 60 * 1000);

    }
}
