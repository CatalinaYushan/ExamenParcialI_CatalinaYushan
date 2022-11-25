package lab5_catalinayushan;

import java.util.Scanner;

public class Lab5_CatalinaYushan {

    public static void main(String[] args) {
        Menu();
    }
    public static void Menu(){
        Scanner input = new Scanner (System.in);
        int opcion = 0;
        boolean choice=true;
        System.out.println("Hola, bienvenido al menu!");
        System.out.println("1. Conjuntos");
        System.out.println("2. Cifrado por Substitución");
        System.out.println("3. Sobre");
        System.out.println("4.Salir");

        System.out.println("Presione el numero que desea realizar: ");
        
        do{
            
        }
         switch(opcion){
            case 1:
                conjuntos();
                break;
            case 2:
                break;
            case 3:
                envelope();
                break;
            case 4:
                System.out.println("Adios! No vuelvas, por favor");
            default:
        }
    }
    public static void conjuntos(String falar, String obrigado){
        Scanner input = new Scanner (System.in);
        int letras = 0;
        System.out.println("Ingrese una cadena de letras separandos estas con una coma: ");
        String abc = input.nextLine();
        System.out.println("Ingrese una segunda cadena de letras separada por comas: ");
        String letters = input.nextLine();
         
        if (abc.equals(letters)){
            System.out.println("Ambos conjuntos son iguales"); 
        }
        }
    public static void envelope(int asterisks){
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese el tamaño (altura) del sobre: ");
        int altura = input.nextInt();
        System.out.println("Ingrese el tipo de cáracter que desea usar (*,/,^.!,etc.): ");
        int symbol = input.nextInt();
        
        for (int i = 0; i < altura; i++) {
        }
             for (int l = 0; l < 10; l++) {
                 if(i == 0 || i == altura -1 || l == 0 || l == altura -1)
             }
             System.out.println(symbol);
    }
    else{
            System.out.println(" ");
 
    }
    public static void Substitucion(){
        Scanner input = new Scanner (System.in);
        int words = 0;
        System.out.println("Ingrese la cadena de letras que desea ingresar: ");
        String muñeca = input.nextLine();
        
        String muñeca_preciosa = muñeca.replace("a", "z");
        String muñeca_preciosa_2 = muñeca.replace("z", "a");
        String muñeca_preciosa_3 = muñeca.replace("b", "y");
        String muñeca_preciosa_4 = muñeca.replace("y", "b");
        String muñeca_preciosa_5 = muñeca.replace("c", "x");
        String muñeca_preciosa_6 = muñeca.replace("x", "c");
        String muñeca_preciosa_7 = muñeca.replace("d", "w");
        String muñeca_preciosa_8 = muñeca.replace("w", "d");
        String muñeca_preciosa_9 = muñeca.replace("e", "v");
        String muñeca_preciosa_10 = muñeca.replace("v", "e");
        String muñeca_preciosa_11 = muñeca.replace("f", "u");
        String muñeca_preciosa_12 = muñeca.replace("u", "f");
        String muñeca_preciosa_13 = muñeca.replace("g", "t");
        String muñeca_preciosa_14 = muñeca.replace("t", "g");
        String muñeca_preciosa_15 = muñeca.replace("h", "s");
        String muñeca_preciosa_16 = muñeca.replace("s", "h");
        String muñeca_preciosa_17 = muñeca.replace("i", "r");
        String muñeca_preciosa_18 = muñeca.replace("r", "i");
        String muñeca_preciosa_19 = muñeca.replace("j", "q");
        String muñeca_preciosa_20 = muñeca.replace("q", "j");
        String muñeca_preciosa_21 = muñeca.replace("k", "p");
        String muñeca_preciosa_22 = muñeca.replace("p", "k");
        String muñeca_preciosa_23 = muñeca.replace("l", "o");
        String muñeca_preciosa_24 = muñeca.replace("o", "l");
        String muñeca_preciosa_25 = muñeca.replace("m", "n");
        String muñeca_preciosa_26 = muñeca.replace("n", "m");
        
        System.out.println(muñeca_preciosa);
    }
    
    }    







