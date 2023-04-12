package atribuicaoclasses;
public class Carro{
boolean ligado;
int velocidade;
    String color;
String brand;
int numPassagers;
int capFuel;
int consumeFuel;
int qtdGas;

public Carro(String brand,String color,int capFuel,int qtdGas,int velocidade){
this.brand = brand;
this.color = color;
this.velocidade = velocidade;
this.numPassagers = 4;
this.capFuel = capFuel;
this.qtdGas = qtdGas;
}

public void ligar(){
    if(ligado == false){
        ligado = true;
    }
}
public void desligar(){
    if(ligado == true){
        ligado = false;
    }
}

public int acelerar(){
    if(ligado == true && velocidade >= 10){
        consumeFuel = 10;
        this.qtdGas = this.qtdGas - consumeFuel;
        return this.qtdGas;
    }
    return 0;
}
public int desascelerar(){
    if(ligado == true && velocidade <10){
        this.consumeFuel = 5;
        int gasAtual = qtdGas - consumeFuel;
        return gasAtual; 
    }
    return qtdGas;
}
public int parar(){
    if(ligado == true && velocidade == 0){
        this.consumeFuel = 0;
        int gasAtual = qtdGas - consumeFuel;
        return gasAtual;
    }
    return qtdGas;
}


}