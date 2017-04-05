package db.bridgeOnline.com;

public class fileMeta extends meta {
	private dbMeta dbMetaObj;

	public fileMeta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public fileMeta(dbColumn[] colA, int columnCount, boolean valid) {
		super(colA, columnCount, valid);
		// TODO Auto-generated constructor stub
	}
	public fileMeta(dbMeta metaObj, String header, String delim) throws dbException {
		this.setDbMetaObj(metaObj);
		String [] columnArr;
		columnArr=header.split(delim);
		this.setColumnCount(columnArr.length);
		this.setColA(this.makeColumns(columnArr));
	
	}
	public fileMeta(dbMeta metaObj, String [] header) throws dbException {
		this.setDbMetaObj(metaObj);
		
		this.setColumnCount(header.length);
		this.setColA(this.makeColumns(header));
	
	}
	private dbColumn[] makeColumns(String[] columnArr) throws dbException {
		// TODO Auto-generated method stub
		dbColumn allocObj,colObj;
		dbColumn [] ar;
		ar=new dbColumn[this.getColumnCount()];
		int i,ct,find;
		String cn;
		ct=this.getColumnCount();
		for(i=0;i<ct;i++)
		{
			cn=columnArr[i];
			find=this.getDbMetaObj().findColumn(cn);
			if(find < 0)
			{
				dbException ex;
				ex=new dbException(-100,"Could not find ("+cn+") in "+this.getDbMetaObj().getTableName());
				throw ex;
			}
			colObj=this.getDbMetaObj().retColumnObj(find);
			allocObj=new dbColumn(colObj);
			ar[i]=allocObj;
			
		}
		return ar;
	}

	public dbMeta getDbMetaObj() {
		return dbMetaObj;
	}

	public void setDbMetaObj(dbMeta dbMetaObj) {
		this.dbMetaObj = dbMetaObj;
	}

}
