
package util;

import Model.Cliente;
import Model.Documento;
import Model.Endereco;
import Model.Fornecedor;
import java.time.LocalDate;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

public class FornecedorParse {

    public static Fornecedor realizaParse(HttpServletRequest req) {
        Fornecedor fornecedor = new Fornecedor();
       
        fornecedor.setNome(req.getParameter("nome"));
        fornecedor.setDataNasc(LocalDate.parse(req.getParameter("dataNasc")));
        
        fornecedor.setTlfixo(req.getParameter("tel"));
        fornecedor.setCelular(req.getParameter("cel"));
        fornecedor.setEmail(req.getParameter("email"));
        
        fornecedor.setDocumentos(Arrays.asList(
                              new Documento(req.getParameter("cpf"), "cpf"), 
                              new Documento(req.getParameter("cnpj"), "cnpj"))
                              );
        
        fornecedor.setEmail(req.getParameter("email"));
        
        fornecedor.setEndereco(new Endereco(
                            req.getParameter("pais"),
                            req.getParameter("estado"),
                            req.getParameter("cidade"),
                            req.getParameter("bairro"),
                            req.getParameter("rua"),
                            Integer.parseInt(req.getParameter("numero")),
                            req.getParameter("cep"),
                            req.getParameter("complemento")
                            ));
        
        
       return fornecedor;
        
    }

    
}
