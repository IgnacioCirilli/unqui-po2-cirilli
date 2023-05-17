package ar.edu.unq.po2.tp11TM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WikipediaPage implements IWikipediaPage {
	
	private String title;
	private List<IWikipediaPage> links;
	private Map<String, IWikipediaPage> infobox;
	
	public WikipediaPage(String title) {
		super();
		this.setTitle(title);
		this.setLinks(new ArrayList<IWikipediaPage>());
		this.setInfobox(new HashMap<>());
	}

	@Override
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public List<IWikipediaPage> getLinks() {
		return links;
	}

	public void setLinks(List<IWikipediaPage> links) {
		this.links = links;
	}

	@Override
	public Map<String, IWikipediaPage> getInfoBox() {
		return this.infobox;
	}
	
	private void setInfobox(Map<String, IWikipediaPage> newInfobox) {
		this.infobox = newInfobox;
	}
	
	public void agregarInfoAInfobox(String propiedad) {
		this.getInfoBox().put(propiedad, this);
	}

	public void linkearCon(IWikipediaPage page) {
		this.getLinks().add(page);
	}
	
	@Override
	public boolean tieneLinksEnComun(IWikipediaPage page) {
		List<IWikipediaPage> linksAComparar = page.getLinks();
		
		return this.getLinks()
				   .stream()
				   .anyMatch(l -> l.concuerdaConAlgunLinkDe(linksAComparar));
		
	}
	
	@Override
	public boolean concuerdaConAlgunLinkDe(List<IWikipediaPage> links) {
		return links.stream()
				    .anyMatch(l -> l.equals(this));
	}

	@Override
	public boolean tienePropiedadEnComun(IWikipediaPage page) {
		
		List<String> clavesPropias   = (List<String>) this.getInfoBox().keySet();
		List<String> clavesAComparar = (List<String>) page.getInfoBox().keySet();
		
		return clavesPropias.stream()
				            .anyMatch(s -> clavesAComparar.contains(s));
	}
	
}
