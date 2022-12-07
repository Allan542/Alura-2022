package br.com.bytebank.banco.test;


import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;
import br.com.bytebank.banco.modelo.CalculadorDeImposto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author silva
 */
public class TesteTributavel {
    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);
        
        SeguroDeVida seguro = new SeguroDeVida();
        
        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguro);
        
        System.out.println(calc.getTotalImposto());
    }
}
