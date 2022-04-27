public final class FuncionarioHora extends FuncionarioAssalariado{
    private int horas;
    private double valorDaHora;

    public FuncionarioHora(String nome, String matricula, double salarioSemanal, int horas, double valorDaHora){
        super(nome, matricula, salarioSemanal);
        this.horas = horas;
        this.valorDaHora = valorDaHora;
    }

    public int getHoras() {
		return horas;
	}

    public void setHoras(int horas) {
        this.horas = horas;
	}

    public double getValorDaHora() {
		return valorDaHora;
	}

    public void setValorDaHora(int valorDaHora) {
        this.valorDaHora = valorDaHora;
	}

    @Override
	public double ganhos() {
		double pagamento = (horas * valorDaHora) + getSalarioSemanal();
		return pagamento;
	}

    public String toString() {
		String funcionario = "\n\nNome: "+getNome()+"\nMatrícula: "+getMatricula()+"\nQuantidade de horas trabalhadas: "+this.horas+
        "\nValor da Hora: "+this.valorDaHora+"\nPagamento Total Semanal: "+this.ganhos()+"\n";
		return funcionario;
	}
}
