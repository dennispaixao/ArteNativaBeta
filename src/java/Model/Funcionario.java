
package Model;


public class Funcionario {

    private String departamento;
    private String login;
    private String senha;
    private Integer idPerfil;

    public Funcionario(String departamento, String login, String senha, Integer idPerfil) {
        this.departamento = departamento;
        this.login = login;
        this.senha = senha;
        this.idPerfil = idPerfil;
    }

    public Funcionario() {
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
    
    
}
