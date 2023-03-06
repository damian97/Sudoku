public class Board {

    int[][] number = new int[9][9];


    public void makeBoard() {

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {

            }
        }

    }


    public void showBoard() {

        int locationNumberX = 0;
        int locationNumberY = 0;

        for (int i = 0; i < number.length+3; i++) {
            for (int j = 0; j < number.length; j++) {
                if (i == number.length) {
                    System.out.print("");
                } else if (i == number.length+1){
                    System.out.print("^ ");
                } else if (i == number.length+2){
                    System.out.print(locationNumberY++ + " ");
                } else {
                    System.out.print(number[i][j] + " ");
                    if (j == number.length - 1) {
                        System.out.print("  < " + locationNumberX++);
                    }
                }
            }
            System.out.println();
        }

    }


}
