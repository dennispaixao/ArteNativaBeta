package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente extends Pessoa{
    
    private Integer idCliente;
    private String login;
    private String senha;
    private Integer idPerfil;
    private Endereco endereco;
    private List<Documento> documentos;
    private String status;
    private Date dataCadastro;


    public Cliente() {
    }
    
    public Cliente(String login, String senha, Integer idPerfil) {
        this.login = login;
        this.senha = senha;
        this.idPerfil = idPerfil;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }
    
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }
       
}
