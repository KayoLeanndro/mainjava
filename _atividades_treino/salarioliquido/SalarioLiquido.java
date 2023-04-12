package salarioliquido;
import java.util.Scanner;
public class SalarioLiquido{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	    
	    
	    System.out.print("Salário Bruto: R$ ");
        double SalarioBruto = sc.nextDouble();
        
        System.out.printf("Salário Líquido: R$ %.2f\n", calculaSalarioLiquido(SalarioBruto) );
        System.out.printf("Tipo do desconto: %s", definirTipoDesconto(SalarioBruto));   
	}
	
	
	
	public static double calculaSalarioLiquido(double salarioBruto){
	    double valorDesconto;
	    if (salarioBruto<=2000) {
	        valorDesconto=0;
	    }
	    else if (salarioBruto<=4000){
	        valorDesconto = salarioBruto * 0.02;
	    }
	    else {
	        valorDesconto = salarioBruto * 0.04;
	        if (valorDesconto>400){
	            valorDesconto=400;
	        }
	    }
	    double salarioLiquido = salarioBruto - valorDesconto;
	    return salarioLiquido;
	}
	
	public static String definirTipoDesconto(double salarioBruto) {
	    if (salarioBruto<=2000) {
	        return "Isento";
	    }
	    else if (salarioBruto<=4000){
	        return "Mínimo";
	    }
	    else {
	        double valorDesconto = salarioBruto*0.04;
	        if (valorDesconto<=400){
	            return "Médio";
	        }
	        else {
	            return "Máximo";
	        }
	    }	    
	}
	
	
    }
