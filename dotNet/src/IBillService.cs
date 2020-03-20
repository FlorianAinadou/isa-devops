using System;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Collections.Generic;

using Partner.Data;

namespace Partner.Service {

  [ServiceContract]
  public interface IBillService
  {
    [OperationContract]
    [WebInvoke( Method = "POST", UriTemplate = "mailbox",
                RequestFormat = WebMessageFormat.Json,
                ResponseFormat = WebMessageFormat.Json)]
    int ReceiveRequest(BillRequest request);


    [OperationContract]
    [WebInvoke( Method = "GET", UriTemplate = "bills/{identifier}",
                ResponseFormat = WebMessageFormat.Json)]
    Bill FindBillById(int identifier);

    [OperationContract]
    [WebInvoke( Method = "GET", UriTemplate = "bills",
                ResponseFormat = WebMessageFormat.Json)]
    List<int> GetAllBillIds();

}

}
