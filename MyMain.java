import java.util.Scanner;

public class MyMain{
    
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        
        String select;
            System.out.println(":::::|||||          Welcome To AJ App           |||||:::::");
            System.out.println(":::::||||| GPA CALCULATOR | STUDENT REPORT CARD |||||:::::");
            System.out.println("Select what You Want : (GPA/SRC)");
            select=myObj.nextLine();
                   
        
        switch(select.toLowerCase()){
            case "gpa": 
            case "gpa calculator" : 
            {
                System.out.println("Enter the Amount of Subjects You have: ");
                  int noOfSub = myObj.nextInt();
                  Gpa stu = new Gpa();
                      stu.myMethod(noOfSub);
                  
                  
                break;
            } 
            case "report sheet" : 
            case "report" : 
            case "src" : 
            {
                System.out.println("Enter the Amount of Subjects you have : ");
            }
        }


    }

}