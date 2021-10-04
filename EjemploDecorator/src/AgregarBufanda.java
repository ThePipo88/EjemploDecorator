
public class AgregarBufanda extends PersonaDecorator{

    public AgregarBufanda(Persona persona) {
        super(persona);
    }

    @Override
    public void vestir() {
        getPersona().vestir();
        System.out.println("Agregando bufanda a persona");
    }
}




