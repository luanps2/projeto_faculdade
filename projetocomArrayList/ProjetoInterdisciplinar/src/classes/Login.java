/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.util.ArrayList;

/**
 *
 * @author Luan
 */
public class Login {
    
    
    
    private String usuario;
    private String senha;
    private String tipo;

    public Login() {
    }

    public Login(String usuario, String senha, String tipo) {
        this.usuario = usuario;
        this.senha = senha;
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
      
}
