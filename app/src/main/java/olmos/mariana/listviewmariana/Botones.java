package olmos.mariana.listviewmariana;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Botones extends AppCompatActivity  {
    Button Saludo;
//    Button Regresar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Saludo = (Button) findViewById(R.id.Saludo);
       // Regresar = findViewById(R.id.Regresar);

       /* Regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mensajito("NOS VEMOS PRONTO");

            }
        });*/
        Saludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"SALUDO",Toast.LENGTH_LONG).show();

            }
        });
    }

    public void mensao(String mensaje){

        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
    }


    public void mensajito(String mensaje){

        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
    }


}
