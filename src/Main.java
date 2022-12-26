public class Main {
    public static void main(String[] args) {

        Secciones("Primero");

        int nunmeroif=10;
        if (nunmeroif>0){
            System.out.println("El número es positivo");
        }
        else if(nunmeroif<0){
            System.out.println("El número es negativo");
        }
        else{
            System.out.println("El número es 0");
        }

        Secciones("Segundo");

        int numerowhile=0;
        while (numerowhile<3){
            System.out.println("El valor del número es "+numerowhile);
            numerowhile++;
        }

        Secciones("Tercer");

        int numerodowhile=3;
        do{
            System.out.println("El valor del número es "+numerodowhile);
            numerodowhile++;
        }while (numerodowhile<3);

        Secciones("Cuarto");


        for(int i=0; i<=0; i++){
            System.out.println("El valor del número es"+i);
        }

        Secciones("Quinto");

        String estacion = "Primavera";

        switch (estacion){
            case "Otroño":
                System.out.println(estacion);
                break;
            case "Verano":
                System.out.println(estacion);
                break;
            case "Invierno":
                System.out.println(estacion);
                break;
            case "Primavera":
                System.out.println(estacion);
                break;
            default:
                System.out.println("No es una estacion");
        }


    }
    public static void Secciones (String seccion) {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("//////////////////////////");
        System.out.println(seccion+" ejercicio");
        System.out.println("//////////////////////////");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
    }
}