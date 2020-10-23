/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

//import java.util.ArrayList;
import forms.frmLoginPaciente;
import forms.frmMenu;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luan Costa
 */
public class LoginPaciente extends Login {

    public void cadastraArray() {
        ArrayList<Login> listaLogin = new ArrayList();

        Login login = new Login(JOptionPane.showInputDialog("Usuario: "), JOptionPane.showInputDialog("Senha: "), "Paciente");

        listaLogin.add(login);

        JOptionPane.showMessageDialog(null, "listaLogin: " + login.getUsuario());

        for (Login l : listaLogin) {
            JOptionPane.showMessageDialog(null, "Paciente " + l.getUsuario() + " cadastrado com Sucesso " + " \nSenha Cadastrada: " + l.getSenha() + " \nTipo: " + l.getTipo());
        }

    }

    public void LogarPaciente(String user, String pass) {
        Login login = new Login();
        if ((user == login.getUsuario()) && (pass == login.getSenha())) {
            
            JOptionPane.showMessageDialog(null, "Bem Vindo " + getUsuario() + "!");
            frmMenu menu = new frmMenu();
            menu.setVisible(true);
            frmLoginPaciente loginpaciente = new frmLoginPaciente();
            loginpaciente.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválido!");
        }

    }

    int n;

    public void cadastrarPaciente() {

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Pacientes: "));

        Login[] paciente = new Login[n];
//        String[] senha = new String[n2];

        for (int i = 0; i < paciente.length; i++) {
            Login logins = new Login();
            String usuario = JOptionPane.showInputDialog("Digite o nome do Paciente " + (i + 1));
            String senha = JOptionPane.showInputDialog("Digite a senha para o Paciente " + usuario);
            paciente[i] = new Login(usuario, senha, "Paciente");
        }

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " - seu usuário: " + paciente[i].getUsuario()
                    + "\nSua senha é: " + paciente[i].getSenha());

            JOptionPane.showMessageDialog(null, (i + 1) + " - seu usuário usuario: " + paciente[i].getUsuario()
                    + "\nSua senha é: " + paciente[i].getSenha());
        }
    }

    public void consultarPaciente(String txtuser, String txtsenha) {

        if (txtuser == getUsuario() && txtsenha == getSenha()) {
            JOptionPane.showMessageDialog(null, "Bem Vindo " + getUsuario());
            frmLoginPaciente LPaciente = new frmLoginPaciente();
            LPaciente.dispose();
            frmMenu menu = new frmMenu();
            menu.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválido");
            JOptionPane.showMessageDialog(null, "Usuario: " + getUsuario() + "\nSenha: " + getSenha() + "\nTipo: " + getTipo());
            JOptionPane.showMessageDialog(null, "Usuario: " + txtuser + "\nSenha: " + txtuser + "\nTipo: " + getTipo());

        }
//        for (int i = 0; i < paciente.length; i++) {
//            if (txtuser == paciente[i].getUsuario() && txtsenha == paciente[i].getSenha()) {
//                JOptionPane.showMessageDialog(null, "Acesso autorizado!" + paciente[i].getUsuario());
//            } else {
//                JOptionPane.showMessageDialog(null, "Usuario " + txtuser + " ou senha incorretos!");
//            }
//        }

    }

}

//    public ArrayList<String> usuarios = new ArrayList();
//    for(int c=0;c<=5;c++){
//        System.out.println("Usuario:" + usuario[c]);
//        System.out.println("Senha: " + senha[c]);
//    
//
//    }
//    public String[] getUsuario() {
//        return usuario;
//    }
//
//    public String[] getSenha() {
//        return senha;
//    }
//
//    void getSenha(String[] senha) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

