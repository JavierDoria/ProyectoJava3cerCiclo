package entidades;

public class Alquiler {
	private int id,idVehiculo,idConductor,idTrabajador;
	private String fechaAlquilada,fechaEntregada;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public int getIdConductor() {
		return idConductor;
	}
	public void setIdConductor(int idConductor) {
		this.idConductor = idConductor;
	}
	public int getIdTrabajador() {
		return idTrabajador;
	}
	public void setIdTrabajador(int idTrabajador) {
		this.idTrabajador = idTrabajador;
	}
	public String getFechaAlquilada() {
		return fechaAlquilada;
	}
	public void setFechaAlquilada(String fechaAlquilada) {
		this.fechaAlquilada = fechaAlquilada;
	}
	public String getFechaEntregada() {
		return fechaEntregada;
	}
	public void setFechaEntregada(String fechaEntregada) {
		this.fechaEntregada = fechaEntregada;
	}
	

}
