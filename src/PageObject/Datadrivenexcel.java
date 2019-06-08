package PageObject;


public class Datadrivenexcel {
	public static void main(String [] args) throws Exception
	{
	
		String Path,SheetName;
		Path="C:\\Users\\welcome\\Desktop\\TestExcel.xlsx";
		SheetName="Sheet1";
		
		excelutils ex=new excelutils(Path, SheetName);
		int r=ex.excel_get_rows();
		System.out.println("No of Rows : "+r);
		
		for (int i=1;i<r;i++)
		{
			for(int j=0;j<=3;j++) 
			{
				String CellData=ex.getCellDataasstring(i, j);
				//System.out.print (CellData +"\t");
				

				double CellData1=ex.getCellDataasnumber(i, j);
				//System.out.print (CellData1+"\t");
				
				
			}
			System.out.println();
		}
		
		/* String data=ex.getCellDataasstring(2, 2);
		
		//System.out.println("The Data : "+ data);
		

		double d=ex.getCellDataasnumber(2, 2);
		System.out.println("Result : "+d);
		
		

		String data1=ex.getCellDataasstring(3, 3);
		
		//System.out.println("The Data : "+ data1);
		
		
		
		double d1=ex.getCellDataasnumber(3, 3);
		System.out.println("Result : "+d1); */
		
		
	}

}
