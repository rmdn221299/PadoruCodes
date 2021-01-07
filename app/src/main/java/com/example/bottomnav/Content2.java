package com.example.bottomnav;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Content2 extends AppCompatActivity {


    TextView tx4,tx5;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content2);

        tx5 = findViewById(R.id.test2);
        tx5.setText("FloatingActionButton fab = findViewById(R.id.fab);\n" +
                "fab.setOnClickListener(new View.OnClickListener() {\n" +
                "    @Override\n" +
                "    public void onClick(View view) {\n" +
                "        Snackbar.make(view, \"Here's a Snackbar\", Snackbar.LENGTH_LONG)\n" +
                "                .setAction(\"Action\", null).show();\n" +
                "    }\n" +
                "});");

        tx4 = findViewById(R.id.test);
        tx4.setText("<com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                "        android:id=\"@+id/fab\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_gravity=\"end|bottom\"\n" +
                "        android:src=\"@drawable/ic_my_icon\"\n" +
                "        android:contentDescription=\"@string/submit\"\n" +
                "        android:layout_margin=\"16dp\" />");
    }
}