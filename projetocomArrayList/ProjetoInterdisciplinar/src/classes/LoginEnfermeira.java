/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

//import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Luan Costa
 */
public class LoginEnfermeira {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Pacientes: "));
        int n2 = n;
        
        String[] usuario = new String[n];
        String[] senha = new String[n2];
        
       

        for (int i = 0; i < n; i++) {
            usuario[i] = JOptionPane.showInputDialog("Digite o nome do Paciente " + (i+1));
            senha[i] = JOptionPane.showInputDialog("Digite a senha para o Paciente " + usuario[i]);
        }
        
        
        
        for (int i = 0;i < n;i++){
            System.out.println((i+1) + " - seu usuário usuario: " + usuario[i] 
                    + "\nSua senha é: " + senha[i]);
            
            JOptionPane.showMessageDialog(null, (i+1) + " - seu usuário usuario: " + usuario[i] 
                    + "\nSua senha é: " + senha[i]);
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

}
