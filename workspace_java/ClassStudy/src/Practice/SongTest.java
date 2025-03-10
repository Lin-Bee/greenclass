package Practice;

public class SongTest {
	public static void main(String[] args) {
		Song song1 = new Song();
		String[] composer = {"윤자바","김자바","도자바"};
		//song1.setSongInfo("사랑했나봐","윤도현","정규2집",2000, new String[]{"aa","bb","dd"});
		song1.setSongInfo("사랑했나봐","윤도현","정규2집",2000, composer);
		song1.printSong();
		System.out.println();
		song1.ClearSong();
	}
}
