package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Conexion.MysqlConexion;
import entidades.Usuario;

public class UsuarioModelo {
	@Override
	public int registrarUsuario(Usuario usuario) {
		int value =0;
		Connection cn=null;
		PreparedStatement psm = null;
		try {
			cn=MysqlConexion.getConexion();
			String sql ="Insert into registro values(null,?,?,?,?)";
			psm=cn.prepareStatement(sql);
			psm.setString(1, usuario.getNombre());
			psm.setString(2, usuario.getCorreo());
			psm.setString(3, usuario.getPais());
			psm.setInt(4, usuario.getTelefono());
			value =psm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(psm != null)psm.close();
				if(cn !=null)cn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return value;
	}
	@Override
	public List<Usuario>listarUsuario(){
		List<Usuario>listUsuario= new ArrayList<Usuario>();
		Connection cn = null;
		PreparedStatement psm = null;
		ResultSet rs = null;
		try {
			cn=MysqlConexion.getConexion();
			String sql ="select * from registro";
			psm = cn.prepareStatement(sql);
			rs=psm.executeQuery();
			while(rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setCorreo(rs.getString("codigo"));
				usuario.setIdUsuario(rs.getInt("IdUsuario"));
				usuario.setNombre(rs.getString("nombre"));
				usuario.setPais(rs.getString("pais"));
				usuario.setTelefono(rs.getInt("telefono"));
				listaUsuario.add(usuario);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(psm != null)psm.close();
				if(cn != null)cn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return listaUsuario;
	}

}
