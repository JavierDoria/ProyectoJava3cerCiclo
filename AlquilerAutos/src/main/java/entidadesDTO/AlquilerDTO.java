package entidadesDTO;

public class AlquilerDTO {
	private int idAlquiler;
	private String fechaAlquilada,fechaEntrega,placaVehiculo,nombreConductor,nombreTrabajador;
	
	public int getIdAlquiler() {
		return idAlquiler;
	}
	public void setIdAlquiler(int idAlquiler) {
		this.idAlquiler = idAlquiler;
	}
	public String getFechaAlquilada() {
		return fechaAlquilada;
	}
	public void setFechaAlquilada(String fechaAlquilada) {
		this.fechaAlquilada = fechaAlquilada;
	}
	public String getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public String getPlacaVehiculo() {
		return placaVehiculo;
	}
	public void setPlacaVehiculo(String placaVehiculo) {
		this.placaVehiculo = placaVehiculo;
	}
	public String getNombreConductor() {
		return nombreConductor;
	}
	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}
	public String getNombreTrabajador() {
		return nombreTrabajador;
	}
	public void setNombreTrabajador(String nombreTrabajador) {
		this.nombreTrabajador = nombreTrabajador;
	}
}
