package DAO;

import Model.Endereco;
import Model.Cliente;



public interface EnderecoDao {

	void cadastrarEndereco(Endereco endereco, Integer id);

	Endereco listarEnderecoPorPessoa(Cliente cliente);

	Endereco listarUmEndereco(Cliente login);

	void alterarEndereco(Endereco endereco);

	void deleterEndereco(Endereco endereco);

}
