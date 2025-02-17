package model;

import java.util.Date;
import java.util.List;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private Date dataDeAdmissao;    

    public Funcionario(String nome, String sobrenome, Date dataDeNascimento, String numeroDeIdentidade,
                       String telefone, String email, String cargo, double salario, Date dataDeAdmissao) {
        super(nome, sobrenome, dataDeNascimento, numeroDeIdentidade, telefone, email);
        this.cargo = cargo;
        this.salario = salario;
        this.dataDeAdmissao = dataDeAdmissao;
    }

    // Getters e Setters
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public Date getDataDeAdmissao() { return dataDeAdmissao; }
    public void setDataDeAdmissao(Date dataDeAdmissao) { this.dataDeAdmissao = dataDeAdmissao; }
    
    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", dataDeAdmissao=" + dataDeAdmissao +
                "} " + super.toString();
    }
}
