package rodriguez87.astridg.digifus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class atencion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atencion);
    }

    public void onfacturacion(View view) {
        Intent miIntent = new Intent(atencion.this, turno.class);
        startActivity(miIntent);
    }

    public void onatencionestudiante(View view) {
        Intent miIntent = new Intent(atencion.this, turno.class);
        startActivity(miIntent);
    }
}
