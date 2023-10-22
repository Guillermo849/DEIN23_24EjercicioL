package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import conexion.ConexionBDD;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Aeropuertos;

public class AeropuertoDao {

	private ConexionBDD conexion;

	/* Devuelve una lista de las personas almacenadas en la base de datos */
	public ObservableList<Aeropuertos> cargarAeropuertosPrivados() {

		ObservableList<Aeropuertos> aeropuertosPrivados = FXCollections.observableArrayList();
		try {
			conexion = new ConexionBDD();
			
			/* Recogemos la información de los IDs y número de socios de los aeropuertos privados */
			String consulta = "select * from aeropuertos_privados";
			PreparedStatement pstmt = conexion.getConexion().prepareStatement(consulta);
			ResultSet rs = pstmt.executeQuery();
			
			HashMap<Integer, Integer> mapPrivados = new HashMap<Integer, Integer>();
			
			while (rs.next()) {
				int idAeropuertos = rs.getInt("id_aeropuerto");
				int numSocios = rs.getInt("numero_socios");
				mapPrivados.put(idAeropuertos, numSocios);
			}
			rs.close();
			
			
			/* Recogemos los aeropuertos que su id este dentro del HashMap mapPrivados */
			
			consulta = "SELECT * FROM aeropuertos";
			pstmt = conexion.getConexion().prepareStatement(consulta);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				if (mapPrivados.containsKey(rs.getInt("id"))) {
					
					String consultaDireccion = "SELECT * FROM direcciones WHERE id LIKE " + rs.getInt("id_direccion");
					
					PreparedStatement pstmtDireccion = conexion.getConexion().prepareStatement(consultaDireccion);
					ResultSet rsDireccion = pstmtDireccion.executeQuery();
					
					int id = rs.getInt("id");
					String nombre = rs.getString("nombre");
					String pais = rsDireccion.getString("pais");
					String ciudad = rsDireccion.getString("ciudad");
					String calle = rsDireccion.getString("calle");
					int numero = rsDireccion.getInt("numero");
					int anio = rs.getInt("anio_inaguracion");
					int capacidad = rs.getInt("capacidad");
					int numSocios = mapPrivados.get(rs.getInt("id"));
					
					Aeropuertos a = new Aeropuertos(id, nombre, pais, ciudad, calle, numero, anio, capacidad, numSocios);
					
					aeropuertosPrivados.add(a);
					rsDireccion.close();
					
				}
			}
			
			rs.close();
			
			conexion.CloseConexion();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aeropuertosPrivados;
	}

}
