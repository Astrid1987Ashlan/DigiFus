package rodriguez87.astridg.digifus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class creditos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);
    }

    public void onClick(View view)
    {
        finish();
    }
}
