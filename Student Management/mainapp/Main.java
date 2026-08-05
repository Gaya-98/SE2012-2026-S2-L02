package mainapp;

import models.Student;
import java.util.Scanner;
import services.EnrollmentManager;

/**
 * Entry point for the Student Management System.
 * Provides a menu-driven console interface to add, list,
 * search, and sort students stored in an array.
 */
 
public class Main{
  
  
    /**
    * Enrolls a given number of students by reading each student's ID
    * and name from the keyboard and storing them in the array.
    *
    * @param students the array to store new students in
    * @param studentCount the current number of students already stored
    * @param numToAdd the number of students to enroll
    * @param input the Scanner used to read user input
    * @return the updated student count after enrollment
    */  
  
  
    public static int  addStudents(Student[] students ,int studentCount,int numToAdd, Scanner input){
		 
		    
        for(int i=0;i<numToAdd;i++){	 
		    if(studentCount >= students.length){
                    System.out.println("Database is full");
                    break;
            }

                            
            System.out.println("Enter the student id:");
            String sId=input.nextLine();
                                 
 
            System.out.println("Enter the student name:");     
            String sName= input.nextLine();

            students[studentCount] = new Student(sId, sName);
            studentCount++;
        }
		 return studentCount;
    }

    /**
    * Runs the Student Management System console application.
    *
    * @param args command-line arguments 
    */


    public static void main(String[] args){

       
        int choice; 

        //create the array
        Student[] students = new Student[100];
        int studentCount = 0;
		
        Scanner input = new Scanner(System.in);
  
      
        do{  
          System.out.println("   Menu  ");
          System.out.println("1 -enroll");
          System.out.println("2 - list ");
          System.out.println("3 - Search ");
          System.out.println("4 - sort ");
          System.out.println("5 - exit");
          System.out.println("Enter the choice(1 to 5) :");
          choice = input.nextInt();
          input.nextLine();

          switch (choice){
                case 1:     System.out.println("Enter the number of students to enroll:");
                            int numToAdd = input.nextInt();
							input.nextLine();
							studentCount= addStudents(students ,studentCount,numToAdd,input);
                                 
                            
                            System.out.println("Record added successfully");
                            break;

                case 2:   
                         System.out.println("The list of enrolled students");
            
                         if(studentCount==0){
                              System.out.println("No students registered");
                         }else{
                             for(int i=0;i<studentCount;i++){
                                    System.out.println(students[i]);
                             }
                         }
                         break;

                case 3:  
                         System.out.println("Enter the student Id:");
                         String id=input.nextLine();
                         Student result = EnrollmentManager.searchStudentById(id,students,studentCount);
						 
						 if(result !=null){
							 
                             System.out.println("The student id "+ id +"is found "+result);
						 }else{
							   System.out.println("The student Id :"+id+ " is not present in the student list ");
						 }
                         break;
                         
                         
                case 4:     
				         System.out.println("Sorted students by their names: ");
                         
                         EnrollmentManager.sortStudentsByName(students,studentCount);
                         for(int i=0;i<studentCount;i++){
							 System.out.println(students[i]);
						 }
                         break;
                         
                         
                case 5:  System.out.println("Exiting from the program........!");
				         break;
                       
					   
					   
			    default:
				        System.out.println("Invalid option!");
                        break;
		    }			
		  
        }while(choice!=5);
    }
}




                   
                        

      