package andrefpcunha.app.sorteio0a10

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    val  lastNumbers = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortearNumero(view: View){
        var txtNumeroSorteado = findViewById<View>(R.id.txtNumeroSorteado) as TextView

        var numSorteado = Random().nextInt(11) //o a 10

        txtNumeroSorteado.text = "Número sorteado: $numSorteado"


        var txtUltNum = findViewById<View>(R.id.txtUltNum) as TextView



        lastNumbers.add(numSorteado)

        if(lastNumbers.count() == 1) {
            txtUltNum.text = lastNumbers[0].toString()
            //Log.i("primeiroNumero",lastNumbers[0].toString())
        }
        else{
            txtUltNum.text = lastNumbers[lastNumbers.lastIndex-1].toString()

        }

    }
}
