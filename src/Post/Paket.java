package Post;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Paket{
	public String Judul;
	public Date Tanggal;
	public String Konten;
	public int id;
	public boolean valid;
	public String getJudul(){
		return Judul;
	}
	public String getTanggal(){
		return new SimpleDateFormat("d MMMM y").format(Tanggal);
	}
	public String getKonten(){
		if (Konten.length()>265){
			return Konten.substring(0, 250);
		} else {
			return Konten;
		}
	}
	public int getId(){
		return id;
	}
	public String isReadMore(){
		if (Konten.length()>250){
			return "&hellip;<a href=\"post.xhtml?id="+id+"\">Read More</a>";
		} else {
			return "";
		}
	}
}