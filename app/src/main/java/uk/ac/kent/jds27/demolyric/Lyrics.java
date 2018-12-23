package uk.ac.kent.jds27.demolyric;

import java.util.ArrayList;
import java.util.Random;

public class Lyrics
{
    //Arraylist to hold song lyrics
    private ArrayList<String> lyrics;
    int lyricIndex = 0;

    /**
     * Constructor for objects of class Lyrics
     */
    public Lyrics()
    {
        lyrics = new ArrayList<>();
        lyrics.add(0, null);
        lyrics.add(1, "that's me in the corner, that's me in the spotlight");
        lyrics.add(2,"I said to the man 'are you trying to tempt me?'");
        lyrics.add(3,"Marry him, or marry me, I'm the one that loves you baby can't you see");
        lyrics.add(4,"I don't believe that anybody feels the way I do, about you now");
        lyrics.add(5,"Oh can't you see, you belong to me. My poor heart aches, with every step you take");
        lyrics.add(6,"You say we've got nothing in common, no common ground to start from");
        lyrics.add(7, "So I'll start a revolution from my bed, because you said the brains I had went to my head");
        lyrics.add(8,"Soft lips are open, them knuckles are pale. Feels like you're dying, you're dying");
        lyrics.add(9,"L.A. proved too much for the man, so he's leaving a life he's come to know");
        lyrics.add(10,"Since you became a V.I.Person it's like your problems have all worsened");
        lyrics.add(11,"He turned to me as if to say, 'Hurry boy, it's waiting there for you'");
        lyrics.add(12,"Let me take you where you'll let me, because leaving just upsets me");
        lyrics.add(13,"Life is good and the girls are gorgeous, suddenly the air smells much greener now");
        lyrics.add(14,"Some folks are born silver spoon in hand, Lord don't they help themselves, oh");
        lyrics.add(15,"Baby, I'm hot just like an oven, I need some lovin'");
        lyrics.add(16,"And I think it's gonnna be a long long time, 'till touch down brings me round again to find");
        lyrics.add(17,"No reason to get excited, the theif he kindly spoke");
        lyrics.add(18,"You can rely on the old man's money, you can rely on the old man's money");
        lyrics.add(19,"Heaven holds a place for those who pray, hey, hey, hey");
        lyrics.add(20,"Listen to the wind blow, down comes the night. Running in the shadows");
        lyrics.add(21,"Just in time, I'm so glad you have a one-track mind like me");
        lyrics.add(22,"Maybe I'm foolish, maybe I'm blind, thinking I can see through this");
        lyrics.add(23,"The streets are dirty too but you never look back over what you've done");
        lyrics.add(24,"We'll be together, with a roof right over our heads");
        lyrics.add(25,"'Cause I knew it from the start, baby when you broke my heart");
        lyrics.add(26,"Hell, with it baby cause you're fun and you're mine and you look so divine");
        lyrics.add(27,"And our bodies, are tired. Our shadows will dance. I've been achin' achin' for you, my love");
        lyrics.add(28,"Man, we just fell about the place, if that chick don't want to know, forget her");
        lyrics.add(29,"Drink some Margaritas by a string of blue lights, listen to the Mariachi play at midnight");
        lyrics.add(30,"When head of state didn't play guitar, not everybody drove a car");
        lyrics.add(31,"And if you leave here, you leave me broken, shattered, I lie");
        lyrics.add(32,"If the sky that we look upon should tumble and fall");
        lyrics.add(33,"When food is gone you are my daily meal, oh");
        lyrics.add(34,"Rosenbergs, H-Bomb, Sugar Ray, Panmunjom, Brando, The King And I, and The Catcher In The Rye");
        lyrics.add(35,"Oh, what a night, hypnotizing, mesmerizing me, she was everything I dreamed she'd be");
        lyrics.add(36,"I've seen your face before my friend, but I don't know if you know who I am");
        lyrics.add(37,"Did you write the book of love and do you have faith in God above");
        lyrics.add(38,"I play along with the charade, there doesn't seem to be a reason to change");
        lyrics.add(39,"I used to roll the dice, feel the fear in my enemy's eyes");
        lyrics.add(40,"I'm breaking in, shaping up, then checking out on the prison bus");
        lyrics.add(41,"So they dug your grave and the masquerade will come calling out at the mess you made");
        lyrics.add(42,"I said maybe I don't really wanna know how your garden grows 'cause I just want to fly");
        lyrics.add(43,"Bring it back down, bring it back down tonight. Never thought I'd let a rumor ruin my moonlight");
        lyrics.add(44,"I'm coming out of my cage and I've been doing just fine");
        lyrics.add(45,"But not us, (no never) no not us (no never) we are far to young and clever");
        lyrics.add(46,"Now John at the bar is a friend of mine, he gets me my drinks for free");
        lyrics.add(47,"I stuck around St. Petersburg when I saw it was a time for a change");
        lyrics.add(48,"Lips are sweet as candy, it's taste stays on my mind. Girl, you got me thirsty for another cup of wine");
        lyrics.add(49,"We like our fun and we never fight, you can't dance and stay uptight");
        lyrics.add(50,"In time I want to be your best friend, East side lovers living on the West end");
        lyrics.add(51,"Did you have to go to jail, put your house up for sale, did you get a good lawyer?");
        lyrics.add(52,"My left stroke just went viral");
        lyrics.add(53, "Sometimes I get the feeling she's watching over me, and other times I feel like I should go");
        lyrics.add(54, "And you're a very sexy girl, very hard to please");
        lyrics.add(55, "Some vodka that will jump start my heart quicker, then a shot when I get shocked at the hospital");
        lyrics.add(56, "Everybody want the key and the secret to rap immortality like I have got");
        lyrics.add(57, "I don't know what they want from me, it's like the more money we come across the more problems we see");
        lyrics.add(58, "Caroline!(Caroline!) Caroline! All the guys would say she's mighty fine(Mighty fine!)");
        lyrics.add(59, "Yeah this one right here goes out to all the baby's mamas, mamas, mamas, mamas, baby mamas, mamas");
        lyrics.add(60, "Can't you see he's the man let me hear you applaud, he is more than a man he's a shining golden god");
        lyrics.add(61, "I'm living in that 21st Century, doing something mean to it");
        lyrics.add(62, "My anaconda don't want none unless you got buns hun");
        lyrics.add(63, "Them baggy sweat pants and the Reebok's with the straps");
        lyrics.add(64, "I did not believe that it would end, no, everything came second to the Benzo");
        lyrics.add(65, "He's always hated me because I never got a J O B");
        lyrics.add(66, "I'm back in Liverpool and everything seems the same");
        lyrics.add(67, "The club isn't the best place to find a lover so the bar is where I go");
        lyrics.add(68, "When I had you to myself, I didn't want you around, those pretty faces always make you stand out in a crowd");
        lyrics.add(69, "I look and stare so deep in your eyes, I touch on you more and more every time");
        lyrics.add(70, "They're gonna clean up your looks with all the lies in the book");
        lyrics.add(71, "So where's your picket fence love? And where's that shiny car?");
        lyrics.add(72, "Stop making the eyes at me I'll stop making the eyes at you");
        lyrics.add(73, "When I finally got sober felt 10 years older but fuck it, it was something to do");
        lyrics.add(74, "Anybody could be that guy, night is young and the music's high");
        lyrics.add(75, "Everyday is so wonderful, then suddenly it's hard to breathe");
        lyrics.add(76, "My father was a gamblin' man, way down in New Orleans");
        lyrics.add(77, "We're no strangers to love, you know the rules and so do I");
        lyrics.add(78, "Am I your fire? Your one desire");
        lyrics.add(79, "Who never ever learned to read or write so well, but he could play a guitar just like a-ringin' a bell");
        lyrics.add(80, "Gina works the diner all day working for her man she brings home her pay, for love");
        lyrics.add(81, "I've seen your flag on the marble arch, and love is not a victory march");
        lyrics.add(82, "Life is old there, older than the trees, younger than the mountains, blowing like a breeze");
        lyrics.add(83, "He said, 'we haven't had that spirit here since nineteen sixty-nine'");
    }

    public void randomLyrics()
    {
        if(lyrics.size() > 0) {
            Random rand = new Random();
            int index = rand.nextInt(lyrics.size());
            System.out.println(lyrics.get(rand.nextInt(lyrics.size())));
        }
    }

    public ArrayList getLyricsList()
    {
        return lyrics;
    }

    public String getLyric(int index)
    {
        String randomLyric = null;
        for(String lyric : lyrics) {
            if(index == lyrics.indexOf(lyric)) {
                randomLyric = lyric;
            }
        }
        return randomLyric;
    }

    public int getIndexByLyric(String lyricName)
    {
        for(String lyric : lyrics)
        {
            if(lyric == lyricName) {
                lyricIndex = lyrics.indexOf(lyric);
            }
        }
        return lyricIndex;
    }
}

