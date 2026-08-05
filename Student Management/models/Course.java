package models;
/**
 * Represents a course with a code and a title.
 */

public class Course {
    private String code;
    private String title;

    /**
    * Constructs a new Course with the given code and title.
    *
    * @param code the course code
    * @param title the course title
    */


    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    /**
    * Returns the course code.
    * @return course code
    */
	 
    public String getCode(){
        return code;
    }
	
	/**
     * Returns the course title.
     * @return course title
     */
    
    public String getTitle(){
         return title;
    }

    /**
    * Returns a printable string representation of the course.
    * @return formatted course details
    */
    
    @Override
    public String toString() {
          return "Course{code='" + code + "', title='" + title + "'}";
    }
    
}