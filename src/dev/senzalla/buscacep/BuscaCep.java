/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.senzalla.buscacep;

import org.json.simple.JSONObject;

/**
 * @author Black Burn Cybernetic
 * @e-mail blackburncyber@gmail.com
 * @github github.com/BlackBurnCybernetic
 */
public class BuscaCep {

    Endereco endereco = new Endereco();

    public void buscaCep(String cep) {
        JSONObject json = new JSONObject();
        json.putAll(new BuscaCepViaCep().buscarCep(cep));

        endereco.setBairro((String) json.get("bairro"));
        endereco.setCep((String) json.get("cep"));
        endereco.setCidade((String) json.get("localidade"));
        endereco.setLogradouro((String) json.get("logradouro"));
        endereco.setUf((String) json.get("uf"));
    }

    public String getBairro() {
        return endereco.getBairro();
    }

    public String getCep() {
        return endereco.getCep();
    }

    public String getCidade() {
        return endereco.getCidade();
    }

    public String getLogradouro() {
        return endereco.getLogradouro();
    }

    public String getUf() {
        return endereco.getUf();
    }

}
