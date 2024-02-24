package beans;
import java.util.*;
public class Test {
	private List fruits;
	private Set cricketers;
	private Map cc;
	public List getFruits() {
		return fruits;
	}
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public Set getCricketers() {
		return cricketers;
	}
	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}
	public Map getCc() {
		return cc;
	}
	public void setCc(Map cc) {
		this.cc = cc;
	}
	public void printData() {
		System.out.println("Fruits....");
		for(Object fruit :fruits) {
			System.out.println("Fruits ...   "+fruit);
		}
		System.out.println("Cricketers .......");
		for(Object ckt : cricketers  ) {
			System.out.println(" Cricketers  ... "+ckt);
		}
		Set keys = cc.keySet();
		System.out.println("Country \t Capital");
		for(Object key : keys) {
			System.out.println(key +" \t "+cc.get(key) );
		
		}
	}

}
