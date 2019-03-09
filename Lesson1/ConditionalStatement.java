public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 25;
                if (age > 20) {
            System.out.println("Vozrast bol'she 20 let");
        }

        boolean muzhskogoPola = true;
        if (muzhskogoPola == true) {
            System.out.println("Muzhskogo pola");
        }
        if (muzhskogoPola == false) {
            System.out.println("Zhenskogo pola");
        }

        float rost = 1.83F;
        if (rost < 1.8) {
            System.out.println("Nizkiy");
        } else {
            System.out.println("Visokiy");
        }

        char pervayaBukvaImeni = 'E';
        if (pervayaBukvaImeni == 'M') {
            System.out.println("Imya nachinaetsa ne s bukvi M");
        } else if (pervayaBukvaImeni == 'I') {
            System.out.println("Imya nachinaetsa ne s bukvi I");
        } else {
            System.out.println("Imya nachinaetsa s drugoy bukvi");
        }
    }
}