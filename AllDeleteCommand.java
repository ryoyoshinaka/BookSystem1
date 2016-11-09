package Library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class AllDeleteCommand implements CLICommand{
	protected BookCatalog catalog;
	public AllDeleteCommand(BookCatalog catalog){
		this.catalog = catalog;
	}

	public void process(BufferedReader in, PrintWriter out) throws IOException {
		out.println("本当に削除しますか？  はい＝１、いいえ＝２");
		String select = in.readLine();
		if(select.equals("1")){
			catalog.deleteFile(select);
			out.println("削除しました");
		}
	}
}
