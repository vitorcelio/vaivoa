/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.ParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Vitor
 */
public class Cartao{

    private String numeroCartao;
    
    public void gerarNumeroCartao() throws ParseException {

        Long numeroCartaoPrimeiro = null;
        Long numeroCartaoSegundo = null;
        for (int i = 0; i < 10; i++) {
            numeroCartaoPrimeiro = (long) (40000001 + Math.random() * 8999991);
        }

        for (int i = 0; i < 10; i++) {
            numeroCartaoSegundo = (long) (10000001 + Math.random() * 8999991);
        }
       
        this.numeroCartao = numeroCartaoPrimeiro.toString() + numeroCartaoSegundo.toString();
        
    }

    public String getNumeroCartao() throws ParseException {
        JTextField formatar = new JFormattedTextField(new MaskFormatter("#### #### #### ####"));
        formatar.setText(numeroCartao);

        return formatar.getText();
    }

    

}
