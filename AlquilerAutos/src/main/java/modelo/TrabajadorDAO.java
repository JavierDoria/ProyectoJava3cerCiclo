package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entidades.Trabajador;
import interfaces.TrabajadorInterface;
import util.MysqlConexion;

public class TrabajadorDAO implements TrabajadorInterface{

	@Override
	public List<Trabajador> listarTrabajadores() {
		List<Trabajador> listarTrabajador = new ArrayList<Trabajador>();
		Connection cn = null;
		PreparedStatement psm = null;
		ResultSet rs = null;
		try {
			cn = MysqlConexion.getConexion();
			String sql = "call sp_listarTrabajadores";
			psm = cn.prepareStatement(sql);
			rs= psm.executeQuery();
			while(rs.next()) {
				Trabajador trabajador = new Trabajador();
				trabajador.setId(rs.getInt("idTrabajador"));;
				trabajador.setNombre(rs.getString("nomTrabajador"));
				trabajador.setApellido(rs.getString("apeTrabajador"));
				trabajador.setDni(rs.getString("dni"));
				trabajador.setTelefono(rs.getString("telefono"));
				listarTrabajador.add(trabajador);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(psm != null) psm.close();
				if(cn != null) cn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return listarTrabajador;
	}

	@Override
	public Trabajador buscarTrabajadorId(int id) {
		Trabajador trabajador = null;
		Connection cn = null;
		PreparedStatement psm = null;
		ResultSet rs= null;
		try {
			cn = MysqlConexion.getConexion();
			String sql ="call sp_buscarTrabajadoresId(?) ";
			psm = cn.prepareStatement(sql);
			psm.setInt(1, id);
			rs = psm.executeQuery();
			if(rs.next()) {
				trabajador = new Trabajador();
				trabajador.setId(rs.getInt("id_trabajador"));
				trabajador.setNombre(rs.getString("nomTrabajador"));
				trabajador.setApellido(rs.getString("apeTrabajador"));
				trabajador.setDni(rs.getString("dni"));
				trabajador.setTelefono(rs.getString("telefono"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(psm != null)psm.close();
				if(cn != null) cn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return trabajador;
	}

	@Override
	public Trabajador buscarTrabajadorDni(String dni) {
		Trabajador trabajador = null;
		Connection cn = null;
		PreparedStatement psm = null;
		ResultSet rs= null;
		try {
			cn = MysqlConexion.getConexion();
			String sql ="call sp_buscarTrabajadoresDni(?) ";
			psm = cn.prepareStatement(sql);
			psm.setString(1, dni);
			rs = psm.executeQuery();
			if(rs.next()) {
				trabajador = new Trabajador();
				trabajador.setId(rs.getInt("id_trabajador"));
				trabajador.setNombre(rs.getString("nomTrabajador"));
				trabajador.setApellido(rs.getString("apeTrabajador"));
				trabajador.setDni(rs.getString("dni"));
				trabajador.setTelefono(rs.getString("telefono"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(psm != null)psm.close();
				if(cn != null) cn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return trabajador;
	}

	@Override
	public List<Trabajador> buscarTrabajador(String apellido) {
		List<Trabajador> listarTrabajador = new ArrayList<Trabajador>();
		Trabajador trabajador = null;
		Connection cn = null;
		PreparedStatement psm = null;
		ResultSet rs= null;
		try {
			cn = MysqlConexion.getConexion();
			String sql ="call sp_buscarTrabajadoresApellido(?) ";
			psm = cn.prepareStatement(sql);
			psm.setString(1, apellido);
			rs = psm.executeQuery();
			while(rs.next()) {
				trabajador = new Trabajador();
				trabajador.setId(rs.getInt("id_trabajador"));
				trabajador.setNombre(rs.getString("nomTrabajador"));
				trabajador.setApellido(rs.getString("apeTrabajador"));
				trabajador.setDni(rs.getString("dni"));
				trabajador.setTelefono(rs.getString("telefono"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(psm != null)psm.close();
				if(cn != null) cn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return listarTrabajador;
		
	}

	@Override
	public int registrarTrabajador(Trabajador trabajador) {
		
		int value  =0;
		Connection cn = null;
		PreparedStatement psm = null;
		
		try {
			cn =MysqlConexion.getConexion();
			String sql = "call sp_registrarTrabajadores ( ?, ?, ?, ?)";
			psm = cn.prepareStatement(sql);
			psm.setString(1,trabajador.getNombre());
			psm.setString(2, trabajador.getApellido());
			psm.setString(3,trabajador.getDni());
			psm.setString(4, trabajador.getTelefono());
			value = psm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(psm != null) psm.close();
				if(cn != null)cn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return value;
	}

	@Override
	public int actualizarTrabajador(Trabajador trabajador) {
		int value =0;
		Connection cn=null;
		PreparedStatement psm = null;
		
		try {
			cn=MysqlConexion.getConexion();
			String sql ="Update sp_actualizarTrabajadores set nomConductor=?, apeConductor=?, dni=?, telefono=? where id_trabajador=?";
			psm = cn.prepareStatement(sql);
			psm.setString(1, trabajador.getNombre());
			psm.setString(2, trabajador.getApellido());
			psm.setString(3, trabajador.getDni());
			psm.setString(4, trabajador.getTelefono());
			psm.setInt(5, trabajador.getId());
			
			value =psm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(psm != null) psm.close();
				if(cn !=  null) cn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return value;
	}

}
