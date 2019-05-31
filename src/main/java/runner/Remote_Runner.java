package runner;

import remotecontrol.*;
public class Remote_Runner {

	public static void main(String[] args) {
		Remote_Control rc = new TV_Remote();
		rc.turn_on();
		((TV_Remote)rc).change_channel(123);
		((TV_Remote)rc).change_channel(true);
		((TV_Remote)rc).change_channel(false);
		((TV_Remote)rc).change_volume(true);
		((TV_Remote)rc).change_volume(false);
		((TV_Remote)rc).display_channel_list();
		((TV_Remote)rc).display_favourites();
		rc.turn_off();

	}

}
