package dao;

import conexoes.ConexoesMySql;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import model.Veiculo;

public class VeiculoDao {

    static Connection conexao = null;
    static PreparedStatement pst = null;
    static PreparedStatement pst1 = null;
    static ResultSet rs1 = null;
    static ResultSet rs = null;
    static int sts;
    String codigo;
    String descricao;
    String placa;

   public ResultSet buscarVeiculoDao(Veiculo veiculo) throws SQLException {
	   conexao = ConexoesMySql.base();
        String sql = "SELECT * FROM VEICULO WHERE placa_veiculo = ?"
                + "OR ID_VEICULO = ?";
        
        String sqlMaxCod = "SELECT MAX(ID_VEICULO) FROM VEICULO";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, veiculo.getPlaca_veiculo());
            pst.setInt(2, veiculo.getCodigo_veiculo());
            rs = pst.executeQuery();

            pst1 = conexao.prepareStatement(sqlMaxCod);
            rs1 = pst1.executeQuery();

            if (rs.next()) {
                veiculo.setCodigo_veiculo(rs.getInt("id_veiculo"));
                veiculo.setDescricao_veiculo(rs.getString("descricao_veiculo"));
                veiculo.setPlaca_veiculo(rs.getString("placa_veiculo"));
                veiculo.setAno_veiculo(rs.getString("ano_veiculo"));
                veiculo.setModelo_veiculo(rs.getString("modelo_veiculo"));
                veiculo.setCor_veiculo(rs.getString("cor_veiculo"));
                veiculo.setChassi_veiculo(rs.getString("chassi_veiculo"));
                veiculo.setVeiculo_id_cliente(rs.getInt("veiculo_id_cliente"));
                veiculo.setId_status_veiculo(rs.getInt("id_status_veiculo"));
            }else {
                veiculo.getPlaca_veiculo();
                addVeiculoDao(veiculo);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Veículo: " + e);

        }
        conexao.close();
        return rs;
    }

    public ResultSet buscarTodosVeiculos() throws SQLException {
    	conexao = ConexoesMySql.base();
        String sql = "SELECT * FROM VEICULO";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Veículos: " + e);
        }
        conexao.close();
        return rs;
    }

    public static boolean addVeiculoDao(Veiculo veiculo) throws SQLException {
        conexao = ConexoesMySql.base();
        pst = null;
        pst1 = null;
        rs = null;
        rs1 = null;

        String sql = "INSERT INTO VEICULO (descricao_veiculo, placa_veiculo,"
                + " ano_veiculo, modelo_veiculo, cor_veiculo, chassi_veiculo)"
                + " VALUES (?,?,?,?,?,?)";

        if (conexao != null) {
            try {

                pst1 = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                pst1.setString(1, veiculo.getDescricao_veiculo());
                pst1.setString(2, veiculo.getPlaca_veiculo());
                pst1.setString(3, veiculo.getAno_veiculo());
                pst1.setString(4, veiculo.getModelo_veiculo());
                pst1.setString(5, veiculo.getCor_veiculo());
                pst1.setString(6, veiculo.getChassi_veiculo());
                pst1.executeUpdate();
                ResultSet keys = pst1.getGeneratedKeys();
                keys.next();
                int key = keys.getInt(1);

                veiculo.setCodigo_veiculo(key);
                return true;

            } catch (SQLException sqlException) {
                System.out.println("Ocorreu uma exceção SQL" + sqlException);
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Veículo!" + sqlException);
            } catch (HeadlessException exception) {
                System.out.println("Ocorreu uma exceção");
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Veículo!" + exception);
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

    public static boolean alterarVeiculoDao(Veiculo veiculo) throws SQLException {
        conexao = ConexoesMySql.base();
        pst = null;
        rs = null;

        String sqlPlaca = "SELECT * FROM VEICULO where placa_veiculo = ? AND descricao_veiculo IS NOT NULL";

        String sql = "UPDATE VEICULO SET descricao_veiculo = ?,"
                + " ano_veiculo = ?, modelo_veiculo = ?, cor_veiculo = ?,"
                + " chassi_veiculo = ?, veiculo_id_cliente = ?, id_status_veiculo = ? WHERE placa_veiculo = ?";

        if (conexao != null) {

            pst = conexao.prepareStatement(sqlPlaca);
            pst.setString(1, veiculo.getPlaca_veiculo());
            rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Não é possível usar a mesma Placa para mais de um veículo.", "Placa já cadastrada para um Veículo", JOptionPane.OK_OPTION);

            } else {

                try {
                    pst1 = conexao.prepareStatement(sql);

                    pst1.setString(1, veiculo.getDescricao_veiculo());
                    pst1.setString(2, veiculo.getAno_veiculo());
                    pst1.setString(3, veiculo.getModelo_veiculo());
                    pst1.setString(4, veiculo.getCor_veiculo());
                    pst1.setString(5, veiculo.getChassi_veiculo());
                    pst1.setInt(6, veiculo.getVeiculo_id_cliente());
                    pst1.setInt(8, veiculo.getId_status_veiculo());
                    pst1.setString(9, veiculo.getPlaca_veiculo());
                    pst1.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Dados do Veículo salvos com sucesso!");
                    return true;

                } catch (SQLException sqlException) {
                    System.out.println("Ocorreu uma exceção SQL" + sqlException);
                    JOptionPane.showMessageDialog(null, "Erro ao Alterar dados do Veículo!" + sqlException);
                }
            }

        }
        conexao.close();
        return false;
    }
}
