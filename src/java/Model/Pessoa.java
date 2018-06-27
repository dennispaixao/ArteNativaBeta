package Model;

import java.time.LocalDate;

public class Pessoa {
    
    private LocalDate dataNasc;
    private String nome;
    private String email;
    private String tlfixo;
    private String celular;

    public Pessoa() {
    }

    public Pessoa(LocalDate dataNasc, String nome, String email, String tlfixo, String celular) {
        this.dataNasc = dataNasc;
        this.nome = nome;
        this.email = email;
        this.tlfixo = tlfixo;
        this.celular = celular;
    }
    
    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
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
