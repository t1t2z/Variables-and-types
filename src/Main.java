public class Main {
    public static void main(String[] args) {
        
        MusicBox mbox1 = new MusicBox("S34TG65", 'Y', "Raindrops", "Misty", 
        "The path less traveled", "Country", "BZEE Music", "Rhythm Divine", 2);

        System.out.println("Now playing the song");
        mbox1.playSong(mbox1.getSongID(), mbox1.getPremiumSong(), 2);
        
        // Creating another MusicBox object with different parameters
        MusicBox mbox2 = new MusicBox("A12BC34", 'N', "Sunshine Melody", "Harmony Band", 
        "Golden Tunes", "Pop", "DreamWorks Studio", "Star Records", 1);

        System.out.println("Now playing the song");
        mbox2.playSong(mbox2.getSongID(), mbox2.getPremiumSong(), 1);
    }
}
