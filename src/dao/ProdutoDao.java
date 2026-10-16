package dao;

import conexoes.ConexoesMySql;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import model.Produto;
import net.proteanit.sql.DbUtils;


public class ProdutoDao {

    static Connection conexao = null;
    static PreparedStatement pst = null;
    static PreparedStatement pst2 = null;

    static ResultSet rs = null;

    public Produto buscarProduto(String descricao) throws SQLException {
        conexao = ConexoesMySql.base();
        String sql = "SELECT p.ID_PRODUTO, p.TIPO_PRODUTO, p.DESCRICAO_PRODUTO, p.APLICACAO_PRODUTO,"
                + " p.VALOR_COMPRA_PRODUTO, p.VALOR_VENDA_PRODUTO"
                + " FROM PRODUTO p"
                //+ " LEFT OUTER JOIN ESTOQUE"
                //+ " ON idProduto = estoque.idProduto"
                + " WHERE p.DESCRICAO_PRODUTO LIKE ?";
        Produto produto = new Produto();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, "%" + descricao + "%");
            rs = pst.executeQuery();

            while (rs.next()) {

                // produto.setIdProduto(rs.getInt("Código"));
                produto.setTipo_produto(rs.getString("TIPO_PRODUTO"));
                produto.setDescricao_produto(rs.getString("DESCRICAO_PRODUTO"));
                produto.setAplicacao_produto(rs.getString("APLICACAO_PRODUTO"));
                produto.setValor_compra_produto(Double.parseDouble(rs.getString("VALOR_COMPRA_PRODUTO")));
                produto.setValor_venda_produto(Double.parseDouble(rs.getString("VALOR_VENDA_PRODUTO")));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Produto Não Cadastrado: " + e.getMessage());
        }
        conexao.close();
        return produto;
    }

    public static void buscarTodosProdutos(JTable tabelaProdutos) {
        try {
            String sql = "SELECT p.ID_PRODUTO as 'Código', p.TIPO_PRODUTO as 'Tipo', p.DESCRICAO_PRODUTO as 'Descrição',"
                    + " p.APLICACAO_PRODUTO, p.VALOR_COMPRA_PRODUTO,"
                    + " p.VALOR_VENDA_PRODUTO as 'Preço'"
                    + " FROM PRODUTO p";

            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            tabelaProdutos.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException err) {
            System.err.println("Erro ao Buscar Produtos!");
        } finally {

        }
    }

    public static Produto buscarProdutoDao(Produto produto) {
        try {
            String sql = "SELECT p.ID_PRODUTO as 'Código', p.DESCRICAO_PRODUTO as 'Descrição',"
                    + " p.TIPO_PRODUTO as 'Tipo',"
                    + "	p.APLICACAO_PRODUTO, p.VALOR_COMPRA_PRODUTO,"
                    + " p.VALOR_VENDA_PRODUTO as 'Preço'"
                    + " FROM PRODUTO p WHERE ID_PRODUTO = ?";

            conexao = ConexoesMySql.base();
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, produto.getCodigo_produto());
            rs = pst.executeQuery();

            if (rs.next()) {
                produto.setCodigo_produto(rs.getInt(1));
                produto.setDescricao_produto(rs.getString(2));
            }

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Produto. " + err);
        } finally {

        }
        return produto;
    }

    public static boolean incluirProdutoDao(Produto produto) throws SQLException {
        conexao = ConexoesMySql.base();
        pst = null;
        rs = null;

        String sql = "INSERT INTO PRODUTO ( tipo_produto, descricao_produto,"
                + " aplicacao_produto, valor_compra_produto, valor_venda_produto, produto_id_fornecedor )"
                + " VALUES (?,?,?,?,?,?)";
        if (conexao != null) {
            try {

                pst = conexao.prepareStatement(sql);

                pst.setString(1, produto.getTipo_produto());
                pst.setString(2, produto.getDescricao_produto());
                pst.setString(3, produto.getAplicacao_produto());
                pst.setDouble(4, produto.getValor_compra_produto());
                pst.setDouble(5, produto.getValor_venda_produto());
                pst.setInt(6, produto.getProduto_id_fornecedor());
                pst.setInt(7, produto.getId_status_produto());
                pst.setString(8, produto.getProduto_marca());
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Produto Cadastrado com sucesso!");
                return true;

            } catch (SQLException sqlException) {
                System.out.println("Ocorreu uma exceção SQL" + sqlException);
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Produto!");
            } catch (HeadlessException exception) {
                System.out.println("Ocorreu uma exceção");
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Produto!");
            }
        }
        conexao.close();
        return false;
    }

    public static boolean alterarProdutoDao(Produto produto) throws SQLException {
        conexao = ConexoesMySql.base();
        pst = null;
        rs = null;

        String sql = "UPDATE PRODUTO SET tipo_produto = ?, descricao_produto = ?, aplicacao_produto = ?, valor_compra_produto = ?, valor_venda_produto = ?"
                + " WHERE id_produto = ? ";
        
        if (conexao != null) {
            try {

                pst = conexao.prepareStatement(sql);

                pst.setString(1, produto.getTipo_produto());
                pst.setString(2, produto.getDescricao_produto());
                pst.setString(3, produto.getAplicacao_produto());
                pst.setDouble(4, produto.getValor_compra_produto());
                pst.setDouble(5, produto.getValor_venda_produto());
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
                return true;

            } catch (SQLException sqlException) {
                System.out.println("Ocorreu uma exceção SQL" + sqlException);
                JOptionPane.showMessageDialog(null, "Erro ao alterar dados.");
            } catch (HeadlessException exception) {
                System.out.println("Ocorreu uma exceção");
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Produto!");
            }
        }
        conexao.close();
        return false;
    }

    public ResultSet buscarTodosProdutosDao(String descricao) throws SQLException {
        conexao = ConexoesMySql.base();

        try {
            String sql = "SELECT p.ID_PRODUTO AS 'Código', p.DESCRICAO_PRODUTO AS 'Descrição',"
                    + " p.VALOR_VENDA_PRODUTO AS 'Preço R$'"
                    + " FROM PRODUTO p"
                    + " WHERE DESCRICAO_PRODUTO LIKE ?";

            conexao = ConexoesMySql.base();
            pst = conexao.prepareStatement(sql);
            pst.setString(1, descricao + "%");
            rs = pst.executeQuery();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Produto. " + err);
        }
        conexao.close();
        return rs;
    }
    
    public List<Produto> read() throws SQLException {

        conexao = ConexoesMySql.base();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            pst = conexao.prepareStatement("SELECT * FROM PRODUTO");
            rs = pst.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setCodigo_produto(rs.getInt("ID_PRODUTO"));
                produto.setTipo_produto(rs.getString("TIPO_PRODUTO"));
                produto.setDescricao_produto(rs.getString("DESCRICAO_PRODUTO"));
                produto.setAplicacao_produto(rs.getString("APLICACAO_PRODUTO"));
                produto.setValor_compra_produto(rs.getDouble("valor_compra_produto"));
                produto.setValor_venda_produto(rs.getDouble("valor_venda_produto"));
                produto.setProduto_marca(rs.getString("produto_marca"));
                
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.close();
        }

        return produtos;

    }
}
