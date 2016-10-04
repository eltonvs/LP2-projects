import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Avaliador {

	private double maiorDeTodos = Double.NEGATIVE_INFINITY;
	private double menorDeTodos = Double.POSITIVE_INFINITY;
	private List<Lance> maiores;// Utilizamos List par trabalhar com a Interface

	public void avalia(Leilao leilao) {

		for (Lance lance : leilao.getLances()) {
			if (lance.getValor() > maiorDeTodos) {
				maiorDeTodos = lance.getValor();
			}
			if (lance.getValor() < menorDeTodos) {
				menorDeTodos = lance.getValor();
			}
		}

		maiores = new ArrayList<Lance>(leilao.getLances());// Inicialiar o
															// ArrayList com os
															// Lances Atuais

		Collections.sort(maiores, new Comparator<Lance>() {// Ordernar o Array,
															// passando uma
															// implementação de
															// Comparator,
															// Para ensinar ao
															// Colletions.sort a
															// ordenar da
															// maneira como
															// queremos
					public int compare(Lance o1, Lance o2) { // Queremos ordenar
																// de forma
																// decrescente

						if (o1.getValor() < o2.getValor()) {
							return 1;
						}
						if (o1.getValor() > o2.getValor()) {
							return -1;
						}

						return 0;

					}

				});
		// Gera um Erro nos testes devido a não vericação do tamanho da lista,
		// pode ocorrer uma exceção
		// Correção:
		maiores = maiores.subList(0, maiores.size() > 3 ? 3 : maiores.size());

		// maiores = maiores.subList(0, 3);
	}

	public List<Lance> getTresMaiores() {
		return maiores;
	}

	public double getMaiorLance() {
		return maiorDeTodos;
	}

	public double getMenorLance() {
		return menorDeTodos;
	}

}
