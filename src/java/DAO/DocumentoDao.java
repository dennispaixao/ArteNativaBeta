package DAO;

import Model.Documento;
import Model.Pessoa;
import java.util.List;



public interface DocumentoDao {

	void cadastrarDocumento(Documento documento, Integer id);

	List<Documento> listarDocumentoPorPessoa(Integer id);

	Documento pegarUmDocumento(String login);

	void alterarDocumento(Documento documento, Integer id);

	void deleterDocumento(Documento documento);

}
