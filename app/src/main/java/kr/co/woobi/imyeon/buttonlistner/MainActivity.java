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


