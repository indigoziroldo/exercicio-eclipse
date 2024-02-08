package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
		
	}
	
	
	String obterDataFormatada(){
		// não usar sysout
		return String.format("%d/%d/%d",dia,mes,ano);
		
	}
	// void significa ausencia de retorno
	// só será exibido no terminal do sistema
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	
}
/*	Minha resolução
 		String modelo = (dia + "/" + mes+ "/" + ano);
 
		return modelo;*/
