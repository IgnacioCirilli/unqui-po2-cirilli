package ar.edu.unq.po2.tp11TemplateMethod.ej3;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp11TemplateMethod.ej3.FiltroLinkEnComun;
import ar.edu.unq.po2.tp11TemplateMethod.ej3.IWikipediaPage;
import ar.edu.unq.po2.tp11TemplateMethod.ej3.WikipediaPage;

class FiltroLinkEnComunTest {
	
	private FiltroLinkEnComun filtro;
	private WikipediaPage page1;
	private WikipediaPage page2;
	private WikipediaPage page3;
	private WikipediaPage page4;

	@BeforeEach
	void setUp() {
		filtro = new FiltroLinkEnComun();
		page1  = mock(WikipediaPage.class);
		page2  = mock(WikipediaPage.class);
		page3  = mock(WikipediaPage.class);
		page4  = mock(WikipediaPage.class);
	}

	@Test
	void verificacionDeFiltroLinkEnComun() {
		//mockeando
		when(page2.tieneLinksEnComun(page1)).thenReturn(true);
		when(page3.tieneLinksEnComun(page1)).thenReturn(false);
		
		List<IWikipediaPage> paginasAFiltrar    = Arrays.asList(page2, page3);
		
		List<IWikipediaPage> paginasYaFiltradas = this.filtro.getSimilarPages(page1, paginasAFiltrar);
		
		assertTrue(paginasYaFiltradas.contains(page2));
		assertEquals(1, paginasYaFiltradas.size());
	}

}
