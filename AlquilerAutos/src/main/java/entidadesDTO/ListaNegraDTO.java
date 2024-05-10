package entidadesDTO;

public class ListaNegraDTO {

	private int id_listaNegra;
	private String fechaInfraccion,descripcion,nombreInfraccion,nombreConductor;
	public int getId_listaNegra() {
		return id_listaNegra;
	}
	public void setId_listaNegra(int id_listaNegra) {
		this.id_listaNegra = id_listaNegra;
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
	public String getNombreInfraccion() {
		return nombreInfraccion;
	}
	public void setNombreInfraccion(String nombreInfraccion) {
		this.nombreInfraccion = nombreInfraccion;
	}
	public String getNombreConductor() {
		return nombreConductor;
	}
	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}
}
