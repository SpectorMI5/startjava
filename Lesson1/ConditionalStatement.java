public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 25;
        if (age > 20) {
            System.out.println("Vozrast bol'she 20 let");
        }

        boolean male = true;
        if (male) {
            System.out.println("Muzhskogo pola");
        }
        if (!male) {
            System.out.println("Zhenskogo pola");
        }

        float growth = 1.83F;
        if (growth < 1.8) {
            System.out.println("Nizkiy");
        } else {
            System.out.println("Visokiy");
        }

        char firstLetterName = 'E';
        if (firstLetterName == 'M') {
            System.out.println("Imya nachinaetsa ne s bukvi M");
        } else if (firstLetterName == 'I') {
            System.out.println("Imya nachinaetsa ne s bukvi I");
        } else {
            System.out.println("Imya nachinaetsa s drugoy bukvi");
        }
    }
}