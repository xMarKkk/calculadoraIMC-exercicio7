import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double tamanho, peso, calc;

    System.out.println("Qual sua altura?(ESCREVA EM CENTIMETROS)");
    tamanho = scan.nextInt();

    System.out.println("Qual seu peso?");
    peso = scan.nextInt();
    
    calc = (peso/(tamanho*tamanho))*10000;
    
      if(tamanho>=100 || peso>=10){
        if(calc<18.5){
          System.out.printf("Você esta abaixo do peso, seu imc é %.2f",calc);
        }
        else if(calc>=18.5 && calc<=24.9){
          System.out.printf("Você esta no peso normal, seu imc é %.2f",calc);
        }
        else if(calc>=25.0 && calc<=29.9){
          System.out.printf("Você esta na pre-obesidade, seu imc é %.2f",calc);
        }
        else if(calc>=30.0 && calc<=34.9){
          System.out.printf("Você esta com Obesidade Grau 1, seu imc é %.2f",calc);
        }
        else if(calc>=35.0 && calc<=39.9){
          System.out.printf("Você esta com Obesidade Grau 2, seu imc é %.2f",calc);
        }
        else if(calc>=40.0){
          System.out.printf("Você esta com Obesidade Grau 3, seu imc é %.2f",calc);
      }
    }
      else{
        System.out.println("Não entendi, escreva sua altura em centimetros, ou digite seu peso corretamente");
      }
  }
}