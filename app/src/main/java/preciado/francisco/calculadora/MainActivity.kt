package preciado.francisco.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var num1: Int = 0
    var num2: Int = 0
    var operacion: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvNum1: TextView = findViewById(R.id.tvNum1)
        var tvNum2: TextView = findViewById(R.id.tvNum2)

        var btnNum0: Button = findViewById(R.id.btnNum0)
        var btnNum1: Button = findViewById(R.id.btnNum1)
        var btnNum2: Button = findViewById(R.id.btnNum2)
        var btnNum3: Button = findViewById(R.id.btnNum3)
        var btnNum4: Button = findViewById(R.id.btnNum4)
        var btnNum5: Button = findViewById(R.id.btnNum5)
        var btnNum6: Button = findViewById(R.id.btnNum6)
        var btnNum7: Button = findViewById(R.id.btn7)
        var btnNum8: Button = findViewById(R.id.btnNum8)
        var btnNum9: Button = findViewById(R.id.btnNum9)

        var btnSuma: Button = findViewById(R.id.btnSuma)
        var btnResta: Button = findViewById(R.id.btnResta)
        var btnMultiplicacion: Button = findViewById(R.id.btnMultiplicacion)
        var btnDivision: Button = findViewById(R.id.btnDivision)

        var btnResult: Button = findViewById(R.id.btnResult)
        var btnBorrar: Button = findViewById(R.id.btnBorrar)

        btnNum0.setOnClickListener {
            if (!tvNum2.text.toString().equals("0"))
                tvNum2.setText(tvNum2.text.toString() + "0")
        }

        btnNum1.setOnClickListener {
            if (tvNum2.text.toString().equals("0"))
                tvNum2.setText("")
            tvNum2.setText(tvNum2.text.toString() + "1")
        }

        btnNum2.setOnClickListener {
            if (tvNum2.text.toString().equals("0"))
                tvNum2.setText("")
            tvNum2.setText(tvNum2.text.toString() + "2")
        }

        btnNum3.setOnClickListener {
            if (tvNum2.text.toString().equals("0"))
                tvNum2.setText("")
            tvNum2.setText(tvNum2.text.toString() + "3")
        }

        btnNum4.setOnClickListener {
            if (tvNum2.text.toString().equals("0"))
                tvNum2.setText("")
            tvNum2.setText(tvNum2.text.toString() + "4")
        }

        btnNum5.setOnClickListener {
            if (tvNum2.text.toString().equals("0"))
                tvNum2.setText("")
            tvNum2.setText(tvNum2.text.toString() + "5")
        }

        btnNum6.setOnClickListener {
            if (tvNum2.text.toString().equals("0"))
                tvNum2.setText("")
            tvNum2.setText(tvNum2.text.toString() + "6")
        }

        btnNum7.setOnClickListener {
            if (tvNum2.text.toString().equals("0"))
                tvNum2.setText("")
            tvNum2.setText(tvNum2.text.toString() + "7")
        }

        btnNum8.setOnClickListener {
            if (tvNum2.text.toString().equals("0"))
                tvNum2.setText("")
            tvNum2.setText(tvNum2.text.toString() + "8")
        }

        btnNum9.setOnClickListener {
            if (tvNum2.text.toString().equals("0"))
                tvNum2.setText("")
            tvNum2.setText(tvNum2.text.toString() + "9")
        }

        btnSuma.setOnClickListener {
            operacion = 0
            num1=tvNum2.text.toString().toInt()
            tvNum1.setText(tvNum2.text.toString()+"+")
            tvNum2.setText("0")
        }

        btnResta.setOnClickListener {
            operacion = 1
            num1=tvNum2.text.toString().toInt()
            tvNum1.setText(tvNum2.text.toString()+"-")
            tvNum2.setText("0")
        }

        btnMultiplicacion.setOnClickListener {
            operacion = 2
            num1=tvNum2.text.toString().toInt()
            tvNum1.setText(tvNum2.text.toString()+"*")
            tvNum2.setText("0")
        }

        btnDivision.setOnClickListener {
            operacion = 3
            num1=tvNum2.text.toString().toInt()
            tvNum1.setText(tvNum2.text.toString()+"/")
            tvNum2.setText("0")
        }

        btnBorrar.setOnClickListener {
            if(!tvNum2.equals("0")){
                if(tvNum2.text.length==1){
                    tvNum2.setText("0")
                }else{
                    tvNum2.setText(tvNum2.text.toString().substring(0,tvNum2.text.length-1))
                }
            }
        }

        btnResult.setOnClickListener {
            if(tvNum1.text.isEmpty())
                return@setOnClickListener
            num2=tvNum2.text.toString().toInt()
            var result: Float=0f
            when(operacion){
                0 -> result=(num1.toFloat()+num2.toFloat())
                1 -> result=(num1.toFloat()-num2.toFloat())
                2 -> result=(num1.toFloat()*num2.toFloat())
                3 -> result=(num1.toFloat()/num2.toFloat())
            }
            tvNum1.setText(result.toString())
            tvNum2.setText("0")
        }
    }

}