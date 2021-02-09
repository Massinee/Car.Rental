/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


import dados.LocacaoDados;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author maria
 */
public class Locacao {
    
    private int codigo;
    private Date dtLocacao;
    private Date dtEntrega;
    private int qtdDiasLocados;
    private double valorTotalLocacao;
    private Carro carro;
    private Clientes cliente;

    public Locacao(){
        
        Random aleatorio = new Random();
        int num = aleatorio.nextInt(9999999);

        if(LocacaoDados.lstLocacao.size() >= 0){            
            for(Locacao cod : LocacaoDados.lstLocacao){
                boolean repetido = false;
                do{                    
                    repetido = false;
                    
                    for(Locacao c : LocacaoDados.lstLocacao){
                        if(c.codigo == num){
                        num = aleatorio.nextInt(9999999);
                        repetido= true;
                        }
                    }                    
                }
                while(repetido==true);
            }
         this.codigo = num;
        }
    }
    public int calcularQtdDias(Date dtEnt){

        Date dtLoc = this.dtLocacao;
        
        int anoLoc = (dtLoc.getYear()) * 365;
        int mesLoc = (dtLoc.getMonth()) * 30;
        int diaLoc = dtLoc.getDate();
        
        int diasLoc = anoLoc + mesLoc + diaLoc;
        
        int anoEnt = (dtEnt.getYear()) * 365;
        int mesEnt = (dtEnt.getMonth()) * 30;
        int diaEnt = dtEnt.getDate();
        
        int diasEnt = anoEnt + mesEnt + diaEnt;

        this.qtdDiasLocados = diasEnt - diasLoc;
        return qtdDiasLocados;
    }

    public double calcularTotalDiaria(double diaria, double desconto, int qtdDiasLocados){

        this.valorTotalLocacao = (diaria * (qtdDiasLocados)) - desconto;
        
        if(qtdDiasLocados == 0){
            return (diaria - desconto);
        }
        
        return valorTotalLocacao;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the dtLocacao
     */
    public Date getDtLocacao() {
        return dtLocacao;
    }

    /**
     * @param dtLocacao the dtLocacao to set
     */
    public void setDtLocacao(Date dtLocacao) {
        this.dtLocacao = dtLocacao;
    }

    /**
     * @return the dtEntrega
     */
    public Date getDtEntrega() {
        return dtEntrega;
    }

    /**
     * @param dtEntrega the dtEntrega to set
     */
    public void setDtEntrega(Date dtEntrega) {
        this.dtEntrega = dtEntrega;
    }

    /**
     * @return the qtdDiasLocados
     */
    public int getQtdDiasLocados() {
        return qtdDiasLocados;
    }

    /**
     * @param qtdDiasLocados the qtdDiasLocados to set
     */
    public void setQtdDiasLocados(int qtdDiasLocados) {
        this.qtdDiasLocados = qtdDiasLocados;
    }

    /**
     * @return the valorTotalLocacao
     */
    public double getValorTotalLocacao() {
        return valorTotalLocacao;
    }

    /**
     * @param valorTotalLocacao the valorTotalLocacao to set
     */
    public void setValorTotalLocacao(double valorTotalLocacao) {
        this.valorTotalLocacao = valorTotalLocacao;
    }

    /**
     * @return the carro
     */
    public Carro getCarro() {
        return carro;
    }

    /**
     * @param carro the carro to set
     */
    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    /**
     * @return the cliente
     */
    public Clientes getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

}
