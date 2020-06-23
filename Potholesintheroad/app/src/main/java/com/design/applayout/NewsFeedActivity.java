package com.design.applayout;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.GridView;

        import androidx.appcompat.app.AppCompatActivity;

public class NewsFeedActivity extends AppCompatActivity implements View.OnClickListener{

    Button galleryBtn;

    String[] potholeNames = {"Pothole1","Pothole2","Pothole3","Pothole4","Pothole5","Pothole6"};
    int[] potholeImages = {R.drawable.pothole1,R.drawable.pothole2,R.drawable.pothole3,R.drawable.pothole4,R.drawable.pothole5,R.drawable.pothole6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_feed);

        galleryBtn=(Button)findViewById(R.id.galleryButton);
        galleryBtn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.galleryButton){
            Intent i = new Intent(NewsFeedActivity.this, GalleryActivity.class);
            startActivity(i);
        }
    }
}