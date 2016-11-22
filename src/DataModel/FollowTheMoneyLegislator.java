package DataModel;

/**
 * Created by tommarler on 11/21/16.
 */
public class FollowTheMoneyLegislator {

    public String candidate;
    public String specific_Party;
    public String election_Year;
    public String office_sought;
    public String election_Status;
    public String status_Of_Candidate;
    public String type_of_Contributor;
    public String state;
    public String employer;
    public String occupation;
    public String amount;


    public FollowTheMoneyLegislator()
    {

    }

    public FollowTheMoneyLegislator(String candidate, String specific_Party, String election_Year, String office_sought, String election_Status, String status_Of_Candidate,
                                    String type_of_Contributor, String state, String employer, String occupation, String amount)
    {
        this.candidate = candidate;
        this.specific_Party = specific_Party;
        this.election_Year = election_Year;
        this.office_sought = office_sought;
        this.election_Status = election_Status;
        this.status_Of_Candidate = status_Of_Candidate;
        this.type_of_Contributor = type_of_Contributor;
        this.state = state;
        this.employer = employer;
        this.occupation = occupation;
        this.amount = amount;

    }

    // Candidate
    public String getCandidate()
    {

        return candidate;
    }

    public void setCandidate(String candidate)
    {

        this.candidate = candidate;
    }

    // Specific_Party
    public String getSpecific_Party()
    {

        return specific_Party;
    }

    public void setSpecific_Party(String specific_Party)
    {

        this.specific_Party = specific_Party;
    }

    // Election_Year
    public String getElection_Year()
    {

        return election_Year;
    }

    public void setElection_Year(String election_Year)
    {

        this.election_Year = election_Year;
    }

    // Office_Sought
    public String getOffice_sought()
    {

        return office_sought;
    }

    public void setOffice_sought(String office_sought)
    {

        this.office_sought = office_sought;
    }

    // Election_Status
    public String getElection_Status()
    {

        return election_Status;
    }

    public void setElection_Status(String election_Status)
    {

        this.election_Status = election_Status;
    }

    // StatusOfCandidate
    public String getStatus_Of_Candidate()
    {

        return status_Of_Candidate;
    }

    public void setStatus_Of_Candidate(String status_Of_Candidate)
    {

        this.status_Of_Candidate = status_Of_Candidate;
    }

    // Type of Contributions
    public String getType_of_Contributor()
    {

        return type_of_Contributor;
    }

    public void setType_of_Contributor(String type_of_Contributor)
    {

        this.type_of_Contributor = type_of_Contributor;
    }

    // State
    public String getState()
    {

        return state;
    }

    public void setState(String state)
    {

        this.state = state;
    }

    // Employer
    public String getEmployer()
    {

        return employer;
    }

    public void setEmployer(String employer)
    {

        this.employer = employer;
    }

    // Occupation
    public String getOccupation()
    {

        return occupation;
    }

    public void setOccupation(String occupation)
    {

        this.occupation = occupation;
    }

    // Amount
    public String getAmount()
    {

        return amount;
    }

    public void setAmount(String amount)
    {

        this.amount = amount;
    }
}
