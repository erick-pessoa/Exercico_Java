package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	public String nome;
	public int codigo;
	public String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	public List<Endereco> endereco;

	public void AdicionaEndere�o(Endereco endereco) {

		if (endereco == null) {
			throw new NullPointerException("Endere�o n�o pode ser Nullo");
		}
		if (endereco.cep == null) {
			throw new NullPointerException("Cep n�o pode ser Nullo");

		}

		getEndereco().add(endereco);
	}

	private List<Endereco> getEndereco() {

		if (endereco == null) {
			endereco = new ArrayList<Endereco>();
		}

		return endereco;
	}
}
