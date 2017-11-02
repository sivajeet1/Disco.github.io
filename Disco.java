import java.applet.Applet;
import java.awt.*;
import java.awt.Component;
import java.awt.Color;
import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.Image;
public class Disco extends Applet implements Runnable,AudioClip
{	
Thread t;
int count=0,x;AudioClip au1,au2;
Image ii;
public void init()
{
setBackground(Color.black);
au1=getAudioClip(getCodeBase(),"dj wala babu mor gana bajabu matal dance mix by dj sueedodia.in).au");
au2=getAudioClip(getCodeBase(),"applause7.wav");
ii=getImage(getCodeBase(),"disco1.jpg");
}
public void start()
{
t=new Thread(this);
t.start();
au1.play();
}
public void stop()
{
t.stop();
t=null;
}
public void run()
{
while(true)
{
count++;
x++;


repaint();
try{
Thread.sleep(200);
}catch(InterruptedException ie)
{
}
}
}
public void paint(Graphics g)
{
 
if(x<=420)
	{
		 g.drawImage(ii,0,0,this);
	if(count%2==0){
g.setColor(Color.white);
//face
g.fillOval(100+x,100,60,60);
g.setColor(Color.black);
//eyes
g.fillOval(112+x,117,10,10);
g.fillOval(138+x,117,10,10);
g.setColor(Color.white);
//body
g.drawLine(130+x,160,130+x,240);
//hand
g.drawLine(130+x,200,90+x,200);
g.drawLine(130+x,200,170+x,200);
g.drawLine(90+x,200,90+x,160);
g.drawLine(170+x,200,170+x,160);
//legs
g.drawLine(130+x,240,100+x,280);
g.drawLine(130+x,240,160+x,280);
g.setColor(Color.red);
//mouth
g.fillOval(120+x,140,15,7);
//girl
//face
g.setColor(Color.white);
g.fillOval(1100-x,100,60,60);
//ribbon

g.setColor(Color.yellow);
g.fillOval(1132-x,94,15,8);
g.fillOval(1146-x,100,15,8);
g.setColor(Color.red);
g.fillOval(1142-x,97,8,8);
g.setColor(Color.black);
//eyes
g.fillOval(1112-x,117,10,10);
g.fillOval(1138-x,117,10,10);

//bindi
g.setColor(Color.red);
g.fillOval(1128-x,112,5,5);
//body
g.setColor(Color.white);
g.drawLine(1130-x,160,1130-x,240);
//hand
g.drawLine(1130-x,200,1090-x,200);
g.drawLine(1130-x,200,1170-x,200);
g.drawLine(1090-x,200,1090-x,160);
g.drawLine(1170-x,200,1170-x,160);
//legs
g.drawLine(1130-x,240,1100-x,280);
g.drawLine(1130-x,240,1160-x,280);
g.setColor(Color.red);
//mouth
g.fillOval(1120-x,140,15,7);

}
else if(count%2!=0){
	 
g.setColor(Color.white);
//face
g.fillOval(100+x,100,60,60);
g.setColor(Color.black);
//eyes
g.fillOval(112+x,117,10,10);
g.fillOval(138+x,117,10,10);
g.setColor(Color.white);
//body
g.drawLine(130+x,160,130+x,240);
//hand
g.drawLine(130+x,200,90+x,170);
g.drawLine(130+x,200,170+x,170);
g.drawLine(90+x,170,90+x,130);
g.drawLine(170+x,170,170+x,130);
//legs
g.drawLine(130+x,240,160+x,260);
g.drawLine(160+x,260,160+x,280);

//mouth
g.setColor(Color.black);
g.fillOval(120+x,140,15,2);

//girl

//face
g.setColor(Color.white);
g.fillOval(1100-x,100,60,60);
//ribbon

g.setColor(Color.yellow);
g.fillOval(1132-x,94,15,8);
g.fillOval(1146-x,100,15,8);
g.setColor(Color.red);
g.fillOval(1142-x,97,8,8);

g.setColor(Color.black);
//eyes
g.fillOval(1112-x,117,10,10);
g.fillOval(1138-x,117,10,10);
//bindi
g.setColor(Color.red);
g.fillOval(1128-x,112,5,5);
g.setColor(Color.white);
//body
g.drawLine(1130-x,160,1130-x,240);
//hand
g.drawLine(1130-x,200,1090-x,170);
g.drawLine(1130-x,200,1170-x,170);
g.drawLine(1090-x,170,1090-x,130);
g.drawLine(1170-x,170,1170-x,130);
//legs
g.drawLine(1130-x,240,1120-x,260);
g.drawLine(1120-x,260,1120-x,280);

//mouth
g.setColor(Color.black);
g.fillOval(1120-x,140,15,2);
}
}
if(x>420&&x<=550)
{
	g.drawImage(ii,0,0,this);
	if(count%2==0){
g.setColor(Color.white);
//face
g.fillOval(520,100,60,60);
g.setColor(Color.black);
//eyes
g.fillOval(112+420,117,10,10);
g.fillOval(138+420,117,10,10);
g.setColor(Color.white);
//body
g.drawLine(130+420,160,130+420,240);
//hand
g.drawLine(130+420,200,90+420,200);

g.drawLine(90+420,200,90+420,160);
g.drawLine(130+420,200,650,240);
//legs
g.drawLine(130+420,240,100+420,280);
g.drawLine(130+420,240,160+420,280);
g.setColor(Color.red);
//mouth
g.fillOval(120+420,140,15,7);
//girl
//face
g.setColor(Color.white);
g.fillOval(1100-420,100,60,60);
//ribbon

g.setColor(Color.yellow);
g.fillOval(1132-420,94,15,8);
g.fillOval(1146-420,100,15,8);
g.setColor(Color.red);
g.fillOval(1142-420,97,8,8);
g.setColor(Color.black);
//eyes
g.fillOval(1112-420,117,10,10);
g.fillOval(1138-420,117,10,10);

//bindi
g.setColor(Color.red);
g.fillOval(1128-420,112,5,5);
//body
g.setColor(Color.white);
g.drawLine(1130-420,160,1130-420,240);
//hand
//left
g.drawLine(1130-420,200,1170-420,200);
g.drawLine(1170-420,200,1170-420,160);
//right
g.drawLine(1130-420,200,650,240);
//legs
g.drawLine(1130-420,240,1100-420,280);
g.drawLine(1130-420,240,1160-420,280);
g.setColor(Color.red);
//mouth
g.fillOval(1120-420,140,15,7);

}
else if(count%2!=0){
g.setColor(Color.white);
//face
g.fillOval(100+420,100,60,60);
g.setColor(Color.black);
//eyes
g.fillOval(112+420,117,10,10);
g.fillOval(138+420,117,10,10);
g.setColor(Color.white);
//body
g.drawLine(130+420,160,130+420,240);
//hand
g.drawLine(130+420,200,90+420,170);

g.drawLine(90+420,170,90+420,130);
//legs
g.drawLine(130+420,240,160+420,260);
g.drawLine(160+420,260,160+420,280);
//mouth
g.setColor(Color.black);
g.fillOval(120+420,140,15,2);
//girl
//face
g.setColor(Color.white);
g.fillOval(1100-420,100,60,60);
//ribbon
g.setColor(Color.yellow);
g.fillOval(1132-420,94,15,8);
g.fillOval(1146-420,100,15,8);
g.setColor(Color.red);
g.fillOval(1142-420,97,8,8);
//eyes
g.setColor(Color.black);
g.fillOval(1112-420,117,10,10);
g.fillOval(1138-420,117,10,10);
//bindi
g.setColor(Color.red);
g.fillOval(1128-420,112,5,5);
g.setColor(Color.white);
//body
g.drawLine(1130-420,160,1130-420,240);
//hand
g.drawLine(1130-420,200,1170-420,170);
g.drawLine(1170-420,170,1170-420,170);
//legs
g.drawLine(1130-420,240,1120-420,260);
g.drawLine(1120-420,260,1120-420,280);
//mouth
g.setColor(Color.black);
g.fillOval(1120-420,140,15,2);
}
}
if(x==550){au1.stop();au2.play();}
if(x>550)
{
	
	//boy bowing
g.setColor(Color.white);
g.fillOval(100+420,140,60,60);
//body
g.drawLine(130+420,200,130+420,260);
//hand
g.drawLine(130+420,220,130+420+30,220);
g.drawLine(130+420,200,130+420+30,220);
g.drawLine(130+420,200,130+420-50,230);
//legs
g.drawLine(130+420,260,130+420-30,240);
	//girl bowing
g.setColor(Color.white);
g.fillOval(100+420+160,140,60,60);
//ribbon
g.setColor(Color.yellow);
g.fillOval(100+420+160+22,175,15,8);
g.fillOval(100+420+160+36,181,15,8);
g.setColor(Color.red);
g.fillOval(100+420+160+32,178,8,8);
//body
g.setColor(Color.white);
g.drawLine(130+420+160,200,130+420+160,260);
//hand
g.drawLine(130+420+160,220,130+420+30+160,220);
g.drawLine(130+420+160,200,130+420+30+160,220);
g.drawLine(130+420+160,200,130+420-50+160,230);
//legs
g.drawLine(130+420+160,260,130+420-30+160,240);
g.setColor(Color.red);
Font f1=new Font("Verdana",Font.BOLD,35);
g.setFont(f1);
g.drawString("THANK YOU SIR!!",130+380,350);


}

}


public void loop()
{} public void play(){}
}

/*<APPLET CODE="Disco.class"  width=800 height=900>
</APPLET>*/
