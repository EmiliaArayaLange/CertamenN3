package com.example.certamenn3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
//A tener en cuenta:
// 1) Para pasar de un Activity a otro usar metodo: Intent "variable" = new Intent(parametros)
// 2) Para cargar un Spinner crear array de datos: String [] "variable" = {aqui ingresas los datos}
// 3) Luego deben crear un ArrayAdapter<String> adaptador = new ArrayAdapter<>(parametros)
// 4) Finalmente deben asignar el adaptador a su Spinner
// 5) Recuerden tambien que para pasar los datos de un activity a otro se utiliza el metodo Put.Extra()
//estante = findViewById(R.id.spinner);
//String [] opcion = {"seleccion","RackMonitores","Rackardware","RackPerifericos","RackGAbinetes","RackAccesorios"};
//ArrayAdapterAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,opcion);
//estante.setAdapter(Adapter);


public class MainActivity extends AppCompatActivity {
    EditText Codigo, Nombre, Precio;

    Spinner lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Codigo = findViewById(R.id.txtCodigoProducto);
        Nombre = findViewById(R.id.txtNombreProducto);
        Precio = findViewById(R.id.txtPrecioProducto);

        lista = findViewById(R.id.spinner);
        String[] opcion = {"seleccion", "RackMonitores", "Rackardware",
                "RackPerifericos", "RackGAbinetes", "RackAccesorios"};
        ArrayAdapter<String> Adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, opcion);
        lista.setAdapter(Adapter);
    }

    public void RegistrarProducto(View view) {
        String CodigoProducto = Codigo.getText().toString();
        String NombreProducto = Nombre.getText().toString();
        String PrecioProcucto = Precio.getText().toString();
        String OpcionDeLista = lista.getSelectedItem().toString();
        if (!CodigoProducto.isEmpty() && !NombreProducto.isEmpty()
                && !PrecioProcucto.isEmpty()){
            if (CodigoProducto.length() <= 15);

        }


    }
}
