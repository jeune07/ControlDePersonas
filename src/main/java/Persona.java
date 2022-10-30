public class Persona {
        private String nombre;
        private Integer edad;

        public Persona(String nombre, Integer edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Integer getEdad() {
            return edad;
        }

        public void setEdad(Integer edad) {
            this.edad = edad;
        }

        public boolean esMayorEdad(){
            return edad>=18;
        }

        public boolean checkNombre4Lettras(){
            return nombre.length()>4;
        }

    public boolean checkEdad() {
       boolean resultado=false;
       // proceso
        if (edad>= 0 && edad<= 120){
            resultado=true;
        }return false;
    }
    public boolean checkLetraAZ(){
            boolean resultado=false;
            char [] nombreAChars= nombre.toCharArray();
        for (char letra:nombreAChars) {
            if(!Character.isLetter(letra)){
                return resultado;
            }

        }resultado=false;
        return resultado;
    }

}
