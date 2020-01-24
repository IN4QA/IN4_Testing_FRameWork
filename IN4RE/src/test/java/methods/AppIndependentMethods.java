package methods;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import driver.DriverScript;
import net.sourceforge.htmlunit.corejs.javascript.JavaScriptException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class AppIndependentMethods extends DriverScript{

	/************************************
	 * Method Name	: readConfig()
	 * Purpose		: to read the config data
	 * Author		: Sachin
	 * Reviewer		: Ganesh
	 * Example		: String strDT = readConfig("URL");
	 * ***********************************
	 */
	public String readConfig(String strPropName)
	{
		FileInputStream fin = null;
		Properties prop = null;
		try {
			fin = new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\config.properties");
			prop = new Properties();
			
			prop.load(fin);
			
			return prop.getProperty(strPropName);
		}catch(Exception e)
		{
		
			return null;
		}
		finally
		{
			try {
				fin.close();
				fin = null;
				prop = null;
			}catch(Exception e)
			{
			
				return null;
			}
		}
	}
	
	
	/************************************
	 * Method Name	: getDateTime()
	 * Purpose		: to get the current system date
	 * Author		: Sachin
	 * Reviewer		:Ganesh
	 * Example		: String strDT = getDateTime("dd-MM-yyyy hh:mm:ss");
	 * ***********************************
	 */
	
	public String getDateTime(String dtFormat)
	{
		Calendar cal = null;
		SimpleDateFormat sdf = null;
		try {
			cal = Calendar.getInstance();
			sdf = new SimpleDateFormat(dtFormat);
			return sdf.format(cal.getTime());
		}catch(Exception e)
		{
			return null;
		}
		finally {
			cal = null;
			sdf = null;
		}
	}
	
	
	/************************************
	 * Method Name	: captureScreenShot()
	 * Purpose		: to capture the error screen shot
	 * Author		: Sachin
	 * Reviewer		:Ganesh
	 * Example		: String strDT = captureScreenShot();
	 * ***********************************
	 */
	public void captureScreenShot()
	{
		File objFile;
		String menumName = null;
		try {
			menumName = menuName.replace(" ", "");
			sceenShotPath = System.getProperty("user.dir")
					+"\\Results\\FinalReport"+finalReport+"\\screenShots\\"+strTestName+"\\"
					+menumName+getDateTime("ddMMyyyy_hhmmss")+".png";
			
			objFile = ((TakesScreenshot)oBrowser)
					.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(objFile, new File(sceenShotPath));
			//return strFilePath;

		}catch(Exception e)
		{
	
	
		}
		finally {
			objFile = null;
		}
	}			
	
	/************************************
	 * Method Name	: checkcrash()
	 * Purpose		: to get the status code of DOM Network
	 * Author		: Ganesh
	 * Reviewer		:Ganesh
	 * Example		: int   = checkcrash();
	 * ***********************************
	 */
    public  int checkcrash() 
				{
		try
		{

			int statuscode = 0;
			JavascriptExecutor js = (JavascriptExecutor)oBrowser;
			String URL =  js.executeScript("return document.URL;").toString();
										
			//System.out.println(URL);
			HttpClient client = HttpClientBuilder.create().build();
			 
			HttpGet request = new HttpGet(URL);
			
				
			HttpResponse response = client.execute(request);
			statuscode=response.getStatusLine().getStatusCode(); 
			
			return statuscode;
		} catch(Exception e)
		{
	
			return -1;
		}
					
}
    /************************************
	 * Method Name	: verifyPageCrash()
	 * Purpose		: to verify weather the pagecrash is present or not
	 * Author		: Ganesh
	 * Reviewer		:Ganesh
	 * Example		: boolean   = checkcrash();
	 * ***********************************
	 */
	
	public boolean verifyPageCrash() 
	{
		try
		{
			if(checkcrash()!=200)
			{
				
				appInd.captureScreenShot();
				return false;

			}else
			{
				return true;
			}
		} catch(Exception e)
		{
	
			return false;
		}
		
	}
	/************************************
	 * Method Name	: moveFile(fromPath, toPath)
	 * Purpose		: to move file from one directory to another directory
	 * Author		: Sachin
	 * Reviewer		:Ganesh
	 * Example		: moveFile(fromPath, toPath);
	 * ***********************************
	 */

	public void moveanddeleteFile(String strFromPath, String strToPath)
	{
	File f1 = null;
	File f4 = null;
	File f2[];
	try
	{
		f1 = new File(strFromPath);
		if(f1.exists())
		{
		f2 = f1.listFiles();
		if(f2!=null)
		{
		String strTestName[] = f1.list();
		for(int i=0; i<f2.length; i++)
		{
			if(f1.getPath().contains("test-output"))
			{
				if(strTestName[i].contains("Test-Report")) {
				f2[i].delete();
				break;
				}
			}else {
			  if(f2[i].exists())
			  {
				 
			  //f2[i].renameTo(new File(strToPath+"\\"+strTestName[i]));
			  FileUtils.copyFile(f2[i], new File(strToPath+"\\"+strTestName[i]));
			  }
			}
		}
		}
		}
	} catch(Exception e )
	{
		System.out.println("Exception while moving the file");
	}
	
}	
	/************************************
	 * Method Name	: zipFolder(fromPath, toPath)
	 * Purpose		: to zip a diractory
	 * Author		: Sachin
	 * Reviewer		:Ganesh
	 * Example		: zipFolder(fromPath, toPath);
	 * ***********************************
	 */
	
	    static void zipDir(String zipFileName, String dir) throws Exception {
	    File dirObj = new File(dir);
	    ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
	    System.out.println("Creating : " + zipFileName);
	    addDir(dirObj, out);
	    out.close();
	  }

	  static void addDir(File dirObj, ZipOutputStream out) throws IOException {
	    File[] files = dirObj.listFiles();
	    byte[] tmpBuf = new byte[1024];

	    for (int i = 0; i < files.length; i++) {
	      if (files[i].isDirectory()) {
	        addDir(files[i], out);
	        continue;
	      }
	      FileInputStream in = new FileInputStream(files[i].getAbsolutePath());
	      System.out.println(" Adding: " + files[i].getAbsolutePath());
	      out.putNextEntry(new ZipEntry(files[i].getAbsolutePath()));
	      int len;
	      while ((len = in.read(tmpBuf)) > 0) {
	        out.write(tmpBuf, 0, len);
	      }
	      out.closeEntry();
	      in.close();
	    }
	  }
	/************************************
	 * Method Name	: sendMail(filename)
	 * Purpose		: to send the zipped report
	 * Author		: Dhanshri
	 * Reviewer		:Ganesh
	 * Example		: zipFolder(fromPath, toPath);
	 * ***********************************
	 */
	 public void sendMail(String filename) throws AddressException, MessagingException 
	 {
		 //// Create object of Property file
			Properties props = new Properties();
				 
				// this will set host of server- you can change based on your requirement 
				props.put("mail.smtp.host", "smtp.gmail.com");
		 
				// set the port of socket factory 
				props.put("mail.smtp.socketFactory.port", "465");
		 
				// set socket factory
				props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		 
				//set the authentication to true
				props.put("mail.smtp.auth", "true");
		 
				// set the port of SMTP server
				props.put("mail.smtp.port", "465");
		 
			//*	//This will handle the complete authentication

				Session session = Session.getDefaultInstance(props,
						 
						new javax.mail.Authenticator() {
		 
						protected PasswordAuthentication getPasswordAuthentication() 
						    {
		 
							return new PasswordAuthentication("Sachin.Shetty@in4velocity.com", "Velocity!234");
		 
							}
		 
						    });
				
				 Message message = new MimeMessage(session);
				 message.setFrom(new InternetAddress("Sachin.Shetty@in4velocity.com"));
				 message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("dhanshri.balpande@in4velocity.com"));
			         message.setSubject(" Test Reports");
				
				               
					// Create object of MimeMessage class
					Message message1 = new MimeMessage(session);
					message.setFrom(new InternetAddress("Sachin.Shetty@in4velocity.com"));
					
					// Set the recipient address
			         message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("dhanshri.balpande@in4velocity.com"));
			         
			         // Add the subject link
			         message.setSubject("Testing Subject");

					// Create object to add multimedia type content
					BodyPart messageBodyPart1 = new MimeBodyPart();
		 
					// Set the body of email
			         messageBodyPart1.setText("This is message body");

		 
					// Create another object to add another content
					MimeBodyPart messageBodyPart2 = new MimeBodyPart();
	
			         // Create data source and pass the filename
			         DataSource source = new FileDataSource(filename);

			         // set the handler
			         messageBodyPart2.setDataHandler(new DataHandler(source));

			         // set the file
			         messageBodyPart2.setFileName(filename);

			         // Create object of MimeMultipart class
			         Multipart multipart = new MimeMultipart();

			         // add body part 1
			         multipart.addBodyPart(messageBodyPart2);

			         // add body part 2
			         multipart.addBodyPart(messageBodyPart1);

			         // set the content
			         message.setContent(multipart);

			         // finally send the email
			         Transport.send(message);

			         System.out.println("=====Email Sent=====");
     }
	 public void moveFileZipandMail(String sourceFile, String destFile)
		{
			File f1 = null;
			try
			{
				appInd.moveanddeleteFile(sourceFile, destFile);
				f1 = new File(System.getProperty("user.dir")+"\\test-output");
			
				File f2[] = f1.listFiles();
				String sFile[] = f1.list();
				for(int i=0; i<sFile.length; i++)
				{
					if(sFile[i].contains("Test-Report"))
					{
						//f2[i].getCanonicalFile();
					f2[i].renameTo(new File(destFile+"\\"+sFile[i]));
					//	FileUtils.copyFile(f2[i], new File(destFile+"\\"+sFile[i]));
					}
				}
			
			    String zipName = destFile+".zip";
			     
			    zipDir(zipName, destFile);
			    
			       appInd.sendMail(zipName);
				
			} catch(Exception e)
			{
				System.out.println("Exception while zipping the folder");
			}
		}
	
	
	 
	 public  void clickObject(WebElement element) throws Exception
	 {
		 ((JavascriptExecutor) oBrowser).executeScript("arguments[0].click();", w2.until(ExpectedConditions.elementToBeClickable(element)));
		 appInd.isAlertPresent();
		 try
		 {
			 menuName= element.getText();  
		 } catch(Exception e) {};
		  		   
	}
	 public boolean clickObject(By by)
	 {
		 try {
	           
	    		   ((JavascriptExecutor) oBrowser).executeScript("arguments[0].click();", w2.until(ExpectedConditions.elementToBeClickable(by)));
	    		    appInd.isAlertPresent();
	        return false;  
	    } catch (Exception sere) {
	        return true;
	        
	    }
	 }
	  
        
         
         public boolean isAlertPresent()
         {
        	 try
        	 {
        		 oBrowser.switchTo().alert().accept();
                return true;
        	 } catch(Exception e)
        	 {
        		return false;
        	 }
         }
         public  void selectDropDown(WebElement oEl, String strText) throws Exception
     	{    
        	 Select osel = null;
        	 w2.until(ExpectedConditions.visibilityOf(oEl));//code not working
        	 osel = new Select(oEl);
        	 osel.selectByVisibleText(strText);	
     	}
     	
         
         
         public void setObject(WebElement element, String strData) 
         {
        	
        		 ((JavascriptExecutor) oBrowser).executeScript("arguments[0].value='"+strData+"';", w2.until(ExpectedConditions.visibilityOf(element)));	
         }
         
         public void clickOnCalender(WebElement calendoBJ,  WebElement monthOBJBy, String strMonth, WebElement yearObj,String strYear, String date ) throws Exception
         {
        	 appInd.clickObject(calendoBJ);
        	 appInd.selectDropDown(monthOBJBy, strMonth);
        	 appInd.selectDropDown(yearObj, strYear);
        	 w2.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(date))).click();
         }

       

		public void clickObject(Object sendKeys) {
			// TODO Auto-generated method stub
			
		}
         
         
         
         
}
     
 

