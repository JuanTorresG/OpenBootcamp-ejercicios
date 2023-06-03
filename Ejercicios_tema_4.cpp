#include <iostream>

int main(){
	// Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
	int numeroIf = 0;
	
	if(numeroIf < 0)
		std::cout<<"La variable es negativa"<<std::endl;
	else if(numeroIf > 0)
		std::cout<<"La variable es positiva"<<std::endl;
	else
		std::cout<<"La variable es 0"<<std::endl;
	
	// Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3
	int numeroWhile = 1;
	
	while(numeroWhile < 3){
		numeroWhile++;
		std::cout<<numeroWhile <<std::endl;
	}
	
	// Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
	do{
		numeroWhile++;
		std::cout<<numeroWhile <<std::endl;
	}while(numeroWhile < 3)
	
	// Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea 
	// igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
	for(int numeroFor = 0; numeroFor <= 3; numeroFor++)
		std::cout<<numeroFor<<std::endl;
	
	//Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. 
	//Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la
	//que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
	std::string estacion = "invierno";
	
	switch(estacion){
		case "verano":
			std::cout<<"Es verano."<<std::endl;
			break;
		case "otoño":
			std::cout<<"Es otoño"<<std::endl;
			break;
		case "primavera":
			std::cout<<"Es primavera."<<std::endl;
			break;
		case "invierno":
			std::cout<<"Es invierno."<<std::endl;
			break;
		default:
			std::cout<<"Esta estación del año no existe..."<<std::endl;
	}
	
	return 0;
}
