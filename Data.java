package prj5;

/**
 * Data class
 * @author Sterling Brinson (brinster)
 * @version 2021.04.20
 */
public class Data
{
    private String state;
    private String race;
    private double caseCount;
    private double deathCount;
    private double cfr;
    
    /**
     * constructor
     * @param state to be used
     * @param race to be used
     * @param caseCount to be used
     * @param deathCount to be used
     * @param cfr to be used
     */
    public Data(String state, String race, 
            double caseCount, double deathCount, double cfr)
    {
        this.state = state;
        this.race = race;
        this.caseCount = caseCount;
        this.deathCount = deathCount;
        this.cfr = cfr;
    }

    /**
     * @return the state
     */
    public String getState()
    {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state)
    {
        this.state = state;
    }

    /**
     * @return the race
     */
    public String getRace()
    {
        return race;
    }

    /**
     * @param race the race to set
     */
    public void setRace(String race)
    {
        this.race = race;
    }

    /**
     * @return the caseCount
     */
    public double getCaseCount()
    {
        return caseCount;
    }

    /**
     * @param caseCount the caseCount to set
     */
    public void setCaseCount(double caseCount)
    {
        this.caseCount = caseCount;
    }

    /**
     * @return the deathCount
     */
    public double getDeathCount()
    {
        return deathCount;
    }

    /**
     * @param deathCount the deathCount to set
     */
    public void setDeathCount(double deathCount)
    {
        this.deathCount = deathCount;
    }

    /**
     * @return the cfr
     */
    public double getCfr()
    {
        return cfr;
    }

    /**
     * @param cfr the cfr to set
     */
    public void setCfr(double cfr)
    {
        this.cfr = cfr;
    }
    
    /**
     * @return String output
     */
    @Override
    public String toString()
    {
        return null;
    }
}
