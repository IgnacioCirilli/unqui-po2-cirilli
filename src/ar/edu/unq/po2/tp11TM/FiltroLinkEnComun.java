package ar.edu.unq.po2.tp11TM;

import java.util.List;

public class FiltroLinkEnComun extends Filtro {

	@Override
	protected List<IWikipediaPage> aplicarFiltro(IWikipediaPage page, List<IWikipediaPage> pages) {
		
		return pages.stream()
				    .filter(p -> p.tieneLinksEnComun(page))
				    .toList();
	}

}
