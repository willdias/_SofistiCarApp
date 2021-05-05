package model;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import view.VeiculoFrm;

public class Veiculo {

    private int codigo_veiculo;
    private String descricao_veiculo;
    private String fabricante_veiculo;
    private String placa_veiculo;
    private String ano_veiculo;
    private String modelo_veiculo;
    private String cor_veiculo;
    private String chassi_veiculo;
    private int veiculo_id_cliente;
    private int id_status_veiculo;

    public Veiculo() {
    }

    public Veiculo(int codigo_veiculo, String descricao_veiculo, String fabricante_veiculo, String placa_veiculo, String ano_veiculo, String modelo_veiculo, String cor_veiculo, String chassi_veiculo, int veiculo_id_cliente, int id_status_veiculo) {
        this.codigo_veiculo = codigo_veiculo;
        this.descricao_veiculo = descricao_veiculo;
        this.fabricante_veiculo = fabricante_veiculo;
        this.placa_veiculo = placa_veiculo;
        this.ano_veiculo = ano_veiculo;
        this.modelo_veiculo = modelo_veiculo;
        this.cor_veiculo = cor_veiculo;
        this.chassi_veiculo = chassi_veiculo;
        this.veiculo_id_cliente = veiculo_id_cliente;
        this.id_status_veiculo = id_status_veiculo;
    }

    public int getCodigo_veiculo() {
        return codigo_veiculo;
    }

    public void setCodigo_veiculo(int codigo_veiculo) {
        this.codigo_veiculo = codigo_veiculo;
    }

    public String getDescricao_veiculo() {
        return descricao_veiculo;
    }

    public void setDescricao_veiculo(String descricao_veiculo) {
        this.descricao_veiculo = descricao_veiculo;
    }

    public String getFabricante_veiculo() {
        return fabricante_veiculo;
    }

    public void setFabricante_veiculo(String fabricante_veiculo) {
        this.fabricante_veiculo = fabricante_veiculo;
    }

    public String getPlaca_veiculo() {
        return placa_veiculo;
    }

    public void setPlaca_veiculo(String placa_veiculo) {
        this.placa_veiculo = placa_veiculo;
    }

    public String getAno_veiculo() {
        return ano_veiculo;
    }

    public void setAno_veiculo(String ano_veiculo) {
        this.ano_veiculo = ano_veiculo;
    }

    public String getModelo_veiculo() {
        return modelo_veiculo;
    }

    public void setModelo_veiculo(String modelo_veiculo) {
        this.modelo_veiculo = modelo_veiculo;
    }

    public String getCor_veiculo() {
        return cor_veiculo;
    }

    public void setCor_veiculo(String cor_veiculo) {
        this.cor_veiculo = cor_veiculo;
    }

    public String getChassi_veiculo() {
        return chassi_veiculo;
    }

    public void setChassi_veiculo(String chassi_veiculo) {
        this.chassi_veiculo = chassi_veiculo;
    }

    public int getVeiculo_id_cliente() {
        return veiculo_id_cliente;
    }

    public void setVeiculo_id_cliente(int veiculo_id_cliente) {
        this.veiculo_id_cliente = veiculo_id_cliente;
    }

    public int getId_status_veiculo() {
        return id_status_veiculo;
    }

    public void setId_status_veiculo(int id_status_veiculo) {
        this.id_status_veiculo = id_status_veiculo;
    }

    
    public String getTextDescricaoVeiculo(JTextField iptDescricaoVeiculo) {
        return iptDescricaoVeiculo.getText().trim();
    }

    public String getTextPlaca(JTextField iptPlaca) {
        return iptPlaca.getText().trim();
    }

    public String getTextAno(JTextField iptAno) {
        return iptAno.getText().trim();
    }

    public String getTextModelo(JTextField iptModelo) {
        return iptModelo.getText().trim();
    }

    public String getTextChassi(JTextField iptChassi) {
        return iptChassi.getText().trim();
    }

    public String getTextCor(JTextField iptCor) {
        return iptCor.getText().trim();
    }

    public String getTextFabricante(JTextField iptFabricante) {
        return iptFabricante.getText().trim();
    }

    public String getTextCliente(JTextField iptCliente) {
        return iptCliente.getText().trim();
    }

    public String getTextCodigo(JTextField iptCodVeiculo) {
        return iptCodVeiculo.getText().trim();
    }

    public String getComboStatus(JComboBox<String> cbbStatus) {
        return cbbStatus.getSelectedItem().toString();
    }

    public Veiculo capturarVeiculo(Veiculo veiculo) {
        //veiculo.setCodigo_veiculo(Integer.parseInt(getTextCodigo(VeiculoFrm.iptCodVeiculo)));
        veiculo.setDescricao_veiculo(getTextDescricaoVeiculo(VeiculoFrm.iptDescricao).toUpperCase());
        veiculo.setPlaca_veiculo(getTextPlaca(VeiculoFrm.iptPlaca).toUpperCase());
        veiculo.setAno_veiculo(getTextAno(VeiculoFrm.iptAno));
        veiculo.setModelo_veiculo(getTextModelo(VeiculoFrm.iptModelo));
        veiculo.setChassi_veiculo(getTextChassi(VeiculoFrm.iptChassi).toUpperCase());
        veiculo.setCor_veiculo(getTextCor(VeiculoFrm.iptCor).toUpperCase());
        veiculo.setFabricante_veiculo(getTextFabricante(VeiculoFrm.iptFabricante).toUpperCase());
        veiculo.setVeiculo_id_cliente(1);
        String sts = null;
        sts = VeiculoFrm.cbbStatus.getSelectedItem().toString();
        int status = 0;
        if (sts.equals("Ativo")) {
            status = 1;
        } else if (sts.equals("Inativo")){
            status = 2;
        }
        veiculo.setId_status_veiculo(status);

        return veiculo;
    }

}
