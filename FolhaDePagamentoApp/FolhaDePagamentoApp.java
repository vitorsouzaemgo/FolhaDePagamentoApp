public class FolhaDePagamentoApp {
    public static void main(String[] args) {
		FuncionarioComissionado c1 = new FuncionarioComissionado("Felipe", "1456", 54, 150.0);
        FuncionarioAssalariado a1 = new FuncionarioAssalariado("Fernanda", "1768", 290.0);
        FuncionarioHora h1 = new FuncionarioHora("Tiago", "2902", 300.0, 19, 11.5);


        System.out.print("\nFolha de Pagamento:");
        System.out.print(c1.toString());
        System.out.print(a1.toString());
        System.out.print(h1.toString());

	}
}
