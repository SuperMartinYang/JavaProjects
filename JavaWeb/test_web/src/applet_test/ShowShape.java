package applet_test;

import java.applet.Applet;
import java.awt.*;
import javax.swing.JOptionPane;

public class ShowShape extends Applet {
	private int shapeX,shapeY,fontX,fontY;
	private String strMessage, strShape,strColor,strBgcolor;
	private String strShapeW,strShapeH,strFstyle,strFsize;
	private int intShapeW, intShapeH,intFstyle,intFsize;
	private String error;
	private Color color,bgcolor;
	private Font font,smpFont;
	private FontMetrics fontMetrics,smpFMetrics;
	private int fontW,fontH;
	
	public ShowShape() {
		super();
	}
	
	public void getParam() 
    {   //message
    		error="";
    		try {
    			this.strMessage = getParameter("Message");
    			if(this.strMessage == null) {
    				throw new NullPointerException();
    			}
    		}
    		catch(NullPointerException localNullPointerException1) {
    			this.strMessage = "default case";
    			System.out.println("Message can't be recognized.");
    		}
    		//shape
    		try {
    			this.strShape = getParameter("Shape");
    			if(this.strShape == null) {
    				throw new NullPointerException();
    			}
    			else if(this.strShape.equals("OVAL")
    				||this.strShape.equals("RECT")
    				||this.strShape.equals("ROUNDRECT"));
    			else this.strShape = "RECT";
    			
    		}
    		catch(NullPointerException localNullPointerException1) {
    			this.strShape = "RECT";
    			System.out.println("Shape can't be recognized.");
    			
    		}
    		//color	
    		try {
    			this.strColor = getParameter("Color");    		
    			if(this.strColor == null ) {
    				throw new NullPointerException();
    			}
    				
    		}
    		catch (NullPointerException localNullPointerException2)
		    {
		      this.strColor = "red";
		      System.out.println("Color can't be recognized.");
		      
		    }
    		//background color
    		try {
    			this.strBgcolor = getParameter("BGColor");    		
    			if(this.strBgcolor == null ) {
    				throw new NullPointerException();
    				
    			}	
    		}
    		catch (NullPointerException localNullPointerException2)
		    {
		      this.strBgcolor = "yellow";
		      System.out.println("Background color can't be recognized.");
	   }
    		//shape width
    		try {
    			this.strShapeW = getParameter("X");
    			if(this.strShapeW == null) {
    				throw new NullPointerException();
    			}
    			this.intShapeW = Integer.parseInt(this.strShapeW);
    		}
    		catch(NumberFormatException localNumberFormatException1)
    		{
    			this.intShapeW = 100;
    			System.out.println("X can't be recognized.");
    		}
    		catch(NullPointerException localNullPointerException5) {
    			this.intShapeW = 100; 
    			System.out.println("X can't be recognized.");
    		}
    		//shape height
    		try {
    			this.strShapeH = getParameter("Y");
    			if(this.strShapeH == null) {
    				throw new NullPointerException();
    			}
    			this.intShapeH = Integer.parseInt(this.strShapeH);
    		}
    		catch(NumberFormatException localNumberFormatException1)
    		{
    			this.intShapeH = 100;
    			System.out.println("Y can't be recognized.");
    		}
    		catch(NullPointerException localNullPointerException5) {
    			this.intShapeH = 100; 
    			System.out.println("Y can't be recognized.");
    		}
    		//font style
    		try {
    			this.strFstyle = getParameter("FTStyle");
    		    if(this.strFstyle == null){throw new NullPointerException();}
    		}
    		catch(NullPointerException localNullPointerException7) {
    			this.strFstyle = "ITALIC";
    			System.out.println("FTStyle can't be recognized.");
    		}
    		//font size
    		try{
    			this.strFsize = getParameter("FTSize");
    			if(this.strFsize == null) {throw new NullPointerException();}
    			else this.intFsize = Integer.parseInt(this.strFsize);
    			}
    			catch(NullPointerException localNullPointerException5) {
    				this.intFsize = 10; 
    				System.out.println("FTSize can't be recognized.");
    			}
    			catch(NumberFormatException localNumberFormatException3)
    			{
    				this.intFsize = 10;
    				System.out.println("FTSize can't be recognized.");
    			}
    		
    }
	
	
	public void destroy() {
		
	}

	
	public String getAppletInfo() {
		return "This is my default applet created by Eclipse";
	}

	
	public void init() {
		resize(300,150);
		getParam();
		switch(this.strColor){
        case "black":
            this.color =Color.black;
            break;
		case "blue":
            this.color =Color.blue;
            break;
		case "cyan":
            this.color =Color.cyan;
            break;
		case "darkGray":
            this.color =Color.darkGray;
            break;
		case "gray":
            this.color =Color.gray;
            break;
		case "green":
            this.color =Color.green;
            break;
		case "lightGray":
            this.color =Color.lightGray;
            break;
		case "magenta":
            this.color =Color.magenta;
            break;
		case "orange":
            this.color =Color.orange;
            break;
		case "pink":
            this.color =Color.pink;
            break;
		case "red":
            this.color =Color.red;
            break;
		case "white":
            this.color =Color.white;
            break;
		case "yellow":
            this.color =Color.yellow;
            break;
        default:
		    this.color =Color.red;
    }
		
		switch(this.strBgcolor){
        case "black":
            this.bgcolor =Color.black;
            break;
		case "blue":
            this.bgcolor =Color.blue;
            break;
		case "cyan":
            this.bgcolor =Color.cyan;
            break;
		case "darkGray":
            this.bgcolor =Color.darkGray;
            break;
		case "gray":
            this.bgcolor =Color.gray;
            break;
		case "green":
            this.bgcolor =Color.green;
            break;
		case "lightGray":
            this.bgcolor =Color.lightGray;
            break;
		case "magenta":
            this.bgcolor =Color.magenta;
            break;
		case "orange":
            this.bgcolor =Color.orange;
            break;
		case "pink":
            this.bgcolor =Color.pink;
            break;
		case "red":
            this.bgcolor =Color.red;
            break;
		case "white":
            this.bgcolor =Color.white;
            break;
		case "yellow":
            this.bgcolor =Color.yellow;
            break;
        default:
		    this.bgcolor =Color.gray;
    }
		setBackground(this.bgcolor);
		
		switch(this.strFstyle){
        case "REGULAR":
        	    this.intFstyle =0;
            break;
		case "BOLD":
			this.intFstyle =1;
            break;
		case "ITALIC":
			this.intFstyle =2;
            break;
		case "BOLD ITALIC":
			this.intFstyle =3;
            break;
		default:
		    this.intFstyle =0;
		}
		
		this.font = new Font("Monospaced",this.intFstyle,this.intFsize);
		
		if(this.intShapeH>=150) {
			this.error += "The height of Shape is too long.";
			this.intShapeH=150;
		}
		else this.shapeY = (150-this.intShapeH)/2;
		if(this.intShapeW>=300) {
			this.error += "The width of Shape is too long.";
			this.intShapeW=300;
		}
		else this.shapeX = (300-this.intShapeW)/2;
		
		this.fontMetrics=getFontMetrics(this.font);
		this.fontW=this.fontMetrics.stringWidth(this.strMessage);
		this.fontH=this.fontMetrics.getHeight();
		
		if(this.fontW>=intShapeW) {
			this.error += "The width of Font is too long.";
			this.intFsize =10;
			this.smpFont=new Font("Monospaced",this.intFstyle,intFsize);
			this.smpFMetrics=getFontMetrics(this.smpFont);
			this.fontH=this.smpFMetrics.getHeight();
			this.fontW=this.smpFMetrics.stringWidth(this.strMessage);
			this.font = this.smpFont;
			this.fontMetrics = this.smpFMetrics;
		}
		this.fontX=this.shapeX+(this.intShapeW-this.fontW)/2;

		
		if(this.fontH>=intShapeH) {
			this.error += "The height of Font is too long.";
			this.intFsize =10;
			this.smpFont=new Font("Monospaced",this.intFstyle,intFsize);
			this.smpFMetrics=getFontMetrics(this.smpFont);
			this.fontH=this.smpFMetrics.getHeight();	
			this.fontW=this.smpFMetrics.stringWidth(this.strMessage);
			this.font = this.smpFont;
			
			this.fontMetrics = this.smpFMetrics;
			
			
		}
		this.fontY=this.shapeY+(this.intShapeH-this.fontH)/2+this.fontMetrics.getAscent();
		
		if (this.error != "") {
		      JOptionPane.showMessageDialog(this,this.error);
		    }
	}
	public void paint( Graphics g )	
	{
		showStatus(this.error);
		g.setColor(this.color);
		switch(this.strShape){
		case "OVAL":
			g.drawOval(this.shapeX,this.shapeY, this.intShapeW, this.intShapeH);
            break;
		case "RECT":
			g.drawRect(this.shapeX, this.shapeY, this.intShapeW, this.intShapeH);
            break;
		case "ROUNDRECT":
			g.drawRoundRect(this.shapeX, this.shapeY, this.intShapeW, this.intShapeH, 10, 10);
            break;
    }
			g.setFont(this.font);
			g.drawString(this.strMessage, this.fontX, this.fontY);
		}
	
	public void start() {
		
	}

	
	public void stop() {
		
	}

}
