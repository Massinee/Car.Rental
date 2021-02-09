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
public class PessoaFisica extends Clientes{
    private String cpf;
    private String cnh;
    private Date dtNascimento;
    
    public PessoaFisica(){
        super();
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the cnh
     */
    public String getCnh() {
        return cnh;
    }

    /**
     * @param cnh the cnh to set
     */
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    /**
     * @return the dtNascimento
     */
    public Date getDtNascimento() {
        return dtNascimento;
    }

    /**
     * @param dtNascimento the dtNascimento to set
     */
    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    @Override
    public String getCPFcnpj() {
        return this.cpf; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCNH() {
        return this.cnh; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getDtNasc() {
        return this.dtNascimento; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getDesconto() {
        return 0.0; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDtNascPJ() {
        return null; //To change body of generated methods, choose Tools | Templates.
    }

}
