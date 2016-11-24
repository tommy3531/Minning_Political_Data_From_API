package DataModel;

import java.util.List;

/**
 * Created by tommarler on 11/23/16.
 */
public class GovTrackLegislatorDetails {

    public List<GovTrackLegislator> legislatorList;

    public List<GovTrackLegislator> getLegislator()
    {
        return legislatorList;
    }

    public void setGovTrackLegislator(List<GovTrackLegislator> legislatorList)
    {
        this.legislatorList = legislatorList;
    }
}
