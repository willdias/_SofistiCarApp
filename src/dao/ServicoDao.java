package dao;

import conexoes.ConexoesMySql;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Ordem_Servico;

import model.Servico;
import view.OrdemServicoFrm;

public class ServicoDao {

	static Connection conexao = null;
	static PreparedStatement pst = null;
	static PreparedStatement pst2 = null;

	static ResultSet rs = null;

	public static Servico buscarServicoDao(Servico servico) throws SQLException {
		try {
			String sql = "SELECT ID_SERVICO as 'Código', DESCRICAO_SERVICO as 'Descrição'"
					+ " FROM SERVICO" + " WHERE ID_SERVICO = ?";

			conexao = ConexoesMySql.base();
			pst = conexao.prepareStatement(sql);
			pst.setInt(1, servico.getCodigo_servico());
			rs = pst.executeQuery();

			if (rs.next()) {
				servico.setCodigo_servico(rs.getInt(1));
				servico.setDescricao_servico(rs.getString(2));

			}

		} catch (SQLException err) {
			JOptionPane.showMessageDialog(null, "Erro ao Buscar servico. " + err);
		} finally {
			conexao.close();

		}
		return servico;
	}

	public static boolean incluirServicoDao(Servico servico) throws SQLException {
		conexao = ConexoesMySql.base();
		pst = null;
		rs = null;

		String sql = "INSERT INTO SERVICO (descricao_servico)"
				+ " VALUES (?)";
		if (conexao != null) {
			try {

				pst = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

				pst.setString(1, servico.getDescricao_servico());
				// pst.setDouble(2, servico.getValor_unitario());

				int status = servico.getId_status_servico();
				int sts = 0;
				if (status == 0) {
					sts = 1;
				} else if (status == 1) {
					sts = 2;
				}
				pst.setInt(3, sts);
				pst.executeUpdate();
				ResultSet keys = pst.getGeneratedKeys();
				keys.next();
				int key = keys.getInt(1);
				servico.setCodigo_servico(key);

				JOptionPane.showMessageDialog(null, "Servico Cadastrado com sucesso!");
				return true;

			} catch (SQLException sqlException) {
				System.out.println("Ocorreu uma exceção SQL" + sqlException);
				JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Servico!");
			} catch (HeadlessException exception) {
				System.out.println("Ocorreu uma exceção");
				JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Servico!");
			} finally {
				try {
					if (rs != null) {
						rs.close();
					}
					if (pst != null) {
						pst.close();
					}
				} catch (SQLException exception) {
					System.out.println("Ocorreu uma exceção SQL");
				}
			}
		}
		conexao.close();
		return false;

	}

	public static boolean alterarServicoDao(Servico servico) throws SQLException {
		conexao = ConexoesMySql.base();
		pst = null;
		rs = null;

		String sql = "UPDATE SERVICO SET descricao_servico = ? WHERE id_servico = ?";
		if (conexao != null) {
			try {

				pst = conexao.prepareStatement(sql);
				pst.setString(1, servico.getDescricao_servico());
				pst.setInt(2, servico.getCodigo_servico());
				// pst.setDouble(4, servico.getValor_unitario());
				// pst.setInt(7, servico.getId_status_servico());
				pst.executeUpdate();
				ResultSet keys = pst.getGeneratedKeys();
				keys.next();
				int key = keys.getInt(1);

				pst2.setInt(1, key);
				pst2.executeUpdate();

				JOptionPane.showMessageDialog(null, "Servico Cadastrado com sucesso!");
				return true;

			} catch (SQLException sqlException) {
				System.out.println("Ocorreu uma exceção SQL" + sqlException);
				JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Servico!");
			} catch (HeadlessException exception) {
				System.out.println("Ocorreu uma exceção");
				JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Servico!");
			} finally {
				try {
					if (rs != null) {
						rs.close();
					}
					if (pst != null) {
						pst.close();
					}
				} catch (SQLException exception) {
					System.out.println("Ocorreu uma exceção SQL");
				}
			}
		}
		conexao.close();
		return false;

	}

	public ResultSet buscarTodosServicosDao(String descricao) throws SQLException {
		try {
			String sql = "SELECT ID_SERVICO AS 'Código', DESCRICAO_SERVICO AS 'Descrição'"
					+ " FROM SERVICO" + " WHERE DESCRICAO_SERVICO LIKE ?";

			conexao = ConexoesMySql.base();
			pst = conexao.prepareStatement(sql);
			pst.setString(1, descricao + "%");
			rs = pst.executeQuery();

		} catch (SQLException err) {
			JOptionPane.showMessageDialog(null, "Erro ao Buscar servico. " + err);
		}
		conexao.close();
		return rs;
	}

	public ResultSet buscarItens(int os) throws SQLException {
		try {
			String sql = "SELECT ID_ITEM_SERVICO AS 'Código', S.DESCRICAO_SERVICO AS 'Descrição'"
					+ " FROM ITEM_SERVICO I"
					+ " LEFT JOIN SERVICO S on S.ID_SERVICO = I.ID_SERVICO"
					+ " WHERE I.ID_SERVICO = ?";
			JOptionPane.showMessageDialog(null, os);
			conexao = ConexoesMySql.base();
			pst = conexao.prepareStatement(sql);
			pst.setInt(1, os);
			rs = pst.executeQuery();

		} catch (SQLException err) {
			JOptionPane.showMessageDialog(null, "Erro ao Buscar servico. " + err);
		}
		conexao.close();
		return rs;
	}

	public ResultSet buscarValorTotalItens(Ordem_Servico os) throws SQLException {
		try {
			String sql = "SELECT SUM(VLR_TOTAL_ITEM_SERVICO)AS SOMA FROM ITEM_SERVICO" + " WHERE ID_SERVICO = ?";
			conexao = ConexoesMySql.base();
			pst = conexao.prepareStatement(sql);
			pst.setInt(1, os.getCodigo_os());
			rs = pst.executeQuery();
			if (rs.next()) {
				OrdemServicoFrm.iptValorTotalServicos.setText(rs.getString(1));
			} else {
			}
		} catch (SQLException err) {
			JOptionPane.showMessageDialog(null, "Erro ao Buscar Soma. " + err);
		}
		conexao.close();
		return rs;
	}
}
