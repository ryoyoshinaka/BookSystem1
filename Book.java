package Library;
import java.io.Serializable;

public class Book implements Serializable {
	private String bookId;
	private String title;
	private String author;
	private String translator;
	private String publisher;
	private String publishingDate;
	private String code;
	private String status;
	private String keyword;
	private String memo;
	private String dataCreator;
	private String dataCreatedDate;

	public String getBookId(){return this.bookId;}
	public void setBookId(String bookId){this.bookId = bookId;}
	public String getTitle(){return this.title;}
	public void setTitle(String title){this.title = title;}
	public String getAuthor(){return this.author;}
	public void setAuthor(String author){this.author = author;}
	public String getTranslator(){return this.translator;}
	public void setTranslator(String translator){this.translator = translator;}
	public String getPublisher(){return this.publisher;}
	public void setPublisher(String publisher){this.publisher = publisher;}
	public String getPublishingDate(){return this.publishingDate;}
	public void setPublishingDate(String publishingDate){this.publishingDate = publishingDate;}
	public String getCode(){return this.code;}
	public void setCode(String code){this.code = code;}
	public String getMemo(){return this.memo;}
	public void setMemo(String memo){this.memo = memo;}
	public String getStatus(){return this.status;}
	public void setStatus(String status){this.status = status;}
	public String getDataCreatedDate(){return this.dataCreatedDate;}
	public void setDataCreatedDate(String dataCreatedDate){this.dataCreatedDate = dataCreatedDate;}
	public String getDataCreator(){return this.dataCreator;}
	public void setDataCreator(String dataCreator){this.dataCreator = dataCreator;}
	public String getKeyword(){return this.keyword;}
	public void setKeyword(String keyword){this.keyword = keyword;}


}
