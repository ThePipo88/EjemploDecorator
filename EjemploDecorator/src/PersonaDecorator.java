
public abstract class PersonaDecorator implements Persona{

    private Persona persona;

    public PersonaDecorator(Persona persona){
        this.persona = persona;
    }

    protected Persona getPersona(){
        return persona;
    }
}


