

public class AgregarAbrigo extends PersonaDecorator{

    public AgregarAbrigo(Persona persona) {
        super(persona);
    }

    @Override
    public void vestir() {
        getPersona().vestir();
        System.out.println("Agregando abrigo a persona");
    }
}



