public class MyTableOfStrings_Test {

    public static void main(String[] s) {
        //creer un tableau
        String [] data = {"one", "two", "three"};
        //creer une table de chaine de caractere avec des donnees
        MyTableOfStrings t = new MyTableOfStrings(data);

        System.out.println("Affichage des valeurs dans l'ordre par defaut");

        // parcours du tableau et affichage de chaque valeur
        for (String value : data) {
            System.out.println(" "+value);
        }

        System.out.println("\nAffichage des valeurs dans l'ordre inverse");

        // parcours du tableau et affichage de chaque valeur
        for (String value : t) {
            System.out.println(" "+value);
        }
    }
}