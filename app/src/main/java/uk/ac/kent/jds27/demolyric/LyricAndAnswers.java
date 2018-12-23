package uk.ac.kent.jds27.demolyric;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

public class LyricAndAnswers
{
    //Arraylist to hold song lyrics
    private ArrayList<String> lyrics = new ArrayList<String>();
    int lyricIndex = 0;

    /**
     * Constructor for objects of class Lyrics
     */
    public LyricAndAnswers()
    {
        lyrics.add(0, null);
        lyrics.add("that's me in the corner, that's me in the spotlight" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Losing My Religion - R.E.M");
        lyrics.add("I said to the man 'are you trying to tempt me?'" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Down Under - Men At Work");
        lyrics.add("Marry him, or marry me, I'm the one that loves you baby can't you see" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Two Princes - Spin Doctors");
        lyrics.add("I don't believe that anybody feels the way I do, about you now" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Wonderwall - Oasis");
        lyrics.add("Oh can't you see, you belong to me. My poor heart aches, with every step you take" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Every Breath You Take - The Police");
        lyrics.add("You say we've got nothing in common, no common ground to start from" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Breakfast At Tiffany's - Deep Blue Something\"");
        lyrics.add("So I'll start a revolution from my bed, because you said the brains I had went to my head" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Don't Look Back In Anger - Oasis");
        lyrics.add("Soft lips are open, them knuckles are pale. Feels like you're dying, you're dying" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sex On Fire - Kings Of Leon");
        lyrics.add("L.A. proved too much for the man, so he's leaving a life he's come to know" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Midnight Train To Georgia - Gladys Knight & The Pips");
        lyrics.add("Since you became a V.I.Person it's like your problems have all worsened" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Starz In Their Eyes - Just Jack");
        lyrics.add("He turned to me as if to say, 'Hurry boy, it's waiting there for you'" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Africa - Toto");
        lyrics.add("Let me take you where you'll let me, because leaving just upsets me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Jenny Don't Be Hasty - Paolo Nutini");
        lyrics.add("Life is good and the girls are gorgeous, suddenly the air smells much greener now" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "These Streets - Paolo Nutini");
        lyrics.add("Some folks are born silver spoon in hand, Lord don't they help themselves, oh" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Fortunate Son - Creedence Clearwater Revival");
        lyrics.add("Baby, I'm hot just like an oven, I need some lovin'" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sexual Healing - Marvin Gaye");
        lyrics.add("And I think it's gonnna be a long long time, 'till touch down brings me round again to find" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rocket Man (I Think It's Going To Be A Long Long Time) - Elton John");
        lyrics.add("No reason to get excited, the theif he kindly spoke" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "All Along The Watchtower - Jimi Hendrix");
        lyrics.add("You can rely on the old man's money, you can rely on the old man's money" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rich Girl - Daryl Hall & John Oates");
        lyrics.add("Heaven holds a place for those who pray, hey, hey, hey" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Mrs. Robinson - Simon & Garfunkel");
        lyrics.add("Listen to the wind blow, down comes the night. Running in the shadows" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The Chain - Fleetwood Mac");
        lyrics.add("Just in time, I'm so glad you have a one-track mind like me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hey, Soul Sister - Train");
        lyrics.add("Maybe I'm foolish, maybe I'm blind, thinking I can see through this" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Human - Rag'N'Bone Man");
        lyrics.add("The streets are dirty too but you never look back over what you've done" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "In The Morning - Razorlight");
        lyrics.add("We'll be together, with a roof right over our heads" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Is This Love - Bob Marley");
        lyrics.add("'Cause I knew it from the start, baby when you broke my heart" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Return Of The Mack - Mark Morrison");
        lyrics.add("Hell, with it baby cause you're fun and you're mine and you look so divine" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Come And Get Your Love - Redbone");
        lyrics.add("And our bodies, are tired. Our shadows will dance. I've been achin' achin' for you, my love" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "My Head Is A Jungle - Emma Louise, Wankelmut");
        lyrics.add("Man, we just fell about the place, if that chick don't want to know, forget her" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The Boys Are Back In Town - Thin Lizzy");
        lyrics.add("Drink some Margaritas by a string of blue lights, listen to the Mariachi play at midnight" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Are You With Me - Lost Frequencies");
        lyrics.add("When head of state didn't play guitar, not everybody drove a car" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Wish I Was A Punk Rocker (With Flowers In My Hair) - Sandi Thom");
        lyrics.add("And if you leave here, you leave me broken, shattered, I lie" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Take Me Out - Franz Ferdinand");
        lyrics.add("If the sky that we look upon should tumble and fall" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Stand By Me - Ben E. King");
        lyrics.add("When food is gone you are my daily meal, oh" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "You've Got The Love - Candi Staton");
        lyrics.add("Rosenbergs, H-Bomb, Sugar Ray, Panmunjom, Brando, The King And I, and The Catcher In The Rye" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "We Didn't Start The Fire - Billy Joel");
        lyrics.add("Oh, what a night, hypnotizing, mesmerizing me, she was everything I dreamed she'd be" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "December 1963 (Oh What A Night) - Frankie Valli & The Four Seasons");
        lyrics.add("I've seen your face before my friend, but I don't know if you know who I am" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "In The Air Tonight - Phil Collins");
        lyrics.add("Did you write the book of love and do you have faith in God above" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "American Pie - Don McLean");
        lyrics.add("I play along with the charade, there doesn't seem to be a reason to change" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Jessie's Girl - Rick Springfield");
        lyrics.add("I used to roll the dice, feel the fear in my enemy's eyes" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Viva La Vida - Coldplay");
        lyrics.add("I'm breaking in, shaping up, then checking out on the prison bus" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Radioactive - Imagine Dragons");
        lyrics.add("So they dug your grave and the masquerade will come calling out at the mess you made" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Demons - Imagine Dragons");
        lyrics.add("I said maybe I don't really wanna know how your garden grows 'cause I just want to fly" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Live Forever - Oasis");
        lyrics.add("Bring it back down, bring it back down tonight. Never thought I'd let a rumor ruin my moonlight" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Somebody Told Me - The Killers");
        lyrics.add("I'm coming out of my cage and I've been doing just fine" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Mr. Brightside - The Killers");
        lyrics.add("But not us, (no never) no not us (no never) we are far to young and clever" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Come On Eileen - Dexys Midnight Runners");
        lyrics.add("Now John at the bar is a friend of mine, he gets me my drinks for free" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Piano Man - Billy Joel");
        lyrics.add("I stuck around St. Petersburg when I saw it was a time for a change" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sympathy For The Devil - The Rolling Stones");
        lyrics.add("Lips are sweet as candy, it's taste stays on my mind. Girl, you got me thirsty for another cup of wine" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hooked On A Feeling - Blue Swede");
        lyrics.add("We like our fun and we never fight, you can't dance and stay uptight" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Dancing In The Moonlight - Toploader");
        lyrics.add("In time I want to be your best friend, East side lovers living on the West end" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Can't Stop - Red Hot Chili Peppers");
        lyrics.add("Did you have to go to jail, put your house up for sale, did you get a good lawyer?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Valerie - The Zutons");
        lyrics.add("My left stroke just went viral" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "HUMBLE. - Kendrick Lamar");
        lyrics.add("Sometimes I get the feeling she's watching over me, and other times I feel like I should go" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Welcome To The Black Parade - My Chemical Romance");
        lyrics.add("And you're a very sexy girl, very hard to please" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Welcome To The Jungle - Guns 'n' Roses");
        lyrics.add("Some vodka that will jump start my heart quicker, then a shot when I get shocked at the hospital" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Without Me - Eminem");
        lyrics.add("Everybody want the key and the secret to rap immortality like I have got" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rap God - Eminem");
        lyrics.add("I don't know what they want from me, it's like the more money we come across the more problems we see" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Mo Money Mo Problems - The Notorious B.I.G");
        lyrics.add("Caroline!(Caroline!) Caroline! All the guys would say she's mighty fine(Mighty fine!)" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Roses - Outkast");
        lyrics.add("Yeah this one right here goes out to all the baby's mamas, mamas, mamas, mamas, baby mamas, mamas" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Ms. Jackson - Outkast");
        lyrics.add("Can't you see he's the man let me hear you applaud, he is more than a man he's a shining golden god" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Classico - Tenacious D");
        lyrics.add("I'm living in that 21st Century, doing something mean to it" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "POWER - Kanye West");
        lyrics.add("My anaconda don't want none unless you got buns hun" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Baby Got Back - Sir Mix-A-Lot");
        lyrics.add("Them baggy sweat pants and the Reebok's with the straps" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Low - Flo Rida");
        lyrics.add("I did not believe that it would end, no, everything came second to the Benzo" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Better Now - Post Malone");
        lyrics.add("He's always hated me because I never got a J O B" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Crashed The Wedding - Busted");
        lyrics.add("I'm back in Liverpool and everything seems the same" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Let's Dance To Joy Division - The Wombats");
        lyrics.add("The club isn't the best place to find a lover so the bar is where I go" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Shape Of You - Ed Sheeran");
        lyrics.add("When I had you to myself, I didn't want you around, those pretty faces always make you stand out in a crowd" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Want You Back - Jackson 5");
        lyrics.add("I look and stare so deep in your eyes, I touch on you more and more every time" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Crazy In Love - Beyonce");
        lyrics.add("They're gonna clean up your looks with all the lies in the book" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Teenagers - My Chemical Romance");
        lyrics.add("So where's your picket fence love? And where's that shiny car?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Gives You Hell - All American Rejects");
        lyrics.add("Stop making the eyes at me I'll stop making the eyes at you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Bet That You Look Good On The Dancefloor - Arctic Monkeys");
        lyrics.add("I get along with old timers 'cause my name's a reminder of a pop song people forgot" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Took A Pill In Ibiza - Mike Posner");
        lyrics.add("Anybody could be that guy, night is young and the music's high" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Dancing Queen - ABBA");
        lyrics.add("Everyday is so wonderful, then suddenly it's hard to breathe" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Beautiful - Christina Aguilera");
        lyrics.add("My father was a gamblin' man, way down in New Orleans" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The House Of The Rising Sun - The Animals");
        lyrics.add("We're no strangers to love, you know the rules and so do I" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Never Gonna Give You Up - Rick Astley");
        lyrics.add("Am I your fire? Your one desire" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Want It That Way - The Backstreet Boys");
        lyrics.add("Who never ever learned to read or write so well, but he could play a guitar just like a-ringin' a bell" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Johnny B. Goode - Chuck Berry");
        lyrics.add("Gina works the diner all day working for her man she brings home her pay, for love" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Livin' On A Prayer - Bon Jovi");
        lyrics.add("I've seen your flag on the marble arch, and love is not a victory march" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hallelujah - Jeff Buckley");
        lyrics.add("Life is old there, older than the trees, younger than the mountains, blowing like a breeze" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Take Me Home, Country Roads - John Denver");
        lyrics.add("He said, 'we haven't had that spirit here since nineteen sixty-nine'" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hotel California - The Eagles");
        lyrics.add("Trying to make ends meet, you're a slave to the money and then you die"  + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Bittersweet Symphony - The Verve");
        lyrics.add("I'm just a poor boy, I need no sympathy, because I'm easy come, easy go, little high, little low" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Bohemian Rhapsody - Queen");
        lyrics.add("You may say I'm a dreamer, but I'm not the only one" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Imagine - John Lennon");
        lyrics.add("And down the waterfall wherever it may take me I know that life won't break me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Angels - Robbie Williams");
        lyrics.add("Take a sad song and make it better" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hey Jude - The Beatles");
        lyrics.add("I'm worse at what I do best and for this gift I feel blessed" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Smells Like Teen Spirit - Nirvana");
        lyrics.add("Well it's too late, tonight to drag the past out into the light" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "One - U2");
        lyrics.add("Yeah, that’s the crew that I’m repping on the rise to the top, no lead in our zeppelin" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Party Rock Anthem - LMFAO");
        lyrics.add("It's hard to say that I'd rather stay awake when I'm asleep 'cause everything is never as it seems" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Fireflies - Owl City");
        lyrics.add("I'm still alive but I'm barely breathing just prayin' to a god that I don't believe in" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Breakeven - The Script");
        lyrics.add("You could travel the world, but nothing comes close to the golden coast" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "California Gurls - Katy Perry");
        lyrics.add("I love when it's all too much, five a.m. turn the radio up. Where's the rock and roll?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Raise Your Glass - P!nk");
        lyrics.add("The scars of your love remind me of us, they keep me thinking that we almost had it all" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rolling In The Deep - Adele");
        lyrics.add("So if by the time the bar closes and you feel like falling down, I'll carry you home" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "We Are Young - Fun.");
        lyrics.add("Hey, you tell your friends it was nice to meet them, but I hope I never see them again" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Closer - The Chainsmokers");
        lyrics.add("Then you smiled over your shoulder for a minute, I was stone-cold sober" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Say You Won't Let Go - James Arthur");
        lyrics.add("I thought I was an atheist until I realised I'm a God" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Woah Woah Woah - Watsky");
        lyrics.add("I always had that dream like my daddy before me, so I started writing songs, I started writing stories" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "7 Years - Lukas Graham");
        lyrics.add("I was told, when I get older, all my fears would shrink but now I'm insecure, and I care what people think" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Stressed Out - Twenty-One Pilots");
        lyrics.add("Take me into your loving arms, kiss me under the light of a thousand stars" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Thinking Out Loud - Ed Sheeran");
        lyrics.add("I'll worship like a dog at the shrine of your lies, I'll tell you my sins and you can sharpen your knife" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Take Me To Church - Hozier");
        lyrics.add("How many times do I have to tell you, even when you’re crying you’re beautiful too" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "All Of Me - John Legend");
        lyrics.add("Well you only need the light when it's burning low, only miss the sun when it starts to snow" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Let Her Go - Passenger");
        lyrics.add("I tried carrying the weight of the world, but I only have two hands" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Wake Me Up - Avicii");
        lyrics.add("I belong with you, you belong with me, you're my sweetheart" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Ho Hey - The Lumineers");
        lyrics.add("If you're having girl problems I feel bad for you son" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "99 Problems - Jay-Z");
        lyrics.add("I done said a lotta things in my day, I admit it, this is payback in a way, I regret it that I did it" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Lucky You - Eminem");
        lyrics.add("And though time goes by I will always be in a club with you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1973 - James Blunt");
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

    public void addLaa(String laa) {
        lyrics.add(laa);
        Log.d("LyricAndAnswers", "String: " + laa);
    }

    public void addList(ArrayList<String> list) {
        lyrics.addAll(list);
    }
}

