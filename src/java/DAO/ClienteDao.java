package DAO;

import Model.Cliente;
import Model.Pessoa;
import Model.Perfil;
import java.util.List;

public interface ClienteDao {

	Integer cadastrarCliente(Cliente cliente, Perfil perfil);

	List<Cliente> listarTodosClientes();

	Cliente listarUmCliente(Integer idPessoa);

	void alterarCliente(Cliente cliente);

	void deleterCliente(String login);
	
	Cliente efetuarLogin(String login, String senha);
	
}
