package br.com.gabriel.contador

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaContador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_contador)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val textView = findViewById<TextView>(R.id.textView);
        val btnAumentar = findViewById<Button>(R.id.btnAumentar);
        val btnDiminuir = findViewById<Button>(R.id.btnDiminuir);

        var contador = 0;

        btnAumentar.setOnClickListener(){
            textView.setText(++contador);
        }
        btnDiminuir.setOnClickListener(){
            textView.setText(--contador);
        }

    }
}