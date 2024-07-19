package entity;

import java.time.Instant;

public class Funcionario {
    String nome;
    String cpf;
    String rg;
    private Integer matricula;
    private Double salario;
    private Instant dataContratacao;
    private Double salarioBase;
    private int horasTrabalhadas;
    private static Integer geraMatricula = 0;

    public Funcionario(String nome, Double salarioBase, int horasTrabalhadas) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
        this.dataContratacao = Instant.now();
        this.matricula = geraMatricula++;
    }

    public void calculaSalario(){
        Calculo calculo = new Calculo();
        calculo.calculoSalario(salarioBase,horasTrabalhadas);
        this.salario = calculo.getTotalSalario();
    }

    public void imprimeDados() {
        System.out.println("Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", matricula=" + matricula +
                ", salario=" + salario +
                ", dataContratacao=" + dataContratacao +
                ", salarioBase=" + salarioBase +
                ", horasTrabalhadas=" + horasTrabalhadas +
                '}');
    }
}
