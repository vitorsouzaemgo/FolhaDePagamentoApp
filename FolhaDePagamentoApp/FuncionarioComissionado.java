public final class FuncionarioComissionado extends Funcionario{
    private int quantidadeVendas;
    private double valorPorVenda;

    public FuncionarioComissionado(String nome, String matricula, int quantidadeVendas, double valorPorVenda){
        super(nome, matricula);
        this.quantidadeVendas = quantidadeVendas;
        this.valorPorVenda = valorPorVenda;
    }

    @Override
	public double ganhos() {
		double pagamento = quantidadeVendas * valorPorVenda;
		return pagamento;
	}

    public int getQuantidadeVendas() {
		return quantidadeVendas;
	}

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
	}

    public double getValorPorVenda() {
		return valorPorVenda;
	}

    public void setValorPorVenda(int valorPorVenda) {
        this.valorPorVenda = valorPorVenda;
	}

    public String toString() {
		String funcionario = "\n\nNome: "+super.getNome()+" Matrícula: "+super.getMatricula()+"\nQuantidade de vendas: "+this.quantidadeVendas+
        "\nValor por venda: "+this.valorPorVenda+"\nPagamento Recebido: "+this.ganhos();
		return funcionario;
	}
}
