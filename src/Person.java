
public class Person {

	private String fname;
	private String lname;
	private int index; 
	
public Person(String Fullname){
		
		char[] cArr = Fullname.toCharArray();
		
		for(int i = 0; i < cArr.length; i++){
			if(cArr[i] == ' '){
				index = i;
			}
		}
		this.fname = Fullname.substring(index);
		this.lname = Fullname.substring(0, index);
		
	}
	
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	} 
		

	
	
}
