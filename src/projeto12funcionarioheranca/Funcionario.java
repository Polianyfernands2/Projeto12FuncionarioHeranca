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
public class Funcionario {
    String nome;
    double salario;
    private String cpf;
    
    //construtor getter e setter
    public Funcionario(){
    
}

    public Funcionario(String nome, double salario, String cpf) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getInformacao(){
        return "Funcionario:" +this.nome +"recebe"+this.salario;
    }
    public double getBonificacao(){
        return this.salario * 0.10;
    }
}
