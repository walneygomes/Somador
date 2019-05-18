package Entidade;

import java.util.ArrayList;
import java.util.List;

public class AdapterSomador implements SomadorEsperado {
	private SomadorExistente somador;

	public AdapterSomador() {
		this.somador = new SomadorExistente();
	}

	@Override
	public int somaVetor(int[] vetor) {

		return somador.somaLista(realizarAdpter(vetor));
	}

	private List<Integer> realizarAdpter(int[] vetor) {
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < vetor.length; i++) {
			lista.add(vetor[i]);
		}
		return lista;
	}

}
