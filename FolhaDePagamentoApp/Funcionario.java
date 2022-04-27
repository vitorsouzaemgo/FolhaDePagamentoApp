public abstract class Funcionario {
    private String nome;
    private String matricula;

    public Funcionario (String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String toString() {
		String funcionario = "Nome: "+this.nome+" Matrícula: "+this.matricula;
		return funcionario;
	}

    public String getNome() {
		return nome;
	}

    public String getMatricula() {
		return matricula;
	}

    public abstract double ganhos();
}
