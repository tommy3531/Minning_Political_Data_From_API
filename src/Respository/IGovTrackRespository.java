package Respository;

import DataModel.GovTrackLegislator;
import DataModel.OpenStateLegislator;

import java.util.ArrayList;

/**
 * Created by tommarler on 11/23/16.
 */
public interface IGovTrackRespository {
    ArrayList<GovTrackLegislator> getGovTrackLegislatorData(ArrayList<GovTrackLegislator> govTrackStateLegislatorArrayItems);
    void getGovTrackLegislatorDataByID(String legislatorID, ArrayList<GovTrackLegislator> govTrackStateLegislatorItems);


}
