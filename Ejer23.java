package ejer23;



public class Ejer23 {
    
    public static int intercambiar(int a,int b) {

        int retorno;
        
        if (a > b) {
            retorno= a;
        }else{
            retorno =b;
        }
        return retorno;
       
    }
    public static void main(String[] args) {

    int num1;
    int num2;
    num1 = 5;
    num2 =4;
    
    int  i;
    
       intercambiar(num1,num2);
    
    i = intercambiar(num1,num2);
    
        System.out.println("El numero mayor es " + i);
    }
    
   
}
