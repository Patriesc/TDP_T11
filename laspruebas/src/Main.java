import complex_library.ClaseCadena;

public class Main {
    public static void main(String[] args) {


        ConversionFacade converter = new ConversionFacade();
        String iniciales = converter.convertIniciales("Andreas Dulac", "String");


        System.out.println("Las iniciales son: " + iniciales);
    }
}
