package model;

public class Office {

    private String code;
    private int floor;
    private Office nextOffice;

    public Office(String code, int floor) {
        {
            this.code = code;
            this.floor = floor;
        }

    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the floor
     */
    public int getFloor() {
        return floor;
    }

    /**
     * @param floor the floor to set
     */
    public void setFloor(int floor) {
        this.floor = floor;
    }

    /**
     * @return the nextOffice
     */
    public Office getNextOffice() {
        return nextOffice;
    }

    /**
     * @param nextOffice the nextOffice to set
     */
    public void setNextOffice(Office nextOffice) {
        this.nextOffice = nextOffice;
    }



}