package Library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public interface CLICommand {
	public void process(BufferedReader in, PrintWriter out)
		throws IOException;
}
