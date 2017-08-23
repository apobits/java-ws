/**
 * 
 */
package ortiz.perez.albin.ws.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author aposo
 *
 */
public class WSCaller1 {

    /**
     * @param args
     * @throws IOException
     * @throws MalformedURLException
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
	URLConnection conn = new URL(args[0]).openConnection();

	BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	String line = null;
	while ((line = reader.readLine()) != null)
	    System.out.println(line);

	reader.close();

    }

}
