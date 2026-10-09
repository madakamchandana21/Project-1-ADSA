interface Camera{
	void click();
}
interface MusicPlayer{
	void playmusic();
}
class Mobile implements Camera, MusicPlayer{
	public void click() {
		System.out.println("Photo clicked");
	}
	public void playmusic() {
		System.out.println("Music Playing");
	}
}
public class MultipleInheritancebyInterface {
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.click();
		m.playmusic();
		
	}
}
