public class ClaseCadena implements Convert{


    public String devuelveIniciales(String cadena) {
        String resultado = "";


        try {
            String[] cadenaSeparada = cadena.split(" ");

            for (String item : cadenaSeparada
            ) {
                char[] array = item.toCharArray();
                resultado += "" + array[0] + ".";
            }
        }catch (ArrayIndexOutOfBoundsException ignored) {
        }
        return resultado;
    }
}
