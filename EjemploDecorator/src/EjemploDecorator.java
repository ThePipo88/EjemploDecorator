

public class EjemploDecorator {

    public static void main(String[] args) {
        Persona persona = new RopaNormal("ropa normal");
        persona = new AgregarBufanda(persona);
        persona = new AgregarAbrigo(persona);
        persona.vestir();
    }
}



