package DataModel;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by MikeWitter on 11/17/16.
 */
public class OpenStateLegislatorDetail
{

    public String first_name;
    public String last_name;
    public String party;
    public String photo_url;
    public String district;
    public String level;
    public String chamber;
    public String office_address;
    public String email;
    public String leg_id;
    public String committee_id;
    public String committee;
    public String position;
    public ArrayList<Roles> roles;


    public OpenStateLegislatorDetail()
    {

    }

    public OpenStateLegislatorDetail(String first_name, String last_name, String party, String photo_url, String district,
                                     String level, String chamber, String office_address, String email, String leg_id,
                                     String committee_id, String committee, String position, ArrayList<Roles> roles)
    {

        this.first_name = first_name;
        this.last_name = last_name;
        this.party = party;
        this.photo_url = photo_url;
        this.district = district;
        this.level = level;
        this.chamber = chamber;
        this.office_address = office_address;
        this.email = email;
        this.leg_id = leg_id;
        this.committee_id = committee_id;
        this.committee = committee;
        this.position = position;
        this.roles = roles;
    }


    // FirstName
    public String getFirstName()
    {

        return first_name;
    }

    public void setFirstName(String first_name)
    {

        this.first_name = first_name;
    }

    // LastName
    public String getLastName()
    {

        return last_name;
    }

    public void setLastName(String last_name)
    {

        this.last_name = last_name;
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

    // Photo_url
    public String getPhoto_url()
    {

        return last_name;
    }

    public void setPhoto_url(String photo_url)
    {

        this.photo_url = photo_url;
    }

    // District
    public String getDistrict()
    {

        return district;
    }

    public void setDistrict(String district)
    {

        this.district = district;
    }

    // Level
    public String getLevel()
    {

        return level;
    }

    public void setLevel(String level)
    {

        this.level = level;
    }

    // Chamber
    public String getChamber()
    {

        return chamber;
    }

    public void setChamber(String chamber)
    {

        this.chamber = chamber;
    }

    // Office_address
    public String getOffice_address()
    {

        return office_address;
    }

    public void setOffice_address(String office_address)
    {

        this.office_address = office_address;
    }

    // Email
    public String getEmail()
    {

        return email;
    }

    public void setEmail(String email)
    {

        this.email = email;
    }

    // Leg_id
    public String getLeg_id()
    {

        return leg_id;
    }

    public void setLeg_id(String leg_id)
    {

        this.leg_id = leg_id;
    }

    // Committee_id
    public String getCommittee_id()
    {
        return committee_id;
    }

    public void setCommittee_id(String committee_id)
    {
        this.committee_id = committee_id;
    }

    // Committee
    public String getCommittee()
    {
        return committee;
    }

    public void setCommittee(String committee)
    {
        this.committee = committee;
    }

    // Position
    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    // Roles
    public ArrayList<Roles> getRoles()
    {
        return roles;
    }

    public void setRoles(ArrayList<Roles> roles)
    {
        this.roles = roles;
    }

}
