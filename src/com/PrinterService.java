package com;


import dialog_salesOrder.SalesOrder_Tender;
import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;
import javax.imageio.ImageIO;
 
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
 
public class PrinterService implements Printable {
	public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss a";
        public String companyName = "CMCommercial";
        public String companyAddress = "address";
        public String companyCity = "Agusan del Sur";
        public String phoneNum = "sample phone num";
        public String vatReg = "sample vat reg";
        public String permitNum = "sample permit num";
        public String cashierName = "cashier name here";
        public String customerName = "customer name here";
        public Integer invoice = 0;
        public int paymentType = 0;
        public float change = 0;
        public float totalNet = 0;
        public float cash = 0;
        
        Vector<Vector<String>> rows = new Vector<Vector<String>>(); //data
        Vector<String> col = new Vector<String>();
        public PrinterService()
        {
            rows = new Vector<Vector<String>>();
            col = new Vector<String>();
            paymentType = 0;
            cashierName = "";
            customerName = "";
            change = 0;
            cash = 0;
            totalNet = 0;
        }
        public float getRealFloat(String floatNum)
        {
            StringBuilder sb = new StringBuilder(floatNum);
            for(int i=0;i<floatNum.length();i++)
            {
                if(floatNum.charAt(i) == ',') sb.deleteCharAt(i);
            }
            float result = Float.parseFloat(sb.toString());
            return result;
        }
        public void setPrinterData(javax.swing.JTable data,String cashierName,String customerName,int paymentType)
        {
            /* Table Index Data         Payment Type
            * 1 - barcode   0            1 - cash
            * 2 - product name  1        2 - credit
            * 3 - color   2              3 - credit pull out
            * 4 - size  3
            * 5 - qty  4
            * 7 - dscount 5
            * 8 - discounted price  6
            */
            total_item_count =0; //init
            switch(paymentType)
            {
                case 1:
                    StringBuilder change = new StringBuilder(SalesOrder_Tender.lbl_CashChange.getText());
                    StringBuilder totalNet = new StringBuilder(SalesOrder_Tender.lbl_CashTotal.getText());
                    change.deleteCharAt(0);
                    totalNet.deleteCharAt(0);
                    total_item_count = data.getRowCount();
                    this.paymentType = paymentType;
                    this.cashierName = cashierName;
                    this.customerName = customerName;
                    
                    this.change = getRealFloat(change.toString());
                    this.totalNet = getRealFloat(totalNet.toString());
                    this.cash = Float.parseFloat(SalesOrder_Tender.txt_CashAmount.getText());
                    
                    for(int i=0;i<data.getRowCount();i++)
                    {
                        col = new Vector<String>();
                        col.add(data.getValueAt(i, 1).toString()); //barcode
                        col.add(data.getValueAt(i, 2).toString()); //product name
                        col.add(data.getValueAt(i, 3).toString()); //color
                        col.add(data.getValueAt(i, 4).toString()); //size
                        col.add(data.getValueAt(i, 5).toString()); //qty
                        col.add(data.getValueAt(i, 7).toString()); //discount
                        col.add(data.getValueAt(i, 8).toString()); //dscounted price
                        rows.add(col);
                    }
                    
                    break;
                case 2:
                    this.paymentType = paymentType;
                    break;
                case 3:
                    this.paymentType = paymentType;
                    break;
                default:
                    break;
            }
        }
        
	public List<String> getPrinters(){
		
		DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
		PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
		
		PrintService printServices[] = PrintServiceLookup.lookupPrintServices(
				flavor, pras);
		
		List<String> printerList = new ArrayList<String>();
		for(PrintService printerService: printServices){
			printerList.add( printerService.getName());
		}
		
		return printerList;
	}
        public static int total_item_count=0;
        protected static double convert_CM_To_PPI(double cm) {            
	        return toPPI(cm * 0.393600787);            
}
        protected static double toPPI(double inch) {            
	        return inch * 72d;            
}
        public static PageFormat getPageFormat(PrinterJob pj){
        PageFormat pf = new PageFormat();
        Paper paper = pf.getPaper();    
             
                double width = 1473.2;      //printer know only point per inch.default value is 72ppi
                // 58mm = 1473.2ppi 57mm = 1447.8ppi
        	double height = 50; 
            paper.setSize(width, height);
            paper.setImageableArea(
                            convert_CM_To_PPI(0.25), 
                            convert_CM_To_PPI(0.5), 
                            width - 1473.2, 
                            height - height);   //define boarder size    after that print area width is about 180 points
            
           // pf.setOrientation(PageFormat.PORTRAIT);           //select orientation portrait or landscape but for this time portrait
            pf.setPaper(paper);    
            
            return pf;
}
 
