package dbfit;

import org.dbfit.db2.DB2Environment;

public class DB2Test  extends DatabaseTest {
	public DB2Test(){
		super(new DB2Environment());
	}
	public void dbfitDotDB2Test() {
		// required by fitnesse release 20080812
	}
}