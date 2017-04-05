package db.bridgeOnline.com;

public class macBobUserDbVar extends dbVar {
	public macBobUserDbVar()
	{
		this.setjClassName("org.mariadb.jdbc.Driver");
		this.setDb("WinningBidding");
		this.setPasswd("BobUser=12436");
		this.setUser("BobUser");
		this.setUrl("jdbc:mariadb://localhost:3306");
	}

}
