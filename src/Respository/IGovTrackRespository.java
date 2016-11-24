package Respository;

import DataModel.GovTrackLegislator;
import DataModel.OpenStateLegislator;

import java.util.ArrayList;

/**
 * Created by tommarler on 11/23/16.
 */
public interface IGovTrackRespository {
    ArrayList<GovTrackLegislator> getGovTrackLegislatorData(ArrayList<GovTrackLegislator> govTrackStateLegislatorArrayList);
    void getGovTrackLegislatorDataByID(String legislatorID, ArrayList<GovTrackLegislator> govTrackStateLegislatorItems);


}
