package ar.edu.unq.po2.tp11TM;

import java.util.List;

public abstract class Filtro {
	
	public List<IWikipediaPage> getSimilarPages(IWikipediaPage page, List<IWikipediaPage> pages) {
		return this.aplicarFiltro(page, pages);
		
	}

	protected abstract List<IWikipediaPage> aplicarFiltro(IWikipediaPage page, List<IWikipediaPage> pages);
	
} 
