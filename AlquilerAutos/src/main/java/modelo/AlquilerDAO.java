package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entidades.Alquiler;
import entidadesDTO.AlquilerDTO;
import interfaces.AlquilerInterface;
import util.MysqlConexion;

public class AlquilerDAO implements AlquilerInterface{

	@Override
	public List<AlquilerDTO> listarAlquiler() {
		List<AlquilerDTO> listaAlquiler = new ArrayList<AlquilerDTO>();
		Connection cn = null;
		PreparedStatement psm = null;
		ResultSet rs = null;
		
		try {
			 cn = MysqlConexion.getConexion();
			 String sql ="call sp_listarAlquiler";
			 psm = cn.prepareStatement(sql);
			 rs = psm.executeQuery();
			 while(rs.next()) {
				 AlquilerDTO alquiler = new AlquilerDTO();
				 alquiler.setIdAlquiler(rs.getInt("idAlquiler"));
				 alquiler.setFechaAlquilada(rs.getString("fechaAlquilada"));
				 alquiler.setFechaEntrega(rs.getString("fechaEntrega"));
				 alquiler.setPlacaVehiculo(rs.getString("placaVehiculo"));
				 alquiler.setNombreConductor(rs.getString("nombreConductor"));
				 alquiler.setNombreTrabajador(rs.getString("nombreTrabajador"));
				 listaAlquiler.add(alquiler);
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
		return listaAlquiler;
	}

	@Override
	public int registrarAlquiler(Alquiler alquiler) {
		int value  =0;
		Connection cn = null;
		PreparedStatement psm = null;
		
		try {
			cn =MysqlConexion.getConexion();
			String sql = "call sp_registrarAlquiler ( ?, ?, ?, ?, ?)";
			psm = cn.prepareStatement(sql);
			psm.setString(1,alquiler.getFechaAlquilada());
			psm.setString(2, alquiler.getFechaEntregada());
			psm.setInt(3,alquiler.getIdVehiculo());
			psm.setInt(4, alquiler.getIdConductor());
			psm.setInt(5, alquiler.getIdTrabajador());
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
	public AlquilerDTO buscarAlquilerId(int id) {
		AlquilerDTO alquiler = null;
		Connection cn = null;
		PreparedStatement psm = null;
		ResultSet rs= null;
		try {
			cn = MysqlConexion.getConexion();
			String sql ="call sp_buscarAlquiler(?) ";
			psm = cn.prepareStatement(sql);
			psm.setInt(1, id);
			rs = psm.executeQuery();
			if(rs.next()) {
				alquiler = new AlquilerDTO();
				alquiler.setIdAlquiler(rs.getInt("idAlquiler"));
				alquiler.setFechaAlquilada(rs.getString("FechaAlquilada"));
				alquiler.setFechaEntrega(rs.getString("FechaEntrega"));
				alquiler.setPlacaVehiculo(rs.getString("placaVehiculo"));
				alquiler.setNombreConductor(rs.getString("nombreConductor"));
				alquiler.setNombreTrabajador(rs.getString("nombreTrabajador"));
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
		return alquiler;
	}

}
