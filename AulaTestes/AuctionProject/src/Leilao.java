import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leilao {

	private String descricao;
	private List<Lance> lances;

	public Leilao(String descricao) {
		this.descricao = descricao;
		this.lances = new ArrayList<Lance>();
	}

	public void propoe(Lance lance) {
		if (!lances.isEmpty()
				&& getUltimoLance().getUsuario().equals(lance.getUsuario()))
			return;

		int c = 1;
		for (Lance l : lances)
			if (l.getUsuario().equals(lance.getUsuario()))
				c++;

		if (c > 5)
			return;

		lances.add(lance);
	}

	private Lance getUltimoLance() {
		return lances.get(lances.size() - 1);
	}

	public String getDescricao() {
		return descricao;
	}

	public List<Lance> getLances() {
		return Collections.unmodifiableList(lances);
	}

}
