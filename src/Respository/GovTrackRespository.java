package Respository;

import DataModel.GovTrackLegislator;
import DataModel.GovTrackLegislatorDetails;

import java.util.ArrayList;


public class GovTrackRespository implements IGovTrackRespository {

    public ArrayList<GovTrackLegislator> govTrackLegislatorArrayList;
    public ArrayList<GovTrackLegislator> govTrackLegislatorArrayListID;

    @Override
    public ArrayList<GovTrackLegislator> getGovTrackLegislatorData(ArrayList<GovTrackLegislator> govTrackStateLegislatorArrayItems) {
        govTrackLegislatorArrayList = govTrackStateLegislatorArrayItems;
        System.out.println("This is getGovTrackLegislatorData: ");
        for(GovTrackLegislator govLeg : govTrackLegislatorArrayList)
        {
            String firstName = govLeg.first_name;
            String last_name = govLeg.last_name ;
            String birthday = govLeg.birthday;
            String religion = govLeg.religion;
            String bioguide_id = govLeg.bioguide_id;
            String thomas_id = govLeg.thomas_id;
            String lis_id = govLeg.lis_id;
            Long govTrack_id = govLeg.govTrack_id;
            Long votesmart_id = govLeg.votesmart_id;
            Long cspan_id = govLeg.cspan_id;
            String wikipedia_id = govLeg.wikipedia_id;
            Long maplight_id = govLeg.maplight_id;
            Long icpsr_id = govLeg.icpsr_id;

//            System.out.println("This is printed: " + firstName);
//            System.out.println("This is the firstname: " + govLeg.first_name);
//            System.out.println("This is the lastname: " + govLeg.last_name);
//            System.out.println("This is the birthday: " + govLeg.birthday);
//            System.out.println("This is the religion: " + govLeg.religion);
//            System.out.println("This is the bioguide_id: " + govLeg.bioguide_id);
//            System.out.println("This is the thomas_id: " + govLeg.thomas_id);
//            System.out.println("This is the lis_id: " + govLeg.lis_id);
//            System.out.println("This is the govTrack_id: " + govLeg.govTrack_id);
//            System.out.println("This is the openSecrets_id: " + govLeg.openSecrets_id);
//            System.out.println("This is the votesmart_id: " + govLeg.votesmart_id);
//            System.out.println("This is the cspan_id: " + govLeg.cspan_id);
//            System.out.println("This is the wikipedia_id: " + govLeg.wikipedia_id);
//            System.out.println("This is the maplight_id: " + govLeg.maplight_id);
//            System.out.println("This is the icpsr_id: " + govLeg.icpsr_id);
//            System.out.println("This is the wikidata_id: " + govLeg.wikidata_id);
//            System.out.println("This is the googleEntity_id: " + govLeg.googleEntity_id + "\n");
        }

        return govTrackLegislatorArrayList;

    }

    @Override
    public void getGovTrackLegislatorDataByID(String legislatorID, ArrayList<GovTrackLegislator> govTrackStateLegislatorItems) {
        govTrackLegislatorArrayListID = govTrackStateLegislatorItems;
        Long targetName = Long.parseLong(legislatorID);
        System.out.println(targetName);
        for(GovTrackLegislator govTrack : govTrackLegislatorArrayListID) {
            if (targetName.equals(govTrack.govTrack_id)) {
//
                System.out.println("GovTrack firstname: " + govTrack.first_name);
                System.out.println("GovTrack lastname: " + govTrack.last_name);
                System.out.println("GovTrack birthday: " + govTrack.birthday);
                System.out.println("GovTrack religion: " + govTrack.religion);
                System.out.println("GovTrack bioguide_id: " + govTrack.bioguide_id);
                System.out.println("GovTrack thomas_id: " + govTrack.thomas_id);
                System.out.println("GovTrack lis_id: " + govTrack.lis_id);
                System.out.println("GovTrack govTrack_id: " + govTrack.govTrack_id);
                System.out.println("GovTrack openSecrets_id: " + govTrack.openSecrets_id);
                System.out.println("GovTrack votesmart_id: " + govTrack.votesmart_id);
                System.out.println("GovTrack cspan_id: " + govTrack.cspan_id);
                System.out.println("GovTrack wikipedia_id: " + govTrack.wikipedia_id);
                System.out.println("GovTrack maplight_id: " + govTrack.maplight_id);
                System.out.println("GovTrack icpsr_id: " + govTrack.icpsr_id);
                System.out.println("GovTrack wikidata_id: " + govTrack.wikidata_id);
                System.out.println("GovTrack googleEntity_id: " + govTrack.googleEntity_id + "\n");
            }
        }
    }
}
