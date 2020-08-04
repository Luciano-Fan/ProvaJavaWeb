package br.com.rdevs.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.rdevs.model.Modulo;

public class ModuloDao {
	Connection conn;
	
	private String SQL_LISTAR_TODAS = "SELECT * FROM tb_modulo";

	public ModuloDao(Connection conn) {
			this.conn = conn;
		}
	
	public List<Modulo> consultarModulos() {

		List<Modulo> listaModulo = new ArrayList<>();

		try (Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(SQL_LISTAR_TODAS);) {

			while (rs.next()) {
				Modulo modulo = new Modulo();
				modulo.setNome(rs.getString("DS_NOME"));
				modulo.setInstrutorTitular(rs.getString("DS_INSTRUTOR_TITULAR"));
				modulo.setInstrutorAuxiliar(rs.getString("DS_INSTRUTOR_AUXILIAR"));
				modulo.setDtInicio(rs.getDate("DT_INICIO"));

				listaModulo.add(modulo);
			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaModulo;
	}
}
