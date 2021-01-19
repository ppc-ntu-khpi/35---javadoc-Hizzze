package domain;

/**
 * Class that enterprise artist 
 * @author Vladislav PC
 */
public class Artist extends Employee {
    /**
     * Method creates an object with all properties assigned to it
     * @param skiils your skills
     * @param name your name
     * @param jobTitle your jobTitle
     * @param level your level
     * @param dept your level
     */

    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        /**
         * 
        Creates 1 object super
         */
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
    /**
     * Sets the value of the this property
     * @param skiils your skills
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    /**
     * Main program method sets new property values
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }
    /**
     * Method returns a string representation of the specified object
     * @return String value
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }
    /**
     * The method makes the skills object available only within the declared class.
     */
    private String[] skiils;
   

    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
    /**
     * Method that save your skills 
     * @return all your skills
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
