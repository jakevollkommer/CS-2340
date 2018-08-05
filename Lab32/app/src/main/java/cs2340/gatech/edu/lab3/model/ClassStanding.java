package cs2340.gatech.edu.lab3.model;
import java.io.Serializable;

/**
 * Created by Jake Vollkommer on 2/6/17.
 *
 * This class represents the possible class standings for a student
 */
public enum ClassStanding implements Serializable {
    FRESHMAN ("Freshman", "FR"),
    SOPHOMORE ("Sophomore", "SO"),
    JUNIOR ("Junior", "JR"),
    SENIOR ("Senior", "SR");

    /** the full string representation of the class standing */
    private final String name;

    /** the representation of the class standing abbreviation */
    private final String code;

    /**
     * Constructor for the enumeration
     *
     * @param pname   class standing string
     * @param pcode   abbreviation
     */
    ClassStanding(String pname, String pcode) {
        name = pname;
        code = pcode;
    }

    /**
     *
     * @return   the full class standing name
     */
    public String getName() { return name; }


    /**
     *
     * @return the abbreviation of the standing
     */
    public String getCode() { return code; }

    /**
     *
     * @return the display string representation of the class standing
     */
    public String toString() { return code; }
}
