package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import factory.Conexao;
import model.Produto;

public class ProdutoDAO {
	private Connection conexao;
	
	public ProdutoDAO() {
		this.conexao = new Conexao().getConexao();
	}
	
	public String salvar(Produto produto) {
		String sql = " INSERT INTO produto(descricao, valor) "+
	                 " VALUES (?, ?) ";
		try {
			PreparedStatement ps = this.conexao.prepareStatement(sql);
			ps.setString(1, produto.getDescricao());
			ps.setDouble(2, produto.getValor());
			ps.execute();
			ps.close();
			return "Produto salvo!";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Erro:"+ e.getMessage();
		}
	}
	
	public List<Produto> listarTodos() {
		List<Produto> listaProdutos = new ArrayList<>();
		String sql = " SELECT * FROM produto ";
		try {
			PreparedStatement ps = this.conexao.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Produto produto = new Produto();
				produto.setCodigo(rs.getInt("codigo"));
				produto.setDescricao(rs.getString("descricao"));
				produto.setValor(rs.getDouble("valor"));
				listaProdutos.add(produto);
			}
			ps.close();
			return listaProdutos;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Produto getProdutoPorCodigo(int codigo) {
		String sql = " SELECT * FROM produto WHERE codigo = ? ";
		try {
			PreparedStatement ps = this.conexao.prepareStatement(sql);
			ps.setInt(1, codigo);
			ResultSet rs = ps.executeQuery();
			rs.next();
			Produto produto = new Produto();
			produto.setCodigo(rs.getInt("codigo"));
			produto.setDescricao(rs.getString("descricao"));
			produto.setValor(rs.getDouble("valor"));
			ps.close();
			return produto;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String alterar(Produto produto) {
		String sql = " UPDATE produto SET descricao = ?, valor = ? "+
					 " WHERE codigo = ? ";
		try {
			PreparedStatement ps = this.conexao.prepareStatement(sql);
			ps.setString(1, produto.getDescricao());
			ps.setDouble(2, produto.getValor());
			ps.setInt(3, produto.getCodigo());
			ps.execute();
			ps.close();
			return "Produto alterado!";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Erro: "+ e.getMessage();
		}
	}
}
