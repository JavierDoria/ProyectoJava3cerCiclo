package entidades;

public class Infraccion {
	private int id;
	private String nombre,montoPago;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMontoPago() {
		return montoPago;
	}
	public void setMontoPago(String montoPago) {
		this.montoPago = montoPago;
	}

}