	@Override
	public int print(Graphics g, PageFormat pf, int page)
			throws PrinterException {
		if (page > 0) { /* We have only one page, and 'page' is zero-based */
			return NO_SUCH_PAGE;
		}
		/*
		 * User (0,0) is typically outside the imageable area, so we must
		 * translate by the X and Y values in the PageFormat to avoid clipping
		 */
		Graphics2D g2d = (Graphics2D) g;
                
		/* Now we perform our rendering */
               int y=0;
                try //logo here
                {
                    int x=40 ;                                //print start at 10 on y axies
                    int imagewidth=50;
                    int imageheight=50;
                    BufferedImage read = ImageIO.read(PrinterService.class.getResource("/zImages/logo3.png"));
                    g2d.drawImage(read,x,y,imagewidth,imageheight,null); 
                }catch(IOException e)
                {
                    e.printStackTrace();
                }
                //HEADER init center
		g.setFont(new Font("Times New Roman", Font.BOLD, 13));
		g.drawString("CM COMMERCIAL", 6, y+60);
                y+=60; //new y initialization after logo and header
                //x and y is modifiable
                    g.setFont(new Font("Consolas", 0, 8));
                    g.drawString(companyAddress,25,y+30); //modifiable depending on the length
                    g.drawString(companyCity,25,y+40); //modifiable depending on the length
                    g.drawString(now(), 25, y+50); //the time. x and y is modifiable
                    g.drawString("Invoice#: "+invoice, 0, y+70);
                    g.drawString("Phone#: "+phoneNum, 0, y+80);
                    g.drawString("VatRegTIN#: "+vatReg, 0, y+90);
                    g.drawString("Permit#: "+permitNum, 0, y+100);//\n\n
                    g.drawString("Customer: "+customerName, 0, y+120);
                    g.drawString("Cashier: "+cashierName, 0, y+130);
                    g2d.setStroke(new BasicStroke(2));
                    g2d.drawLine(0, y+150, 180, y+150);
                //BODY
                    //title
                    g.drawString("ITEM", 0, y+160);
                    g.drawString("QTY", 45, y+160);
                    g.drawString("%", 80, y+160);
                    g.drawString("%PRICE", 100, y+160);
                y+=160; //re initial y after the header
                int cH = (y+10);
                for(int i=0;i<total_item_count;i++)
                {
                    g.drawString(rows.get(i).get(4), 45, cH); //qty
                    g.drawString(rows.get(i).get(5), 80, cH); //%
                    g.drawString(rows.get(i).get(6), 100, cH); //%price
                    g.drawString(rows.get(i).get(1)+" "+rows.get(i).get(3)+" "+rows.get(i).get(2),0,cH+10); // item name size color
                    
                    cH = cH + 20;
                }
                
                //FOOTER
                g2d.setStroke(new BasicStroke(2));
                g2d.drawLine(0, cH+10, 180, cH+10);
                    g.drawString("TOTAL: PHP "+totalNet, 45, cH+20);
//                g.drawString("Signature:", 0, cH+40);
                //signature
                    g.drawString("Payment Type: CASH", 0, cH+100);
                    g.drawString("CASH: PHP "+cash, 45, cH+110);
                    g.drawString("CHANGE: "+change, 45, cH+120);
                g.drawString("Thank you! Please Come Again!", 0, cH+140);
                
                
		return PAGE_EXISTS;
	}
 
	public void printString(String printerName, String text) {
		
		// find the printService of name printerName
		DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
		PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
 
		PrintService printService[] = PrintServiceLookup.lookupPrintServices(
				flavor, pras);
		PrintService service = findPrintService(printerName, printService);
 
		DocPrintJob job = service.createPrintJob();
 
		try {
 
			byte[] bytes;
 
			// important for umlaut chars
			bytes = text.getBytes("CP437");
 
			Doc doc = new SimpleDoc(bytes, flavor, null);
 
			
			job.print(doc, null);
 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
	}
 
	public void printBytes(String printerName, byte[] bytes) {
		
		DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
		PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
 
		PrintService printService[] = PrintServiceLookup.lookupPrintServices(
				flavor, pras);
		PrintService service = findPrintService(printerName, printService);
                
		DocPrintJob job = service.createPrintJob();
 
		try {
 
			Doc doc = new SimpleDoc(bytes, flavor, null);
 
			job.print(doc, null);
 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private PrintService findPrintService(String printerName,
			PrintService[] services) {
		for (PrintService service : services) {
			if (service.getName().equalsIgnoreCase(printerName)) {
				return service;
			}
		}
 
		return null;
	}
        public String now() {
            //get current date and time as a String output   
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
            return sdf.format(cal.getTime());
        }
//        public static void main(String[] args) {
// 
//            PrinterService printerService = new PrinterService();
//            PrinterJob pj = PrinterJob.getPrinterJob();
//            pj.setPrintable(new PrinterService(),PrinterService.getPageFormat(pj));
//            try {
//                pj.print();
//            }
//            catch (PrinterException ex) {
//                ex.printStackTrace();
//            }
		//System.out.println(printerService.getPrinters());
				
		//print some stuff
//		printerService.printString("POS-80-Series", printerService.companyName+"\n"
//                                + printerService.companyAddress+"\n"
//                                + printerService.companyCity+"\n\n"
//                                        + printerService.now() +"\n"
//                                + "Phone #: "+printerService.phoneNum+"\n"
//                                + "VAT Reg: "+printerService.vatReg+"\n"
//                                + "Permit #: "+printerService.permitNum+"\n\n"
//                                + "Customer Name: "+printerService.customerName+"\n"
//                                + "Cashier: "+printerService.cashierName+"\n"
//                                + "\nTHIS SERVES AS AN OFFICIAL RECEIPT\n\n\n\n\n");
 
                //cut that paper!
//		byte[] cutP = new byte[] { 0x1d, 'V', 1 };
//// 
//		printerService.printBytes("POS-80-Series", cutP);
               
	
	//}
}
 