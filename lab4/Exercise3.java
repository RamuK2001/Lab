package lab4;

/*
 * Using an inheritance hierarchy, design a Java program 
 * to model items at a library (books, journal articles, 
 * videos and CDs.) Have an abstract superclass called 
 * Item and include common information that the library 
 * must have for every item (such as unique identification 
 * number, title, and number of copies). No actual objects 
 * of type Item will be created - each actual item will be 
 * an object of a (non-abstract) subclass. Place 
 * item-type-specific behavior in subclasses 
 * (such as a video's year of release, a CD's musical genre, or a book's author).
 */

abstract class Item{
	private int uin;
	private String title;
	private int noc;
	Item(){};
	Item(int uin, String title, int noc) {
		this.uin = uin;
		this.title = title;
		this.noc = noc;
	}
	public int getUin() {
		return uin;
	}
	public void setUin(int uin) {
		this.uin = uin;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoc() {
		return noc;
	}
	public void setNoc(int noc) {
		this.noc = noc;
	}
	@Override
	public String toString() {
		return "Item [uniqueIdentificationNumber=" + uin + ", title=" + title + ", numberOfCopies=" + noc + "]";
	}
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if(!(o instanceof Item)) {
			return false;
		}
		Item i = (Item) o;
		return (uin == i.getUin())&&(title.equals(i.getTitle()))&&(noc == i.getNoc());
	}
	public static void print(Item []items) {
		for(int i = 0;i < items.length;i++) {
			System.out.println(items[i]);
		}
	}
	public static Item[] addItem(Item[] items,Item i) {
		Item []newItems = new Item[items.length+1];
		for(int j = 0;j < items.length;j++) {
			newItems[j] = items[j];
		}
		newItems[items.length] = i;
		return newItems;
	}
}

abstract class WrittenItem extends Item{
	private String author;
	WrittenItem(){};
	WrittenItem(int uin,String title,int noc,String author){
		super(uin,title,noc);
		this.setAuthor(author);
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}

abstract class MediaItem extends Item{
	private int rt;
	MediaItem(){};
	MediaItem(int uin,String title,int noc,int rt){
		super(uin,title,noc);
		this.rt = rt;
	}
	public int getRt() {
		return rt;
	}
	public void setRt(int rt) {
		this.rt = rt;
	}
}

class Book extends WrittenItem{
	Book(){};
	Book(int uin,String title,int noc,String author){
		super(uin,title,noc,author);
	}
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if(!(o instanceof Book)) {
			return false;
		}
		Book b = (Book) o;
		return (this.getUin() == b.getUin())&&(this.getTitle().equals(b.getTitle()))&&(this.getNoc() == b.getNoc())&&(this.getAuthor().equals(b.getAuthor()));
	}
	@Override
	public String toString() {
		return "Book [uniqueIdentificationNumber=" + getUin() + ", title=" + getTitle()
				+ ", numberOfCopies=" + getNoc() + ", author=" + getAuthor() + "]";
	}
}

class JournalPaper extends WrittenItem{
	private int py;
	JournalPaper(){};
	JournalPaper(int uin,String title,int noc,String author,int py){
		super(uin,title,noc,author);
		this.py = py;
	}
	public int getPy() {
		return py;
	}
	public void setPy(int py) {
		this.py = py;
	}
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if(!(o instanceof JournalPaper)) {
			return false;
		}
		JournalPaper j = (JournalPaper) o;
		return (this.getUin() == j.getUin())&&(this.getTitle().equals(j.getTitle()))&&(this.getNoc() == j.getNoc())&&(this.getAuthor().equals(j.getAuthor()))&&(py == j.getPy());
	}
	@Override
	public String toString() {
		return "JournalPaper [uniqueIdentificationNumber=" + getUin() + ", title="
				+ getTitle() + ", numberOfCopies=" + getNoc() + ", author=" + getAuthor() + ", publishedYear=" + py + "]";
	}
}

class Video extends MediaItem{
	private String director;
	private String genre;
	private int ry;
	Video(){};
	Video(int uin,String title,int noc,int rt,String director,String genre,int ry){
		super(uin,title,noc,rt);
		this.director = director;
		this.genre = genre;
		this.ry= ry;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRy() {
		return ry;
	}
	public void setRy(int ry) {
		this.ry = ry;
	}
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if(!(o instanceof Video)) {
			return false;
		}
		Video v = (Video) o;
		return (this.getUin() == v.getUin())&&(this.getTitle().equals(v.getTitle()))&&(this.getNoc() == v.getNoc())&&(this.getRt() == v.getRt())&&(director.equals(v.getDirector()))&&(genre.equals(v.getGenre()))&&(ry == v.getRy());
	}
	@Override
	public String toString() {
		return "Video [uniqueIdentificationNumber=" + getUin() + ", title=" + getTitle() + ", numberOfCopies=" + getNoc() + ", runTime=" + getRt() + ", director=" + director + ", genre=" + genre + 
				", releasedYear=" + ry + "]";
	}
}

class CD extends MediaItem{
	private String artist;
	private String genre;
	CD(){};
	CD(int uin,String title,int noc,int rt,String artist,String genre){
		super(uin,title,noc,rt);
		this.artist = artist;
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if(!(o instanceof CD)) {
			return false;
		}
		CD c = (CD) o;
		return (this.getUin() == c.getUin())&&(this.getTitle().equals(c.getTitle()))&&(this.getNoc() == c.getNoc())&&(this.getRt() == c.getRt())&&(artist.equals(c.getArtist()))&&(genre.equals(c.getGenre()));
	}
	@Override
	public String toString() {
		return "CD [uniqueIdentificationNumber=" + getUin() + ", title=" + getTitle() + ", numberOfCopies=" + getNoc() + ", runTime=" + getRt() + ", artist=" + artist + ", genre=" + genre + "]";
	}
}

public class Exercise3 {
	public static void main(String[] args) {
		Item []items = new Item[4];
		items[0] = new Book(1,"Title1",10,"Author1");
		items[1] = new JournalPaper(2,"Title2",11,"Author2",2000);
		items[2] = new Video(3,"Title3",12,100,"Director1","Genre1",2001);
		items[3] = new CD(4,"Title4",13,101,"Artist1","Genre2");
		items = Item.addItem(items, new Book(1,"Title1",10,"Author1"));
		items = Item.addItem(items, new JournalPaper(2,"Title2",11,"Author2",2000));
		items = Item.addItem(items, new Video());
		items = Item.addItem(items, new CD(4,"Title4",13,101,"Artist1","Genre2"));
		Item.print(items);
		for(int i = 0;i < 4;i++) {
			System.out.println(items[i+0].equals(items[i+4]));
		}
	}
}