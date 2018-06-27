package DAO;

import Model.Fornecedor;
import Model.Perfil;
import java.util.List;

public interface FornecedorDao {

    Integer cadastrarFornecedor(Fornecedor fornecedor);

    List<Fornecedor> listarTodosFornecedores();

    Fornecedor listarUmFornecedor(Integer idPessoa);

    void alterarFornecedor(Fornecedor fornecedor);

    void deleterFornecedor(Integer idPessoa);
	
}
