package Languages;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Message
{

  public static String getMessage(String language, String key, String[] placeholders)
  {

    String message = "???"; //Error message, change if better idea

    try (InputStream input = Message.class.getResourceAsStream(language + ".properties")) {

      Properties language_properties_file = new Properties();
      language_properties_file.load(input);

      message = language_properties_file.getProperty(key);

      if(placeholders != null)
      {
        for(int i = 0; i < placeholders.length; i++)
          message = message.replace("{"+i+"}", placeholders[i]);
      }

    } catch (IOException ex) {
      ex.printStackTrace();
    }

    return message;
  }

  public static String getMessage(String language, String key) {return getMessage(language, key, null);}

}
