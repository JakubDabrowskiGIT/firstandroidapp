package pl.uniwersytetradom.bartoszewski.artur.zasobynst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView pic;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pic = (ImageView) findViewById(R.id.imageView01);
        title = (TextView) findViewById(R.id.texView01);
        pic.setImageResource(R.drawable.images);


    }

    public void description1 (View view) {
        pic.setImageResource(R.drawable.images);
        title.setText(R.string.description1);
    }

    public void description2 (View view) {
        pic.setImageResource(R.drawable.wilk01);
        title.setText(R.string.description2);
    }

    public void description3 (View view) {
        pic.setImageResource(R.drawable.italy);
        title.setText(R.string.description3);
    }
}
