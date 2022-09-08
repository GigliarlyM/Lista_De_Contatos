package br.edu.ifpb.minhalistacontatos.DAO;

import br.edu.ifpb.minhalistacontatos.model.Pessoa;
import br.edu.ifpb.minhalistacontatos.R;

import java.util.ArrayList;

public class PessoaDAO {
    private static ArrayList<Pessoa> pessoas;

    public PessoaDAO() {
        this.pessoas = new ArrayList<Pessoa>();
    }

    public ArrayList<Pessoa> getPessoas() {
        pessoas.add(new Pessoa("Ana Maria","anamaria@mail.com","83999999999",R.drawable.anamaria));
        pessoas.add(new Pessoa("Carlota Joaquina","joaquina@mail.com","83977777777",R.drawable.carlonajoaquina));
        pessoas.add(new Pessoa("Márcia Catiora","cationa@mail.com","83988888888",R.drawable.marciacatiora));
        pessoas.add(new Pessoa("João de Nada","denada.joao@mail.com","83966666666",R.drawable.joaodenada));
        pessoas.add(new Pessoa("Jorge da Lua","dalua.jorge@mail.com","83955555555",R.drawable.jorgedalua));
        pessoas.add(new Pessoa("Juma do Pantanal","juma_onca@mail.com","83944444444",R.drawable.jumadepantanal));
        pessoas.add(new Pessoa("Capitão Planeta","capplanet@mail.com","83933333333",R.drawable.capitaoplaneta));

        return pessoas;
    }

}