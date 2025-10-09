
# InputMismatchException

Java Collections exercises

## Level 1

### Exercici 1
>Crea una classe anomenada Month amb un atribut "name" (que emmagatzemarà el nom del mes de l'any). Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) en un ArrayList, a excepció de l'objecte amb atribut "Agost". Després, efectua la inserció en el lloc que correspon a aquest mes i demostra que l’ArrayList manté l'ordre correcte.
>
>Converteix l’ArrayList de l’exercici anterior en un HashSet i assegura’t que no permet duplicats.
>
>Recorre la llista amb un for i amb un iterador.

### Exercici 2
>Crea i emplena un List<Integer>. 
>
>Crea un segon List<Integer> i insereix a la segona llista els elements de la primera en ordre invers. 
>
>Empra els objectes ListIterator per a llegir els elements de la primera llista i inserir-los en la segona.


### Exercici 3
>Donat el fitxer countrties.txt (revisa l'apartat recursos) que conté països i capitals. El programa ha de llegir el fitxer i guardar les dades en un HashMap<String, String>. El programa demana el nom de l’usuari/ària, i després ha de mostrar un país de forma aleatòria, guardat en el HashMap. Es tracta que l’usuari/ària ha d’escriure el nom de la capital del país en qüestió. Si l’encerta se li suma un punt. Aquesta acció es repeteix 10 vegades. Un cop demanades les capitals de 10 països de forma aleatòria, llavors s’ha de guardar en un fitxer anomenat classificacio.txt, el nom de l’usuari/ària i la seva puntuació.

## Nivell 2
### Exercici 1
>Crea una classe anomenada Restaurant amb dos atributs: nom(String) i puntuació(int). Implementa els mètodes necessaris perquè no es puguin introduir objectes Restaurant amb el mateix nom i la mateixa puntuació en un HashSet creat en el main() de l’aplicació.

> **Important**
>
>Pot haver-hi restaurants amb el mateix nom amb diferent puntuació, però no pot haver-hi restaurants amb el mateix nom i la mateixa puntuació.

### Exercici 2
>Utilitzant la classe del programa anterior, crea la implementació necessària perquè els objectes de la classe Restaurant estiguin ordenats per nom i per puntuació en ordre descendent. 

>Exemple: 
>
>nom: restaurant1, puntuació: 8
>
>nom: restaurant1, puntuació: 7

## Nivell 3
### Exercici 1
>Crea una aplicació capaç de llegir un fitxer CSV. Aquest fitxer té 3 camps: nom, cognom i DNI, per cada registre. Es tracta d’ordenar les persones llegides del fitxer, mitjançant el seu nom, cognom o DNI. Pots fer servir la llista que creguis més adient.

>La classe Persona té 3 atributs: 
>
> * nom
>
> * cognom
>
> * DNI

>La classe principal té el següent menú:
>
>1.- Introduir persona.
>
>2.- Mostrar les persones ordenades per nom (A-Z).
>
>3.- Mostrar les persones ordenades per nom (Z-A).
>
>4.- Mostrar les persones ordenades per cognoms (A-Z).
>
>5.- Mostrar les persones ordenades per cognoms (Z-A).
>
>6.- Mostrar les persones ordenades per DNI (1-9).
>
>7.- Mostrar les persones ordenades per DNI (9-1).
>
>0.- Sortir.


## Installation

Clone the repository (https://github.com/EstherBlacksmith/S1.03.Collections.git) in order to obtain the code and execute de Main file in each package.
```bash
git clone https://github.com/EstherBlacksmith/S1.03.Collections.git
```

## Usage

```
Follow the questions in the terminal. 
Every package has it's own Main class. Execute it and introduce the data in the terminal of your IDE.
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)
