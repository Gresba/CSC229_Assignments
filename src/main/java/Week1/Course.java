package Week1;

/**
 * The Course class which contains getters, setters, overloaded constructor, which takes three parameters
 * and default constructor
 *
 * @author Paul Kim
 * @version 1.0
 * @since 9/12/2021
 *
*/
public class Course {
    
    //Member variables which are members of the Course class. Encapsulated variables.
    private int iD;
    private String name;
    private String code;

    /**
     * Overloaded constructor which initializes iD, name and code
     * 
     * @param iD Initialize the iD for the course
     * @param name Initialize the name for the course
     * @param code Initialize the code for the course
     */
    public Course(int iD, String name, String code){
        this.iD = iD;
        this.name = name;
        this.code = code;
    }

    /**
     * Default constructor since java does not generate one because there is another constructor
     */
    public Course() {
        
    }
    
    /**
     * Getter for the member iD
     * 
     * @return 
     */
    public int getiD() {
        return iD;
    }

    /**
     * Setter for the member iD
     * 
     * @param iD Set the iD for the course
     */
    public void setiD(int iD) {
        this.iD = iD;
    }

    /**
     * Getter for the member name
     * 
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the member name
     * 
     * @param name Set the name for the course
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for the member code
     * 
     * @return 
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter for the member code.
     * 
     * @param code set the code for the course
     */
    public void setCode(String code) {
        this.code = code;
    }
}