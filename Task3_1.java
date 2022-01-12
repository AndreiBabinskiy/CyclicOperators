import java.util.Scanner;

class Task3_1 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Value:");       
        int inputA = scanner.nextInt();
        String result = "";
        
        int a = inputA;
        while (a > 1) {   
            result = a % 2 + result;
            a = a / 2; 
            
        }
        result = a + result;
        System.out.println(result);
           
        a = inputA;
        result = "";
        while (a > 7) {
            result = a % 8 + result;
            a = a / 8; 
        }
        result = a + result;
        System.out.println(result);
        
        a = inputA;
        result = "";
        while (a > 15) {
            int res = a % 16;
            
            switch(res) {
                case 10: {
                    result = "A" + result; 
                    break;
                }     
                case 11: {
                    result = "B" + result;    
                    break;
                }
                case 12: {
                    result = "C" + result; 
                    break;
                }
                case 13: {
                    result = "D" + result;  
                    break;
                }
                case 14: {
                    result = "E" + result;  
                    break;
                }
                case 15: {
                    result = "F" + result;  
                    break;
                }
                default: {
                    result = res + result;
                }                
            }
            a = a / 16;            
        }
            switch(a) {
                case 10: {
                    result = "A" + result; 
                    break;
                }     
                case 11: {
                    result = "B" + result;    
                    break;
                }
                case 12: {
                    result = "C" + result; 
                    break;
                }
                case 13: {
                    result = "D" + result;  
                    break;
                }
                case 14: {
                    result = "E" + result;  
                    break;
                }
                case 15: {
                    result = "F" + result;  
                    break;
                }
                default: {
                    result = a + result;
                }                
            }
        System.out.println(result);
    }
}