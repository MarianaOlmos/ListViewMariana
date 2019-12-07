package olmos.mariana.listviewmariana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_botones.*
import java.time.Duration


class ActivityBotones : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botones)

       /* Saludo.setOnClickListener {view ->
            mensaje("BIENVENIDO",Toast.LENGTH_LONG)

        }*/
        Saludo.setOnClickListener { view: View? ->
            "Bienvenido"
        }
        fun mensaje(mensaje: String, dur:Int=Toast.LENGTH_SHORT){
            Toast.makeText(this,mensaje,dur).show();
        }

    }
}