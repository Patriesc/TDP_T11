import complex_library.ClaseCadena;

public class ConversionFacade {
    public String convertIniciales(String nombre, String format){
        String iniciales = "";
        System.out.println("Conversion started");
        if(format.equals("String")){
            ClaseCadena claseCadena = new ClaseCadena();

             iniciales = claseCadena.devuelveIniciales(nombre);
        }
        return iniciales;
    }
}
