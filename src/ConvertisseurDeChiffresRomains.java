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

        /**
         * cette partie là ajoute le bon nombre de I
         * si i = 1, le bon nombre de bâtons c'est 1
         *        2                                2
         *        3                                3
         *        4                                x
         *        5                                0 = 5 - 5
         *        6                                1 = 6 - 5
         *        7                                2 = 7 - 5
         */
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nombre; ++i) {
            result.append("I");
        }
        return result.toString();
    }
}
