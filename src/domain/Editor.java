package domain;
/**
 * Class that interprise editor class that extends
 * @author Vladislav PC
 */
public class Editor extends Artist {
    /**
     * Main information of editors
     * @param electronicEditing
     * @param skiils skill of working
     * @param name your name
     * @param jobTitle your job
     * @param level your level
     * @param dept your dept
     */
   
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
    
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
   
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
   
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    /**
     * Method that you use for convertation informetion into the text
     * @return String value
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;
    /**
     * refer to a specific object
     * @return true of false
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
