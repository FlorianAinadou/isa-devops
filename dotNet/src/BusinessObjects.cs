using System.Runtime.Serialization;
using System;

namespace Partner.Data {

  [DataContract(Namespace = "http://partner/external/bill/data/",
                Name = "BillRequest")]
  public class BillRequest
  {

    [DataMember]
    public double Amount { get; set; }

    override public string ToString()
    {
      return "BillRequest[" + Amount + "]";
    }
  }

  [DataContract(Namespace = "http://partner/external/bill/data/",
                Name = "Bill")]
  public class Bill
  {
    [DataMember]
    public int Identifier { get; set; }

    [DataMember]
    public double Amount { get; set; }

    [DataMember]
    public BillStatus Status { get; set; }

    [DataMember]
    public string Date { get; set; }

  }

  public enum BillStatus { Ok, Ko }

}
