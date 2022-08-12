import java.util.Scanner;
public class Assignment5_1 {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      String  bmi="";
      float height, weight, result;

      System.out.print("신장을 입력하시오: ");    
         height =sc.nextFloat();

      System.out.print("체중을 입력하시오: ");    
         weight =sc.nextFloat();
         
      sc.close();
      
      result = (weight / (height*height))*10000;
      
      if(result>30.0){   
      bmi = "비만";
      }
      
      else if(result>25.0){
      bmi="과체중";
      }
      
      else if(result>18.0){
      bmi="정상";
      }
      
      else{
      bmi="저체중";
      }
      
      System.out.printf("BMI : %.2f \n", result); 
      System.out.println("비만도: "+bmi);  

   }
   }

  

