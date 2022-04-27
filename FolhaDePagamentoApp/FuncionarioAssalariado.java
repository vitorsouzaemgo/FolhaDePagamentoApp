public class FuncionarioAssalariado extends Funcionario{
    private double salarioSemanal;

    public FuncionarioAssalariado(String nome, String matricula, double salarioSemanal){
        super(nome, matricula);
        this.salarioSemanal = salarioSemanal;
    }

    @Override
	public double ganhos() {
		double pagamentoMensal = salarioSemanal * 4;
		return pagamentoMensal;
	}

    public double getSalarioSemanal() {
		return salarioSemanal;
	}

    public void setSalarioSemanal(int salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
	}

    public String toString() {
		String funcionario = "\n\nNome: "+super.getNome()+"\nMatrícula: "+super.getMatricula()+"\nSalário Semanal: "+this.salarioSemanal+
        "\nPagamento Mensal: "+this.ganhos();
		return funcionario;
	}
}
