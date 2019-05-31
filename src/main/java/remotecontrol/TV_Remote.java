package remotecontrol;

/**
 * @author Neeraj Jain
 *
 */
public class TV_Remote implements Remote_Control {
	public TV_Remote() {System.out.println("initializing tv remote ...");}
	public void change_channel(int channel_number) { System.out.println("Moving to channel number :"+ channel_number);}
	public void change_volume(boolean direction) {		
		String vol_direct = direction == true ? "UP" : "DOWN";
		System.out.println("Changing vlome in "+vol_direct+" direction");		
	}
	public void change_channel(boolean direction) {
		String channel_direct = direction == true ? "UP" : "DOWN";
		System.out.println("Changing channel in "+channel_direct+" direction");	
	}
	public void display_channel_list() {System.out.println("Going to display channel list");}
	public void display_favourites() {System.out.println("Going to display favourites");}
	public void turn_on() {System.out.println("Going to turn the TV on");}
	public void turn_off() {System.out.println("Going to turn the TV off");}
}
