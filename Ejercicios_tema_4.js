let numeroIf = 0

if (numeroIf < 0)
    console.log("La variable es negativa");
else if (numeroIf > 0)
    console.log("La variable es positiva");
else
    console.log("La variable es 0");

console.log();

// Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3
let numeroWhile = 1;

while (numeroWhile < 3) {
    numeroWhile++;
    console.log(numeroWhile);
}

console.log();

// Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
do {
    numeroWhile++;
    console.log(numeroWhile);
} while (numeroWhile < 3);

// Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea 
// igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
for (let numeroFor = 0; numeroFor <= 3; numeroFor++)
 console.log(numeroFor)

console.log();

//Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. 
//Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la
//que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
let estacion = "invierno";

switch (estacion) {
    case "verano":
        console.log("Es verano.");
        break;
    case "otoño":
        console.log("Es otoño");
        break;
    case "primavera":
        console.log("Es primavera.");
        break;
    case "invierno":
        console.log("Es invierno.");
        break;
    default:
        console.log("Esta estación del año no existe...");
}
