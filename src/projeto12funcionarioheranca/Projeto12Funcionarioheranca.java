/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto12funcionarioheranca;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              

/**
 *
 * @author aluno
 */
public class Projeto12Funcionarioheranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario objFunc01 = new Funcionario();
        objFunc01.setNome("Poliany");
        objFunc01.setSalario(500);
        objFunc01.setCpf("56456456493");
        System.out.println("Func01:"+objFunc01.getNome());
        System.out.println("Info:"+objFunc01.getInformacao());
        
        Gerente objGer01 = new Gerente();
        objGer01.setNome("Pedro");
        objGer01.setSalario(5000);
        objGer01.setCpf("13213213212");
        objGer01.setSetor("ADM");
        objGer01.setSenha("5456");
        System.out.println("Ger01:"+objGer01.getNome());
        System.out.println("Ger01:"+objGer01.getInformacao());
        
        
        Funcionario objFunc02  = new Gerente();
        Gerente objGer02 = (Gerente) new Funcionario();
        
        
        objFunc02 = objGer02;
        objGer02 = (Gerente)objFunc02;
        
    }
    
}
