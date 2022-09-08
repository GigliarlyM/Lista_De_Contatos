package br.edu.ifpb.minhalistacontatos.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import br.edu.ifpb.minhalistacontatos.R;
import br.edu.ifpb.minhalistacontatos.model.Pessoa;

public class ListaContatosAdapter extends BaseAdapter {

    private Context contexto;
    private ArrayList<Pessoa> pessoas;

    public ListaContatosAdapter(Context contexto, ArrayList<Pessoa> pessoas) {
        this.contexto = contexto;
        this.pessoas = pessoas;
    }

    @Override
    public int getCount() {
        return pessoas.size();
    }

    @Override
    public Object getItem(int i) {
        return pessoas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View item_lista, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(this.contexto);

        if (item_lista == null){
            item_lista = inflater.inflate(R.layout.item_lista, viewGroup, false);
        }

        ImageView ivFotoPessoa = item_lista.findViewById(R.id.ivFotoPessoa);
        TextView tvNomePessoa = item_lista.findViewById(R.id.tvNomePessoa);
        TextView tvEmailPessoa = item_lista.findViewById(R.id.tvEmailPessoa);
        TextView tvTelefonePessoa = item_lista.findViewById(R.id.tvTelefonePessoa);

        Pessoa pessoaAtual = (Pessoa) getItem(i);

        tvNomePessoa.setText(pessoaAtual.getNome());
        tvEmailPessoa.setText(pessoaAtual.getEmail());
        tvTelefonePessoa.setText(pessoaAtual.getTelefone());
        ivFotoPessoa.setImageResource(pessoaAtual.getFoto());

        return item_lista;
    }
}
