/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author Luan Costa
 */
public class Medico extends Pessoa{
    
    private int crm;
    
    Pessoa p = new Pessoa();
    
    public Medico(){}
    
    public Medico(String nome, String cpf, int idade, Date dataNascimento, String endereco, String telefone, 
            char tipoUsuario, String usuario, String senha, int crm){
         p.Cadastro(nome, cpf, idade, dataNascimento, endereco, telefone, tipoUsuario, usuario, senha);
         this.crm = crm;
    
    }
    
}
