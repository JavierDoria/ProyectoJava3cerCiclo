package entidades;

public class ListaNegra {
	private int id;
	private String fechaInfraccion, descripcion;
	private int idInfraccion, idConductor;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFechaInfraccion() {
		return fechaInfraccion;
	}
	public void setFechaInfraccion(String fechaInfraccion) {
		this.fechaInfraccion = fechaInfraccion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getIdInfraccion() {
		return idInfraccion;
	}
	public void setIdInfraccion(int idInfraccion) {
		this.idInfraccion = idInfraccion;
	}
	public int getIdConductor() {
		return idConductor;
	}
	public void setIdConductor(int idConductor) {
		this.idConductor = idConductor;
	}
}
