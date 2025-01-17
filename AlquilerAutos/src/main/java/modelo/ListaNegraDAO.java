package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entidades.ListaNegra;
import entidadesDTO.ListaNegraDTO;
import interfaces.ListaNegraInterface;
import util.MysqlConexion;

public class ListaNegraDAO implements ListaNegraInterface{

	@Override
	public List<ListaNegraDTO> listarListaNegra() {
		List<ListaNegraDTO> listarListaNegra = new ArrayList<ListaNegraDTO>();
		Connection cn = null;
		PreparedStatement psm = null;
		ResultSet rs = null;
		
		try {
			 cn = MysqlConexion.getConexion();
			 String sql ="call sp_listarListaNegra";
			 psm = cn.prepareStatement(sql);
			 rs = psm.executeQuery();
			 while(rs.next()) {
				 ListaNegraDTO listaNegra = new ListaNegraDTO();
				 listaNegra.setId_listaNegra(rs.getInt("id_listaNegra"));
				 listaNegra.setFechaInfraccion(rs.getString("fechaInfraccion"));
				 listaNegra.setDescripcion(rs.getString("descripcion"));
				 listaNegra.setNombreInfraccion(rs.getString("nombreInfraccion"));
				 listaNegra.setNombreConductor(rs.getString("nombreConductor"));
				 listarListaNegra.add(listaNegra);
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
		return listarListaNegra;
	}

	@Override
	public int registrarListaNegra(ListaNegra listaNegra) {
		int value  =0;
		Connection cn = null;
		PreparedStatement psm = null;
		
		try {
			cn =MysqlConexion.getConexion();
			String sql = "call sp_registrarListaNegra ( ?, ?, ?, ?)";
			psm = cn.prepareStatement(sql);
			psm.setString(1,listaNegra.getFechaInfraccion());
			psm.setString(2, listaNegra.getDescripcion());
			psm.setInt(3,listaNegra.getIdInfraccion());
			psm.setInt(4, listaNegra.getIdConductor());
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
	public ListaNegraDTO buscarListaNegraId(int id) {
		ListaNegraDTO listaNegra = null;
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
				listaNegra = new ListaNegraDTO();
				listaNegra.setId_listaNegra(rs.getInt("id_listaNegra"));
				listaNegra.setFechaInfraccion(rs.getString("FechaInfraccion"));
				listaNegra.setDescripcion(rs.getString("descripcion"));
				listaNegra.setNombreInfraccion(rs.getString("nombreInfraccion"));
				listaNegra.setNombreConductor(rs.getString("nombreConductor"));
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
		return listaNegra;
	}
}
