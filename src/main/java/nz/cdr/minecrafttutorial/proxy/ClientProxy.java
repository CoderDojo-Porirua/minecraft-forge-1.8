package nz.cdr.minecrafttutorial.proxy;

import nz.cdr.minecrafttutorial.init.TutorialItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders(){
		TutorialItems.registerRenders();
	}
	
}
