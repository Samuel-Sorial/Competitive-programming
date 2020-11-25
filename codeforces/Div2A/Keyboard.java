import java.util.Scanner;

public class Keyboard {

    public static void main(String[] args){

        String row1 = "qwertyuiop[]\\";
        String row2 = "asdfghjkl;'";
        String row3 = "zxcvbnm,./";
        int direction = 0;
        Scanner in = new Scanner(System.in);
        if(in.nextLine().equals("R")){
            direction = -1;
        }else{
            direction = 1;
        }
        String shiftedMessage = in.nextLine();
        for(int s : shiftedMessage.toCharArray()){
            String row = findRow(s, row1, row2, row3);
            System.out.print(row.charAt(row.indexOf(s) + direction));
        }
    }

    private static String findRow(int s, String row1, String row2, String row3) {
        if(row1.indexOf(s) != -1){
            return row1;
        }else if(row2.indexOf(s) != -1){
            return row2;
        }else{
            return row3;
        }
    }
}
