
public class Person implements Comparable<Person> {

	private String fname;
	private String lname;
	private int index; 
	
	Person(String Fullname){
		
		char[] cArr = Fullname.toCharArray();
		
		for(int i = 0; i < cArr.length; i++){
			if(cArr[i] == ' '){
				index = i;
			}
		}
		this.fname = Fullname.substring(index);
		this.lname = Fullname.substring(0, index);
		
	}
	
	public String getFullName(){
		return lname + " " + fname;
	}
	
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}

	@Override
	public int compareTo(Person o) {
		String l = lname.substring(0, 2);
		String i = fname.substring(0, 2);
		
		if(l.compareTo(o.getLname()) == 0){
			return i.compareTo(o.getFname());
			
		}
		else{
			return l.compareTo(o.getLname());
		}
		
		
	} 
		

	
	
}
