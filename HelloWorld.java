package demo.sphinx.helloworld;

import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;
import edu.cmu.sphinx.util.props.PropertyException;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Font;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.speech.recognition.ResultToken;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import com.sun.speech.freetts.Voice;   
import com.sun.speech.freetts.VoiceManager;   
import java.util.Locale;
  




 

public class HelloWorld
{
     
     private static final String VOICENAME = "kevin16";
    
     static int i = 1;
     static Random ran = new Random();
     static String resultText;
     static String  type;
     static String  gmail;
     static String  cal;
     JTextArea userSpeechDisp=new JTextArea("");
     private static void digits(String p) throws IOException,AWTException
     {
            Robot robot = new Robot();
            robot.delay(500);
            switch(p)
            {
            case "zero":{
                
             robot.keyPress(KeyEvent.VK_0);
             robot.keyRelease(KeyEvent.VK_0);
               break;
             }
             case "one":{
                
             robot.keyPress(KeyEvent.VK_1);
             robot.keyRelease(KeyEvent.VK_1);
               break;
             }
             case "two":{
                
             robot.keyPress(KeyEvent.VK_2);
             robot.keyRelease(KeyEvent.VK_2);
               break;
             }
             case "three":{
                
             robot.keyPress(KeyEvent.VK_3);
             robot.keyRelease(KeyEvent.VK_3);
               break;
             }
             case "four":{
                
             robot.keyPress(KeyEvent.VK_4);
             robot.keyRelease(KeyEvent.VK_4);
               break;
             }
             case "five":{
                
             robot.keyPress(KeyEvent.VK_5);
             robot.keyRelease(KeyEvent.VK_5);
               break;
             }
             case "six":{
                
             robot.keyPress(KeyEvent.VK_6);
             robot.keyRelease(KeyEvent.VK_6);
               break;
             }
             case "seven":{
                
             robot.keyPress(KeyEvent.VK_7);
             robot.keyRelease(KeyEvent.VK_7);
               break;
             }
             case "eight":{
                
             robot.keyPress(KeyEvent.VK_8);
             robot.keyRelease(KeyEvent.VK_8);
               break;
             }
             case "nine":{
                
             robot.keyPress(KeyEvent.VK_9);
             robot.keyRelease(KeyEvent.VK_9);
               break;
             }
            }
     }
     private static void type_alphabets(char x) throws IOException,AWTException
     {
     
         Robot robot = new Robot();
         robot.delay(500);
         switch(x)
         {    
            
              case 'a':{
                
             robot.keyPress(KeyEvent.VK_A);
             robot.keyRelease(KeyEvent.VK_A);
               break;
             }
               case 'b':{
                
             robot.keyPress(KeyEvent.VK_B);
             robot.keyRelease(KeyEvent.VK_B);
               break;
             }
                case 'c':{
                
             robot.keyPress(KeyEvent.VK_C);
             robot.keyRelease(KeyEvent.VK_C);
               break;
             }
                 case 'd':{
                
             robot.keyPress(KeyEvent.VK_D);
             robot.keyRelease(KeyEvent.VK_D);
               break;
             }
                  case 'e':{
                
             robot.keyPress(KeyEvent.VK_E);
             robot.keyRelease(KeyEvent.VK_E);
               break;
             }
                   case 'f':{
                
             robot.keyPress(KeyEvent.VK_F);
             robot.keyRelease(KeyEvent.VK_F);
               break;
             }
                    case 'g':{
                
             robot.keyPress(KeyEvent.VK_G);
             robot.keyRelease(KeyEvent.VK_G);
               break;
             }
                     case 'h':{
                
             robot.keyPress(KeyEvent.VK_H);
             robot.keyRelease(KeyEvent.VK_H);
               break;
             }
                      case 'i':{
                
             robot.keyPress(KeyEvent.VK_I);
             robot.keyRelease(KeyEvent.VK_I);
               break;
             }
                       case 'j':{
                
             robot.keyPress(KeyEvent.VK_J);
             robot.keyRelease(KeyEvent.VK_J);
               break;
             }
                        case 'k':{
                
             robot.keyPress(KeyEvent.VK_K);
             robot.keyRelease(KeyEvent.VK_K);
               break;
             }
                         case 'l':{
                
             robot.keyPress(KeyEvent.VK_L);
             robot.keyRelease(KeyEvent.VK_L);
               break;
             }           case 'm':{
                
             robot.keyPress(KeyEvent.VK_M);
             robot.keyRelease(KeyEvent.VK_M);
               break;
             }
                          case 'n':{
                
             robot.keyPress(KeyEvent.VK_N);
             robot.keyRelease(KeyEvent.VK_N);
               break;
             }
                         
                           case 'o':{
                
             robot.keyPress(KeyEvent.VK_O);
             robot.keyRelease(KeyEvent.VK_O);
               break;
             }
                            case 'p':{
                robot.keyPress(KeyEvent.VK_P);
                robot.keyRelease(KeyEvent.VK_P);
               break;
             }
                            case 'q':{
                
               robot.keyPress(KeyEvent.VK_Q);
               robot.keyRelease(KeyEvent.VK_Q);
               break;
             }
             
                             case 'r':{
                
               robot.keyPress(KeyEvent.VK_R);
               robot.keyRelease(KeyEvent.VK_R);
              break;
             }
             
                             case 's':{
                
               robot.keyPress(KeyEvent.VK_S);
               robot.keyRelease(KeyEvent.VK_S);
               break;
             }
             
                              case 't':{
              
               robot.keyPress(KeyEvent.VK_T);
               robot.keyRelease(KeyEvent.VK_T);
               break;
             }
             
                               case 'u':{
                
               robot.keyPress(KeyEvent.VK_U);
               robot.keyRelease(KeyEvent.VK_U);
               break;
             }
                                case 'v':{
                
               robot.keyPress(KeyEvent.VK_V);
               robot.keyRelease(KeyEvent.VK_V);
               break;
             }
                               case 'w':{
                
               robot.keyPress(KeyEvent.VK_W);
               robot.keyRelease(KeyEvent.VK_W);
               break;
             }
                                case 'x':{
                
               robot.keyPress(KeyEvent.VK_X);
               robot.keyRelease(KeyEvent.VK_X);
               break;
             }
                                case 'y':{
                
               robot.keyPress(KeyEvent.VK_Y);
               robot.keyRelease(KeyEvent.VK_Y);
               break;
             }
                                case 'z':{
                
               robot.keyPress(KeyEvent.VK_Z);
               robot.keyRelease(KeyEvent.VK_Z);
               break;
             }
        }
    }         
private static void recognize_words(Recognizer recognizer,JTextArea userSpeechDisp) throws IOException,AWTException, PropertyException, InstantiationException, InterruptedException
    { 
      
        
            Robot robot = new Robot();       
            while (true) 
            {
                 System.out.println("Start speaking. Press Ctrl-C to quit.\n");
                Result result = recognizer.recognize();
                if (result != null) 
                {
                    System.out.println("Say your words" + "\n");
                    type = result.getBestFinalResultNoFiller();
                userSpeechDisp.setText("You said: " + '\n' + type );
                    if(type.equalsIgnoreCase("save"))
                    {
                        robot.keyPress(KeyEvent.VK_CONTROL);
                        robot.keyPress(KeyEvent.VK_S);
                        robot.keyRelease(KeyEvent.VK_CONTROL);
                        robot.keyRelease(KeyEvent.VK_S);
                        TimeUnit.SECONDS.sleep(3);
                        continue;
                    }
                    if(type.equalsIgnoreCase("select all"))
                    {
                        robot.keyPress(KeyEvent.VK_CONTROL);
                        robot.keyPress(KeyEvent.VK_A);
                        robot.keyRelease(KeyEvent.VK_CONTROL);
                        robot.keyRelease(KeyEvent.VK_A);
                        TimeUnit.SECONDS.sleep(3);
                        continue;
                    }
                    if(type.equalsIgnoreCase("undo"))
                    {
                        robot.keyPress(KeyEvent.VK_CONTROL);
                        robot.keyPress(KeyEvent.VK_Z);
                        robot.keyRelease(KeyEvent.VK_CONTROL);
                        robot.keyRelease(KeyEvent.VK_Z);
                        TimeUnit.SECONDS.sleep(3);
                        continue;
                    }
                    if(type.equalsIgnoreCase("back"))
                    {
                        robot.keyPress(KeyEvent.VK_BACK_SPACE);
                        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
                        
                        TimeUnit.SECONDS.sleep(3);
                        continue;
                    }
                    if(type.equalsIgnoreCase("make bold"))
                    {
                        robot.keyPress(KeyEvent.VK_CONTROL);
                        robot.keyPress(KeyEvent.VK_B);
                        robot.keyRelease(KeyEvent.VK_CONTROL);
                        robot.keyRelease(KeyEvent.VK_B);
                        TimeUnit.SECONDS.sleep(3);
                        continue;
                    }
                    if(type.equalsIgnoreCase("make italic"))
                    {
                        robot.keyPress(KeyEvent.VK_CONTROL);
                        robot.keyPress(KeyEvent.VK_I);
                        robot.keyRelease(KeyEvent.VK_CONTROL);
                        robot.keyRelease(KeyEvent.VK_I);
                        TimeUnit.SECONDS.sleep(3);
                        continue;
                    }
                    if(type.equalsIgnoreCase("make underline"))
                    {
                        robot.keyPress(KeyEvent.VK_CONTROL);
                        robot.keyPress(KeyEvent.VK_U);
                        robot.keyRelease(KeyEvent.VK_CONTROL);
                        robot.keyRelease(KeyEvent.VK_U);
                        TimeUnit.SECONDS.sleep(3);
                        continue;
                    }
                    if(type.equalsIgnoreCase("copy"))
                    {
                        robot.keyPress(KeyEvent.VK_CONTROL);
                        robot.keyPress(KeyEvent.VK_C);
                        robot.keyRelease(KeyEvent.VK_CONTROL);
                        robot.keyRelease(KeyEvent.VK_C);
                        TimeUnit.SECONDS.sleep(3);
                        continue;
                    }
                    if(type.equalsIgnoreCase("paste"))
                    {
                        robot.keyPress(KeyEvent.VK_CONTROL);
                        robot.keyPress(KeyEvent.VK_V);
                        robot.keyRelease(KeyEvent.VK_CONTROL);
                        robot.keyRelease(KeyEvent.VK_V);
                        TimeUnit.SECONDS.sleep(3);
                        continue;
                    }
                    if(type.equalsIgnoreCase("press enter"))
                    {
                         robot.keyPress(KeyEvent.VK_ENTER);
                         robot.keyRelease(KeyEvent.VK_ENTER);
                         continue;
                          
                    }
                    if(type.equalsIgnoreCase("maximize window"))
                    {
                          robot.keyPress(KeyEvent.VK_WINDOWS);
                          robot.keyPress(KeyEvent.VK_UP);
                          robot.keyRelease(KeyEvent.VK_WINDOWS);
                          robot.keyRelease(KeyEvent.VK_UP);
                          TimeUnit.SECONDS.sleep(4);
                          continue;
                     }
                     if(type.equalsIgnoreCase("minimize window"))
                    {
                           robot.keyPress(KeyEvent.VK_WINDOWS);
                           robot.keyPress(KeyEvent.VK_DOWN);
                           robot.keyRelease(KeyEvent.VK_WINDOWS);
                           robot.keyRelease(KeyEvent.VK_DOWN);
                           TimeUnit.SECONDS.sleep(4);
			   continue;
                     }
                    
                    if(type.equalsIgnoreCase("press tab"))
                    {
                         robot.keyPress(KeyEvent.VK_TAB);
                         robot.keyRelease(KeyEvent.VK_TAB);
                         continue;
                    }
                    
                    
                    if(type.equalsIgnoreCase("stop"))
                    {
                        return;
                    }
                       
                    for(int i=0;i<type.length();i++)   
                    {
                        type_alphabets(type.charAt(i));
                    }
                    
                    robot.keyPress(KeyEvent.VK_SPACE);
               
                }
            }
    }
    private static void recognize_paint(Recognizer recognizer,JTextArea userSpeechDisp) throws IOException,AWTException, PropertyException, InstantiationException, InterruptedException
    { 
      
        
            Robot robot = new Robot();       
            while (true) 
            {
                 System.out.println("Start speaking. Press Ctrl-C to quit.\n");
                Result result = recognizer.recognize();
                if (result != null) 
                {
                    System.out.println("Say your words" + "\n");
                    type = result.getBestFinalResultNoFiller();
                userSpeechDisp.setText("You said: " + '\n' + type );
                    if(type.equalsIgnoreCase("save"))
                    {
                        robot.keyPress(KeyEvent.VK_CONTROL);
                        robot.keyPress(KeyEvent.VK_S);
                        robot.keyRelease(KeyEvent.VK_CONTROL);
                        robot.keyRelease(KeyEvent.VK_S);
                        TimeUnit.SECONDS.sleep(3);
                        continue;
                    }
                    
                    if(type.equalsIgnoreCase("undo"))
                    {
                        robot.keyPress(KeyEvent.VK_CONTROL);
                        robot.keyPress(KeyEvent.VK_Z);
                        robot.keyRelease(KeyEvent.VK_CONTROL);
                        robot.keyRelease(KeyEvent.VK_Z);
                        TimeUnit.SECONDS.sleep(3);
                        continue;
                    }
                    if(type.equalsIgnoreCase("back"))
                    {
                        robot.keyPress(KeyEvent.VK_BACK_SPACE);
                        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
                        
                        TimeUnit.SECONDS.sleep(3);
                        continue;
                    }
                    
                   
                    if(type.equalsIgnoreCase("copy"))
                    {
                        robot.keyPress(KeyEvent.VK_CONTROL);
                        robot.keyPress(KeyEvent.VK_C);
                        robot.keyRelease(KeyEvent.VK_CONTROL);
                        robot.keyRelease(KeyEvent.VK_C);
                        TimeUnit.SECONDS.sleep(3);
                        continue;
                    }
                    if(type.equalsIgnoreCase("paste"))
                    {
                        robot.keyPress(KeyEvent.VK_CONTROL);
                        robot.keyPress(KeyEvent.VK_V);
                        robot.keyRelease(KeyEvent.VK_CONTROL);
                        robot.keyRelease(KeyEvent.VK_V);
                        TimeUnit.SECONDS.sleep(3);
                        continue;
                    }
                    if(type.equalsIgnoreCase("press enter"))
                    {
                         robot.keyPress(KeyEvent.VK_ENTER);
                         robot.keyRelease(KeyEvent.VK_ENTER);
                         continue;
                          
                    }
                    if(type.equalsIgnoreCase("maximize window"))
                    {
                          robot.keyPress(KeyEvent.VK_WINDOWS);
                          robot.keyPress(KeyEvent.VK_UP);
                          robot.keyRelease(KeyEvent.VK_WINDOWS);
                          robot.keyRelease(KeyEvent.VK_UP);
                          TimeUnit.SECONDS.sleep(4);
                          continue;
                     }
                     if(type.equalsIgnoreCase("minimize window"))
                    {
                           robot.keyPress(KeyEvent.VK_WINDOWS);
                           robot.keyPress(KeyEvent.VK_DOWN);
                           robot.keyRelease(KeyEvent.VK_WINDOWS);
                           robot.keyRelease(KeyEvent.VK_DOWN);
                           TimeUnit.SECONDS.sleep(4);
			   continue;
                     }
                    
                    if(type.equalsIgnoreCase("press tab"))
                    {
                         robot.keyPress(KeyEvent.VK_TAB);
                         robot.keyRelease(KeyEvent.VK_TAB);
                         continue;
                    }
                    
                    
                    if(type.equalsIgnoreCase("stop"))
                    {
                        return;
                    }
                       
                   
               
                }
            }
    }
     private static void  mail(Recognizer recognizer,JTextArea userSpeechDisp) throws IOException,AWTException, PropertyException, InstantiationException, InterruptedException
     {          Robot robot = new Robot();
                 
                while (true) 
            {
                 
                Result result = recognizer.recognize();
                if (result != null) 
                {
                    
                 gmail = result.getBestFinalResultNoFiller();
                 userSpeechDisp.setText("You said: " + '\n' + gmail );
                 TimeUnit.SECONDS.sleep(1);
	         if(gmail.equalsIgnoreCase("compose mail"))
                 {
                   robot.keyPress(KeyEvent.VK_C);
                   robot.keyRelease(KeyEvent.VK_C);
                   continue;
                   }
                 if(gmail.equalsIgnoreCase("move down"))
                 {
                   robot.keyPress(KeyEvent.VK_DOWN);
                   robot.keyRelease(KeyEvent.VK_DOWN);
                   continue;
                 }
                 if(gmail.equalsIgnoreCase("move up"))
                 {
                   robot.keyPress(KeyEvent.VK_UP);
                   robot.keyRelease(KeyEvent.VK_UP);
                   continue;
                 }
                  if(gmail.equalsIgnoreCase("stop"))
                    {
                    return;
                    }
                  if(gmail.equalsIgnoreCase("press tab"))
                    {   
                            
                         robot.keyPress(KeyEvent.VK_TAB);
                          robot.keyRelease(KeyEvent.VK_TAB);
                          continue;
                    }
                    if(gmail.equalsIgnoreCase("press escape"))
                    {
                         robot.keyPress(KeyEvent.VK_TAB);
                         robot.keyRelease(KeyEvent.VK_TAB);
                          continue;
                    }
                    if(gmail.equalsIgnoreCase("press enter"))
                    {
                         robot.keyPress(KeyEvent.VK_ENTER);
                          robot.keyRelease(KeyEvent.VK_ENTER);
                          continue;
                    }
                    if(gmail.equalsIgnoreCase("back"))
                    {
                         robot.keyPress(KeyEvent.VK_BACK_SPACE);
                          robot.keyRelease(KeyEvent.VK_BACK_SPACE);
                          continue;
                    }
                    if(gmail.equalsIgnoreCase("send mail"))
                    {
                         robot.keyPress(KeyEvent.VK_CONTROL);
                          robot.keyPress(KeyEvent.VK_ENTER);
                          robot.keyRelease(KeyEvent.VK_CONTROL);
                          robot.keyRelease(KeyEvent.VK_ENTER);
                          continue;
                    }
                    
                    
                    if(gmail.equalsIgnoreCase("select all"))
                    {
                         robot.keyPress(KeyEvent.VK_CONTROL);
                          robot.keyPress(KeyEvent.VK_A);
                          robot.keyRelease(KeyEvent.VK_CONTROL);
                          robot.keyRelease(KeyEvent.VK_A);
                          continue;
                    }
                    if(gmail.equalsIgnoreCase("undo"))
                    {
                         robot.keyPress(KeyEvent.VK_CONTROL);
                          robot.keyPress(KeyEvent.VK_Z);
                          robot.keyRelease(KeyEvent.VK_CONTROL);
                          robot.keyRelease(KeyEvent.VK_Z);
                          continue;
                    }
                    if(gmail.equalsIgnoreCase("show sent"))
                    {
                         robot.keyPress(KeyEvent.VK_G);
                          robot.keyPress(KeyEvent.VK_T);
                          robot.keyRelease(KeyEvent.VK_G);
                          robot.keyRelease(KeyEvent.VK_T);
                          continue;
                    }
                    if(gmail.equalsIgnoreCase("inbox"))
                    {
                         robot.keyPress(KeyEvent.VK_G);
                          robot.keyPress(KeyEvent.VK_I);
                          robot.keyRelease(KeyEvent.VK_G);
                          robot.keyRelease(KeyEvent.VK_I);
                          continue;
                    }
                     for(int i=0;i<gmail.length();i++)   
                    {
                        type_alphabets(gmail.charAt(i));
                    }
                    robot.keyPress(KeyEvent.VK_SPACE);		
		
                 
                    
                   
	          }
            }
     }
   private static void calculate(Recognizer recognizer,JTextArea userSpeechDisp) throws IOException,AWTException, PropertyException, InstantiationException, InterruptedException
    { 
        Robot robot = new Robot();       
            while (true) 
            {
                System.out.println("Welcome to Calculator.\n");
                Result result = recognizer.recognize();
               if (result != null) 
                {
                    System.out.println("Perform Operations" + "\n");
                    cal = result.getBestFinalResultNoFiller();
                    userSpeechDisp.setText("You said: " + '\n' + type );
                   
                     
                        digits(cal);
                    
                    
                    if(cal.equalsIgnoreCase("add digit"))
                    {
                        robot.keyPress(KeyEvent.VK_ADD);
                    }
                    if(cal.equalsIgnoreCase("subtract digit"))
                    {
                       robot.keyPress(KeyEvent.VK_SUBTRACT);
                    }
                    if(cal.equalsIgnoreCase("multiply digit"))
                    {
                        robot.keyPress(KeyEvent.VK_MULTIPLY);
                    }
                    if(cal.equalsIgnoreCase("divide digit"))
                    {
                        robot.keyPress(KeyEvent.VK_DIVIDE);
                    }
                    if(cal.equalsIgnoreCase("answer"))
                    {
                        robot.keyPress(KeyEvent.VK_EQUALS);
                    }
                    if(cal.equalsIgnoreCase("stop"))
                    {
                        return;
                    }
                   
                }
            }
    }
    
