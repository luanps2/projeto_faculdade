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
public class Pessoa {
    
    private String nome;
    private String cpf;
    private int idade;
    private Date dataNacimento;
    private String endereco;
    private String telefone;
    private char tipoUsuario;
    private String usuario;
    private String senha;
    private boolean acesso;
    private String[] vacina;
    
    
    public void Cadastro(){
    
    };
    
    public void Cadastro(String nome, String cpf, int idade, Date dataNascimento, String endereco, String telefone, 
            char tipoUsuario, String usuario, String senha, boolean acesso, String vacina[]){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.dataNacimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
        this.usuario = usuario;
        this.senha = senha;
        this.acesso = acesso;
        this.vacina = vacina;
    }
    
       public void Cadastro(String nome, String cpf, int idade, Date dataNascimento, String endereco, String telefone, 
            char tipoUsuario, String usuario, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.dataNacimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
        this.usuario = usuario;
        this.senha = senha;
   
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public Date getDataNacimento() {
        return dataNacimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public char getTipoUsuario() {
        return tipoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isAcesso() {
        return acesso;
    }

    public String[] getVacina() {
        return vacina;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setDataNacimento(Date dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setTipoUsuario(char tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setAcesso(boolean acesso) {
        this.acesso = acesso;
    }

    public void setVacina(String[] vacina) {
        this.vacina = vacina;
    }
    
    
    
    
    
    
    
    
}
