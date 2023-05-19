package ar.edu.unq.po2.tp8.ej2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecretariaDeDeporteDelMunicipio {
	
	private List<ActividadSemanal> actividadesSemanales;
	
	public SecretariaDeDeporteDelMunicipio() {
		this.setActividadesSemanales(new ArrayList<ActividadSemanal>());
	}

	public List<ActividadSemanal> getActividadesSemanales() {
		return actividadesSemanales;
	}

	private void setActividadesSemanales(List<ActividadSemanal> actividadesSemanales) {
		this.actividadesSemanales = actividadesSemanales;
	}

	public void agregarActividadSemanal(ActividadSemanal actividadSemanal) {
		this.getActividadesSemanales().add(actividadSemanal);
	}

	public List<ActividadSemanal> actividadesSemanalesDe(Deporte deporte) {
		return this.getActividadesSemanales()
				   .stream()
				   .filter(as -> as.getDeporte().equals(deporte))
				   .toList();
	}

	public List<ActividadSemanal> actividadesSemanalesDeComplejidad(int nivelDeComplejidad) {
		return this.getActividadesSemanales()
				   .stream()
				   .filter(as -> as.getDeporte().getNivelDeComplejidad() == nivelDeComplejidad)
				   .toList();
	}

	public int cantidadDeHorasTotalesDeActividades() {
		return this.getActividadesSemanales()
				   .stream()
				   .mapToInt(as -> as.getDuracion())
				   .sum();
	}

	public ActividadSemanal actividadDeMenorCostoDe(Deporte deporte) {
		return this.actividadesSemanalesDe(deporte)
				   .stream()
				   .min(Comparator.comparingInt(as -> as.obtenerCosto()))
				   .get();
		
	}

	public Map<Deporte, Optional<ActividadSemanal>> agruparPorActividadPorMenorCosto() {
		return this.getActividadesSemanales()
				   .stream()
				   .collect(Collectors.groupingBy(
						   		ActividadSemanal::getDeporte, 
						   (Collectors.minBy(Comparator.comparing(
								ActividadSemanal::obtenerCosto)))));
	}

	@Override
	public String toString() {
		return "SecretariaDeDeporteDelMunicipio [actividadesSemanales=" + actividadesSemanales.toString() + "]";
	}
}
