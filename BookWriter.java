package Library;

import java.io.PrintWriter;

public class BookWriter {
	protected PrintWriter out;
	protected String indent;

	public BookWriter(PrintWriter out, String indent){
		this.out = out;
		this.indent = indent;
	}
	public void write(Book book){

	}

}
