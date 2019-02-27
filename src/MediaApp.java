import java.util.Scanner;

public class MediaApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		boolean next = false;

		// arrays
		Artist[] artistcd = new Artist[1000];
		int cda = 0;
		Artist[] majorcd = new Artist[1000];
		int cdma = 0;
		CD[] cd = new CD[100];
		int ccd = 0;
		Artist[] artistdvd = new Artist[1000];
		int dvda = 0;
		Artist[] majordvd = new Artist[1000];
		int dvdma = 0;
		DVD[] dvd = new DVD[100];
		int cdvd = 0;

		// create cd1 with artist
		Artist ma1 = new Artist("Jimbo", "Jenkins", "04/02/00", "jimborocks", "jimboboy.org");
		Artist[] gm1 = new Artist[] { new Artist("jimmy", "newtron", "03/23/2033", "Boygenius", "Science.org"),
				new Artist("jim", "tron", "03/20/1993", "genius", "ecneics.org") };
		String[] t1 = new String[] { "science is for nerds", "my dog ate my toast", "helcoptors are littt" };
		Artist p1 = new Artist("bo", "Jenkins", "04/02/2000", "jimborocks", "bo.net");

		CD cd1 = new CD("boys gone wild", ma1, 420, gm1, t1.length, p1, t1, 3);
		cd[ccd] = cd1;
		ccd++;

		//checks to makes sure no artist are duped
		if (noDupes(majorcd, ma1, cdma)) {cdma++;}
		if (noDupes(artistcd, ma1, cda)) {cda++;}
		for (int i = 0; i < gm1.length; i++) {
			if (noDupes(artistcd, gm1[i], cda)) {cda++;}
		}
		if (noDupes(artistcd, p1, cda)) {cda++;}
		

		//create cd2 with artist
		Artist ma2 = new Artist("Jimbo", "Jenkins", "04/02/00", "jimborocks", "jimboboy.org");
		Artist[] gm2 = new Artist[] { new Artist("jimmy", "newtron", "03/23/2033", "Boygenius", "Science.org"),
				new Artist("jim", "tron", "03/20/1993", "genius", "ecneics.org") };
		String[] t2 = new String[] { "Going hard on code", "my cat ate a bird", "submarines are cooool" };
		Artist p2 = new Artist("bo", "Jenkins", "04/02/2000", "jimborocks", "bo.net");
		
		CD cd2 = new CD("boys just gonna be boys", ma2, 840, gm2, t2.length, p2, t2, 5);
		cd[ccd] = cd2;
		ccd++;
		
		//checks to makes sure no artist are duped
				if (noDupes(majorcd, ma2, cdma)) {cdma++;}
				if (noDupes(artistcd, ma2, cda)) {cda++;}
				for (int i = 0; i < gm2.length; i++) {
					if (noDupes(artistcd, gm2[i], cda)) {cda++;}
				}
				if (noDupes(artistcd, p2, cda)) {cda++;}
		
		// creates dvd with actors
		Artist ma3 = new Artist("gill", "manikan", "10/2/1998", "grillgill", "gill.com");
		Artist[] sup1 = new Artist[] { new Artist("jane", "timbers", "05/15/2014", "jaminjane", "allaboutjane.com"),
				new Artist("sydney", "tollen", "12/20/2013", "trolltoll", "sydneyTollen.org") };
		String[] s1 = new String[] { "Souround sound", "basss max" };
		String[] f1 = new String[] { "3D", "Gore" };
		Artist d1 = new Artist("boppin", "Studios", "05/11/2000", "wazboppin", "boppin.net");

		DVD dvd1 = new DVD("Maximum Power", ma3, 600, sup1, sup1.length, d1, 2, f1, f1.length, null, "TV Format", s1, s1.length);
		dvd[cdvd] = dvd1;
		cdvd++;
		majordvd[dvdma] = ma3;
		dvdma++;
		
		//checks to makes sure no actors are duped
		if (noDupes(artistdvd, ma3, dvda)) {dvda++;}
		for (int i = 0; i < sup1.length; i++) {
			if (noDupes(artistdvd, sup1[i], dvda)) {dvda++;}
		}
		if (noDupes(artistdvd, d1, dvda)) {dvda++;}

