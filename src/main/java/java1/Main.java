package java1;

public class Main {

	public static void main(String[] args) {
		Main elias = new Main();
		elias.iniciar();

	}

	private void iniciar() {
		int idade = 15;
		System.out.println("A idade é de " + idade + " anos");
		idade = (idade + 5) * 1;
		System.out.println("resultado 1:" + idade);
		idade = idade - 50;
		System.out.println("resultado 2:" + idade);
		if (idade > 20) {
			System.out.println("A idade é maior que 20");
		} else if (idade > 10 && idade <= 20) {
			System.out.println("idade maior que 10 e menor que 20");
		} else {
			System.out.println("a idade é menor que 10");
		}

	}

}
