import java.util.Scanner;
class Main{
public static void main(String[] args){
//Passo1:Mostrar variável  
  double numero1;
  double numero2;
  double numero3;
//Passo2:Entrada de dados
  Scanner teclado = new Scanner(System.in);
  System.out.println("Digite o primeiro número inteiro");
numero1 = teclado.nextDouble();

  System.out.println("Digite o segundo número inteiro");
numero2 = teclado.nextDouble();

  System.out.println("Digite o número real");
numero3 = teclado.nextDouble();

  //Passo4:Calcular 
numero1 = (2 * numero1) * (numero2 / 2);
  numero2 = (3 * numero1) + numero3;
  numero3 = Math.pow (numero3 , 3);
  
//Passo3:Mostrar resultado
  
System.out.println("o produto do dobro do primeiro com metade do segundo " + numero1);
 System.out.println("a soma do triplo do primeiro com o terceiro" + numero2);
   System.out.println("o terceiro elevado ao cubo" + numero3);
 }
}
