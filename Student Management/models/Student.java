package models;

/**
 * Represents a student with an ID and a name.
 */


public class Student {
    private String id;
    private String name;

    /**
    * Constructs a new Student with the given ID and name.
    *
    * @param id the student's ID
    * @param name the student's name
    */

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
	
	/**
	*Returns the student ID.
	*@return student id;
	*/

    public String getId(){
       return id;
    }  
	
	/**
   * Returns the name of the student.
   * @return student name
   */
	
    public String getName(){
        return name;
    }
	
	/**
     * Returns a printable string representation of the student.
     * @return formatted student details
     */
	@Override
	
    public String toString(){
      return "Students{Student ID:" + id + " " + "student Name:" + name + "}";

    }

    
}