package db.bridgeOnline.com;

public class meta {
	private dbColumn [] colA;
	private int columnCount;
	private boolean valid;
	
	public meta() {
		super();
	}
	
	public meta(dbColumn[] colA, int columnCount, boolean valid) {
		super();
		this.setColA(colA);
		this.setColumnCount(columnCount);
		this.setValid(valid);
	}
	public int findColumn(String columnName)
	{
		int i,ct;
		dbColumn colObj;
		ct=this.getColumnCount();
		for(i=0;i<ct;i++)
		{
			colObj=this.getColumn(i);
			if(colObj.equalsIgnoreCase(columnName)) return i;
			
			
		}
		return -1;
		
	}	
	public dbColumn getColumn(int i) {
		// TODO Auto-generated method stub
		if(i <0 || i>=this.getColumnCount()) return null;
		return this.getColA()[i];
	
	}

	public dbColumn[] getColA() {
	
		return colA;
	}
	public dbColumn retColumnObj(int argColIndex) {
		// TODO Auto-generated method stub
		dbColumn ret;
		ret=this.getColA()[argColIndex];
		return ret;
	}
	public void setColA(dbColumn[] colA) {
		this.colA = colA;
	}
	public int getColumnCount() {
		return columnCount;
	}
	public void setColumnCount(int columnCount) {
		this.columnCount = columnCount;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
}
