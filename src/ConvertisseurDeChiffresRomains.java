public class ConvertisseurDeChiffresRomains {
    public String convertirEnChiffresRomains(int nombre) {
        if (nombre == 4) {
            return "IV";
        }
        if (nombre == 9) {
            return "IX";
        }

        StringBuilder result = new StringBuilder();
        if (nombre >= 5) {
            result.append("V");
            nombre = nombre - 5;
        }

        ajouteLesBatonsÀDroite(nombre, result);
        return result.toString();
    }

    private void ajouteLesBatonsÀDroite(int nombre, StringBuilder result) {
        for (int i = 0; i < nombre; ++i) {
            result.append("I");
        }
    }
}
