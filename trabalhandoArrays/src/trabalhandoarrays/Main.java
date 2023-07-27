
package trabalhandoarrays;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

   
    public static void main(String[] args) {
        // Crie um programa JOptionPane que peça tres notas e informe a media do aluno
        //Ultilizando o array list, pegar quantos inteiros o ususario quiser digitar
        // no final indique qual o menor qual o maior e qual a media do inteiro
        
          ArrayList<Integer> numbers = new ArrayList<>();
          
          String resp = "";
          String result= "";
           
           while(!resp.equals("x")){
               resp = JOptionPane.showInputDialog("Digite um numero inteiro ou x para sair: ");
                 result = resp + result;
            
               if(!resp.equals("x")){
                   numbers.add(Integer.parseInt(resp));
               }
           }
          Integer menor  = numbers.get(0);
          Integer maior = numbers.get(0);
           for (int i = 0; i <numbers.size(); i++){
              if(numbers.get(i)< menor){
               menor = numbers.get(i);
               }
           } for (int i = 0; i <numbers.size(); i++){
               if(numbers.get(i)>maior){
                   maior = numbers.get(i);
               }
           } 
           JOptionPane.showInternalMessageDialog(null, "A menor nota foi " +menor);
           JOptionPane.showInputDialog("A maior nota foi "+maior);
           JOptionPane.showInputDialog("A média das notas foi "+result);
        }       
    
    public static void media(){
          Double[] notas = new Double[3];
        
        for (int i=0; i<=2; i++){
            notas[i]=  Double.parseDouble(JOptionPane.showInputDialog("Digite a " +(i+1) +" nota"));
        }
        double media = (notas[0]+notas[1]+notas[2])/3;
        
        JOptionPane.showMessageDialog(null, "A média do aluno foi de "+ media+".");
    }
    
    public static void pedirVariasNotas(){
      Double[] nota = new Double [1];
            String resp = "";
            int contador = 0;
            
            while (resp.equals("-1")){
            resp = (JOptionPane.showInputDialog("Digite a nota ou -1 para encerrar> "));
            if(!resp.equals("-1")){
                if(nota.length == contador){
                    Double[] newNota = new Double[contador+1];
                    for(int i = 0; i<nota.length;i++){
                        newNota[i] = nota[i];
                    }
                    nota = newNota;
                }
                nota[contador]= Double.parseDouble(resp);
                 contador++;
              }
          }
    }
}
