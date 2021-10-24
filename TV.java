
package my.package1;
public class TV 
{
    int channel;
    int volumelevel;
    boolean on ;
    
    
   public TV()
   {
       channel=1;
       volumelevel=1;
       on=true;
       
   }
   public void  turnon()
   {
       on=true;
       System.out.println("turn on this Tv");
   }
   public void turnoff()
   {
       on=false;
           System.out.println("turn off this Tv");
   }
   public void setchannel(int newchannel)
   {
       if(newchannel>=1&&newchannel<=120)
       channel=newchannel;
       else
            System.out.println("no channel is fouded");
   }
   public void setvolume(int newvolume)
   {
       if(newvolume>=1&newvolume<=7)
       volumelevel=newvolume;
       else
         System.out.println("no newvolume is fouded");
   }
   public void ChannelUp()
   {
       if(channel==120)
           channel=1;
       else
       channel++;
   }
   public void ChannelDown()
   {
       if(channel==1)
           channel=120;
       else
       channel--;
   }
   public void VolumeUp()
   {
       if(volumelevel!=7)
       volumelevel++;
   }
   public void  volumeDown()
   {
       if(volumelevel!=1)
              volumelevel--;
   }
   
    
    
    
}
