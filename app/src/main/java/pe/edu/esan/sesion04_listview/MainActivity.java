package pe.edu.esan.sesion04_listview;


import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //Se crea una arreglo de string con los valores que se asginarán a la lista
    String[] arrSO = new String[]{
            "Android", "iPhone", "Windows Phone", "Blackberry", "Firefox OS", "Amazon World", "Nokia"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se obtiene el view lstSO
        ListView lsvSistemasOperativos = (ListView) findViewById(R.id.lsvSO);

        //Se crea un adaptador para llenar la lista
        ArrayAdapter adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrSO);
        //Se asigna el adaptador a la view
        lsvSistemasOperativos.setAdapter(adaptador);
        //Se genera el método setOnItemClickListener de la view
        lsvSistemasOperativos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(), "Posición:" +  Integer.toString(i), Toast.LENGTH_SHORT).show();

            }
        });
    }

}
