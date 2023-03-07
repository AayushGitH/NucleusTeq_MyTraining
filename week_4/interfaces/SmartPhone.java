package Training.week_4.interfaces;

public class SmartPhone extends Phone implements Camera,MusicPlayer
{
	// Overriding unimplemented methods from interfaces
	@Override
	public void play() 
	{
		System.out.println("Music is playing...");
	}

	@Override
	public void stop() 
	{
		System.out.println("Music stopped..");
	}

	@Override
	public void click() 
	{
		System.out.println("Photo is clicked :-)");
	}

	@Override
	public void record() 
	{
		System.out.println("Video is about to record.....");
	}
	
	public static void main(String...args)
	{
		SmartPhone oppo = new SmartPhone();
		// Calling phone class methods
		oppo.call(); 
		oppo.sms();
		
		System.out.println();
		// Calling Camera interface methods
		oppo.click();
		oppo.record();
		
		System.out.println();
		// Calling MusicPlayer interface methods
		oppo.play();
		oppo.stop();
		
	}
}
