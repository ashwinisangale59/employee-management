package designpattern;

public class SingelTone {
	private static SingelTone insta;
	
	private SingelTone() {}
	
	private static synchronized SingelTone getinst() {
		if(insta==null) {
			synchronized(SingelTone.class) {
				if(insta==null)
			insta=new SingelTone();
		}
		}
		return insta;
	}
}
