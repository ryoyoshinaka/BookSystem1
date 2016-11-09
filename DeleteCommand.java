package Library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteCommand implements CLICommand {
	protected BookCatalog catalog;

	public DeleteCommand(BookCatalog catalog){
		this.catalog = catalog;
	}
	public void process(BufferedReader in, PrintWriter out) throws IOException {
		out.println("削除する図書IDを入力してください");
		String bookId = in.readLine();
		if(catalog.getBook(bookId)==null){
			out.println("指定した本はありません");
		}else
			catalog.deleteBook(bookId);
	}
}
