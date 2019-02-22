package kr.co.woobi.imyeon.buttonlistner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener , View.OnLongClickListener {
    Button btn1, btn2, btn3, btn4;
    TextView textView;

    /**
     * onCreate() 메서드는 액티비티가 생성될 때 호출되는 메서드입니다.
     *   git commit --date="2019-2-22 12:00:00 +0900" -m "주석"
     * 여기서 setContentView() 메서드를 호출하여 액티비티의 레이아웃을 설정합니다.
     * 또한, findViewById() 메서드를 호출하여 버튼과 텍스트뷰를 찾아서 변수에 저장합니다.
     * 마지막으로, setOnClickListener() 메서드를 호출하여 버튼의 클릭 이벤트를 처리합니다.
     * 또한, setOnLongClickListener() 메서드를 호출하여 버튼의 롱클릭 이벤트를 처리합니다.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn1.setOnLongClickListener(this);
        textView = (TextView) findViewById(R.id.textView);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn2.setOnLongClickListener(this);
        btn3=(Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn3.setOnLongClickListener(this);
        btn4=(Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn4.setOnLongClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Toast.makeText(this, ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                textView.setText("OnClick"+ ((Button) v).getText());
                break;
            case R.id.btn2:
                Toast.makeText(this, ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                textView.setText("OnClick"+ ((Button) v).getText());
            case R.id.btn3:
                Toast.makeText(this, ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                textView.setText("OnClick"+ ((Button) v).getText());
            case R.id.btn4:
                Toast.makeText(this, ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                textView.setText("OnClick"+ ((Button) v).getText());
                break;
            default:
                textView.setText("nothing");
                break;
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if (v.getId() == R.id.btn1) {
            textView.setText("OnLongClick" + ((Button) v).getText());
        } else if(v.getId() == R.id.btn2){
            textView.setText("OnLongClick" + ((Button) v).getText());
        } else if(v.getId() == R.id.btn3){
            textView.setText("OnLongClick" + ((Button) v).getText());
        }else {
            textView.setText("OnLongClick" + ((Button) v).getText());
        }
        return true;
    }

    }


