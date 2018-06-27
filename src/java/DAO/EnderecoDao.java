package DAO;

import Model.Endereco;
import Model.Cliente;



public interface EnderecoDao {

	void cadastrarEndereco(Endereco endereco, Integer id);

	Endereco listarUmEndereco(Integer id);

	void alterarEndereco(Endereco endereco, Integer id);

}
