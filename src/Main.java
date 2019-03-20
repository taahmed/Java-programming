
public class Main {

	public static void main(String[] args) {
		MediaType[] libMedia = new MediaType[5];
		
		libMedia[0] = new Books("001", "csharp", "Quincy", "Amazon");
		libMedia[1] = new Magazines ("002", "newyorktimes", "Lynda");
		libMedia[2] = new Cd("003", "World", "Jacky" );
		libMedia[3] = new Dvd("004", "Linuxvideo", "Craig" );
		libMedia[4] = new Books("005", "Python", "Conger", "SClibrary");
		
		for (int i=0; i< libMedia.length; i++) {
			System.out.println(libMedia[i].toString());
			System.out.println();
		}
		
		libMedia[2].setReserve(true);
		System.out.println(libMedia[2].toString());
		System.out.println();
		
		libMedia[4].setborrowStatus(true);
		System.out.println(libMedia[4].toString());
		System.out.println();
		
	}
	
}