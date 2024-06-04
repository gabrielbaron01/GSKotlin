package com.github.gabrielbaron01

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.RecyclerView
import com.github.gabrielbaron01.ui.theme.GabrielBaron_RM93266_recyclerViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView);
        val itemsAdapter = PraiaAdapter()
        recyclerView.adapter = itemsAdapter

        val button = findViewById<Button>(R.id.button)
        val editTextNome = findViewById<EditText>(R.id.editTextNome)
        val editTextCidade = findViewById<EditText>(R.id.editTextCidade)
        val editTextEstado = findViewById<EditText>(R.id.editTextEstado)

        button.setOnClickListener {
            val praia = PraiaModel(
                nome = editTextNome.text.toString(),
                cidade = editTextCidade.text.toString(),
                estado = editTextEstado.text.toString()
            )

            itemsAdapter.adicionarPraia(praia)
        }
    }
}
