package br.com.fiap.a2tina_android_asynctask;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final String IMG_URL = "https://www.douglascabral.com.br/aula-api/img/01.png";
    private ProgressDialog mProgressDialog;
    private ImageView imgBaixada;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBaixada = (ImageView) findViewById(R.id.imgBaixada);

    }

    public void download(View view) {
    }

    private class DownloadAsyncTask extends AsyncTask<>{
        
    }
}
