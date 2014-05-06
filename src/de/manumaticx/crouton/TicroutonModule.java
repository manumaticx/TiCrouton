package de.manumaticx.crouton;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.TiC;
import org.appcelerator.titanium.util.TiConvert;

import de.manumaticx.crouton.Configuration.Builder;

@Kroll.module(name="Ticrouton", id="de.manumaticx.crouton")
public class TicroutonModule extends KrollModule
{
	
	private static final String TAG = "TicroutonModule";
	
	//private static Activity activity;

	// constants
	@Kroll.constant public static final int STYLE_INFO = 1;
	@Kroll.constant public static final int STYLE_ALERT = 2;
	@Kroll.constant public static final int STYLE_CONFIRM = 3;
	
	//private Crouton infiniteCrouton;
	
	public TicroutonModule()
	{
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app)
	{
		Log.d(TAG, "inside onAppCreate");
		// put module init code that needs to run when the application is created
		
		
	}
	
	// Methods
	@Kroll.method
	public void showText(String text, int style)
	{
		Log.d(TAG, "showText called");
		
		Crouton.showText(TiApplication.getInstance().getCurrentActivity(), text, getStyle(style));
	}
	
	@Kroll.method
	public void show(KrollDict args)
	{
		Log.d(TAG, "show called");
		
		Crouton crouton;
		
		String text = "";
		Style style = Style.INFO;
		Builder config = new Configuration.Builder();
		
		
		if (args.containsKey(TiC.PROPERTY_TEXT)){
            text = TiConvert.toString(args.get(TiC.PROPERTY_TEXT));
        }
		
		if (args.containsKey(TiC.PROPERTY_STYLE)){
            style = getStyle(TiConvert.toInt(args.get(TiC.PROPERTY_STYLE)));
        }
		
		crouton = Crouton.makeText(TiApplication.getInstance().getCurrentActivity(), text, style);
		
		if (args.containsKey(TiC.PROPERTY_DURATION)){
			config.setDuration(TiConvert.toInt(args.get(TiC.PROPERTY_DURATION)));
			crouton.setConfiguration(config.build());
		}
		
		/*
		if (args.containsKey("infinite") && args.getBoolean("infinite")){
			
			infiniteCrouton = crouton;
			config.setDuration(Configuration.DURATION_INFINITE);
			
			crouton
			.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View view) {
					TiApplication.getInstance().getCurrentActivity().runOnUiThread(new Runnable() {
	        			@Override
	        			public void run() {
	        				Crouton.hide(infiniteCrouton);
	        			}
	        		});
				}
			})
			.setConfiguration(config.build());
			
		}
		*/
		
		crouton.show();
		
	}
	
	@Kroll.method
	public Crouton makeText(String text, int style)
	{
		Log.d(TAG, "makeText called");
		
		return Crouton.makeText(TiApplication.getInstance().getCurrentActivity(), text, getStyle(style));
	}
	
	@Kroll.method
	public Crouton make(KrollDict args)
	{
		Log.d(TAG, "make called");
		
		Crouton crouton;
		
		String text = "";
		Style style = Style.INFO;
		Builder config = new Configuration.Builder();
		
		
		if (args.containsKey(TiC.PROPERTY_TEXT)){
            text = TiConvert.toString(args.get(TiC.PROPERTY_TEXT));
        }
		
		if (args.containsKey(TiC.PROPERTY_STYLE)){
            style = getStyle(TiConvert.toInt(args.get(TiC.PROPERTY_STYLE)));
        }
		
		crouton = Crouton.makeText(TiApplication.getInstance().getCurrentActivity(), text, style);
		
		if (args.containsKey(TiC.PROPERTY_DURATION)){
			config.setDuration(TiConvert.toInt(args.get(TiC.PROPERTY_DURATION)));
			crouton.setConfiguration(config.build());
		}
		
		return crouton;
		
	}
	
	@Kroll.method
	public void hide(Crouton crouton)
	{
		Crouton.hide(crouton);
	}
	
	@Kroll.method
	public void cancelAllCroutons()
	{
		Crouton.cancelAllCroutons();
	}
	
	@Kroll.method
	public void alert(String text)
	{
		showText(text, STYLE_ALERT);
	}
	
	@Kroll.method
	public void confirm(String text)
	{
		showText(text, STYLE_CONFIRM);
	}
	
	@Kroll.method
	public void info(String text)
	{
		showText(text, STYLE_INFO);
	}
	
	/**
	 * returns a Style for the int constant
	 * @param code
	 * @return Style
	 */
	protected Style getStyle(int code)
	{
		switch (code){
			case STYLE_INFO: {
				return Style.INFO;
			}
			
			case STYLE_ALERT: {
				return Style.ALERT;
			}
			
			case STYLE_CONFIRM: {
				return Style.CONFIRM;
			}
			
			default: return Style.INFO;
		}
	}

}

