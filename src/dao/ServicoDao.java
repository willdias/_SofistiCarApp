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

    public ServicoDao() {
        conexao = ConexoesMySql.conectar();

    }

    public static Servico buscarServicoDao(Servico servico) {
        try {
            String sql = "SELECT codigo_servico as 'Código', descricao_servico as 'Descrição',"
                    + " valor_venda_servico as 'Preço'"
                    + " FROM servico"
                    + " WHERE codigo_servico = ?";

            conexao = ConexoesMySql.conectar();
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

        }
        return servico;
    }

    public static boolean incluirServicoDao(Servico servico) throws SQLException {
        conexao = ConexoesMySql.conectar();
        pst = null;
        rs = null;

        String sql = "INSERT INTO servico ( descricao_servico,"
                + " valor_unitario, id_status_servico)"
                + " VALUES (?,?,?)";
        if (conexao != null) {
            try {

                pst = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                pst.setString(1, servico.getDescricao_servico());
                pst.setDouble(2, servico.getValor_unitario());

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

        return false;

    }

    public static boolean alterarServicoDao(Servico servico) throws SQLException {
        conexao = ConexoesMySql.conectar();
        pst = null;
        rs = null;

        String sql = "INSERT INTO servico (tipo, descricao, aplicacao, valorCompra, valorVenda) VALUES (?,?,?,?,?)";
        if (conexao != null) {
            try {

                pst = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                pst.setString(2, servico.getDescricao_servico());
                pst.setDouble(4, servico.getValor_unitario());
                pst.setInt(7, servico.getId_status_servico());
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

        return false;

    }

    public ResultSet buscarTodosServicosDao(String descricao) {
        try {
            String sql = "SELECT codigo_servico AS 'Código', descricao_servico AS 'Descrição',"
                    + " valor_unitario AS 'Preço R$'"
                    + " FROM servico"
                    + " WHERE descricao_servico LIKE ?";

            conexao = ConexoesMySql.conectar();
            pst = conexao.prepareStatement(sql);
            pst.setString(1, descricao + "%");
            rs = pst.executeQuery();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar servico. " + err);
        }
        return rs;
    }

    public ResultSet buscarItens(int os) {
        try {
            String sql = "SELECT codigo_servico AS 'Código',descricao AS 'Descrição',quantidade AS 'Quantidade',"
                    + " preco_unit AS 'Preço Unit. R$', preco_total AS 'Preço Total R$'"
                    + " FROM itens_servicos"
                    + " WHERE codigo_os = ?";
            JOptionPane.showMessageDialog(null, os);
            conexao = ConexoesMySql.conectar();
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, os);
            rs = pst.executeQuery();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar servico. " + err);
        }
        return rs;
    }

    public ResultSet buscarValorTotalItens(Ordem_Servico os) {
        try {
            String sql = "SELECT SUM(valor_total)AS SOMA FROM itens_servicos"
                    + "WHERE codigo_os = ?";
            conexao = ConexoesMySql.conectar();
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
        return rs;
    }
}
