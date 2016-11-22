package Respository;

import java.util.ArrayList;

import DataModel.OpenStateLegislator;
import DataModel.OpenStateLegislatorDetail;

public interface IOpenStateRespository
{

    // DataBase method for OpenState
    ArrayList<OpenStateLegislator> getLegislatorData(ArrayList<OpenStateLegislator> openStateLegislatorList);
    ArrayList<OpenStateLegislatorDetail> getLegislatorDetailData(ArrayList<OpenStateLegislatorDetail> openStateLegislatorDetailList);
    void getLegislatorByLegID(ArrayList<OpenStateLegislator> openStateLegislatorItems, String leg_id);
    void getLegislatorByLastName(ArrayList<OpenStateLegislator> openStateLegislatorItems, String firstName);

    // OpenStateLegislatorDetail search through the detail arrayList for the LegID
    // The data in the legislatorDetail is from the leg_id search
    void getLegislatorDetailByLegID(ArrayList<OpenStateLegislatorDetail> openStateLegislatorDetailItems, String leg_id);




}
