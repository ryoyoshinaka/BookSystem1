package Library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	protected Map<String,CLICommand> commandMap = new HashMap<String,CLICommand>();

	public Main(){
		BookCatalog catalog = BookCatalog.getInstance();
		CLICommand command;
		command = new ListCommand(catalog);
		commandMap.put("1", command);
		commandMap.put("List", command);
		command = new AddCommand(catalog);
		commandMap.put("2", command);
		commandMap.put("add", command);
		command = new DeleteCommand(catalog);
		commandMap.put("3", command);
		commandMap.put("delete", command);
		command = new ExitCommand();
		commandMap.put("0", command);
		commandMap.put("exit", command);
		command = new AllDeleteCommand(catalog);
		commandMap.put("4", command);
		commandMap.put("all delete", command);
//		command = new SearchCommand(command);
//		commandMap.put("5",command );
//		commandMap.put("search", command);
	}
	public void process(BufferedReader in, PrintWriter out)throws IOException{
		for(;;){
			try{
				out.println("\n"+"1)list  2)add  3)delete 4)all delete 5)search 0)exit");
				commandMap.get(in.readLine()).process(in, out);
			}catch(Exception e){
				out.println("正しくありません。");
			}

		}
	}
	public static void main(String[] args) {
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out),true);
			Main main = new Main();
			main.process(in, out);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
