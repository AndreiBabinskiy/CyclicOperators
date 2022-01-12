import java.util.Scanner;

class Task3_2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("Enter amount of Input");
        if (scanner.hasNextInt()) {
            int userValue = scanner.nextInt();
            if (userValue == 0) {
               System.out.println("You can’t enter 0 as a first digit");            
            }
            Integer[] userInputArray = new Integer [userValue]; 
            int amount = 0;
            while (amount < userValue) {              
                System.out.println ("Enter value");
                String strInput = scanner.next();                
                if (strInput.equals("q") && amount >=2) {
                   break;
                } 
                int value = 0;
                try {
                    value = Integer.parseInt(strInput);                       
                } catch (Exception e){ 
                    System.out.println("You enterred incorrect INT Value: " + strInput + "Be carefull in future");
                    continue;
                }
                    if (value < 10 && value >= 0) { 
                        boolean correctInput = true;
                        for (Integer userInput : userInputArray) {
                            if(userInput != null && value == userInput) {
                                System.out.println("Duplicate input for - " + value);
                                correctInput = false;
                                break;
                            }
                        }
                        if (correctInput == true) {
                            userInputArray[amount] = value;                       
                            amount++;
                        }                                                    
                    } else {
                        System.out.println("You can input only digits from 0 to 9!");
                    }
            } 
            for (Integer i = 0; i < userInputArray.length; i++) {
                for(Integer j = 0; j < userInputArray.length; j++) {
                    if(userInputArray[i] < userInputArray[j]) {
                        Integer temp = userInputArray[i];
                        userInputArray[i] = userInputArray[j];
                        userInputArray[j] = temp;
                    }
                }
            }
            
            for (Integer element : userInputArray) {
                System.out.print(element + ", ");
            } 
            Integer max = 0;
            for(Integer a = userInputArray.length-1; a > 0; a--) {
                if (userInputArray[a] % 2 == 0) {
                    max = userInputArray[a];                   
                    break;                        
                }               
            } 
            if (max != 0) {
                String result = "";
                for (Integer element : userInputArray) {
                    if(max != element) {
                        result += element.toString();
                    }
                }
                result += max;
                System.out.println("Result = " + result);
            } else {
                System.out.println("irirror");
            }           
        } else {
            System.out.println("Введено не верное чиcло");
        }
        
    } 
}