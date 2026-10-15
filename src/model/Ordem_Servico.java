package model;

import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import view.OrdemServicoFrm;

public final class Ordem_Servico extends javax.swing.JFrame {

    private int codigo_os;
    private String defeito_ordem_servico;
    private String dt_ent_os;
    private String dt_sai_os;
    private Double valor_total_os;
    private String status;
    private int id_produto;
    private int id_cliente;
    private int id_veiculo;
    private int id_servico;

    private String nomeCliente;
    private String foneFixoCliente;
    private String celularCliente;

    private String veiculo;

    private String mecanico;
    private String funcionario;
    private String defeito;

    private String produto;
    private String servico;

    public Ordem_Servico() {
    }

    public Ordem_Servico(int codigo_os, String defeito_ordem_servico, String dt_ent_os, String dt_sai_os, Double valor_total_os,
            String status, int id_produto, int id_cliente, int id_veiculo, int id_servico, String nomeCliente, String foneFixoCliente, String celularCliente, String veiculo, String mecanico, String funcionario, String defeito, String produto, String servico) {
        this.codigo_os = codigo_os;
        this.defeito_ordem_servico = defeito_ordem_servico;
        this.dt_ent_os = dt_ent_os;
        this.dt_sai_os = dt_sai_os;
        this.valor_total_os = valor_total_os;
        this.status = status;
        this.id_produto = id_produto;
        this.id_cliente = id_cliente;
        this.id_veiculo = id_veiculo;
        this.id_servico = id_servico;
        this.nomeCliente = nomeCliente;
        this.foneFixoCliente = foneFixoCliente;
        this.celularCliente = celularCliente;
        this.veiculo = veiculo;
        this.mecanico = mecanico;
        this.funcionario = funcionario;
        this.defeito = defeito;
        this.produto = produto;
        this.servico = servico;
    }

    public int getCodigo_os() {
        return codigo_os;
    }

    public void setCodigo_os(int codigo_os) {
        this.codigo_os = codigo_os;
    }

    public String getDefeito_ordem_servico() {
        return defeito_ordem_servico;
    }

    public void setDefeito_ordem_servico(String defeito_ordem_servico) {
        this.defeito_ordem_servico = defeito_ordem_servico;
    }

    public String getDt_ent_os() {
        return dt_ent_os;
    }

    public void setDt_ent_os(String dt_ent_os) {
        this.dt_ent_os = dt_ent_os;
    }

    public String getDt_sai_os() {
        return dt_sai_os;
    }

    public void setDt_sai_os(String dt_sai_os) {
        this.dt_sai_os = dt_sai_os;
    }

    public Double getValor_total_os() {
        return valor_total_os;
    }

    public void setValor_total_os(Double valor_total_os) {
        this.valor_total_os = valor_total_os;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public int getId_servico() {
        return id_servico;
    }

    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getFoneFixoCliente() {
        return foneFixoCliente;
    }

    public void setFoneFixoCliente(String foneFixoCliente) {
        this.foneFixoCliente = foneFixoCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getMecanico() {
        return mecanico;
    }

    public void setMecanico(String mecanico) {
        this.mecanico = mecanico;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getTextNome(JTextField iptNomeCliente) {
        return iptNomeCliente.getText().trim();
    }

    public String getTextCodigoCliente(JTextField iptCodigoCliente) {
        return iptCodigoCliente.getText().trim();
    }

    public String getTextFoneFixo(JFormattedTextField iptFoneFixoCliente) {
        return iptFoneFixoCliente.getText().trim();
    }

    public String getTextCelularCliente(JFormattedTextField iptCelularCliente) {
        return iptCelularCliente.getText().trim();
    }

    public String getComboStatus(JComboBox<String> cbbStatus) {
        return cbbStatus.getSelectedItem().toString();
    }
    
    public Double getValorTotal(JTextField iptValorTotal) {
        return Double.parseDouble(iptValorTotal.getText().trim());
    }

    public Ordem_Servico capturarOrdemServico(Ordem_Servico os) {

        os.setNomeCliente(getTextNome(OrdemServicoFrm.iptNomeRazaoSocial));
//        ordemServico.setId_cliente(Integer.parseInt(getTextCodigoCliente(OrdemServicoFrm.iptCodigoCliente)));
//        ordemServico.setFoneFixoCliente(getTextFoneFixo((JFormattedTextField) OrdemServicoFrm.iptTelefoneFixo));
        //      ordemServico.setCelularCliente(getTextCelularCliente((JFormattedTextField) OrdemServicoFrm.iptCelular));
        os.setValor_total_os(getValorTotal(OrdemServicoFrm.iptValorTotal));
        os.setStatus(getComboStatus(OrdemServicoFrm.cbbStatus));
        return os;
    }
}
