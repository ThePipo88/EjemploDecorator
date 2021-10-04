public class RopaNormal implements Persona {

    private String prendaVestir;

    public RopaNormal(String pv){
        prendaVestir = pv;
    }

    @Override
    public void vestir() {
      System.out.println("Persona caminando con su "+prendaVestir);
    }
}

