package DAO;

import Model.Documento;
import Model.Pessoa;
import java.util.List;



public interface DocumentoDao {

	void cadastrarDocumento(Documento documento, Integer id);

	List<Documento> listarDocumentoPorPessoa(Pessoa pessoa);

	Documento pegarUmDocumento(String login);

	void alterarDocumento(List<Documento> documentos, Pessoa pessoa);

	void deleterDocumento(Documento documento);

}
