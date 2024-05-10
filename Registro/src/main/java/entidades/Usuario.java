package entidades;

public class Usuario {
	public int idUsuario, telefono;
	public String nombre, correo, pais;
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int IdUsuario) {
		this.idUsuario = IdUsuario;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo=correo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais=pais;
	}
	

}
