package ar.edu.unq.po2.tp11TM;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiltroPropiedadEnComunTest {
	
	private FiltroPropiedadEnComun filtro;
	private WikipediaPage page1;
	private WikipediaPage page2;
	private WikipediaPage page3;
	private WikipediaPage page4;

	@BeforeEach
	void setUp() {
		filtro = new FiltroPropiedadEnComun();
		page1  = mock(WikipediaPage.class);
		page2  = mock(WikipediaPage.class);
		page3  = mock(WikipediaPage.class);
		page4  = mock(WikipediaPage.class);
	}

	@Test
	void verificacionDeFiltroLinkEnComun() {
		//mockeando
		when(page2.tienePropiedadEnComun(page1)).thenReturn(true);
		when(page3.tienePropiedadEnComun(page1)).thenReturn(false);
		
		List<IWikipediaPage> paginasAFiltrar    = Arrays.asList(page2, page3);
		
		List<IWikipediaPage> paginasYaFiltradas = this.filtro.getSimilarPages(page1, paginasAFiltrar);
		
		assertTrue(paginasYaFiltradas.contains(page2));
		assertEquals(1, paginasYaFiltradas.size());
	}

}
