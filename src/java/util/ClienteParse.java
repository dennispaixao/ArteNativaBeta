
package util;

import Model.Cliente;
import Model.Documento;
import Model.Endereco;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

public class ClienteParse {

    public static Cliente realizaParse(HttpServletRequest req) {
        Cliente cliente = new Cliente();
       
        cliente.setNome(req.getParameter("nome"));
       
        
        try{  
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
           
           cliente.setDataNasc(format.parse(req.getParameter("dataNasc")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        cliente.setTlfixo(req.getParameter("tel"));
        cliente.setCelular(req.getParameter("cel"));
        cliente.setEmail(req.getParameter("email"));
        cliente.setLogin(req.getParameter("email"));
        
        cliente.setSenha(req.getParameter("senha") == null ? "12345": req.getParameter("senha") );
        
        cliente.setDocumentos(Arrays.asList(
                              new Documento(req.getParameter("cpf"), "cpf"), 
                              new Documento(req.getParameter("cpf"), "rg"))
                              );
        
        cliente.setEmail(req.getParameter("email"));
        
        cliente.setEndereco(new Endereco(
                            req.getParameter("pais"),
                            req.getParameter("estado"),
                            req.getParameter("cidade"),
                            req.getParameter("bairro"),
                            req.getParameter("rua"),
                            Integer.parseInt(req.getParameter("numero")),
                            req.getParameter("cep"),
                            req.getParameter("complemento")
                            ));
        
        
       return cliente;
        
    }

    
}
