package DAO;

import Model.Cliente;
import Model.Perfil;
import java.util.List;

public interface ClienteDao {

	Integer cadastrarCliente(Cliente cliente, Perfil perfil);

	List<Cliente> listarTodosClientes();

	Cliente listarUmCliente(Integer idPessoa);

	void alterarCliente(Cliente cliente);

	void deleterCliente(Integer idPessoa);
	
	Cliente efetuarLogin(String login, String senha);
	
}
