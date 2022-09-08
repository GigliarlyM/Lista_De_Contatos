package br.edu.ifpb.minhalistacontatos.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.minhalistacontatos.DAO.PessoaDAO;
import br.edu.ifpb.minhalistacontatos.R;
import br.edu.ifpb.minhalistacontatos.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    private ListView lvContatos;
    private PessoaDAO pessoaDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PessoaDAO pessoaDAO = new PessoaDAO();
        ArrayList<Pessoa> pessoas = pessoaDAO.getPessoas();

        ListaContatosAdapter listaContatosAdapter = new ListaContatosAdapter(this, pessoas);

        this.lvContatos = (ListView) findViewById(R.id.listView);
        this.lvContatos.setAdapter(listaContatosAdapter);

        Log.i("CONTATOS", String.format("o total de pessoas é: %s", listaContatosAdapter.getCount()));
        Toast.makeText(
                this,
                String.format("o total de pessoas é: %s", listaContatosAdapter.getCount()),
                Toast.LENGTH_SHORT
        ).show();

    }
}