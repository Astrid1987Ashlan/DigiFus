package rodriguez87.astridg.digifus;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class ingreso extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);
    }

    public void oncreditos(View view) {
        Intent miIntent = new Intent(ingreso.this, creditos.class);
        startActivity(miIntent);
    }

    public void onturno(View view) {
        Intent miIntent1 = new Intent(ingreso.this, atencion.class);
        startActivity(miIntent1);
    }

    public void oncerrar(View view) {
        finish();
    }

}