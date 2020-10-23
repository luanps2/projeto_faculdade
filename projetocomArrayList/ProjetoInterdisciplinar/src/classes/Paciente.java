/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Luan Costa
 */
public class Paciente extends Pessoa{
    
    private int codConsulta;
    private Date dataConsulta;
    private Date horaConsulta;
    
    Pessoa p = new Pessoa();
    
    public Paciente(String nome, String cpf, int idade, Date dataNascimento, String endereco, String telefone, 
            char tipoUsuario, String usuario, String senha, Date dataConsulta, Date horaConsulta){
    
        p.Cadastro(nome, cpf, idade, dataNascimento, endereco, telefone, tipoUsuario, usuario, senha);
        this.dataConsulta = dataConsulta;
        this.horaConsulta = horaConsulta;
        
    }
    
    public void ImprimeDadosPaciente(){
        JOptionPane.showMessageDialog(null, "Nome: " + getNome() + 
                "CPF: " + getCpf() + 
                "Idade: " + getIdade() + 
                "Data de Nascimento: " + getDataNacimento() + 
                "Endereço: " + getEndereco() + 
                "Telefone: " + getTelefone() + 
                "Tipo de Usuário: " + getTipoUsuario() + 
                "Usuario: " + getUsuario() + 
                "Senha: " + getSenha() + 
                "Data da Consulta: " + dataConsulta + 
                "Hora da Consulta: " + horaConsulta);
    }
    
    
    
}
