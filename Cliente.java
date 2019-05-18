package Entidade;

public class Cliente {
	SomadorEsperado somador;

	public Cliente(SomadorEsperado s) {
		this.somador = somador;

	}

	public void executar() {
		int[] vetor = new int[] { 1, 2, 3, 4, 5 };
		int soma = somador.somaVetor(vetor);
		System.out.println("RESULTADO SOMADO: " + soma);
	}

}
