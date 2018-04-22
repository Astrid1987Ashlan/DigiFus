package rodriguez87.astridg.digifus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class alerta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerta);
    }
    public void oncerrar(View view) {
        Intent miIntent = new Intent(alerta.this, ingreso.class);
        startActivity(miIntent);
    }
}
