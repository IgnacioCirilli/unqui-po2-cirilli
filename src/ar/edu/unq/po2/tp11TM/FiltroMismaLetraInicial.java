package ar.edu.unq.po2.tp11TM;

import java.util.List;

public class FiltroMismaLetraInicial extends Filtro {

	@Override
	protected List<IWikipediaPage> aplicarFiltro(IWikipediaPage page, List<IWikipediaPage> pages) {
		String letraAComparar = page.getTitle().substring(0,1);
		return pages.stream()
				    .filter(p -> p.getTitle().startsWith(letraAComparar))
				    .toList();
	}

}
