package Collection;

public class AuthorDetails {
	private int authorid;
	private String authorname;
	private String address;
//	private String bookname;

	
	public AuthorDetails(int authorid, String authorname, String address) {
		super();
		this.authorid = authorid;
		this.authorname = authorname; 
		this.address = address;
//		this.bookname = bookname;
	}
	@Override
	public String toString() {
		return "\n AuthorDetails [authorid=" + authorid + ", authorname=" + authorname + ", address=" + address+"]";
	}
	public synchronized int getAuthorid() {
		return authorid;
	}
	public synchronized void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public synchronized String getAuthorname() { 
		return authorname;
	}
	public synchronized void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
//	public synchronized String getBookname() {
//		return bookname;
//	}
//	public synchronized void setBookname(String bookname) {
//		this.bookname = bookname;
//	}
	public synchronized String getAddress() {
		return address;
	}
	public synchronized void setAddress(String address) {
		this.address = address;
	}
	public int hashCode(){
		System.out.println("In Hashcode method   "+ authorname.hashCode());
		return authorname.hashCode();
				
	}
	public void equals1(Object o) { 
		System.out.println("In equals method");
		boolean flag =  false;
		if (o instanceof AuthorDetails)
		{
			AuthorDetails c = (AuthorDetails)o;
			if (c.authorname==this.authorname) {
				flag =  true;
				System.out.println(c.authorname);
			}
			}
		
	}
}
