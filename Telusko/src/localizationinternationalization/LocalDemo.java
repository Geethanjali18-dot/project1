package localizationinternationalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalDemo {
public static void main(String[] args) {
	//L10N-Localization
	//I18N->Internationalization
	//Local
	//ResourceBundle-java.util.*
	
	//System.out.println("wish");
	//String lang="en";
	//String country="US";
	//String lang="ge";
	//String country="GE";
	String lang="hi";
	String country="IN";
	Locale l=new Locale(lang,country);
	ResourceBundle r=ResourceBundle.getBundle("localizationinternationalization/Bundle",l);
	
	String str=r.getString("wish");
	System.out.println(str);
}
}
