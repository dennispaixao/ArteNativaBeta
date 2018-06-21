package Model;

import java.util.Date;

public class Pessoa {
    
    private Date dataNasc;
    private String nome;
    private String email;
    private String tlfixo;
    private String celular;

    public Pessoa() {
    }

    public Pessoa(Date dataNasc, String nome, String email, String tlfixo, String celular) {
        this.dataNasc = dataNasc;
        this.nome = nome;
        this.email = email;
        this.tlfixo = tlfixo;
        this.celular = celular;
    }
    
    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTlfixo() {
        return tlfixo;
    }

    public void setTlfixo(String tlfixo) {
        this.tlfixo = tlfixo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
}
