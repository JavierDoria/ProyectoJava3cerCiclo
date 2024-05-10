package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import conexionBd.MysqlConexion;
import entidades.Clientes;
import interfaces.clienteInterface;

public class ClienteModelo implements clienteInterface {
	@Override
	public int registrarCliente(Clientes cliente) {
		int value =0;
		Connection cn = null;
		PreparedStatement psm = null;
		try {
			cn=MysqlConexion.getConexion();
			String sql ="Insert into atenciones values(null,?,?,?,?,?)";
			psm= cn.prepareStatement(sql);
			psm.setString(1, cliente.getNombreDuenio());
			psm.setString(2, cliente.getNombreMascota());
			psm.setString(3, cliente.getFechaCita());
			psm.setString(4, cliente.getDni());
			psm.setString(5, cliente.getNacionalidad());
			
			value = psm.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(psm != null)psm.close();
				if(cn != null)cn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return value;
	}
	@Override
	public List<Clientes> listarCliente(){
		List<Clientes> listaCliente = new ArrayList<Clientes>();
		Connection cn = null;
		PreparedStatement psm = null;
		ResultSet rs = null;
		try {
			cn=MysqlConexion.getConexion();
			String sql ="select * from atenciones";
			psm =cn.prepareStatement(sql);
			rs= psm.executeQuery();
			while(rs.next()) {
				Clientes cliente = new Clientes();
				cliente.setCodigo(rs.getInt("codigo"));
				cliente.setNombreDuenio(rs.getString("nombreDuenio"));
				cliente.setNombreMascota(rs.getString("nombreMascota"));
				cliente.setFechaCita(rs.getString("fechaCita"));
				cliente.setDni(rs.getString("dni"));
				cliente.setNacionalidad(rs.getString("nacionalidad"));
				listaCliente.add(cliente);
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
		return listaCliente;
	}
}
