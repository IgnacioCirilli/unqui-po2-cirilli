package ar.edu.unq.po2.tp11TemplateMethod.ej3;

import java.util.List;
import java.util.Map;

public interface IWikipediaPage {
	
	public String getTitle();
	public List<IWikipediaPage> getLinks();
	public Map<String, IWikipediaPage> getInfoBox();
	public boolean tieneLinksEnComun(IWikipediaPage page); 
	public boolean concuerdaConAlgunLinkDe(List<IWikipediaPage> linksAComparar);
	public boolean tienePropiedadEnComun(IWikipediaPage page);

}
