package estructuradatosjava;

import java.util.Scanner;

public class Casa_tipografica_santandereana {
    public static void main(String[] args) {
    	
        //Variables
    	String userName = "aprendizSena";
    	String opcionUserName = "";
    	String password = "adso3234206";
    	String opcionPassword = "";
    	int intentosPassword = 0;
    	String nombreUsuario = "";
    	String apellidosUsuario = "";
    	String usernameUsuario = "";
    	String paswordUsuario = "";
    	int respuestaMenuDiseNadores = 0;
        int edicionTipografia1 = 0;
    	int opcionMenuBienvenida = 0;
        double precioTipografiaAB = 70000;
        double precioTipografiaTerrazas = 60000;
        double precioTipografiaGironesa = 100000;
        double porcentajeRegaliasArtista = 0.70;
        double porcentajeRegaliasCasa = 0.30;
        double totalRecibidoPorArtistaTipografiaAB = precioTipografiaAB * porcentajeRegaliasArtista;
        double totalRecibidoPorCasaPorTipografiaAB = precioTipografiaAB * porcentajeRegaliasCasa;
        double totalRecibidoPorArtistaTipografiaTerrazas = precioTipografiaTerrazas * porcentajeRegaliasArtista;
        double totalRecibidoPorCasaPorTipografiaTerrazas = precioTipografiaTerrazas * porcentajeRegaliasCasa;
        int eleccionTipografia = 0;
        int respuesta_modificacion = 0;
 int respuestaMenu;

 String[][]disenadoresytipografias = {
    {"Gironesa", "Zapatoca", "Palenque"},
    {"florideña", "piedicuestana", "Cañaveral"},
    {"Conucos", "Aurora", "San francisco"}
 };
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la casa tipográfica santandereana ");
        System.out.println("Ingrese 1: para hacer login");
        System.out.println("Ingrese 2: para crear una cuenta");
        opcionMenuBienvenida=scanner.nextInt();
        switch(opcionMenuBienvenida) {
        case 1:
        	scanner.nextLine();
        	do {
        	System.out.println("Ingrese su usuario");
        	opcionUserName = scanner.nextLine();
        	if(!opcionUserName.equalsIgnoreCase(userName)) {
        		System.out.println("El usuario no existe ");
        	}
        	}
        	while(!opcionUserName.equals(userName));{
        		
        	}
        	do {
        		System.out.println("Ingrese su contraseña");
        		opcionPassword=scanner.nextLine();
        		
        		if(!opcionPassword.equals(password)) {
        			System.out.println("Contraseña incorrecta");
        			intentosPassword++;
        			
        			if (intentosPassword>3) {
        				System.out.println("Haz superado el límite de intentos");
        				System.out.println("Espera 3 minútos para volver a intentar");
        			}
        		}
        	}while(!opcionPassword.equals(password));
        	break;
        	
        case 2:
        	System.out.println("Ingrese su nombre");
        	nombreUsuario = scanner.nextLine();
        	System.out.println("Ingrese sus apellidos");
        	apellidosUsuario = scanner.nextLine();
        	System.out.println("Cree su username ");
        	usernameUsuario  = scanner.nextLine();
        	System.out.println("Cree su contraseña ");
        	paswordUsuario = scanner.nextLine();
        	System.out.println("Usuario Creado con exito");
        	
        	
        }
       
        System.out.println("Bienvenido a la casa tipográfica santandereana " + userName );
        System.out.println("Ingrese 1: para ver las últimas fuentes tipográficas de la casa");
        System.out.println("Ingrese 2: para realizar una vizualización y modificación avanzada a una fuente tipográfica");
        System.out.println("Ingresa 3: para filtrar las fuentes tipográficas por diseñador.");

        respuestaMenu = scanner.nextInt();
        if (respuestaMenu == 1) {
        while(eleccionTipografia !=3){
                System.out.println("Estas son las últimas fuente tipográficas");
                System.out.println("Ingrese el número de cada una para ver a detalle ");
                System.out.println("[1].  Tipografía Atletico Bucaramanga");
                System.out.println("[2].  Tipografía Terrazas");
                System.out.println("[3].  Salir");

                eleccionTipografia = scanner.nextInt();

                switch (eleccionTipografia) {
                    case 1:


                        System.out.print("Tipografía Atletico Bucaramanga \n");

                        System.out.println("             _____                    _____          ");
                        System.out.println("            /\\    \\                  /\\    \\         ");
                        System.out.println("           /::\\    \\                /::\\    \\        ");
                        System.out.println("          /::::\\    \\              /::::\\    \\       ");
                        System.out.println("         /::::::\\    \\            /::::::\\    \\      ");
                        System.out.println("        /:::/\\:::\\    \\          /:::/\\:::\\    \\     ");
                        System.out.println("       /:::/__\\:::\\    \\        /:::/__\\:::\\    \\    ");
                        System.out.println("      /::::\\   \\:::\\    \\      /::::\\   \\:::\\    \\   ");
                        System.out.println("     /::::::\\   \\:::\\    \\    /::::::\\   \\:::\\    \\  ");
                        System.out.println("    /:::/\\:::\\   \\:::\\    \\  /:::/\\:::\\   \\:::\\ ___\\ ");
                        System.out.println("   /:::/  \\:::\\   \\:::\\____\\/:::/__\\:::\\   \\:::|    |");
                        System.out.println("   \\::/    \\:::\\  /:::/    /\\:::\\   \\:::\\  /:::|____|");
                        System.out.println("    \\/____/ \\:::\\/:::/    /  \\:::\\   \\:::\\/:::/    / ");
                        System.out.println("             \\::::::/    /    \\:::\\   \\::::::/    /  ");
                        System.out.println("              \\::::/    /      \\:::\\   \\::::/    /   ");
                        System.out.println("              /:::/    /        \\:::\\  /:::/    /    ");
                        System.out.println("             /:::/    /          \\:::\\/:::/    /     ");
                        System.out.println("            /:::/    /            \\::::::/    /      ");
                        System.out.println("           /:::/    /              \\::::/    /       ");
                        System.out.println("           \\::/    /                \\::/____/        ");
                        System.out.println("            \\/____/                  ~~              ");
                        System.out.println("".repeat(50));
                        System.out.println("¿Desea comprar esta fuente tipográfica AB ? \n" +
                                "Precio de la fuente tipográfica: " + precioTipografiaAB +
                                " ingrese: 1. para: si /2. para : no");
                        int respuestaCompraAB = scanner.nextInt();
                        switch (respuestaCompraAB) {
                            case 1:
                                System.out.println("Gracias por tu compra");
                                System.out.println("Ganacia del artista: " + totalRecibidoPorArtistaTipografiaAB);
                                System.out.println("Ganancia de la casa: " + totalRecibidoPorCasaPorTipografiaAB);
                                System.out.println(" Ahora puedes descargar tu Fuente Tipográfica");
                                System.out.println("*************************************************************");
                                System.out.println("");
                                break;

                            case 2:
                                System.out.println("Pago rechazado");
                                System.out.println("Contamos con más fuentes que te pueden gustar ");
                                System.out.println("*************************************************************");
                                System.out.println("");
                                break;

                            default:
                                System.out.println("Opción inválida");
                        }

                        break;

                    case 2:
                        System.out.print("Tipografía Terrazas \n");
                        System.out.println("░██████████░██████████ ░█████████  ░█████████     ░███    ░█████████    ░███      ░██████   ");
                        System.out.println("    ░██    ░██         ░██     ░██ ░██     ░██   ░██░██         ░██    ░██░██    ░██   ░██  ");
                        System.out.println("    ░██    ░██         ░██     ░██ ░██     ░██  ░██  ░██       ░██    ░██  ░██  ░██         ");
                        System.out.println("    ░██    ░█████████  ░█████████  ░█████████  ░█████████    ░███    ░█████████  ░████████  ");
                        System.out.println("    ░██    ░██         ░██   ░██   ░██   ░██   ░██    ░██   ░██      ░██    ░██         ░██ ");
                        System.out.println("    ░██    ░██         ░██    ░██  ░██    ░██  ░██    ░██  ░██       ░██    ░██  ░██   ░██  ");
                        System.out.println("    ░██    ░██████████ ░██     ░██ ░██     ░██ ░██    ░██ ░█████████ ░██    ░██   ░██████   ");
                        System.out.println("                                                                                             ");
                        System.out.println("                                                                                             ");
                        System.out.println("¿Desea comprar esta fuente tipográfica AB ? \n" +
                                "Precio de la fuente tipográfica: " + precioTipografiaTerrazas +
                                " ingrese: 1. para: si /2. para : no");
                        int respuestaCompratTerrazas = scanner.nextInt();
                        switch (respuestaCompratTerrazas) {
                            case 1:
                                System.out.println("Gracias por tu compra");
                                System.out.println("Ganacia del artista: " + totalRecibidoPorArtistaTipografiaTerrazas);
                                System.out.println("Ganancia de la casa: " + totalRecibidoPorCasaPorTipografiaTerrazas);
                                System.out.println(" Ahora puedes descargar tu Fuente Tipográfica");
                                System.out.println("*************************************************************");
                                System.out.println("");
                                break;
                            case 2:
                                System.out.println("Pago rechazado");
                                System.out.println("Contamos con más fuentes que te pueden gustar ");
                                System.out.println("*************************************************************");
                                System.out.println("");
                                break;
                        }

                        break;
                }
            }
        }else if(respuestaMenu == 2){
            System.out.println("Realizar modificaciones avanzadas ");
            while(respuesta_modificacion != 5){
                System.out.println("INGRESE 1 PARA: \n"
                        +" VISUALIZAR LA TIPOGRAFÍA EN PLANO PICADOINVERSO \n"+
                        "INGRESE 2 PARA: \n"+
                        " VISUALIZAR LA TIPOGRAFÍA EN PLANO PICADOINVERSO REFLEJADO \n"+
                        "INGRESE 3 PARA: \n"+
                        " VISUALIZAR LA TIPOGRAFÍA EN PLANO PICADO \n"+
                        "INGRESE 4 PARA: \n"+
                        " VISUALIZAR LA TIPOGRAFÍA EN PLANO PICADO REFLEJADO \n"+
                        "INGRESE 5 PARA: \n"+
                                " Para Salir \n"
                );
                 respuesta_modificacion = scanner.nextInt();

                switch (respuesta_modificacion) {
                    case 1:
                        System.out.println(" /$$   /$$        /$$$$$$        /$$              /$$$$$$ ");
                        System.out.println("| $$  | $$       /$$__  $$      | $$             /$$__  $$");
                        System.out.println("| $$  | $$      | $$  \\ $$      | $$            | $$  \\ $$");
                        System.out.println("| $$$$$$$$      | $$  | $$      | $$            | $$$$$$$$");
                        System.out.println("| $$__  $$      | $$  | $$      | $$            | $$__  $$");
                        System.out.println("| $$  | $$      | $$  | $$      | $$            | $$  | $$");
                        System.out.println("| $$  | $$      |  $$$$$$/      | $$$$$$$$      | $$  | $$");
                        System.out.println("|__/  |__/       \\______/       |________/      |__/  |__/");
                        System.out.println("                                                          ");
                        System.out.println("                                                          ");

                        break;
                    case 2:

                        System.out.println("$$\\   $$\\        $$$$$$\\        $$\\              $$$$$$\\  ");
                        System.out.println("$$ |  $$ |      $$  __$$\\       $$ |            $$  __$$\\ ");
                        System.out.println("$$ |  $$ |      $$ /  $$ |      $$ |            $$ /  $$ |");
                        System.out.println("$$$$$$$$ |      $$ |  $$ |      $$ |            $$$$$$$$ |");
                        System.out.println("$$  __$$ |      $$ |  $$ |      $$ |            $$  __$$ |");
                        System.out.println("$$ |  $$ |      $$ |  $$ |      $$ |            $$ |  $$ |");
                        System.out.println("$$ |  $$ |       $$$$$$  |      $$$$$$$$\\       $$ |  $$ |");
                        System.out.println("\\__|  \\__|       \\______/       \\________|      \\__|  \\__|");
                        System.out.println("                                                          ");
                        System.out.println("                                                          ");
                        break;
                    case 3:
                        System.out.println(" __    __         ______         __               ______  ");
                        System.out.println("|  \\  |  \\       /      \\       |  \\             /      \\ ");
                        System.out.println("| $$  | $$      |  $$$$$$\\      | $$            |  $$$$$$\\");
                        System.out.println("| $$__| $$      | $$  | $$      | $$            | $$__| $$");
                        System.out.println("| $$    $$      | $$  | $$      | $$            | $$    $$");
                        System.out.println("| $$$$$$$$      | $$  | $$      | $$            | $$$$$$$$");
                        System.out.println("| $$  | $$      | $$__/ $$      | $$_____       | $$  | $$");
                        System.out.println("| $$  | $$       \\$$    $$      | $$     \\      | $$  | $$");
                        System.out.println(" \\$$   \\$$        \\$$$$$$        \\$$$$$$$$       \\$$   \\$$");
                        System.out.println("                                                          ");
                        System.out.println("                                                          ");
                        break;
                    case 4:
                        System.out.println(" __    __         ______         __               ______  ");
                        System.out.println("/  |  /  |       /      \\       /  |             /      \\ ");
                        System.out.println("$$ |  $$ |      /$$$$$$  |      $$ |            /$$$$$$  |");
                        System.out.println("$$ |__$$ |      $$ |  $$ |      $$ |            $$ |__$$ |");
                        System.out.println("$$    $$ |      $$ |  $$ |      $$ |            $$    $$ |");
                        System.out.println("$$$$$$$$ |      $$ |  $$ |      $$ |            $$$$$$$$ |");
                        System.out.println("$$ |  $$ |      $$ \\__$$ |      $$ |_____       $$ |  $$ |");
                        System.out.println("$$ |  $$ |      $$    $$/       $$       |      $$ |  $$ |");
                        System.out.println("$$/   $$/        $$$$$$/        $$$$$$$$/       $$/   $$/");
                        System.out.println("                                                          ");
                        System.out.println("                                                          ");
                        break;

                }
            }
        }
        else if(respuestaMenu == 3){
        while( respuestaMenuDiseNadores != 4){
          System.out.println("Diseñadores de la casa: ");
           System.out.println ("INGRESE 1 PARA: \n"
                        +" Juan David Martínez Rojas \n"+
                        "INGRESE 2 PARA: \n"+
                        "Juan David Rojas Martínez  \n"+
                        "INGRESE 3 PARA: \n"+
                        " David Juan Rojas Martínez\n"+
                        "INGRESE 4 PARA: \n"+
                                " Para Salir \n"
                );
                 respuestaMenuDiseNadores = scanner.nextInt();

            switch(respuestaMenuDiseNadores){
                case 1 :
                    System.out.println("Tipografías de Juan David Martínez Rojas ");
                    for (int i = 0; i< disenadoresytipografias[0].length; i++){
                    System.out.println((i+1)+" "+disenadoresytipografias[0][i]);
                    }
                    System.out.println("Ingrese el número de la tipografía que desea vizualizar");
                    int case1Tipografias = scanner.nextInt();
                    if(case1Tipografias == 1){

System.out.println("      █████       ██████");
System.out.println("  ████████████    ██████");
System.out.println(" ██████████████");
System.out.println(" ██████  ██████   ██████  ███████████   ███████████    ██████ ███████     ████████████    ████████████     ████████████");
System.out.println("███████  ██████   ██████  ███████████  █████████████   ███████████████   ██████████████  ██████████████   ██████████████");
System.out.println("███████  ███████  ██████  ███████     ██████   ██████  ███████  ██████  ███████  ██████  ██████  ███████ ███████  ██████");
System.out.println("███████           ██████  ███████     ██████   ██████  ██████   ██████  ███████  ██████  ███████ ███████  ██████  ██████");
System.out.println("███████ ███████   ██████  ███████     ██████   ██████  ██████   ██████  ███████  ██████  ██████████             ████████");
System.out.println("███████ ███████   ██████  ███████     ██████   ██████  ██████   ██████  ███████████████    ██████████       ████████████");
System.out.println("███████  ██████   ██████  ███████     ██████   ██████  ██████   ██████  ███████              ██████████   ██████  ██████");
System.out.println("███████  ██████   ██████  ███████     ██████   ██████  ██████   ██████  ███████  ██████         ████████ ███████  ██████");
System.out.println("███████  ██████   ██████  ███████     ██████   ██████  ██████   ██████  ███████  ██████  ██████  ███████ ███████  ██████");
System.out.println(" ██████  ██████   ██████  ███████     ██████   ██████  ██████   ██████  ███████  ██████  ██████  ███████ ███████  ██████");
System.out.println(" ██████████████   ██████  ███████     ██████████████   ██████   ██████   ██████████████  ██████████████  ███████████████");
System.out.println("   ████████████   ██████  ███████       ███████████    ██████   ██████    ████████████    ████████████    ██████████████");
                    }
                  do{System.out.println("................................................................................................");
                    System.out.println("................................................................................................");
                    System.out.println("Realizar modificaciones a la textura de la fuente");
                     System.out.println ("INGRESE 1 PARA: \n"
                        +" Para añadir una textura de estrellas ******\n"+
                        "INGRESE 2 PARA: \n"+
                        "Para añadir una textura de estrellas de slash´s  /////\n"+
                        "INGRESE 3 PARA: \n"+
                        "Para añadir una textura de estrellas de Puntos ......\n"+
                         "INGRESE 4 PARA: \n"+
                                " Comprar la fuente tipográfica Girónesa \n"+
                        "INGRESE 5 PARA: \n"+
                                " Para Salir \n");
                edicionTipografia1 = scanner.nextInt();
                

                   
                    if(edicionTipografia1 == 1 ){

System.out.println("       *****       ******                 ********");
System.out.println("  ************    ******                  ********");
System.out.println(" **************");
System.out.println(" ******  ******   ******  ***********   ***********    ****** *******     ************    ************     ************");
System.out.println("*******  ******   ******  ***********  *************   ***************   **************  **************   **************");
System.out.println("*******  *******  ******  *******     ******   ******  *******  ******  *******  ******  ******  ******* *******  ******");
System.out.println("*******           ******  *******     ******   ******  ******   ******  *******  ******  ******* *******  ******  ******");
System.out.println("******* *******   ******  *******     ******   ******  ******   ******  *******  ******  **********             ********");
System.out.println("******* *******   ******  *******     ******   ******  ******   ******  ***************    **********       ************");
System.out.println("*******  ******   ******  *******     ******   ******  ******   ******  *******              **********   ******  ******");
System.out.println("*******  ******   ******  *******     ******   ******  ******   ******  *******  ******         ******** *******  ******");
System.out.println("*******  ******   ******  *******     ******   ******  ******   ******  *******  ******  ******  ******* *******  ******");
System.out.println(" ******  ******   ******  *******     ******   ******  ******   ******  *******  ******  ******  ******* *******  ******");
System.out.println(" **************   ******  *******     **************   ******   ******   **************  **************  ***************");
System.out.println("   ************   ******  *******       ***********    ******   ******    ************    ************    **************");

                     } else if(edicionTipografia1 == 2){

System.out.println("       /////       //////                  ////////");
System.out.println("  ////////////    //////                  ////////");
System.out.println(" //////////////");
System.out.println(" //////  //////   //////  ///////////   ///////////    ////// ///////     ////////////    ////////////     ////////////");
System.out.println("///////  //////   //////  ///////////  /////////////   ///////////////   //////////////  //////////////   //////////////");
System.out.println("///////  ///////  //////  ///////     //////   //////  ///////  //////  ///////  //////  //////  /////// ///////  //////");
System.out.println("///////           //////  ///////     //////   //////  //////   //////  ///////  //////  /////// ///////  //////  //////");
System.out.println("/////// ///////   //////  ///////     //////   //////  //////   //////  ///////  //////  //////////             ////////");
System.out.println("/////// ///////   //////  ///////     //////   //////  //////   //////  ///////////////    //////////       ////////////");
System.out.println("///////  //////   //////  ///////     //////   //////  //////   //////  ///////              //////////   //////  //////");
System.out.println("///////  //////   //////  ///////     //////   //////  //////   //////  ///////  //////         //////// ///////  //////");
System.out.println("///////  //////   //////  ///////     //////   //////  //////   //////  ///////  //////  //////  /////// ///////  //////");
System.out.println(" //////  //////   //////  ///////     //////   //////  //////   //////  ///////  //////  //////  /////// ///////  //////");
System.out.println(" //////////////   //////  ///////     //////////////   //////   //////   //////////////  //////////////  ///////////////");
System.out.println("   ////////////   //////  ///////       ///////////    //////   //////    ////////////    ////////////    //////////////");

                     } else if(edicionTipografia1 == 3){
System.out.println("       .....       ......                 .........");
System.out.println("  ............    ......                 ........");
System.out.println(" ..............");
System.out.println(" ......  ......   ......  ...........   ...........    ...... .......     ............    ............     ............");
System.out.println(".......  ......   ......  ...........  .............   ...............   ..............  ..............   ..............");
System.out.println(".......  .......  ......  .......     ......   ......  .......  ......  .......  ......  ......  ....... .......  ......");
System.out.println(".......           ......  .......     ......   ......  ......   ......  .......  ......  ....... .......  ......  ......");
System.out.println("....... .......   ......  .......     ......   ......  ......   ......  .......  ......  ..........             ........");
System.out.println("....... .......   ......  .......     ......   ......  ......   ......  ...............    ..........       ............");
System.out.println(".......  ......   ......  .......     ......   ......  ......   ......  .......              ..........   ......  ......");
System.out.println(".......  ......   ......  .......     ......   ......  ......   ......  .......  ......         ........ .......  ......");
System.out.println(".......  ......   ......  .......     ......   ......  ......   ......  .......  ......  ......  ....... .......  ......");
System.out.println(" ......  ......   ......  .......     ......   ......  ......   ......  .......  ......  ......  ....... .......  ......");
System.out.println(" ..............   ......  .......     ..............   ......   ......   ..............  ..............  ...............");
System.out.println("   ............   ......  .......       ...........    ......   ......    ............    ............    ..............");
                     } else if (edicionTipografia1 == 4){
                System.out.println("¿Desea comprar esta fuente tipográfica AB ? \n" +
                                "Precio de la fuente tipográfica: " + precioTipografiaGironesa +
                                " ingrese: 1. para: si /2. para : no");
                        int respuestaCompraGironesa = scanner.nextInt();
                                System.out.println("Gracias por tu compra");
                                System.out.println("Ganacia del artista: " + totalRecibidoPorArtistaTipografiaTerrazas);
                                System.out.println("Ganancia de la casa: " + totalRecibidoPorCasaPorTipografiaTerrazas);
                                System.out.println(" Ahora puedes descargar tu Fuente Tipográfica");
                                System.out.println("*************************************************************");
                                System.out.println("");
                                break;
        }
                     else{
                        System.out.println("Regresando....");
                     }
                    }while(edicionTipografia1 != 5);
                     break;
                    
                case 2 :
                    System.out.println("Tipografías de Juan David Rojas Martínez");
                    for (int i = 0; i < disenadoresytipografias[1].length; i++){
                        System.out.println((i+1)+" "+disenadoresytipografias[1][i]);
                    }break;
                case 3 :
                    System.out.println("Tipografías de David Juan Rojas Martínez");
                for (int i = 0 ; i<disenadoresytipografias[2].length; i++){
                System.out.println((i+1)+" "+ disenadoresytipografias[2][i]);
                
            } break;
            }
        }
    }
        
    }
    }