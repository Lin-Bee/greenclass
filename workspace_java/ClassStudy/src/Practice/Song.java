package Practice;

import java.util.Arrays;

public class Song {
	String title;
	String artist;
	String album;
	int year;
	String[] comporser;
//기본자료형을 제외한 모든 자료형은 기본 초기값 : null;
	public void setSongInfo(String title, String artist, String album, int year, String[] comporser){
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
		this.comporser = comporser;
	}

	public void printSong(){
		System.out.println("노래제목 : "+ title);
		System.out.println("가수 : "+ artist);
		System.out.println("앨범제목 : "+ album);
		System.out.println("제작연도 : "+ year);
		System.out.println("작곡가명 : "+ Arrays.toString(comporser));
	}
	public void ClearSong(){

	}
}
