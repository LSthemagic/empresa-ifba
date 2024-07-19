package entity;

public class Calculo {

    private Double totalSalario;
    public Calculo() {}

    public void calculoSalario(Double salarioBase, int horasTrabalhadas){
        this.totalSalario = salarioBase * horasTrabalhadas;
    }

    public Double getTotalSalario() {
        return totalSalario;
    }
}
