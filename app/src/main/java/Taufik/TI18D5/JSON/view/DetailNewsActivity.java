package Taufik.TI18D5.JSON.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import Taufik.TI18D5.JSON.R;

public class DetailNewsActivity extends AppCompatActivity {

    TextView tvTitle, txTglPublish, txDetailBerita;
    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_news);

        tvTitle = (TextView) findViewById(R.id.sheetTittleBerita);
        txTglPublish = (TextView) findViewById(R.id.sheetTglPublish);
        txDetailBerita = (TextView) findViewById(R.id.sheetDetailBerita);
        pic = (ImageView) findViewById(R.id.sheetPicBerita);

        if(getIntent().getExtras() != null){
            Bundle tampungBundle = getIntent().getExtras();
            tvTitle.setText(tampungBundle.getString("TITTLE"));
            txTglPublish.setText("Dipublikasikan pada" + tampungBundle.getString("PUBLISH") + ", Oleh " +tampungBundle.getString("AUTHOR"));
            txDetailBerita.setText(tampungBundle.getString("CONTENT"));

            Picasso.get().load(tampungBundle.getString("IMG")).placeholder(R.drawable.placeholder).into(pic);
        }else{

        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}