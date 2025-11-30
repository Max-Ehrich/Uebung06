package h3;

public class H3_main {
    public static void main(String[] args) {
        System.out.println(compareArraysVal(new int[] {4,3,4}, new int[] {4,4,3}));

    }
    public static boolean compareArraysVal(int[] a, int[] b) {

         //Länge unterschiedlich → unmöglich gleiche Häufigkeiten
        if (a.length != b.length) {
            return false;
        }

        // Für jedes Element in a prüfen, ob es in b gleich oft vorkommt
        for (int i = 0; i < a.length; i++) {
            int value = a[i];
            int countA = 0;
            int countB = 0;

            // Zähle Vorkommen in a
            for (int x = 0; x < a.length; x++) {
                if (a[x] == value) {
                    countA++;
                }
            }

            // Zähle Vorkommen in b
            for (int y = 0; y < b.length; y++) {
                if (b[y] == value) {
                    countB++;
                }
            }

            // Wenn Häufigkeit unterschiedlich: Arrays sind nicht gleich
            if (countA != countB) {
                return false;
            }
        }

        return true; // Alle Werte kommen gleich oft vor
    }

}
