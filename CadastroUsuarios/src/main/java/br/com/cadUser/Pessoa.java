
package br.com.cadUser;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped

public class Pessoa {

	private String nome;

	private List<String> listNome = new ArrayList<>();

	public String add() {
		listNome.add(nome);
		return "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getListNome() {
		return listNome;
	}

	public void setListNome(List<String> listNome) {
		this.listNome = listNome;
	}

}