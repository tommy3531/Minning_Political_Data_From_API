package DataModel;

public class OpenFECLegislator {

    public String name;
    public String candidate_id;
    public String party;
    public String rep_state;
    public String office_sought;
    public String incumbent_chanllenge;
    public String candidate_status;


    public OpenFECLegislator(String name, String candidate_id, String party, String rep_state, String office_sought, String incumbent_chanllenge, String candidate_status)
    {
        this.name  = name;
        this.candidate_id = candidate_id;
        this.party = party;
        this.rep_state = rep_state;
        this.office_sought = office_sought;
        this.incumbent_chanllenge = incumbent_chanllenge;
        this.candidate_status = candidate_status;

    }

    // Name
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // Candidate_id
    public String getCandidate_id()
    {
        return candidate_id;
    }

    public void setCandidate_id(String candidate_id)
    {
        this.candidate_id = candidate_id;
    }

    // Party
    public String getParty()
    {
        return party;
    }

    public void setParty(String party)
    {
        this.party = party;
    }

    // Rep_State
    public String getRep_state()
    {
        return rep_state;
    }

    public void setRep_state(String rep_state)
    {
        this.rep_state = rep_state;
    }

    // Office_sought
    public String getOffice_sought()
    {
        return office_sought;
    }

    public void setOffice_sought(String office_sought)
    {
        this.office_sought = office_sought;
    }

    // Incumbent Chanllenge
    public String getIncumbent_chanllenge()
    {
        return incumbent_chanllenge;
    }

    public void setIncumbent_chanllenge(String incumbent_chanllenge)
    {
        this.incumbent_chanllenge = incumbent_chanllenge;
    }

    // Candidate Status
    public String getCandidate_status()
    {
        return candidate_status;
    }

    public void setCandidate_status(String candidate_status)
    {
        this.candidate_status = candidate_status;
    }
}
