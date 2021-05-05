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

    public ProdutoDao() {
        conexao = ConexoesMySql.conectar();

    }

    public Produto buscarProduto(String descricao) throws SQLException {
        conexao = ConexoesMySql.conectar();
        String sql = "SELECT produto.idProduto, produto.tipo, produto.descricao, produto.aplicacao,"
                + " produto.valorCompra, produto.valorVenda"
                + " FROM soberano.produto"
                + " LEFT OUTER JOIN soberano.estoque"
                + " ON produto.idProduto = estoque.idProduto"
                + " WHERE produto.descricao LIKE ?";
        Produto produto = new Produto();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, "%" + descricao + "%");
            rs = pst.executeQuery();

            while (rs.next()) {

                // produto.setIdProduto(rs.getInt("Código"));
                produto.setTipo_produto(rs.getString("Tipo"));
                produto.setDescricao_produto(rs.getString("descricao"));
                produto.setAplicacao_produto(rs.getString("aplicacao"));
                produto.setValor_compra_produto(Double.parseDouble(rs.getString("valorCompra")));
                produto.setValor_venda_produto(Double.parseDouble(rs.getString("valorVenda")));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Produto Não Cadastrado: " + e.getMessage());
        }
        conexao.close();
        return produto;
    }

    public static void buscarTodosProdutos(JTable tabelaProdutos) {
        try {
            String sql = "SELECT p.codigo_produto as 'Código', p.tipo_produto as 'Tipo', p.descricao_produto as 'Descrição',"
                    + " p.aplicacao_produto, p.valor_compra_produto,"
                    + " p.valor_venda_produto as 'Preço'"
                    + " FROM produto p";

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
            String sql = "SELECT p.codigo_produto as 'Código', p.descricao_produto as 'Descrição',"
                    + " p.tipo_produto as 'Tipo',"
                    + "	p.aplicacao_produto, p.valor_compra_produto,"
                    + " p.valor_venda_produto as 'Preço'"
                    + " FROM produto p WHERE codigo_produto = ?";

            conexao = ConexoesMySql.conectar();
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
        conexao = ConexoesMySql.conectar();
        pst = null;
        rs = null;

        String sql = "INSERT INTO produto ( tipo_produto, descricao_produto,"
                + " aplicacao_produto, valor_compra_produto, valor_venda_produto, produto_id_fornecedor,"
                + " id_status_produto, produto_marca)"
                + " VALUES (?,?,?,?,?,?,?,?)";
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
        conexao = ConexoesMySql.conectar();
        pst = null;
        rs = null;

        String sql = "UPDATE produto tipo = ?, descricao = ?, aplicacao = ?, valorCompra = ?, valorVenda = ?"
                + " WHERE codigo_produto = ? ";
        
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
        conexao = ConexoesMySql.conectar();

        try {
            String sql = "SELECT p.codigo_produto AS 'Código', p.descricao_produto AS 'Descrição',"
                    + " p.valor_venda_produto AS 'Preço R$'"
                    + " FROM produto p"
                    + " WHERE descricao_produto LIKE ?";

            conexao = ConexoesMySql.conectar();
            pst = conexao.prepareStatement(sql);
            pst.setString(1, descricao + "%");
            rs = pst.executeQuery();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Produto. " + err);
        }
        //conexao.close();
        return rs;
    }
    
    public List<Produto> read() throws SQLException {

        conexao = ConexoesMySql.conectar();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            pst = conexao.prepareStatement("SELECT * FROM produto");
            rs = pst.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setCodigo_produto(rs.getInt("codigo_produto"));
                produto.setTipo_produto(rs.getString("tipo_produto"));
                produto.setDescricao_produto(rs.getString("descricao_produto"));
                produto.setAplicacao_produto(rs.getString("aplicacao_produto"));
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
