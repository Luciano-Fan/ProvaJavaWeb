package br.com.rdevs.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.rdevs.dao.ConexaoMySqlDao;
import br.com.rdevs.dao.ModuloDao;
import br.com.rdevs.model.Modulo;

public class ModuloService{
	ModuloDao dao = null;
	Connection conn = null;
	
	public ModuloService() {
		ConexaoMySqlDao conexaoMySql = new ConexaoMySqlDao();
		
		try {
			conn = conexaoMySql.obterConexao();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		dao = new ModuloDao(conn);
	}
	
	public List<Modulo> listarModulos(){
		List<Modulo> listaModulos = dao.consultarModulos();
		
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaModulos;
	}
	
}
