package com.example.bottomnav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageViewFotoContent;
    TextView textViewJudulContent, textViewInfoContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewFotoContent = findViewById(R.id.imageViewFotoContent);
        textViewJudulContent = findViewById(R.id.textViewJudulContent);
        textViewInfoContent = findViewById(R.id.textViewInfoContent);

        Glide.with(this).load(getIntent().getIntExtra("foto_Content",0)).into(imageViewFotoContent);
        textViewJudulContent.setText(getIntent().getStringExtra("nama_Content"));
        textViewInfoContent.setText(getIntent().getStringExtra("info_Content"));

        textViewInfoContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyText(textViewInfoContent.getText().toString());
            }
        });
    }

    void CopyText(String text){
        ClipboardManager clipBoard = (ClipboardManager) this.getSystemService(this.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("asd", text);
        clipBoard.setPrimaryClip(clip);

        Toast.makeText(this, "udah dicopy cuy! ", Toast.LENGTH_SHORT).show();
    }
}