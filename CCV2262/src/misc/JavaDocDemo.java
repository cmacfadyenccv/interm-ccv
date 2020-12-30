/**
 * JavaDocDemo demonstrates the use of comments to create documentation
 * @author Charles MacFadyen
 */

package misc;

public class JavaDocDemo {
	
	/**
	 * Information displayed by the demo
	 */
	private String info;
	
	/**
	 * Constructs a demo with default text
	 */
	public JavaDocDemo() {
		info = "Basic example";
	}
	
	/**
	 * Constructs a demo with given text
	 * @param info the text to be displayed
	 */
	public JavaDocDemo(String info) {
		this.info = info;
	}
	
	
	public String getInfo() {
		return info;
	}
	
	/**
	 * Adds text to the information string
	 * @param addedInfo the text to add
	 * @return true if information is appended; false if initial info
	 */
	public boolean addInfo(String addedInfo) {
		if(info.equals("Basic example")) {
			info = addedInfo;
			return false;
		}
		else {
			info = info + " " + addedInfo;
			return true;
		}
	}
	
	
	public String toString() {
		return "This is a demo";
	}
	
	

}
