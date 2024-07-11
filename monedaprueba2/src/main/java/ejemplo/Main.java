package ejemplo;

import model.Pelicula;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;


import servicio.ConsultaPelicula;
//import util.GeneradorDeArchivo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        Scanner lectura = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();

        System.out.println("TITUTLO : aplicacion CAMBIO DE MONEDAS ");

        try {

            Pelicula pelicula = consulta.buscaPelicula();
          //  System.out.println(pelicula);


            while (true) {
                System.out.println("Menu:");
                System.out.println("1. dolares americanos a pesos argentinos");
                System.out.println("2. pesos argentinos a dolares americanos");
                System.out.println("3.dolar americano a  real de brazil");
                System.out.println("4. real de brazil a  dolares americanos ");
                System.out.println("5.dolar americano a peso colombiano");
                System.out.println("6. peso colombiano a dolar americano");
                System.out.println("7. dolar americano a  peso mexicano");
                System.out.println("8. peso mexicano a dolar amercano");

                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");

                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("seleccione un  numero entre  0 and 8.");
                    continue;
                }
                double usnum=0;
                double Total=0;
                double Us_Ex=0;

                switch (choice) {
                    case 1:
                        System.out.println(" dolares americanos a pesos argentinos");
                        System.out.println(" introduce el numero de dolares:");
                         usnum=0;
                         usnum = Integer.parseInt(scanner.nextLine());
                        Us_Ex=Double.parseDouble(pelicula.getARS());
                        Total=0;
                        Total=usnum*Us_Ex;
                        BigDecimal Tbd=new BigDecimal(Total).setScale(2,RoundingMode.HALF_UP);
                        System.out.println(usnum+" dolar(es) es igual a  "+Tbd+"  " +
                                "peso(s) argentinos");
                        System.out.println("presiona enter para continuar...");
                        scanner.nextLine();

                        break;
                    case 2:

                        System.out.println(" pesos argentinos a dolares");
                        System.out.println(" introduce el numero de pesos argentinos dolares:");
                        usnum=0;
                        usnum = Integer.parseInt(scanner.nextLine());
                        Us_Ex=Double.parseDouble(pelicula.getARS());
                        Total=0;
                        Total=usnum/Us_Ex;
                         Tbd=new BigDecimal(Total).setScale(2,RoundingMode.HALF_UP);
                        System.out.println(usnum+ "peso(s) argentinos  es igual a  "+Tbd+
                                " dolar(es) ");
                        System.out.println("presiona enter para continuar...");
                        scanner.nextLine();

                        break;
                    case 3:
                        System.out.println(" dolares americanos a  real  de brazil");
                        System.out.println(" introduce el numero de dolares:");
                        usnum=0;
                        usnum = Integer.parseInt(scanner.nextLine());
                        Us_Ex=Double.parseDouble(pelicula.getBRL());
                        Total=0;
                        Total=usnum*Us_Ex;
                        Tbd=new BigDecimal(Total).setScale(2,RoundingMode.HALF_UP);
                        System.out.println(usnum+" dolar(es) es igual a  "+Tbd+"  " +
                                "real(es) de brasil");
                        System.out.println("presiona enter para continuar...");
                        scanner.nextLine();
                    case 4:
                        System.out.println("****** real(es)  de brazil a dolares americanos***** ");
                        System.out.println(" introduce el numero de real(es)  de brazil :");
                        usnum=0;
                        usnum = Integer.parseInt(scanner.nextLine());
                        Us_Ex=Double.parseDouble(pelicula.getBRL());
                        Total=0;
                        Total=usnum/Us_Ex;
                        Tbd=new BigDecimal(Total).setScale(2,RoundingMode.HALF_UP);
                        System.out.println(usnum+" real(es) es igual a  "+Tbd+"  " +
                                "dolares americanos");
                        System.out.println("presiona enter para continuar...");
                        scanner.nextLine();
                        break;
                    case 5:
                        System.out.println(" dolares americanos a peso(s) colombiano(s)");
                        System.out.println(" introduce el numero de dolares:");
                        usnum=0;
                        usnum = Integer.parseInt(scanner.nextLine());
                        Us_Ex=Double.parseDouble(pelicula.getCOP());
                        Total=0;
                        Total=usnum*Us_Ex;
                        Tbd=new BigDecimal(Total).setScale(2,RoundingMode.HALF_UP);
                        System.out.println(usnum+" dolar(es) es igual a  "+Tbd+"  " +
                                "peso(s) colombiano(s)");
                        System.out.println("presiona enter para continuar...");
                        scanner.nextLine();
                    case 6:
                        System.out.println("****** peso(s) colombiano(s) a dolares americanos***** ");
                        System.out.println(" introduce el numero  peso(s) colombiano(s) :");
                        usnum=0;
                        usnum = Integer.parseInt(scanner.nextLine());
                        Us_Ex=Double.parseDouble(pelicula.getCOP());
                        Total=0;
                        Total=usnum/Us_Ex;
                        Tbd=new BigDecimal(Total).setScale(2,RoundingMode.HALF_UP);
                        System.out.println(usnum+" peso(s) colombiano(s) es igual a  "+Tbd+"  " +
                                "dolares americanos");
                        System.out.println("presiona enter para continuar...");
                        scanner.nextLine();
                        break;
                    case 7:
                        System.out.println(" dolares americanos a peso(s) mexicano(s)");
                        System.out.println(" introduce el numero de dolares:");
                        usnum=0;
                        usnum = Integer.parseInt(scanner.nextLine());
                        Us_Ex=Double.parseDouble(pelicula.getMXN());
                        Total=0;
                        Total=usnum*Us_Ex;
                        Tbd=new BigDecimal(Total).setScale(2,RoundingMode.HALF_UP);
                        System.out.println(usnum+" dolar(es) es igual a  "+Tbd+"  " +
                                "peso(s) mexicano(s)");
                        System.out.println("presiona enter para continuar...");
                        scanner.nextLine();
                        break;
                    case 8:
                        System.out.println("****** peso(s) mexicanos(s) a dolares americanos***** ");
                        System.out.println(" introduce el numero de peso(s) mexicano(s) :");
                        usnum=0;
                        usnum = Integer.parseInt(scanner.nextLine());
                        Us_Ex=Double.parseDouble(pelicula.getMXN());
                        Total=0;
                        Total=usnum/Us_Ex;
                        Tbd=new BigDecimal(Total).setScale(2,RoundingMode.HALF_UP);
                        System.out.println(usnum+" peso(s) mexicano(s) es igual a  "+Tbd+"  " +
                                "dolares americanos");
                        System.out.println("presiona enter para continuar...");
                        scanner.nextLine();
                        break;

                    case 0:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 0 and 10.");
                        break;
                }
            }





        } catch (IOException e) {
           // System.out.println("Error al consultar o guardar el archivo JSON: " + e.getMessage());
        }



    }
}