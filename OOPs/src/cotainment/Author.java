package cotainment;

public class Author {
	private int  Aid;
	private String Aname;
	
	public Author() {
		
	}
	public Author(int Aid,String Aname) {
		this.Aid=Aid;
		this.Aname=Aname;
	}
	public void setAid(int Aid) {
		this.Aid=Aid;
	}
	public int getAid() {
		return Aid;
	}
	public void setAname(String Aname) {
		this.Aname=Aname;
	}
	public String getAname() {
		return Aname;
	}
	public String toString()
	{
		return "Author:"+Aid+" "+Aname;
	}

}
