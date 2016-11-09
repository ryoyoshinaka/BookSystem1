package Library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ListCommand implements CLICommand{
	BookCatalog catalog;

	public ListCommand(BookCatalog catalog){
		this.catalog = catalog;
	}
	public void process(BufferedReader in, PrintWriter out) throws IOException{
		out.println("合計" + catalog.getBooks().length + "項目");
		for(int i = 0;i<30;i++){
			System.out.print("-");
		}
		out.println();
		int count = 1;
		for(Book book: catalog.getBooks()){
			out.println("[" + count + "]");
			out.println("図書ID		：" + book.getBookId());
			out.println("タイトル	：" + book.getTitle());
			out.println("著者		：" + book.getAuthor());
			out.println("訳者		：" + book.getTranslator());
			out.println("出版社		：" + book.getPublisher());
			out.println("出版年月日	：" + book.getPublishingDate());
			out.println("ISBN/ISSN	：" + book.getCode());
			out.println("備考		：" + book.getMemo());
			out.println("キーワード	：" + book.getKeyword());
			out.println("登録者		：" + book.getDataCreator());
			out.println("登録日		：" + book.getDataCreatedDate());
			for(int i = 0;i<30;i++){
				System.out.print("-");
			}
			out.println();
			count++;
		}
	}

}
