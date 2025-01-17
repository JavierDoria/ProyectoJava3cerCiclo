package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import entidades.Conductor;
import interfaces.ConductorInterface;
import util.MysqlConexion;

public class ConductorDAO implements ConductorInterface {

	@Override
	public List<Conductor> listarConductores() {
		List<Conductor> listaConductor = new ArrayList<Conductor>();
		Connection cn = null;
		PreparedStatement psm = null;
		ResultSet rs = null;
		
		try {
			 cn = MysqlConexion.getConexion();
			 String sql ="call sp_listarConductores";
			 psm = cn.prepareStatement(sql);
			 rs = psm.executeQuery();
			 while(rs.next()) {
				 Conductor conductor = new Conductor();
				 conductor.setId(rs.getInt("idConductor"));
				 conductor.setNombre(rs.getString("nomConductor"));
				 conductor.setApellido(rs.getString("apeConductor"));
				 conductor.setDni(rs.getString("dni"));
				 conductor.setTelefono(rs.getString("telefono"));
				 conductor.setCorreo(rs.getString("correo"));
				 listaConductor.add(conductor);
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
		return listaConductor;
	}

	@Override
	public Conductor buscarConductorId(int id) {
		Conductor conductor = null;
		Connection cn = null;
		PreparedStatement psm = null;
		ResultSet rs= null;
		try {
			cn = MysqlConexion.getConexion();
			String sql ="call sp_buscarConductoresId(?) ";
			psm = cn.prepareStatement(sql);
			psm.setInt(1, id);
			rs = psm.executeQuery();
			if(rs.next()) {
				conductor = new Conductor();
				conductor.setId(rs.getInt("idConductor"));
				conductor.setNombre(rs.getString("nomConductor"));
				conductor.setApellido(rs.getString("apeConductor"));
				conductor.setDni(rs.getString("dni"));
				conductor.setTelefono(rs.getString("telefono"));
				conductor.setCorreo(rs.getString("correo"));
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
		return conductor;
	}

	@Override
	public Conductor buscarConductorDni(String dni) {
		Conductor conductor = null;
		Connection cn = null;
		PreparedStatement psm = null;
		ResultSet rs = null;
		try {
			cn = MysqlConexion.getConexion();
			String sql = "call sp_buscarConductoresDni(?)";
			psm = cn.prepareStatement(sql);
			psm.setString(1, dni);
			rs =psm.executeQuery();
			if(rs.next()) {
				conductor = new Conductor();
				conductor.setId(rs.getInt("idConductor"));
				conductor.setNombre(rs.getString("nomConducor"));
				conductor.setApellido(rs.getString("apeConductor"));
				conductor.setDni(rs.getString("dni"));
				conductor.setTelefono(rs.getString("telefono"));
				conductor.setCorreo(rs.getString("correo"));
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
		return conductor;
	}

	@Override
	public List<Conductor> buscarConductorApellido(String apellidos) {
		List<Conductor> listaConductor = new ArrayList<Conductor>();
		Conductor conductor = null;
		Connection cn  = null;
		PreparedStatement psm = null;
		ResultSet rs = null;
		try {
			cn =MysqlConexion.getConexion();
			String sql = "call sp_buscarConductoresApellido(?)";
			psm = cn.prepareStatement(sql);
			psm.setString(1, apellidos);
			rs = psm.executeQuery();
			while(rs.next()) {
				conductor = new Conductor();
				conductor.setId(rs.getInt("idConductor"));
				conductor.setNombre(rs.getString("nomConducor"));
				conductor.setApellido(rs.getString("apeConductor"));
				conductor.setDni(rs.getString("dni"));
				conductor.setTelefono(rs.getString("telefono"));
				conductor.setCorreo(rs.getString("correo"));
				listaConductor.add(conductor);
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
		return listaConductor;
	}

	@Override
	public int registrarConductor(Conductor conductor) {
		
		int value  =0;
		Connection cn = null;
		PreparedStatement psm = null;
		
		try {
			cn =MysqlConexion.getConexion();
			String sql = "call sp_registrarConductores ( ?, ?, ?, ?, ?)";
			psm = cn.prepareStatement(sql);
			psm.setString(1,conductor.getNombre());
			psm.setString(2, conductor.getApellido());
			psm.setString(3,conductor.getDni());
			psm.setString(4, conductor.getTelefono());
			psm.setString(5, conductor.getCorreo());
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
	public int actualizarConductor(Conductor conductor) {
		int value =0;
		Connection cn=null;
		PreparedStatement psm = null;
		
		try {
			cn=MysqlConexion.getConexion();
			String sql ="Update sp_actualizarConductores set nomConductor=?, apeConductor=?, dni=?, telefono=?, correo=? where idConductor=?";
			psm = cn.prepareStatement(sql);
			psm.setString(1, conductor.getNombre());
			psm.setString(2, conductor.getApellido());
			psm.setString(3, conductor.getDni());
			psm.setString(4, conductor.getTelefono());
			psm.setString(5, conductor.getCorreo());
			psm.setInt(6, conductor.getId());
			
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
