using System;
using System.Net;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Collections.Generic;
using System.Linq;
using Partner.Data;

namespace Partner.Service {

  // The service is stateful, as it is only a Proof of Concept.
  // Services should be stateless, this is for demonstration purpose only.
  [ServiceBehavior(InstanceContextMode = InstanceContextMode.Single)]
  public class BillService : IBillService
  {
    private const string MagicKey = "896983"; // ASCII code for "YES"

    private Dictionary<int, Bill> accounts = new Dictionary<int, Bill>();
    private int counter;

    public int ReceiveRequest(BillRequest request)
    {
      Console.WriteLine("ReceiveRequest: " + request);
      var bill = BuildBill(request);
      Console.WriteLine("Amount of the bill : " + bill.Amount);
      accounts.Add(counter, bill);
      return counter;
    }

    public Bill FindBillById(int identifier)
    {
      if(!accounts.ContainsKey(identifier)) {
        WebOperationContext.Current.OutgoingResponse.StatusCode = HttpStatusCode.NotFound;
        return null;
      }
      return accounts[identifier];
    }

    public List<int> GetAllBillIds()
    {
      return accounts.Keys.ToList();
    }

    private Bill BuildBill(BillRequest request)
    {
      var bill = new Bill();
      bill.Identifier = counter++;
      bill.Amount = request.Amount;
      bill.Date = DateTime.Now.ToString();
      return bill;
    }

  }
}
