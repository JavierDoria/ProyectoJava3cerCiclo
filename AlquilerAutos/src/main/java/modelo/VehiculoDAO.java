package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entidades.Vehiculo;
import interfaces.VehiculoInterface;
import util.MysqlConexion;

public class VehiculoDAO  implements  VehiculoInterface{

	@Override
	public List<Vehiculo> listarVehiculos() {
		List<Vehiculo> listarVehiculos = new ArrayList<Vehiculo>();
		Connection cn = null;
		PreparedStatement psm = null;
		ResultSet rs = null;
		try {
			cn = MysqlConexion.getConexion();
			String sql = "call sp_listaVehiculo";
			psm = cn.prepareStatement(sql);
			rs= psm.executeQuery();
			while(rs.next()) {
				Vehiculo vehiculo = new Vehiculo();
				vehiculo.setId(rs.getInt("idVehiculo"));;
				vehiculo.setPlaca(rs.getString("placa"));
				vehiculo.setTipo(rs.getString("tipo"));
				vehiculo.setPrecio(rs.getDouble("precioDia"));
				listarVehiculos.add(vehiculo);
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
		return listarVehiculos;
	}

	@Override
	public Vehiculo buscarVehiculoPlaca(String placa) {
		Vehiculo vehiculo = null;
		Connection cn = null;
		PreparedStatement psm = null;
		ResultSet rs= null;
		try {
			cn = MysqlConexion.getConexion();
			String sql ="call sp_buscarVehiculoPlaca(?) ";
			psm = cn.prepareStatement(sql);
			psm.setString(1, placa);
			rs = psm.executeQuery();
			if(rs.next()) {
				vehiculo = new Vehiculo();
				vehiculo.setId(rs.getInt("id_trabajador"));
				vehiculo.setPlaca(rs.getString("placa"));
				vehiculo.setTipo(rs.getString("tipo"));
				vehiculo.setPrecio(rs.getDouble("precioDia"));
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
		return vehiculo;
	}

	@Override
	public int eliminarVehiculoPlaca(String placa) {
		
		int value =0;
		Connection cn = null;
		PreparedStatement psm = null;
		
		try {
			cn=MysqlConexion.getConexion();
			String sql = "delete from sp_eliminarVehiculoPlaca where placa=?";
			psm = cn.prepareStatement(sql);
			psm.setString(1, placa);
			
			value =psm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(psm != null) psm.close();
				if(cn != null) cn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return value;
	}

	@Override
	public int eliminarVehiculoId(int id) {
		
		int value =0;
		Connection cn = null;
		PreparedStatement psm = null;
		
		try {
			cn=MysqlConexion.getConexion();
			String sql = "delete from sp_eliminarVehiculoId where idVehiculo=?";
			psm = cn.prepareStatement(sql);
			psm.setInt(1, id);
			
			value =psm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(psm != null) psm.close();
				if(cn != null) cn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return value;
	}

	@Override
	public int registrarVehiculos(Vehiculo vehiculo) {
		int value  =0;
		Connection cn = null;
		PreparedStatement psm = null;
		
		try {
			cn =MysqlConexion.getConexion();
			String sql = "call sp_registrarVehiculos ( ?, ?, ?)";
			psm = cn.prepareStatement(sql);
			psm.setString(1,vehiculo.getPlaca());
			psm.setString(2, vehiculo.getTipo());
			psm.setDouble(3,vehiculo.getPrecio());
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

}
