
package Model;


public class Documento {

	private Integer idDocumento;
	private String numero;
	private String descricao;
	private Integer idUser;
        /**/
	public Documento() {

	}

	public Documento(String numero, String descricao) {
		
		this.numero = numero;
		this.descricao = descricao;
		
	}

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

}
