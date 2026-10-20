public class Cliente {
    private String nombre;
    private String correo;
    private int edad;
    private double saldo;

    //Setters

    public void setNombre(String nombre) {
        if(nombre!=null && !nombre.isBlank()){
            this.nombre = nombre;
        }
    }

    public void setCorreo(String correo) {
        if(correo!=null && !correo.isBlank()){
            this.correo = correo;
        }
    }

    public void setEdad(int edad) {
        if (edad>=0){
            this.edad = edad;
        }
    }

    public void setSaldo(double saldo) {
        if (saldo>=0){
            this.saldo = saldo;
        }
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " +getNombre()+ "\nCorreo: " +getCorreo()+ "\nEdad: " +getEdad()+ "\nSaldo: " +getSaldo());
    }
}