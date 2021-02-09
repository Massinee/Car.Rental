/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author maria
 */
public class PessoaJuridica extends Clientes{
    private String cnpj;
    private String cnhResponsavel;
    private double descontoLocacao;
    
    public PessoaJuridica(){
        super();
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the cnhResponsavel
     */
    public String getCnhResponsavel() {
        return cnhResponsavel;
    }

    /**
     * @param cnhResponsavel the cnhResponsavel to set
     */
    public void setCnhResponsavel(String cnhResponsavel) {
        this.cnhResponsavel = cnhResponsavel;
    }

    /**
     * @return the descontoLocacao
     */
    public double getDescontoLocacao() {
        return descontoLocacao;
    }

    /**
     * @param descontoLocacao the descontoLocacao to set
     */
    public void setDescontoLocacao(double descontoLocacao) {
        this.descontoLocacao = descontoLocacao;
    }

    @Override
    public String getCPFcnpj() {
        return this.cnpj; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCNH() {
        return this.cnhResponsavel; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getDtNasc() {    
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getDesconto() {
        return this.descontoLocacao; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDtNascPJ() {
        return null; //To change body of generated methods, choose Tools | Templates.
    }
    
}
