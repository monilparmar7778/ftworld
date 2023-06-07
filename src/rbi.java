
public class rbi {
  public float getRateofInterest()
  {
	  return 5.5f;
  }
}
class sbi extends rbi
{
	public float  getRateofInterest()
	{
		return 6.7f;
	}
	public sbi getObject()
	{
		return this;
	}
}
