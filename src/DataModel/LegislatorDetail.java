package DataModel;

import java.util.List;

/**
 * Created by MikeWitter on 11/17/16.
 */
public class LegislatorDetail {

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
    public List Roles;


    public LegislatorDetail() {

    }

    public LegislatorDetail(String first_name, String last_name, String party, String photo_url, String district,
                            String level, String chamber, String office_address, String email, String leg_id,
                            String committee_id, String committee, String position, List Roles){

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
        this.Roles = Roles;
    }

    public List getRoles(){
        return Roles;
    }

    public void setRoles(List Roles){
        this.Roles = Roles;
    }

    // FirstName
    public String getFirstName(){

        return first_name;
    }

    public void setFirstName(String first_name){

        this.first_name = first_name;
    }

    // LastName
    public String getLastName(){

        return last_name;
    }

    public void setLastName(String last_name){

        this.last_name = last_name;
    }

    // Party
    public String getParty(){

        return party;
    }

    public void setParty(String party){

        this.party = party;
    }

    // photo_url
    public String getPhoto_url(){

        return last_name;
    }

    public void setPhoto_url(String photo_url){

        this.photo_url = photo_url;
    }

    // district
    public String getDistrict(){

        return district;
    }

    public void setDistrict(String district){

        this.district = district;
    }

    // Level
    public String getLevel(){

        return level;
    }

    public void setLevel(String level){

        this.level = level;
    }

    // Chamber
    public String getChamber(){

        return chamber;
    }

    public void setChamber(String chamber){

        this.chamber = chamber;
    }

    // Office_address
    public String getOffice_address(){

        return office_address;
    }

    public void setOffice_address(String office_address){

        this.office_address = office_address;
    }

    // email
    public String getEmail(){

        return email;
    }

    public void setEmail(String email){

        this.email = email;
    }

    // leg_id
    public String getLeg_id(){

        return leg_id;
    }

    public void setLeg_id(String leg_id){

        this.leg_id = leg_id;
    }

    // committee_id
    public String getCommittee_id(){

        return committee_id;
    }

    public void setCommittee_id(String committee_id){

        this.committee_id = committee_id;
    }

    // committee
    public String getCommittee(){

        return committee;
    }

    public void setCommittee(String committee){

        this.committee = committee;
    }

    // position
    public String getPosition(){

        return position;
    }

    public void setPosition(String position){

        this.position = position;
    }
}
