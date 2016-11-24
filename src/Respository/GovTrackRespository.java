package Respository;

import DataModel.GovTrackLegislator;

import java.util.ArrayList;


public class GovTrackRespository implements IGovTrackRespository {

    public ArrayList<GovTrackLegislator> govTrackLegislatorArrayList;
    public ArrayList<GovTrackLegislator> govTrackLegislatorArrayListID;

    @Override
    public ArrayList<GovTrackLegislator> getGovTrackLegislatorData(ArrayList<GovTrackLegislator> govTrackStateLegislatorArrayList) {

        System.out.println("This is getGovTrackLegislatorData: ");
        for(GovTrackLegislator govLeg : govTrackStateLegislatorArrayList)
        {
            System.out.println("This is the firstname: " + govLeg.first_name);
            System.out.println("This is the lastname: " + govLeg.last_name);
            System.out.println("This is the birthday: " + govLeg.birthday);
            System.out.println("This is the religion: " + govLeg.religion);
            System.out.println("This is the bioguide_id: " + govLeg.bioguide_id);
            System.out.println("This is the thomas_id: " + govLeg.thomas_id);
            System.out.println("This is the lis_id: " + govLeg.lis_id);
            System.out.println("This is the govTrack_id: " + govLeg.govTrack_id);
            System.out.println("This is the openSecrets_id: " + govLeg.openSecrets_id);
            System.out.println("This is the votesmart_id: " + govLeg.votesmart_id);
            System.out.println("This is the cspan_id: " + govLeg.cspan_id);
            System.out.println("This is the wikipedia_id: " + govLeg.wikipedia_id);
            System.out.println("This is the maplight_id: " + govLeg.maplight_id);
            System.out.println("This is the icpsr_id: " + govLeg.icpsr_id);
            System.out.println("This is the wikidata_id: " + govLeg.wikidata_id);
            System.out.println("This is the googleEntity_id: " + govLeg.googleEntity_id + "\n");
        }

        return govTrackStateLegislatorArrayList;

    }

    @Override
    public void getGovTrackLegislatorDataByID(String legislatorID, ArrayList<GovTrackLegislator> govTrackStateLegislatorItems) {
        govTrackLegislatorArrayListID = govTrackStateLegislatorItems;
        Long targetName = Long.parseLong(legislatorID);
        for(GovTrackLegislator govTrack : govTrackLegislatorArrayListID) {
            if (govTrack.govTrack_id.equals(targetName)) {

                System.out.println("This is the firstname: " + govTrack.first_name);
                System.out.println("This is the lastname: " + govTrack.last_name);
                System.out.println("This is the birthday: " + govTrack.birthday);
                System.out.println("This is the religion: " + govTrack.religion);
                System.out.println("This is the bioguide_id: " + govTrack.bioguide_id);
                System.out.println("This is the thomas_id: " + govTrack.thomas_id);
                System.out.println("This is the lis_id: " + govTrack.lis_id);
                System.out.println("This is the govTrack_id: " + govTrack.govTrack_id);
                System.out.println("This is the openSecrets_id: " + govTrack.openSecrets_id);
                System.out.println("This is the votesmart_id: " + govTrack.votesmart_id);
                System.out.println("This is the cspan_id: " + govTrack.cspan_id);
                System.out.println("This is the wikipedia_id: " + govTrack.wikipedia_id);
                System.out.println("This is the maplight_id: " + govTrack.maplight_id);
                System.out.println("This is the icpsr_id: " + govTrack.icpsr_id);
                System.out.println("This is the wikidata_id: " + govTrack.wikidata_id);
                System.out.println("This is the googleEntity_id: " + govTrack.googleEntity_id + "\n");
            }
        }
    }
}
