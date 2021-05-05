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

    public VeiculoDao() {
        conexao = ConexoesMySql.conectar();

    }

    public ResultSet buscarVeiculoDao(Veiculo veiculo) {
        String sql = "SELECT * FROM veiculo WHERE placa_veiculo = ?"
                + "OR codigo_veiculo = ?";
        
        String sqlMaxCod = "SELECT MAX(codigo_veiculo) FROM veiculo";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, veiculo.getPlaca_veiculo());
            pst.setInt(2, veiculo.getCodigo_veiculo());
            rs = pst.executeQuery();

            pst1 = conexao.prepareStatement(sqlMaxCod);
            rs1 = pst1.executeQuery();

            if (rs.next()) {
                veiculo.setCodigo_veiculo(rs.getInt(1));
                veiculo.setDescricao_veiculo(rs.getString(2));
                veiculo.setFabricante_veiculo(rs.getString(3));
                veiculo.setPlaca_veiculo(rs.getString(4));
                veiculo.setAno_veiculo(rs.getString(5));
                veiculo.setModelo_veiculo(rs.getString(6));
                veiculo.setCor_veiculo(rs.getString(7));
                veiculo.setChassi_veiculo(rs.getString(8));
                veiculo.setVeiculo_id_cliente(rs.getInt(10));
            }else {
                veiculo.getPlaca_veiculo();
                addVeiculoDao(veiculo);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Veículo: " + e);

        }
        return rs;
    }

    public ResultSet buscarTodosVeiculos() {
        String sql = "SELECT * FROM veiculo";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Veículos: " + e);
        }
        return rs;
    }

    public static boolean addVeiculoDao(Veiculo veiculo) throws SQLException {
        conexao = ConexoesMySql.conectar();
        pst = null;
        pst1 = null;
        rs = null;
        rs1 = null;

        String sql = "INSERT INTO veiculo (descricao_veiculo, fabricante_veiculo, placa_veiculo,"
                + " ano_veiculo, modelo_veiculo, cor_veiculo, chassi_veiculo)"
                + " VALUES (?,?,?,?,?,?,?)";

        if (conexao != null) {
            try {

                pst1 = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                pst1.setString(1, veiculo.getDescricao_veiculo());
                pst1.setString(2, veiculo.getFabricante_veiculo());
                pst1.setString(3, veiculo.getPlaca_veiculo());
                pst1.setString(4, veiculo.getAno_veiculo());
                pst1.setString(5, veiculo.getModelo_veiculo());
                pst1.setString(6, veiculo.getCor_veiculo());
                pst1.setString(7, veiculo.getChassi_veiculo());
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
        return false;

    }

    public static boolean alterarVeiculoDao(Veiculo veiculo) throws SQLException {
        conexao = ConexoesMySql.conectar();
        pst = null;
        rs = null;

        String sqlPlaca = "SELECT * FROM veiculo where placa_veiculo = ? AND descricao_veiculo IS NOT NULL";

        String sql = "UPDATE veiculo SET descricao_veiculo = ?, fabricante_veiculo = ?,"
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
                    pst1.setString(2, veiculo.getFabricante_veiculo());
                    pst1.setString(3, veiculo.getAno_veiculo());
                    pst1.setString(4, veiculo.getModelo_veiculo());
                    pst1.setString(5, veiculo.getCor_veiculo());
                    pst1.setString(6, veiculo.getChassi_veiculo());
                    pst1.setInt(7, veiculo.getVeiculo_id_cliente());
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
        return false;
    }
}
