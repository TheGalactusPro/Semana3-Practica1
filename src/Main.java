public class Main {
    static void main() {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();

        c1.setNombre("Sebastián");
        c1.setCorreo("almagro.sebas@gmail.com");
        c1.setEdad(-5);
        c1.setSaldo(100);

        c2.setNombre("Luis");
        c2.setCorreo("almagro.sebas@hotmail.com");
        c2.setEdad(54);
        c2.setSaldo(-100);

        System.out.println("Cliente 1");
        c1.mostrarInformacion();

        System.out.println("\nCliente 2");
        c2.mostrarInformacion();
    }
}
