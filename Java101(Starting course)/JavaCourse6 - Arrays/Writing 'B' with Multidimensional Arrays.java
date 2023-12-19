public class JavaKurs {
    public static void main(String[] args) {

        String[][] matris = new String[5][6];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {

                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        matris[i][j] = "*";
                    } else {
                        matris[i][j] = " ";
                    }
                } else {
                    if (j == 0 || j == 5) {
                        matris[i][j] = "*";
                    } else {
                        matris[i][j] = " ";
                    }
                }
            }
        }
        for (String[] x: matris){
            for (String y: x){
                System.out.print(y);
            }
            System.out.println();
        }
    }
}