    public static void main(String[] args) throws IOException, InterruptedException, AWTException, InstantiationException, PropertyException 
    {           JFrame SpeechFrame=new JFrame("Speech Recognition Desktop Application");
    	        SpeechFrame.setSize(480,530);
    	        SpeechFrame.setLocationRelativeTo(null);									
		SpeechFrame.setResizable(false); 
		SpeechFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel mainBackgoundImage=new JLabel ("");								
		SpeechFrame.add(mainBackgoundImage);										
		mainBackgoundImage.setIcon(new ImageIcon ("data"+File.separator+"bg.data")); 
		SpeechFrame.setVisible(true);
		mainBackgoundImage.setOpaque(false);
		
		
		JButton btnInfo=new JButton(new ImageIcon ("data"+File.separator+File.separator+"info.data"));
		mainBackgoundImage.add(btnInfo);
		btnInfo.setRolloverIcon(new ImageIcon ("data"+File.separator+File.separator+"info_actv.data"));
		btnInfo.setBounds(40,210,80,80);
		btnInfo.setToolTipText("About This Application");
		btnInfo.setBorderPainted(false);
		
		
		btnInfo.addActionListener(new ActionListener() 
                {
		  public void actionPerformed(ActionEvent arg0) 
                  {
	            JOptionPane.showMessageDialog(null, "<html><center><h3>Speech Recognition</h3></center><br/>Final Year Project<br/>Under Supervision of  Dr.Harikesh Singh <br/> Group No-43 <br/><br/> <br/><b>Pranjal  Singh 121296</b><br/> <b> Prakhar Singhal 121293 </b>  </b><br/> <b>Pranay Pandya </b> 121295 </html>");
	          }
	        });
		
		
		JButton btnHowToUse=new JButton(new ImageIcon ("data"+File.separator+File.separator+"help.data"));
		mainBackgoundImage.add(btnHowToUse);
		btnHowToUse.setRolloverIcon(new ImageIcon ("data"+File.separator+File.separator+"help_actv.data"));
		btnHowToUse.setBounds(130,210,80,80);
		btnHowToUse.setToolTipText("How To Use");
		btnHowToUse.setBorderPainted(false);
		
		
		btnHowToUse.addActionListener(new ActionListener() 
                {
	           public void actionPerformed(ActionEvent arg0) 
                   {
			   JOptionPane.showMessageDialog(null, "<html> <h3> HOW TO USE </h3> Start the application and u are ready to go<br/> Use commands like: <br><i><ul><li>Hey Computer</li><li> Start *Application Name*</li><li>Stop *Application Name*</li><li>Site mail </li> </ul>for more commands and troubleshooting guide <br/> </html>");
	           }
                });
		
		
		                JTextArea userSpeechDisp=new JTextArea("");
		                mainBackgoundImage.add(userSpeechDisp);
				
		                userSpeechDisp.setBounds(48,290,390,65);
		                userSpeechDisp.setForeground(new Color(241, 144, 0));
                                userSpeechDisp.setFont(new Font("Times New Roman" , Font.BOLD, 24));
		                Border border = BorderFactory.createLineBorder(new Color(0, 84, 186));
		                userSpeechDisp.setBorder(BorderFactory.createCompoundBorder(border, 
		                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		                userSpeechDisp.setEditable(false);
				
				JTextArea slnDisp=new JTextArea("");
				mainBackgoundImage.add(slnDisp);
				slnDisp.setLineWrap(true);
				slnDisp.setWrapStyleWord(true);
				slnDisp.setForeground(new Color(241, 144, 0));
				slnDisp.setFont(new Font("Times New Roman" , Font.BOLD, 24));
				slnDisp.setBounds(48,370,390,65);
				slnDisp.setBorder(BorderFactory.createCompoundBorder(border, 
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));
				slnDisp.setEditable(false);
                                
                              
                                JLabel listening=new JLabel("");
                                listening.setForeground(Color.RED);
                                listening.setFont(new Font("Times New Roman" , Font.BOLD, 24));
                                mainBackgoundImage.add(listening);
                                listening.setBounds(30,180,290,30);
                                listening.setText("Loading");
	
                                Voice voice;  
    
                                VoiceManager voiceManager = VoiceManager.getInstance();
                                System.setProperty("mbrola.base",VOICENAME );
                                voice = voiceManager.getVoice(VOICENAME);
                                voice.allocate();
                                voice.setRate(120);
                                voice.setPitch(100);
                                
        try {
            Robot myrobot = new Robot();
            URL url;
            if (args.length > 0) {
                url = new File(args[0]).toURI().toURL();
            } else {
                url = HelloWorld.class.getResource("helloworld.config.xml");
            }

            System.out.println("Loading...");

            ConfigurationManager cm = new ConfigurationManager(url);

            Recognizer recognizer = (Recognizer) cm.lookup("recognizer");
            Microphone microphone = (Microphone) cm.lookup("microphone");

            recognizer.allocate();
           // voice.speak("welcome to speech recognition bot");
            listening.setText("Listening");

            if (microphone.startRecording()) {
                
                
                while (true) 
                {
                    listening.setVisible(true);

                    

                    Result result = recognizer.recognize();
                    if (result != null) {

                        
                        resultText = result.getBestFinalResultNoFiller();
                       userSpeechDisp.setText("You said: " + '\n' + resultText );
                       
                           try {
                            Process p;

                            switch (resultText) {
                                
                                
                                case "hello":{
                                    String[] greet = {
                                        
                                         
                                        ""
                                          
                                       };
                                String greet_ran = greet[ran.nextInt(greet.length)];
                                slnDisp.setText(greet_ran);
                                voice.speak(greet_ran);
                                TimeUnit.SECONDS.sleep(4);
                                microphone.clear();
                                break;
                                }
                                case "what time is it": {
                                    SimpleDateFormat time = new SimpleDateFormat("hh:mm a");
			            String formattedDate = time.format(new Date()).toString();
			            slnDisp.setText(
                                            "It is " + formattedDate ) ;
			            voice.speak("It is " + formattedDate);
			            TimeUnit.SECONDS.sleep(4);
				    microphone.clear();
                                        
                                 
                                    break;
                                 }
                                case "print screen": {
                                    myrobot.keyPress(KeyEvent.VK_PRINTSCREEN);
                                    myrobot.keyRelease(KeyEvent.VK_PRINTSCREEN);
                                    TimeUnit.SECONDS.sleep(4);
				    microphone.clear();
                                    break;
                                }
                                case "press escape": {
                                    myrobot.keyPress(KeyEvent.VK_ESCAPE);
                                    myrobot.keyRelease(KeyEvent.VK_ESCAPE);
                                    
                                    TimeUnit.SECONDS.sleep(4);
				    microphone.clear();
                                    break;
                                }
                                
                                
                                case "start paint": {
                                    p = Runtime.getRuntime().exec("cmd /c start mspaint");
                                       TimeUnit.SECONDS.sleep(4);
                                       recognize_paint(recognizer, userSpeechDisp);
					microphone.clear();
                                    break;
                                }
                                 case "open my computer": {
                                   myrobot.keyPress(KeyEvent.VK_WINDOWS);
                                   myrobot.keyPress(KeyEvent.VK_E);
                                   myrobot.keyRelease(KeyEvent.VK_WINDOWS);
                                   myrobot.keyRelease(KeyEvent.VK_E);
                                   
                                       TimeUnit.SECONDS.sleep(4);
					microphone.clear();
                                        break;
                                }
                                case "stop paint": {
                                    p = Runtime.getRuntime().exec("cmd /c start taskkill /im mspaint.exe /f");
                                       TimeUnit.SECONDS.sleep(4);
					microphone.clear();
                                        break;
                                }
                                case "switch application": {
                                    myrobot.keyPress(KeyEvent.VK_ALT);
                                    myrobot.keyPress(KeyEvent.VK_TAB);
                                    myrobot.keyRelease(KeyEvent.VK_ALT);
                                    myrobot.keyRelease(KeyEvent.VK_TAB);
                                    TimeUnit.SECONDS.sleep(4);
				    microphone.clear();
                                    break;
                                }
                                case "close window": {
                                    myrobot.keyPress(KeyEvent.VK_ALT);
                                    myrobot.keyPress(KeyEvent.VK_F4);
                                    myrobot.keyRelease(KeyEvent.VK_ALT);
                                    myrobot.keyRelease(KeyEvent.VK_F4);
                                    TimeUnit.SECONDS.sleep(4);
				    microphone.clear();
                                    break;
                                }
                                

                                
                                case "start calculator": {
                                    p = Runtime.getRuntime().exec("calc");
                                       //calculate(recognizer,userSpeechDisp);
                                       TimeUnit.SECONDS.sleep(4);
					microphone.clear();
                                    break;
                                }
                                case "stop calculator": {
                                    p = Runtime.getRuntime().exec("cmd /c start taskkill /im calc.exe /f");
                                        TimeUnit.SECONDS.sleep(4);
					microphone.clear();
                                    break;
                                }
                               
                                case "open office word": {
                                        voice.speak("Opening Microsoft Word");
                                        p = Runtime.getRuntime().exec("cmd /c start winword");
                                        recognize_words(recognizer,userSpeechDisp);
                                        TimeUnit.SECONDS.sleep(4);
					microphone.clear();
                                        
                                       
                                    break;
                                }
                                case "close office word": {
                                        p = Runtime.getRuntime().exec("cmd /c start taskkill /im winword.exe /f");
                                        TimeUnit.SECONDS.sleep(4);
				        microphone.clear();	
                                    break;
                                }
                                case "start browser": {
                                    p = Runtime.getRuntime().exec("cmd /c start chrome.exe");
                                        TimeUnit.SECONDS.sleep(4);
					microphone.clear();
                                    break;
                                }
                                case "stop browser": {
                                    p = Runtime.getRuntime().exec("cmd /c start taskkill /im chrome.exe /f");
                                        TimeUnit.SECONDS.sleep(4);
					microphone.clear();
                                    break;
                                }
                                case "gmail": {
                                    p = Runtime.getRuntime().exec("cmd /c start chrome https://mail.google.com");
                                       
                                        mail(recognizer,userSpeechDisp);
	          
                                        TimeUnit.SECONDS.sleep(4);
					microphone.clear();
                                    break;
                                }
                                case "start word pad": {
                                    p = Runtime.getRuntime().exec("cmd /c  write");
                                        TimeUnit.SECONDS.sleep(4);
					microphone.clear();
                                    break;
                                }
                                case "stop word pad": {
                                    p = Runtime.getRuntime().exec("cmd /c  start taskkill /im wordpad.exe /f");
                                        TimeUnit.SECONDS.sleep(4);
					microphone.clear();
                                    break;
                                }
                                case "open cell": {
                                    p = Runtime.getRuntime().exec("cmd /c start excel");
                                        TimeUnit.SECONDS.sleep(4);
					microphone.clear();
                                    break;
                                }
                                case "close cell": {
                                     p = Runtime.getRuntime().exec("cmd /c  start taskkill /im excel.exe /f");
                                         TimeUnit.SECONDS.sleep(4);
				         microphone.clear();
                                    break;
                                }
                                case "start pad": {   
                                         Runtime.getRuntime().exec("notepad");
                                         recognize_words(recognizer,userSpeechDisp);
                                         TimeUnit.SECONDS.sleep(4);
					 microphone.clear();
                                    break;
                                }
                                case "stop pad": {
                                    p = Runtime.getRuntime().exec("cmd /c start taskkill /im notepad.exe /f");
                                        TimeUnit.SECONDS.sleep(4);
					microphone.clear();
                                    break;
                                }
                               
                                case "speech recognize complete": {
                                        System.out.println("Thanks for using !");
                                        recognizer.deallocate();
                                        System.exit(0);
                                    break;
                                }
                                 
                                case "stop recognize": {
                                       System.out.println("See you later!");
                                       System.exit(0);
                                    
                                    break;
                                }


                            }
                        } 
                        catch (IOException | InterruptedException | IllegalStateException ae) {
                            
                        }
                    } else {
                        System.out.println("I can't hear what you said.\n");
                    }
                }
            } else {
                System.out.println("Cannot start microphone.");
                recognizer.deallocate();
                System.exit(1);
            }

        } catch (IOException e) {
            System.err.println("Problem when loading HelloWorld: " + e);
        } catch (PropertyException e) {
            System.err.println("Problem configuring HelloWorld: " + e);
        } catch (InstantiationException e) {
            System.err.println("Problem creating HelloWorld: " + e);
        }

    }
}
