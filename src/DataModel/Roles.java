package DataModel;

import java.util.List;
import java.util.ArrayList;

public class Roles
{

    public String committee;
    public String committee_id;
    public String position;
    public ArrayList sources;

    public Roles()
    {

    }

    public Roles(String committee, String committee_id, String position, ArrayList sources)
    {
        this.committee = committee;
        this.committee_id = committee_id;
        this.position = position;
        this.sources = sources;
    }

    // Committee
    public String getCommittee(){

        return committee;
    }

    public void setCommittee(String committee){

        this.committee = committee;
    }

    // Committee_id
    public String getCommittee_id(){

        return committee_id;
    }

    public void setCommittee_id(String committee_id){

        this.committee_id = committee_id;
    }

    // Position
    public String getPosition(){

        return position;
    }

    public void setPosition(String position){

        this.position = position;
    }

    // Sources
    public List getSources(){

        return sources;
    }

    public void setSources(ArrayList sources){

        this.sources = sources;
    }
}
