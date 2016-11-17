package DataModel;

public class Legislator {

    public String first_name;
    public String last_name;
    public String leg_id;

    public Legislator() {

    }

    public Legislator(String first_name, String last_name, String leg_id){
        this.first_name = first_name;
        this.last_name = last_name;
        this.leg_id = leg_id;
    }

    public String getFirstName(){

        return first_name;
    }

    public void setFirstName(String first_name){

        this.first_name = first_name;
    }

    public String getLastName(){

        return last_name;
    }

    public void setLastName(String last_name){

        this.last_name = last_name;
    }
}
