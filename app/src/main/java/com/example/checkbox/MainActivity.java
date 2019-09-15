package com.example.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    CheckBox checkBox,checkBox1,checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox=findViewById(R.id.checkBox);
        checkBox1=findViewById(R.id.checkBox2);
        checkBox2=findViewById(R.id.checkBox3);
        checkBox.setOnCheckedChangeListener(this);
        checkBox1.setOnCheckedChangeListener(this);
        checkBox2.setOnCheckedChangeListener(this);

      //  checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           // @Override
            //public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
             //   onClick();
           // }
        //});
    }
    public void onCheckedChanged(CompoundButton compoundButton,boolean b){
        switch (compoundButton.getId())
        {
            case R.id.checkBox:
                Toast.makeText(this, "1"+checkBox.getText(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.checkBox2:
                Toast.makeText(this, "2"+checkBox1.getText(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.checkBox3:
                Toast.makeText(this, "3"+checkBox2.getText(), Toast.LENGTH_SHORT).show();
                break;

        }
    }
/*public void onClick()
{
    if(checkBox.isChecked())
    {
        Toast.makeText(MainActivity.this, "Checked", Toast.LENGTH_SHORT).show();
    }else
    {
        Toast.makeText(MainActivity.this, "unChecked", Toast.LENGTH_SHORT).show();
    }
}*/
}