//Beginning of the program that is printed
		System.out.println("Hello, and welcome to the Media Library.");

		while (!exit) {
			System.out.println("\nIf you wish to list all media enter 1."
					+ "\nIf you want the list of all data from a specific media enter 2."
					+ "\nIf you want all the media related to a specific major artist enter 3."
					+ "\nIf you wish to play a specific media enter 4."
					+ "\nIf you would like to know the amount of plays for a certain media enter 5"
					+ "\nIf you wish to exit type exit or 6");
			String begin = sc.nextLine();

			// Exits While
			if (begin.equalsIgnoreCase("exit") || begin.equals("6")) {
				exit = true;
			}

			switch (begin) {

			// List all Media
			case ("1"):

				for (int i = 0; i < ccd; i++) {
					System.out.println(
							"Title: " + cd[i].getTitle() + "\nType: CD" + "\nNumber of plays:" + cd[i].getNumPlays());
				}

				for (int i1 = 0; i1 < cdvd; i1++) {
					System.out.println("Title:" + dvd[i1].getTitle() + "\nType: DVD" + "\nNumber of plays:"
							+ dvd[i1].getNumPlays());
				}
				next=false;
				break;

			// List Specific Media
			case ("2"):
				while (!next) {
					System.out.println("Do you want CD or DVD?");
					String ans = sc.nextLine();

					if (ans.equalsIgnoreCase("cd")) {
							System.out.println(cd[1].toString());
						next = true;
					} 
					
					else if (ans.equalsIgnoreCase("dvd")) {
							System.out.println(dvd[0].toString());
						next = true;
					} 
					else {
						next = false;
					}
				}
			next=false;
				break;

			// List Major Artist Media
			case ("3"):
				while (!next) {
					System.out.println("Do you want CD or DVD?");
					String ans = sc.nextLine();

					if (ans.equalsIgnoreCase("cd")) {
						for (int i = 0; i < cdma; i++) {
							System.out.println(majorcd[i].toString());
						}
						next = true;
					} 
					else if (ans.equalsIgnoreCase("dvd")) {
						for (int i1 = 0; i1 < dvdma; i1++) {
							System.out.println(majordvd[i1].toString());
						}
						next = true;
					} 
					else {
						next = false;
					}
				}
			next=false;
				break;

			// Play Media
			case ("4"):
				while (!next) {
					System.out.println("Do you want CD or DVD?");
					String ans = sc.nextLine();
					if (ans.equalsIgnoreCase("cd")) {
						System.out.println(cd[0].playMedia());
						next = true;
					}

					else if (ans.equalsIgnoreCase("dvd")) {
						System.out.println(dvd[0].playMedia());
						next = true;
					}

					else {
						next = false;
					}
				}
			next=false;

				break;

			// Amount of plays for specific media
			case ("5"):
				while (!next) {
					System.out.println("Do you want CD or DVD?");
					String ans = sc.nextLine();
					if (ans.equalsIgnoreCase("cd")) {
						System.out.println("Amount of plays for this media is:" + cd[0].getNumPlays());
						next = true;
					}

					else if (ans.equalsIgnoreCase("dvd")) {
						System.out.println("Amount of plays for this media is:" + dvd[0].getNumPlays());
						next = true;
					}

					else {
						next = false;
					}
				}
			next=false;
				break;
			}
		}

		System.out.println("Thank you for using this program, Have a wonderful rest of your day!");
		
	}	
	
	//searchs for equals in artist
	public static int search(Object[] arr, Object K) {
		boolean search = false;
		int num = -1;
		
		for(int i=0; i<arr.length && !search && (arr[i] !=null); i++) {
			if(arr[i].equals(K)) {
				num = i;
				search = true;
			}
		}
		
		return num;
	}
	
	//looks for dupes
	public static boolean noDupes(Object[] arr, Object add, int arrCount) {
		boolean dupe = true;
		
		if(search(arr,add) == -1) {
			
			arr[arrCount] = add;
			dupe = false;
		}
		return dupe;
	}
}
