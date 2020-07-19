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

public class teste {
    public static void main(String[] args) {
        BuscaCep buscaCep=new BuscaCep();
        buscaCep.buscaCep("78005540");
        System.out.println(buscaCep.getBairro());
        System.out.println(buscaCep.getCep());
        System.out.println(buscaCep.getCidade());
        System.out.println(buscaCep.getLogradouro());
        System.out.println(buscaCep.getUf());
    }
}
