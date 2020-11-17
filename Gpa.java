import java.util.Scanner;

public class Gpa {
     
     public void myMethod(int x){
        Scanner scan = new Scanner(System.in);
        
        int NoOfSub = x;
        int i;
        String studentMark[] = new String[NoOfSub]; 
        float courseCredit[] =  new float[NoOfSub];
        float tMark = 0f,tCredit = 0f; 
        
            System.out.println("-----|||||              Grades You can have                   |||||-----");
            System.out.println("-----||||| A+ | A | A- | B+ | B | B- | C+ |C-| C | D+ | D-| E |||||-----");
                        
            for(i=0;i<NoOfSub;i++){                    //Loop Block to Get the marks,credit and assign values
                System.out.print("Enter the Grade of Subject No "+(i+1)+"(Grd in latter) : ");       //This is for Marks 
                    studentMark[i] = scan.next();                //Getting the Value of the subject
                
                      switch(studentMark[i].toLowerCase()){ // Converstion of Char Grades into Marks and Addition
                        case "a" : case "a+":{  
                            tMark += 4f;
                        break;
                        }
                        case "a-":{
                            tMark += 3.7f;
                        break;
                        }
                        case "b+":{
                            tMark += 3.3f;
                        break;
                        }
                        case "b":{
                            tMark += 3f;
                        break;
                        }
                        case "b-":{
                            tMark += 2.7f;
                        break;
                        }
                        case "c+":{
                            tMark += 2.3f;
                        break;
                        }
                        case "c":{
                            tMark += 2f;
                        break;
                        }
                        case "c-":{
                            tMark += 1.7f;
                        break;
                        }
                        case "d+":{
                            tMark += 1.3f;
                        break;
                        }
                        case "d":{
                            tMark += 1f;
                        break;
                        }
                        case "e":{
                            tMark += 0f;
                        break;
                        }
                    }  
                                   // scan.nextLine();
                            //  System.out.println(studentMark[i]);
                          
                System.out.print("Enter the credit of this Subject : ");          //This is for Credits
                    courseCredit[i] = scan.nextFloat();               //Getting Credits from User
                    tCredit += courseCredit[i];                 //Addition of *Credits
              }
              System.out.println("\n");
                System.out.println("-----|||||Result|||||-----");
                System.out.printf("       TotalMarks : %.1f  \n       Total Credits : %d\n",tMark,(int)tCredit);
                System.out.printf("\n       Final GPA : %.2f",(tMark/tCredit));
                System.out.println("\n-----|||||Thanks for Using this.. IM ♠AJ♠|||||-----");
            scan.close();
    }
}



//Have a little logic concern need to clear it♥