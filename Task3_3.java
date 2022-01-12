import java.util.Scanner;

class Task3_3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[][] devMap = new String[10][10]; 
        for (int i = 0; i < devMap.length; i++) {
            for (int j = 0; j < devMap[i].length; j++) {
                devMap[i][j] = "_ ";
            }
        } 
        
        int x = 0;
        int y = 0;
        devMap[y][x] = "Z "; 
        for (int i = 0; i < devMap.length; i++) {
            for (int j = 0; j < devMap[i].length; j++) {
                System.out.print(devMap[i][j]);
            }
            System.out.println();
        }
        
        boolean isExit = false;
        while (isExit == false) {              
            System.out.println ("Enter Char");
            String strInput = scanner.next();
            
            switch (strInput.toLowerCase()) { //всю строку в нижний регистр
                case "q": {
                    isExit = true;
                    break;
                }
                case "s": {
                    if (y < 10) {
                    devMap[y][x] = "_ ";
                    y++;
                    devMap[y][x] = "Z ";
                    } else {
                        System.out.println("Going out of the map");
                    }
                    break;                   
                }
                case "a": {
                   if (x >= 0) {
                    devMap[y][x] = "_ ";
                    x--;
                    devMap[y][x] = "Z ";
                    } else {
                        System.out.println("Going out of the map");
                    }
                    break;   
                }
                case "d": {
                    if (x < 10) {
                    devMap[y][x] = "_ ";
                    x++;
                    devMap[y][x] = "Z ";
                    } else {
                        System.out.println("Going out of the map");
                    }
                    break;                     
                }
                case "w": {
                    if (y >= 0) {
                    devMap[y][x] = "_ ";
                    y--;
                    devMap[y][x] = "Z ";
                    } else {
                        System.out.println("Going out of the map");
                    }
                    break;    
                }
                default:
                    System.out.println("Incorrect move!");
            }
            for (int i = 0; i < devMap.length; i++) {
                for (int j = 0; j < devMap[i].length; j++) {
                    System.out.print(devMap[i][j]);
                }
                System.out.println();
            }   
        }
    }
}                    