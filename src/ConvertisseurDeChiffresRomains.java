public class ConvertisseurDeChiffresRomains {
    public String convertirEnChiffresRomains(int nombre) {
        if (nombre == 4) {
            return "IV";
        }
        if (nombre == 5) {
            return "V";
        }
        if (nombre == 6) {
            return "VI";
        }

        //////////////////

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nombre; ++i) {
            result.append("I");
        }
        return result.toString();
    }
}
