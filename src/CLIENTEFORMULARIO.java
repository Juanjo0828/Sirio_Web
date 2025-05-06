import java.util.Scanner;

public class CLIENTEFORMULARIO {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("REGISTRO CLIENTE NUEVO:");

        System.out.println("Nombre del cliente:");

        String NombreCliente = sc.nextLine();

        if (NombreCliente.isEmpty()) {

            System.out.println("El nombre del cliente no puede estar vacio.");
        }

        System.out.println("NIT:");

        String Nit = sc.nextLine();

        System.out.println("Email:");

        String Email = sc.nextLine();

        if (!Email.contains("@")) {

            System.out.println("El email no es valido.");

            return;

        }

        System.out.println("Numero de contacto 1:");

        String Numero1 = sc.nextLine();

        System.out.println("Numero de contacto 2:");

        String Numero2 = sc.nextLine();

        System.out.println("Nombre de contacto 1:");

        String Nombre1 = sc.nextLine();

        System.out.println("Nombre de contacto 2:");

        String Nombre2 = sc.nextLine();

        System.out.println("Direccion:");

        String Direccion = sc.nextLine();

        System.out.println("Ingrese la hora de atencion (Formato 24h).");

        System.out.println("Horario de atencion 6:00 AM - 4:00 PM");

        int Horario = sc.nextInt();

        if (Horario >= 6 && Horario <= 16) {

            System.out.println("Horario valido.");
        } else {

            System.out.println("Horario de atencion fuera del rango permitido.");
        }

        System.out.println("Nombre del Representante Legal:");

        String Representante = sc.nextLine();

        System.out.println("Tipo de persona (natural o juridica):");

        String TipoPersona = sc.nextLine();

        String DescripcionTipo = "";

        switch (TipoPersona) {
            case "Natural":

                DescripcionTipo = "Persona Natural - Identificación individual";

                break;

            case "Juridica":

                DescripcionTipo = "Persona Jurídica - Empresa u organización legalmente constituida";

                break;

            default:

                System.out.println("Tipo de persona invalido. debe ser Natural o Juridico.");

                return;
        }

        System.out.println("INFORMACION INGRESADA:");

        System.out.println("Nombre del cliente:" + NombreCliente);
        System.out.println("NIT:" + Nit);
        System.out.println("Email:" + Email);
        System.out.println("Numero de contacto 1:" + Numero1);
        System.out.println("Numero de contacto 2:" + Numero2);
        System.out.println("Nombre de contacto 1:" + Nombre1);
        System.out.println("Nombre de contacto 2:" + Nombre2);
        System.out.println("Dirección:" + Direccion);
        System.out.println("Horario de Atención:" + Horario);
        System.out.println("Representante Legal:" + Representante);
        System.out.println("Tipo de Persona:" + TipoPersona + " - " + DescripcionTipo);

        sc.close();

    }
}
