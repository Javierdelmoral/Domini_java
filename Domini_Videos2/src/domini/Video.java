package domini;

import java.util.ArrayList;
import java.util.List;

public class Video {

	protected String url;
	protected String title;
	private List<Tag> tagsList;

	public Video(String url, String title) {

		this.url = url;
		this.title = title;
		this.tagsList = new ArrayList<Tag>();

	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Tag> getTagsList() {
		return tagsList;
	}

	public void setTagsList(List<Tag> tagsList) {
		this.tagsList = tagsList;
	}
	
	
	
	@Override
	public String toString() {
		return "Video [url=" + this.getUrl() + ", title=" + this.getTitle() + ", tagsList=" + this.getTagsList() + "]";
	}

	
	public String getInfoVideo() {
		
		return "Your video URL is: " + this.getUrl() + ", the title is: " + this.getTitle() + ", and it have " + this.getTagsList().size() + " tags: " +
				this.getTagsList();
		
	}
	
	

	
	
	

}

/*
 * 
 * Si necesito guardar la URL de esta manera...
 * 
 * String q = "random word £500 bank $"; 
 * String url ="http://example.com/query?q=" + URLEncoder.encode(q, "UTF-8");
 * 
 * 
 */