/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.senzalla.buscacep;

/**
 * @author Black Burn Cybernetic
 * @e-mail blackburncyber@gmail.com
 * @github github.com/BlackBurnCybernetic
 */
public class Endereco {

    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;

    Endereco() {
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (cep != null) {
            this.cep = cep;
        }
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        if (logradouro != null) {
            this.logradouro = logradouro;
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        if (bairro != null) {
            this.bairro = bairro;
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if (cidade != null) {
            this.cidade = cidade;
        }
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf != null) {
            this.uf = uf;
        }
    }
}
