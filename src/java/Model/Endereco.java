/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Endereco {

    private Integer IdEndereco;
    private String pais;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private Integer numero;
    private String cep;
    private String complemento;
    private Integer IdUser;

    public Endereco(String pais, String estado, String cidade, String bairro, String rua, Integer numero, String cep, String complemento) {
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
    }

    public Endereco() {
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
      public Integer getIdUser() {
        return IdUser;
    }

    public void setIdUser(Integer IdUser) {
        this.IdUser = IdUser;
    }

    public Integer getIdEndereco() {
        return IdEndereco;
    }

    public void setIdEndereco(Integer IdEndereco) {
        this.IdEndereco = IdEndereco;
    }

}
