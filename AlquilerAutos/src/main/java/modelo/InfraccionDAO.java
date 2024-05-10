package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entidades.Infraccion;
import interfaces.InfraccionInterface;
import util.MysqlConexion;

public class InfraccionDAO implements InfraccionInterface{

	@Override
	public List<Infraccion> listarInfraccion() {
		
		List<Infraccion> listarInfraccion = new ArrayList<Infraccion>();
		Connection cn = null;
		PreparedStatement psm = null;
		ResultSet rs = null;
		try {
			cn = MysqlConexion.getConexion();
			String sql = "call sp_listarInfraccion";
			psm = cn.prepareStatement(sql);
			rs= psm.executeQuery();
			while(rs.next()) {
				Infraccion infraccion = new Infraccion();
				infraccion.setId(rs.getInt("id_infraccion"));;
				infraccion.setNombre(rs.getString("nombre"));
				infraccion.setMontoPago(rs.getString("montoPago"));
				listarInfraccion.add(infraccion);
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
		return listarInfraccion;
	}

	@Override
	public int registrarInfraccion(Infraccion infraccion) {
		int value  =0;
		Connection cn = null;
		PreparedStatement psm = null;
		
		try {
			cn =MysqlConexion.getConexion();
			String sql = "call sp_registrarInfraccion ( ?, ?)";
			psm = cn.prepareStatement(sql);
			psm.setString(1,infraccion.getNombre());
			psm.setString(2, infraccion.getMontoPago());
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
	public Infraccion buscarInfraccionId(int id) {
		Infraccion infraccion = null;
		Connection cn = null;
		PreparedStatement psm = null;
		ResultSet rs= null;
		try {
			cn = MysqlConexion.getConexion();
			String sql ="call sp_buscarInfraccion(?) ";
			psm = cn.prepareStatement(sql);
			psm.setInt(1, id);
			rs = psm.executeQuery();
			if(rs.next()) {
				infraccion = new Infraccion();
				infraccion.setId(rs.getInt("id_infraccion"));
				infraccion.setNombre(rs.getString("monbre"));
				infraccion.setMontoPago(rs.getString("montoPago"));
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
		return infraccion;
	}

}
