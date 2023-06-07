public class Acastu extends per_stu {

	
    String EnrollNo,result;
    
    public String getenrollno()
    {
    	return EnrollNo;
     }
    public String getresul()
    {
    	return result;
    }
    public void setenrollno(String enroll)
    {
    	this.EnrollNo=enroll;
    }
    public void setresult(String resu)
    {
    	this.result=resu;
    }
    @Override
    public String toString()
    {
     return ("enrollment no="+ getenrollno() +"result="+ getresul() + "name ="+ getname() +"getadress ="+ getaddress() + "email =" + getemail()  );
     }
	}


