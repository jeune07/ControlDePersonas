import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunnit {
    @Test
    public void casoUno(){
        // Given Dado
        Persona juan= new Persona("jeune",18);
        Persona Pedro= new Persona("Pedro",17);
        Persona Ana= new Persona("Ana",22);
        Persona Juli= new Persona("Juli",32);
        Persona Juli2= new Persona("Juli2",40);

        Group groupo1 =new Group();

        // When cuando
        groupo1.agregarPersona(juan);
        groupo1.agregarPersona(Pedro);
        groupo1.agregarPersona(Ana);
        groupo1.agregarPersona(Juli);

        //Then Entonces
       Assertions.assertFalse(groupo1.getPersonas().size()==2);
    }
}
