package model;

import javax.swing.JTextField;
import view.ServicoFrm;

public class Servico {

    
    private String descricao_servico;
    private Double valor_unitario;
    private Double valor_total;
    private int codigo_servico;
    private int codigo_os;
    private int id_status_servico;

    public Servico() {
    }

    public Servico(String descricao_servico, Double valor_unitario, Double valor_total, int codigo_servico, int codigo_os, int id_status_servico) {
        this.descricao_servico = descricao_servico;
        this.valor_unitario = valor_unitario;
        this.valor_total = valor_total;
        this.codigo_servico = codigo_servico;
        this.codigo_os = codigo_os;
        this.id_status_servico = id_status_servico;
    }

    public String getDescricao_servico() {
        return descricao_servico;
    }

    public void setDescricao_servico(String descricao_servico) {
        this.descricao_servico = descricao_servico;
    }

    public Double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(Double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public Double getValor_total() {
        return valor_total;
    }

    public void setValor_total(Double valor_total) {
        this.valor_total = valor_total;
    }

    public int getCodigo_servico() {
        return codigo_servico;
    }

    public void setCodigo_servico(int codigo_servico) {
        this.codigo_servico = codigo_servico;
    }

    public int getCodigo_os() {
        return codigo_os;
    }

    public void setCodigo_os(int codigo_os) {
        this.codigo_os = codigo_os;
    }

    public int getId_status_servico() {
        return id_status_servico;
    }

    public void setId_status_servico(int id_status_servico) {
        this.id_status_servico = id_status_servico;
    }

    
    private String getTextDescricaoServico(JTextField iptDescricao) {
        return iptDescricao.getText().trim();
    }
    
    private Double getTextValor(JTextField iptValor) {
        return Double.parseDouble(iptValor.getText().trim());
    }
    
    public Servico capturarServico(Servico servico) {
        servico.setDescricao_servico(getTextDescricaoServico(ServicoFrm.iptDescricao).toUpperCase());
        servico.setValor_unitario(getTextValor(ServicoFrm.iptValor));
        String sts = ServicoFrm.cbbStatus.getSelectedItem().toString();
        int status = 0;
        if (sts.equals("Ativo")) {
            status = 1;
        } else if (sts.equals("Inativo")) {
            status = 2;
        }
        servico.setId_status_servico(status);

        return servico;

    }

}
