package cn.maitian.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Python是一种解释型、面向对象、动态数据类型的高级程序设计语言。Python由Guido van Rossum于1989年底发明，第一个公开发行版发行于1991年。像Perl语言一样, Python 源代码同样遵循 GPL(GNU General Public License)协议。Python是一种解释型、面向对象、动态数据类型的高级程序设计语言。Python由Guido van Rossum于1989年底发明，第一个公开发行版发行于1991年。像Perl语言一样, Python 源代码同样遵循 GPL(GNU General Public License)协议。Python是一种解释型、面向对象、动态数据类型的高级程序设计语言。Python由Guido van Rossum于1989年底发明，第一个公开发行版发行于1991年。\r像Perl语言一样, Python 源代码同样遵循 GPL(GNU General Public License)协议。Python是一种解释型、面向对象、动态数据类型的高级程序设计语言。 \rPython由Guido van Rossum于1989年底发明，第一个公开发行版发行于1991年。像Perl语言一样, Python 源代码同样遵循 GPL(GNU General Public License)协议。");
    }
}
