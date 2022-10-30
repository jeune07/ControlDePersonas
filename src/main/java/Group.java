import java.util.ArrayList;
import java.util.List;

public class Group {
private List<Persona> personas;

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public Group(){
        personas =new ArrayList<>();

    }
    public void agregarPersona(Persona p){
        boolean cheakMayor=p.esMayorEdad();
        boolean checkNombre= p.checkNombre4Lettras();
        boolean checcksoleooLetra=p.checkLetraAZ();
        boolean cheakEdad=p.checkEdad();

        if(cheakMayor && checkNombre && checcksoleooLetra && cheakEdad){
            personas.add(p);
            System.out.println("se agrego la persona"+ p.getNombre());
        }

    }

}
