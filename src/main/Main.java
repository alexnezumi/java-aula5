
package main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        //            atividade 1
        Scanner grava = new Scanner(System.in);
       int x = 100;
       while(x < 200){
          if (x % 2 == 1){
              System.out.println(x);
          }
          }
       x++;       
            
//            atividade 2
            int val = 100;
            
            while(val<0){
                System.out.println(x);
            val--;
            }

//    atividade 3

        int menu = 1;
        double idade, soma = 0;
        double div = -1;
        double resul = 0;
        
       while(menu == 1){
            System.out.println("Insira a idade do aluno ou insira 0 para encerrar");
            idade = grava.nextInt();
            if(idade == 0){
                menu = 0;
                System.out.println("Você encerrou suas atividades no sistema de inserção de idades");
            }
            div++;
            soma = soma + idade;
        }
        resul = soma / div;
        System.out.println("A media das somas é " + resul);
       



//ATIVIDADE 4
         
        int a, b=0;
        
        System.out.println("Insira um valor?");
        
         a=grava.nextInt();
         while(a<b){
             b++;
        System.out.println("Isso é um teste");
        
         }
        }
        

    }
    

