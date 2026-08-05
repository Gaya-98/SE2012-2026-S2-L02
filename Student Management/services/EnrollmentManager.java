package services;


import models.Student;



 /**
 * Handles enrollment-related operations between students and courses.
 */
public class EnrollmentManager {
	
  /**
  * Searches for a student by ID using linear search.
  *
  * @param id the student ID to search for
  * @param students the array of students to search through
  * @param studentCount the number of students currently stored in the array
  * @return the matching Student object, or null if no match is found
  */
   public static Student  searchStudentById(String id ,Student[] students, int studentCount){
	      
          for(int i=0;i<studentCount;i++){
			  if(students[i].getId().equals(id)){
				  
				  return students[i];				  
			  }
		  }
		  return null;
	}
  
   /**
  * Sorts the given array of students alphabetically by name
  * using the bubble sort algorithm.
  *
  * @param students the array of students to sort
  * @param count the number of students currently stored in the array
  */
   public static void sortStudentsByName(Student[] students, int count){
        for (int i = 0; i < count - 1; i++) {
              for (int j = 0; j < count - i - 1; j++) {
                  if (students[j].getName().compareToIgnoreCase(students[j + 1].getName()) > 0) {
                      Student temp = students[j];
                      students[j] = students[j + 1];
                      students[j + 1] = temp;
                   }
               }
        }
   }

	
	

}