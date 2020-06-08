import java.util.*;

public class TestDriver {


  public static void main (String [] args ){
    
    
    //Etapas do processamentos de dados 


    Scanner read = new Scanner(System.in);
    
    Double result = 0.0D; // ponto flutuante 
    Double firstNumber= 10.223D;
    Double secondNumber= 2.89D;

    System.out.println("Digite o primeiro numero:\n");
    firstNumber = read.nextDouble();

    System.out.println("Digite o segundo numero:\n");
    secondNumber = read.nextDouble();


    result = firstNumber + secondNumber;
    System.out.println(" soma = "+ result);
    result = firstNumber - secondNumber;
    System.out.println(" subtracão = " + result);
    result = firstNumber * secondNumber;
    System.out.println(" multiplicacão = " + result);
    if(secondNumber == 0 ){
      System.out.println(" nao e possivel dividir por zero!");
    }else{
        result = firstNumber / secondNumber;
        System.out.println(" Divisão = " + result);
    }
    result = firstNumber * firstNumber;
    System.out.println("Potencia de 2 para firstNumeber = " + result);
    result = secondNumber * secondNumber;
    System.out.println ("Potencia de 2 para secondNumber = " + result);
  }
}