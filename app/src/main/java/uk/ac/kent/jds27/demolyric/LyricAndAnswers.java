package uk.ac.kent.jds27.demolyric;

import java.util.ArrayList;
import java.util.Objects;

class LyricAndAnswers {
    //list to store all lyrics
    private final ArrayList<String> lyrics = new ArrayList<>();

    //list to store lyrics from the 1950's
    private final ArrayList<String> fiveLyrics = new ArrayList<>();

    //list to store lyrics from the 1960's
    private final ArrayList<String> sixLyrics = new ArrayList<>();

    //list to store lyrics from the 1970's
    private final ArrayList<String> sevenLyrics = new ArrayList<>();

    //list to store lyrics from the 1980's
    private final ArrayList<String> eightLyrics = new ArrayList<>();

    //list to store lyrics from the 1990's
    private final ArrayList<String> nineLyrics = new ArrayList<>();

    //list to store lyrics from the 2000's
    private final ArrayList<String> twentyLyrics = new ArrayList<>();

    //list to store lyrics from the 2010's
    private final ArrayList<String> tenLyrics = new ArrayList<>();

    //int to store the index of the list
    private int lyricIndex = 0;

    LyricAndAnswers() {

        //add lyrics to 1950's list
        fiveLyrics.add("Who never ever learned to read or write so well, but he could play a guitar just like a-ringin' a bell" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Johnny B. Goode - Chuck Berry (1958)");
        fiveLyrics.add("Yeah they said you was high-classed, well, that was just a lie. Well, you ain't never caught a rabbit and you ain't no friend of mine" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hound Dog - Big Mama Thornton (1953)");
        fiveLyrics.add("You shake my nerves and you rattle my brain, too much love drives a man insane. You broke my will, oh what a thrill" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Great Balls Of Fire - Jerry Lee Lewis (1957)");
        fiveLyrics.add("Got a girl named Sue, she knows just what to do. She rock to the east, she rocks to the west but she's the girl that I know best" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Tutti Frutti - Little Richard (1957)");
        fiveLyrics.add("Well, my mom and pop told me, 'son, you gotta make some money' if you want to use the car to go ridin' next Sunday" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Summertime Blues - Eddie Cochran (1958)");
        fiveLyrics.add("At first I thought it was infatuation but, woo, it's lasted so long. Now I find myself wanting to marry you and take you home" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "You Send Me - Sam Cooke (1957)");
        fiveLyrics.add("When tears come down like falling rain, you'll toss around and call my name" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Your Cheatin' Heart - Hank Williams (1952)");
        fiveLyrics.add("Always though it's crowded, you still can find some room. Those broken-hearted lovers cry away there in their gloom" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Heartbreak Hotel - Elvis Presley (1956)");
        fiveLyrics.add("Well, you can knock me down, step in my face, slander my name all over the place" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Blue Suede Shoes - Carl Perkins (1955)");
        fiveLyrics.add("I got the rockin' pneumonia, I need a shot of rhythm and blues" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Roll Over Beethoven - Chuck Berry (1956)");
        fiveLyrics.add("Train I ride, sixteen coaches long. Well, that long black train got my baby and gone" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Mystery Train - Junior Parker (1953)");
        fiveLyrics.add("I want you to know, I said I want you to know right now, yeah! You been good to me baby, better than I been to myself" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Shout - The Isley Brothers (1959)");
        fiveLyrics.add("Tombstone hand and a graveyard mine, just 22 and I don't mind dying" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Who Do You Love? - Bo Diddley (1956)");
        fiveLyrics.add("Well, I said come on over baby, we got chicken in the barn. Come on over baby, I got the bull by the horns" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Whole Lotta Shakin' Goin' On - Big Maybelle (1955)");
        fiveLyrics.add("I never kissed a bear, I never kissed a goon, but I can shake a chicken in the middle of the room" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Let's Have A Party - Elvis Presley (1957)");
        fiveLyrics.add("I keep a close watch on this heart of mine, I keep my eyes wide open all the time" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Walk The Line - Johnny Cash (1956)");
        fiveLyrics.add("Love is ended before it's begun, and too many moonlight kisses seem to cool in the warmth of the sun" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "When I Fall In Love - Doris Day (1952)");
        fiveLyrics.add("Let's walk up to the preacher and let us say 'I do', then you'll know you'll have me and I'll know that I'll have you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Don't Be Cruel - Elvis Presley (1956)");
        fiveLyrics.add("The warden threw a party in the county jail, the prison band was there and they began to wail" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Jailhouse Rock - Elvis Presley (1957)");
        fiveLyrics.add("My darling dear, love you all the time. I'm just a fool, a fool in love with you." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Earth Angel - The Penguins (1954)");
        fiveLyrics.add("When the clock strikes two, three and four, if the band slows down we'll yell for more" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rock Around The Clock - Bill Haley & His Comets (1954)");
        fiveLyrics.add("Too real is this feeling of make believe, too real when I feel what my heart can't conceal" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The Great Pretender - The Platters (1955)");

        //add lyrics to 1960's list
        sixLyrics.add("Some folks are born silver spoon in hand, Lord don't they help themselves, oh" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Fortunate Son - Creedence Clearwater Revival (1969)");
        sixLyrics.add("No reason to get excited, the theif he kindly spoke" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "All Along The Watchtower - Jimi Hendrix (1968)");
        sixLyrics.add("Heaven holds a place for those who pray, hey, hey, hey" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Mrs. Robinson - Simon & Garfunkel (1968)");
        sixLyrics.add("If the sky that we look upon should tumble and fall" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Stand By Me - Ben E. King (1962)");
        sixLyrics.add("I stuck around St. Petersburg when I saw it was a time for a change" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sympathy For The Devil - The Rolling Stones (1968)");
        sixLyrics.add("When I had you to myself, I didn't want you around, those pretty faces always make you stand out in a crowd" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Want You Back - Jackson 5 (1969)");
        sixLyrics.add("My father was a gamblin' man, way down in New Orleans" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "House Of The Rising Sun - The Animals (1964)");
        sixLyrics.add("Take a sad song and make it better" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hey Jude - The Beatles (1968)");
        sixLyrics.add("He'd give up all his comfort, sleep out in the rain, if she said that's the way it ought to be" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "When A Man Loves A Woman - Percy Sledge (1966)");
        sixLyrics.add("But, he can't be a man 'cause he doesn't smoke the same cigarettes as me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "(I Can't Get No) Satisfaction - The Rolling Stones (1965)");
        sixLyrics.add("Regrets, I've had a few, but then again, too few to mention. I did what I had to do, and saw it through without exemption" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "My Way - Frank Sinatra (1969)");
        sixLyrics.add("You never close your eyes anymore when I kiss your lips and there's no tenderness like before in your fingertips" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "You've Lost That Loving Feeling - The Righteous Brothers (1964)");
        sixLyrics.add("Ground Control to Major Tom, take your protein pills and put your helmet on" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Space Oddity - David Bowie (1969)");
        sixLyrics.add("Stopped into a church, I passed along the way. Well, I got down on my knees, and I pretend to pray" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "California Dreamin' - The Mamas And The Papas (1966)");
        sixLyrics.add("What you want, baby, I got it, what you need, do you know I got it?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Respect - Otis Redding (1965)");
        sixLyrics.add("I thought love was more or less a giving thing, the more I gave the less I got oh yeah" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I'm A Believer - The Monkees (1967)");
        sixLyrics.add("I-I love the colorful clothes she wears and the way the sunlight plays upon her hair" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Good Vibrations - The Beach Boys (1966)");

        //add lyrics to 1970's list
        sevenLyrics.add("L.A. proved too much for the man, so he's leaving a life he's come to know" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Midnight Train To Georgia - Gladys Knight & The Pips (1973)");
        sevenLyrics.add("And I think it's gonnna be a long long time, 'till touch down brings me round again to find" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rocket Man (I Think It's Going To Be A Long Long Time) - Elton John (1972)");
        sevenLyrics.add("You can rely on the old man's money, you can rely on the old man's money" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rich Girl - Daryl Hall & John Oates (1976)");
        sevenLyrics.add("Listen to the wind blow, down comes the night. Running in the shadows" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The Chain - Fleetwood Mac (1977)");
        sevenLyrics.add("We'll be together, with a roof right over our heads" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Is This Love - Bob Marley (1978)");
        sevenLyrics.add("Man, we just fell about the place, if that chick don't want to know, forget her" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The Boys Are Back In Town - Thin Lizzy (1976)");
        sevenLyrics.add("When food is gone you are my daily meal, oh" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "You've Got The Love - Candi Staton (1976)");
        sevenLyrics.add("Oh, what a night, hypnotizing, mesmerizing me, she was everything I dreamed she'd be" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "December 1963 (Oh What A Night) - Frankie Valli & The Four Seasons (1975)");
        sevenLyrics.add("Did you write the book of love and do you have faith in God above" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "American Pie - Don McLean (1971)");
        sevenLyrics.add("Now John at the bar is a friend of mine, he gets me my drinks for free" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Piano Man - Billy Joel (1973)");
        sevenLyrics.add("Lips are sweet as candy, it's taste stays on my mind. Girl, you got me thirsty for another cup of wine" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hooked On A Feeling - Blue Swede (1974)");
        sevenLyrics.add("We like our fun and we never fight, you can't dance and stay uptight" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Dancing In The Moonlight - Toploader (1972)");
        sevenLyrics.add("Anybody could be that guy, night is young and the music's high" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Dancing Queen - ABBA (1976)");
        sevenLyrics.add("Life is old there, older than the trees, younger than the mountains, blowing like a breeze" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Take Me Home, Country Roads - John Denver (1971)");
        sevenLyrics.add("He said, 'we haven't had that spirit here since nineteen sixty-nine'" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hotel California - The Eagles (1976)");
        sevenLyrics.add("I'm just a poor boy, I need no sympathy, because I'm easy come, easy go, little high, little low" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Bohemian Rhapsody - Queen (1975)");
        sevenLyrics.add("You may say I'm a dreamer, but I'm not the only one" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Imagine - John Lennon (1971)");
        sevenLyrics.add("Young man, I was once in your shoes. I said, I was down and out with the blues" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Y.M.C.A - Village People (1978)");
        sevenLyrics.add("Sprung from cages out on highway nine, chrome wheeled, fuel injected, and steppin' out over the line" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Born To Run - Bruce Springsteen (1975)");
        sevenLyrics.add("Some people call me the space cowboy, yeah, some call me the gangster of love" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Joker - Steve Miller Band (1973)");
        sevenLyrics.add("If I leave here tomorrow, would you still remember me?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Free Bird - Lynyrd Skynyrd (1973)");
        sevenLyrics.add("You keep on dancin' and the room gets hot, you drive us wild, we'll drive you crazy" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rock And Roll All Nite - Kiss (1975)");
        sevenLyrics.add("And as we wind on down the road, our shadows taller than our soul" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Stairway To Heaven - Led Zeppelin (1971)");
        sevenLyrics.add("Oh, take your time, don't live too fast, troubles will come and they will pass" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Simple Man - Lynyrd Skynyrd (1973)");
        sevenLyrics.add("Into this house we're born, into this world we're thrown, like a dog without a bone, an actor out on loan" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Riders On The Storm - The Doors (1971)");
        sevenLyrics.add("Anyway the thing is, what I really mean, yours are the sweetest eyes I've ever seen" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Your Song - Elton John (1970)");
        sevenLyrics.add("Oh man, wonder if he'll ever know he's in the best selling show" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Life On Mars? - David Bowie (1971)");
        sevenLyrics.add("I've been really tryin', baby, tryin' to hold back this feeling for so long" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Let's Get It On - Marvin Gaye (1973)");
        sevenLyrics.add("Thunder only happens when it's raining, players only love you when they're playing" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Dreams - Fleetwood Mac (1977)");
        sevenLyrics.add("Thirteen month old baby, broke the lookin' glass, seven years of bad luck, the good things in your past" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Superstition - Stevie Wonder (1972)");
        sevenLyrics.add("See-saw swingin' with the boys in the school with your feet flyin' up in the air" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Walk This Way - Aerosmith (1975)");
        sevenLyrics.add("And in my hour of darkness she is standing right in front of me, speaking words of wisdom" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Let It Be - The Beatles (1970)");
        sevenLyrics.add("Buddy, you're a young man, hard man, shouting in the street, gonna take on the world someday" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "We Will Rock You - Queen (1977)");
        sevenLyrics.add("Hell, with it baby cause you're fun and you're mine and you look so divine" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Come And Get Your Love - Redbone (1973)");

        //add lyrics to 1980's list
        eightLyrics.add("I said to the man 'are you trying to tempt me?'" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Down Under - Men At Work (1980)");
        eightLyrics.add("Oh can't you see, you belong to me. My poor heart aches, with every step you take" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Every Breath You Take - The Police (1983)");
        eightLyrics.add("He turned to me as if to say, 'Hurry boy, it's waiting there for you'" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Africa - Toto (1982)");
        eightLyrics.add("Rosenbergs, H-Bomb, Sugar Ray, Panmunjom, Brando, The King And I, and The Catcher In The Rye" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "We Didn't Start The Fire - Billy Joel (1989)");
        eightLyrics.add("I've seen your face before my friend, but I don't know if you know who I am" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "In The Air Tonight - Phil Collins (1981)");
        eightLyrics.add("I play along with the charade, there doesn't seem to be a reason to change" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Jessie's Girl - Rick Springfield (1981)");
        eightLyrics.add("But not us, (no never) no not us (no never) we are far too young and clever" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Come On Eileen - Dexys Midnight Runners (1982)");
        eightLyrics.add("And you're a very sexy girl, very hard to please" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Welcome To The Jungle - Guns 'n' Roses (1987)");
        eightLyrics.add("We're no strangers to love, you know the rules and so do I" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Never Gonna Give You Up - Rick Astley (1987)");
        eightLyrics.add("Annie, are you ok? So, Annie are you ok? Are you ok, Annie?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Smooth Criminal - Michael Jackson (1987)");
        eightLyrics.add("Streetlights, people, living just to find emotion. Hiding somewhere in the night" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Don't Stop Believing - Journey (1981)");
        eightLyrics.add("The phone rings in the middle of the night, my father yells what you gonna do with your life" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Girls Just Want To Have Fun - Cyndi Lauper (1983)");
        eightLyrics.add("People always told me be careful of what you do, and don't go around breaking young girls' hearts" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Billie Jean - Michael Jackson (1982)");
        eightLyrics.add("In touch with the ground I'm on the hunt down I'm after you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hungry Like The Wolf - Duran Duran (1982)");
        eightLyrics.add("It's close to midnight, something evil's lurking from the dark" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Thriller - Michael Jackson (1982)");
        eightLyrics.add("Life is a mystery, everyone must stand alone. I hear you call my name, and it feels like home" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Like a Prayer - Madonna (1989)");
        eightLyrics.add("How can you just leave me standing? Alone in a world that's so cold (so cold)" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "When Doves Cry - Prince (1984)");
        eightLyrics.add("Clock strikes upon the hour and the sun begins to fade" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Wanna Dance With Somebody - Whitney Houston (1987)");
        eightLyrics.add("I want a ticket to anywhere, maybe we make a deal. Maybe together we can get somewhere" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Fast Car - Tracy Chapman (1988)");
        eightLyrics.add("Let's dance in style, let's dance for a while, heaven can wait we're only watching the skies" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Forever Young - Alphaville (1984)");
        eightLyrics.add("See the stone set in your eyes, see the thorn twist in your side" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "With Or Without You - U2 (1987)");
        eightLyrics.add("Yes, I'm let loose from the noose that's kept me hanging about" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Back In Black - AC/DC (1980)");
        eightLyrics.add("These girls are really sleazy, all they just say is please me, or spend some time and rock a rhyme, I said 'It's not that easy'" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "It's Tricky - Run D.M.C (1986)");
        eightLyrics.add("She's been living in her white bread world as long as anyone with hot blood can and now she's looking for a downtown man, that's what I am" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Uptown Girl - Billy Joel (1983)");
        eightLyrics.add("Now, what you hear is not a test I'm rappin' to the beat, and me, the groove, and my friends are gonna try to move your feet" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rappers Delight - The Sugarhill Gang (1980)");
        eightLyrics.add("Baby, I'm hot just like an oven, I need some lovin'" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sexual Healing - Marvin Gaye (1982)");
        eightLyrics.add("Gina works the diner all day working for her man she brings home her pay, for love" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Livin' On A Prayer - Bon Jovi (1986)");
        eightLyrics.add("I've seen your flag on the marble arch, and love is not a victory march" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hallelujah - Leonard Cohen (1984)");

        //add lyrics to 1990's list
        nineLyrics.add("That's me in the corner, that's me in the spotlight" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Losing My Religion - R.E.M (1991)");
        nineLyrics.add("Marry him, or marry me, I'm the one that loves you baby can't you see" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Two Princes - Spin Doctors (1991)");
        nineLyrics.add("I don't believe that anybody feels the way I do, about you now" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Wonderwall - Oasis (1995)");
        nineLyrics.add("You say we've got nothing in common, no common ground to start from" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Breakfast At Tiffany's - Deep Blue Something (1993)");
        nineLyrics.add("So I'll start a revolution from my bed, because you said the brains I had went to my head" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Don't Look Back In Anger - Oasis (1995)");
        nineLyrics.add("'Cause I knew it from the start, baby when you broke my heart" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Return Of The Mack - Mark Morrison (1996)");
        nineLyrics.add("I said maybe I don't really wanna know how your garden grows 'cause I just want to fly" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Live Forever - Oasis (1994)");
        nineLyrics.add("I don't know what they want from me, it's like the more money we come across the more problems we see" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Mo Money Mo Problems - The Notorious B.I.G (1997)");
        nineLyrics.add("My anaconda don't want none unless you got buns hun" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Baby Got Back - Sir Mix-A-Lot (1992)");
        nineLyrics.add("Am I your fire? Your one desire" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Want It That Way - The Backstreet Boys (1999)");
        nineLyrics.add("Trying to make ends meet, you're a slave to the money and then you die" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Bittersweet Symphony - The Verve (1997)");
        nineLyrics.add("And down the waterfall wherever it may take me I know that life won't break me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Angels - Robbie Williams (1997)");
        nineLyrics.add("I'm worse at what I do best and for this gift I feel blessed" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Smells Like Teen Spirit - Nirvana (1991)");
        nineLyrics.add("Well it's too late, tonight to drag the past out into the light" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "One - U2 (1991)");
        nineLyrics.add("And if you said this life ain't good enough I would give my world to lift you up" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Smooth - Santana (1999)");
        nineLyrics.add("My loneliness is killing me (and I) I must confess I still believe (still believe)" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "... Baby One More Time - Britney Spears (1998)");
        nineLyrics.add("And you can't fight the tears that ain't coming, or the moment of truth in your lies" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Iris - Goo Goo Dolls (1998)");
        nineLyrics.add("Hangin' out the passenger side of his best friend's ride, trying to holla at me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "No Scrubs - TLC (1992)");
        nineLyrics.add("It's a cool place and they say it gets colder, you're bundled up now, wait till you get older" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "All Star - Smash Mouth (1999)");
        nineLyrics.add("You think you've got it, oh, you think you've got it. But got it just don't get it when there's nothin' at all" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hey Ya! - Outkast (1990)");
        nineLyrics.add("An enchanted moment and it sees me through, it's enough for this restless warrior just to be with you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Can You Feel The Love Tonight - Elton John (1994)");
        nineLyrics.add("Well, don't get lonely now, and dry your whining eyes. I'm just roaming for the moment" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "When I Come Around - Green Day (1994)");
        nineLyrics.add("You can brush my hair, undress me everywhere. Imagination, life is your creation" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Barbie Girl - Aqua (1997)");
        nineLyrics.add("Exit, light, enter, night. Take my hand, we're off to never-never land" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Enter Sandman - Metallica (1991)");
        nineLyrics.add("But you won't get a crumb from me 'cause I'm from the streets of Compton" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Forgot About Dre - Dr. Dre (1999)");
        nineLyrics.add("Thoughts arrive like butterflies oh he don't know, so he chases them away" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Even Flow - Pearl Jam (1991)");
        nineLyrics.add("Say it ain't so, I will not go, turn the lights off, carry me home" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "All The Small Things - Blink-182 (1999)");
        nineLyrics.add("What have I become, my sweetest friend. Everyone I know goes away in the end" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hurt - Nine Inch Nails (1994)");

        //add lyrics to 2000's list
        twentyLyrics.add("Soft lips are open, them knuckles are pale. Feels like you're dying, you're dying" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sex On Fire - Kings Of Leon (2008)");
        twentyLyrics.add("Since you became a V.I.Person it's like your problems have all worsened" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Starz In Their Eyes - Just Jack (2007)");
        twentyLyrics.add("Let me take you where you'll let me, because leaving just upsets me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Jenny Don't Be Hasty - Paolo Nutini (2006)");
        twentyLyrics.add("Life is good and the girls are gorgeous, suddenly the air smells much greener now" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "These Streets - Paolo Nutini (2006)");
        twentyLyrics.add("Just in time, I'm so glad you have a one-track mind like me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hey, Soul Sister - Train (2009)");
        twentyLyrics.add("The streets are dirty too but you never look back over what you've done" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "In The Morning - Razorlight (2006)");
        twentyLyrics.add("When head of state didn't play guitar, not everybody drove a car" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Wish I Was A Punk Rocker (With Flowers In My Hair) - Sandi Thom (2006)");
        twentyLyrics.add("And if you leave here, you leave me broken, shattered, I lie" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Take Me Out - Franz Ferdinand (2004)");
        twentyLyrics.add("I used to roll the dice, feel the fear in my enemy's eyes" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Viva La Vida - Coldplay (2008)");
        twentyLyrics.add("Bring it back down, bring it back down tonight. Never thought I'd let a rumor ruin my moonlight" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Somebody Told Me - The Killers (2004)");
        twentyLyrics.add("I'm coming out of my cage and I've been doing just fine" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Mr. Brightside - The Killers (2004)");
        twentyLyrics.add("In time I want to be your best friend, East side lovers living on the West end" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Can't Stop - Red Hot Chili Peppers (2002)");
        twentyLyrics.add("Did you have to go to jail, put your house up for sale, did you get a good lawyer?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Valerie - The Zutons (2006)");
        twentyLyrics.add("Sometimes I get the feeling she's watching over me, and other times I feel like I should go" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Welcome To The Black Parade - My Chemical Romance (2006)");
        twentyLyrics.add("Some vodka that will jump start my heart quicker, then a shot when I get shocked at the hospital" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Without Me - Eminem (2002)");
        twentyLyrics.add("Caroline!(Caroline!) Caroline! All the guys would say she's mighty fine(Mighty fine!)" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Roses - Outkast (2003)");
        twentyLyrics.add("Yeah this one right here goes out to all the baby's mamas, mamas, mamas, mamas, baby mamas, mamas" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Ms. Jackson - Outkast (2000)");
        twentyLyrics.add("Can't you see he's the man let me hear you applaud, he is more than a man he's a shining golden god" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Classico - Tenacious D (2006)");
        twentyLyrics.add("Them baggy sweat pants and the Reebok's with the straps" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Low - Flo Rida (2008)");
        twentyLyrics.add("He's always hated me because I never got a J O B" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Crashed The Wedding - Busted (2003)");
        twentyLyrics.add("I'm back in Liverpool and everything seems the same, but I worked something out last night that changed this little boy's brain" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Let's Dance To Joy Division - The Wombats (2007)");
        twentyLyrics.add("I look and stare so deep in your eyes, I touch on you more and more every time" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Crazy In Love - Beyonce (2003)");
        twentyLyrics.add("They're gonna clean up your looks with all the lies in the book" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Teenagers - My Chemical Romance (2006)");
        twentyLyrics.add("So where's your picket fence love? And where's that shiny car?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Gives You Hell - All American Rejects (2008)");
        twentyLyrics.add("Stop making the eyes at me I'll stop making the eyes at you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Bet That You Look Good On The Dancefloor - Arctic Monkeys (2006)");
        twentyLyrics.add("Everyday is so wonderful, then suddenly it's hard to breathe" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Beautiful - Christina Aguilera (2002)");
        twentyLyrics.add("It's hard to say that I'd rather stay awake when I'm asleep 'cause everything is never as it seems" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Fireflies - Owl City (2009)");
        twentyLyrics.add("I'm still alive but I'm barely breathing just prayin' to a god that I don't believe in" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Breakeven - The Script (2008)");
        twentyLyrics.add("If you're having girl problems I feel bad for you son" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "99 Problems - Jay-Z (2003)");
        twentyLyrics.add("And though time goes by I will always be in a club with you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1973 - James Blunt (2007)");
        twentyLyrics.add("Would you dance if I asked you to dance? Or would you run and never look back?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hero - Enrique Iglesias (2001)");
        twentyLyrics.add("'Cause there's nothing, there's nothing you can teach me that I can't learn from Mr. Hathaway" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rehab - Amy Winehouse (2006)");
        twentyLyrics.add("Never made it as a wise man, I couldn't cut it as a poor man stealing" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "How You Remind Me - Nickelback (2001)");
        twentyLyrics.add("All I know, time is a valuable thing watch it fly by as the pendulum swings" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "In The End - Linkin Park (2003)");
        twentyLyrics.add("I'm up on him, he up on me, don't pay him any attention" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Single Ladies (Put A Ring On It) - Beyoncé (2008)");
        twentyLyrics.add("Few times I've been around that track so it's not just gonna happen like that" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Hollaback Girl - Gwen Stefani (2004)");
        twentyLyrics.add("I want your ugly, I want your disease, I want your everything as long as it's free" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Bad Romance - Lady Gaga (2009)");
        twentyLyrics.add("When the sun shines, we shine together, told you I'll be here forever" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Umbrella - Rihanna (2007)");
        twentyLyrics.add("Yeah I was out of touch, but it wasn't because I didn't know enough, I just knew too much" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Crazy - Gnarls Barkley (2006)");
        twentyLyrics.add("My life is brilliant, my love is pure. I saw an angel, of that I'm sure" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "You're Beautiful - James Blunt (2004)");
        twentyLyrics.add("People killin', people dyin', children hurt can you hear them cryin'?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Where Is The Love? - Black Eyed Peas (2003)");
        twentyLyrics.add("Slamming Bentley doors, hopping out of Porsche's, popping up on Forbes lists, gorgeous, hold up" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Young Forever - Jay-Z (2009)");
        twentyLyrics.add("Well open up your mind and see like me, open up your plans and damn you're free" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I'm Yours - Jason Mraz (2005)");
        twentyLyrics.add("So lately, been wondering, who will be there to take my place, when I'm gone you'll need love to light the shadows on your face" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Wherever You Will Go - The Calling (2001)");
        twentyLyrics.add("Nobody wanta' see us together, nobody thought that we'd last forever, I feel them hoping and praying" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Don't Matter - Akon (2006)");
        twentyLyrics.add("Promise I'll be kind, but I won't stop until that boy is mine" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Paparazzi - Lady Gaga (2008)");
        twentyLyrics.add("I drove for miles and miles and wound up at your door. I've had you so many times but somehow I want more" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "She Will Be Loved - Maroon 5 (2002)");
        twentyLyrics.add("Chill out, what you yelling for? Lay back, it's all been done before" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Complicated - Avril Lavigne (2002)");
        twentyLyrics.add("Tomorrow's getting harder, make no mistake, luck ain't enough you've got to make your own breaks" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "It's My Life - Bon Jovi (2000)");
        twentyLyrics.add("Control yourself, take only what you need from it. A family of trees wanting to be haunted" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Kids - MGMT (2008)");
        twentyLyrics.add("I was too weak to give in, too strong to lose. My heart is under arrest again, but I break loose" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Best Of You - Foo Fighters (2005)");
        twentyLyrics.add("I’m just a notch in your bedpost, but you're just a line in a song" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sugar, We're Going Down - Fall Out Boy (2005)");
        twentyLyrics.add("Welcome to a new kind of tension, all across the alien nation" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "American Idiot - Green Day (2004)");
        twentyLyrics.add("Wake me up inside, call my name and save me from the dark" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Bring Me To Life - Evanescence (2003)");
        twentyLyrics.add("By becoming this all I want to do is be more like me and be less like you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Numb - Linkin Park (2003)");
        twentyLyrics.add("There's a hole in your logic, you who know all the answers" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Goodbye Mr. A - The Hoosiers (2007)");
        twentyLyrics.add("They will not force us, they will stop degrading us, they will not control us, we will be victorious " + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Uprising - Muse (2009)");
        twentyLyrics.add("The unsuspecting victim of darkness in the valley, we can live like Jack and Sally if we want" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Miss You - Blink-182 (2003)");
        twentyLyrics.add("Watching the people get lairy, it's not very pretty I tell thee. Walking through town is quite scary, it's not very sensible either" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Predict A Riot - Kaiser Chiefs (2005)");
        twentyLyrics.add("There is nothing I need except the function to breathe, but I'm not really fussed, doesn't matter to me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Ruby - Kaiser Chiefs (2007)");
        twentyLyrics.add("So one, two, three, take my hand and come with me because you look so fine that I really wanna make you mine" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Are You Gonna Be My Girl - Jet (2003)");
        twentyLyrics.add("Jack had a gang that he called 'The Many Grams', he was known as Smack Jack the Cracker Man" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sheila - Jamie T (2007)");
        twentyLyrics.add("When there's no one left to fight, boys like him don't shine so bright. Soon as I see the dust settle he's out on the town trying to find trouble" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Sticks 'n' Stones - Jamie T (2009)");
        twentyLyrics.add("And I want these words to make things right, but it's the wrongs that make the words come to life. Who does he think he is?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Thnks Fr Th Mmrs - Fall Out Boy (2007)");
        twentyLyrics.add("Rate yourself and rake yourself, take all the courage you have left wasted on fixing all the problems that you made in your own head" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Little Lion Man - Mumford & Sons (2009)");
        twentyLyrics.add("Oh, let's just get this whole thing straight, I don't wanna kidnap the truth and negotiate" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Before I Fall To Pieces - Razorlight (2006)");
        twentyLyrics.add("It's not about your make-up, or how you try to shape up to these tiresome paper dreams, paper dreams honey" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "She Moves In Her Own Way - The Kooks (2006)");
        twentyLyrics.add("I said tell me your name is it sweet? She said my boy it's Dagger" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Chelsea Dagger - The Fratellis (2006)");
        twentyLyrics.add("Send in your skeletons, sing as their bones go marching in, again" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The Pretender - Foo Fighters (2007)");
        twentyLyrics.add("I backed my car into a cop car the other day, well, he just drove off - sometimes life's okay" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Float On - Modest Mouse (2004)");
        twentyLyrics.add("Love forever, love has freely turned forever you and me. Windmill, windmill for the land, is everybody in?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Feel Good Inc - Gorillaz (2005)");
        twentyLyrics.add("Let's get lost tonight, you could be my black Kate Moss tonight. Play secretary, I'm the boss tonight" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Stronger - Kanye West (2007)");
        twentyLyrics.add("Everybody wants to know her name, how does she cope with her new found fame?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Five Colours In Her Hair - McFly (2004)");
        twentyLyrics.add("Her name is Noel, I have a dream about her. She rings my bell, I got gym class in half an hour" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Teenage Dirtbag - Wheatus (2000)");
        twentyLyrics.add("And I'm talking to myself at night because I can't forget. Back and forth through my mind behind a cigarette" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Seven Nation Army - The White Stripes (2003)");

        //add lyrics to 2010's list
        tenLyrics.add("And I know she'll be the death of me, at least we'll both be numb. And she'll always get the best of me, the worst is yet to come" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Can't Feel My Face - The Weeknd (2015)");
        tenLyrics.add("Everybody's looking for love, oh, oh, ain't that the reason you're at this club" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "In My Head - Jason Derulo (2010)");
        tenLyrics.add("Maybe I'm foolish, maybe I'm blind, thinking I can see through this" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Human - Rag'N'Bone Man (2017)");
        tenLyrics.add("Drink some Margaritas by a string of blue lights, listen to the Mariachi play at midnight" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Are You With Me - Lost Frequencies (2014)");
        tenLyrics.add("I'm breaking in, shaping up, then checking out on the prison bus" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Radioactive - Imagine Dragons (2012)");
        tenLyrics.add("So they dug your grave and the masquerade will come calling out at the mess you made" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Demons - Imagine Dragons (2013)");
        tenLyrics.add("My left stroke just went viral" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "HUMBLE. - Kendrick Lamar (2017)");
        tenLyrics.add("Everybody want the key and the secret to rap immortality like I have got" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rap God - Eminem (2013)");
        tenLyrics.add("I'm living in that 21st Century, doing something mean to it" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "POWER - Kanye West (2010)");
        tenLyrics.add("I did not believe that it would end, no, everything came second to the Benzo" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Better Now - Post Malone (2018)");
        tenLyrics.add("The club isn't the best place to find a lover so the bar is where I go" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Shape Of You - Ed Sheeran (2017)");
        tenLyrics.add("I get along with old timers 'cause my name's a reminder of a pop song people forgot" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Took A Pill In Ibiza - Mike Posner (2016)");
        tenLyrics.add("Yeah, that’s the crew that I’m repping on the rise to the top, no lead in our zeppelin" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Party Rock Anthem - LMFAO (2011)");
        tenLyrics.add("You could travel the world, but nothing comes close to the golden coast" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "California Gurls - Katy Perry (2010)");
        tenLyrics.add("I love when it's all too much, five a.m. turn the radio up. Where's the rock and roll?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Raise Your Glass - P!nk (2010)");
        tenLyrics.add("The scars of your love remind me of us, they keep me thinking that we almost had it all" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Rolling In The Deep - Adele (2011)");
        tenLyrics.add("So if by the time the bar closes and you feel like falling down, I'll carry you home" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "We Are Young - Fun. (2011)");
        tenLyrics.add("Hey, you tell your friends it was nice to meet them, but I hope I never see them again" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Closer - The Chainsmokers (2016)");
        tenLyrics.add("Then you smiled over your shoulder for a minute, I was stone-cold sober" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Say You Won't Let Go - James Arthur (2016)");
        tenLyrics.add("I thought I was an atheist until I realised I'm a God" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Woah Woah Woah - Watsky (2014)");
        tenLyrics.add("I always had that dream like my daddy before me, so I started writing songs, I started writing stories" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "7 Years - Lukas Graham (2015)");
        tenLyrics.add("I was told, when I get older, all my fears would shrink but now I'm insecure, and I care what people think" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Stressed Out - Twenty-One Pilots (2015)");
        tenLyrics.add("Take me into your loving arms, kiss me under the light of a thousand stars" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Thinking Out Loud - Ed Sheeran (2014)");
        tenLyrics.add("I'll worship like a dog at the shrine of your lies, I'll tell you my sins and you can sharpen your knife" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Take Me To Church - Hozier (2013)");
        tenLyrics.add("How many times do I have to tell you, even when you’re crying you’re beautiful too" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "All Of Me - John Legend (2013)");
        tenLyrics.add("Well you only need the light when it's burning low, only miss the sun when it starts to snow" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Let Her Go - Passenger (2012)");
        tenLyrics.add("I tried carrying the weight of the world, but I only have two hands" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Wake Me Up - Avicii (2013)");
        tenLyrics.add("I belong with you, you belong with me, you're my sweetheart" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Ho Hey - The Lumineers (2012)");
        tenLyrics.add("I done said a lotta things in my day, I admit it, this is payback in a way, I regret it that I did it" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Lucky You - Eminem (2018)");
        tenLyrics.add("Your stare was holding, ripped jeans, skin was showin'" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Call Me Maybe - Carly Rae Jepsen (2012)");
        tenLyrics.add("I'm too hot (hot damn), am I bad 'bout that money, break it down" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Uptown Funk - Mark Ronson (2014)");
        tenLyrics.add("I'll never miss a beat, I'm lightning on my feet, and that's what they don't see" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Shake It Off - Taylor Swift (2014)");
        tenLyrics.add("So I put my hands up, they're playing my song, and the butterflies fly away" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Party In The U.S.A - Miley Cyrus (2010)");
        tenLyrics.add("I can only tell you what it feels like, and right now there's a steel knife, in my windpipe" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Love The Way You Lie - Eminem (2010)");
        tenLyrics.add("And I can't stop till the whole word knows my name 'cause I was only born inside my dreams" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Centuries - Fall Out Boy (2015)");
        tenLyrics.add("I go crazy 'cause here isn't where I wanna be and satisfaction feels like a distant memory" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "R U Mine? - Arctic Monkeys (2013)");
        tenLyrics.add("Tell me how's it feel sittin' up there, feeling so high but too far away to hold me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Without Me - Halsey (2018)");
        tenLyrics.add("I should've stayed with you last night, instead of going out to find trouble" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Let You Love Me - Rita Ora (2018)");
        tenLyrics.add("Give me one good reason why I should never make a change" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Budapest - George Ezra (2014)");
        tenLyrics.add("Oh we go where nobody knows, with guns hidden under our petticoats" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Chocolate - The 1975 (2013)");
        tenLyrics.add("I wanted the fame but not the cover of Newsweek, oh well, guess beggars can't be choosey" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The Monster - Eminem (2013)");
        tenLyrics.add("So break my step and relent, you forgave and I won't forget" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "I Will Wait - Mumford & Sons (2012)");
        tenLyrics.add("Cause I'm a sad sad post teen could have been a love machine" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Zombie - Jamie T (2014)");
        tenLyrics.add("Now can I kick it, thank you, yeah I’m so damn grateful. I grew up, really wanted gold fronts but that’s what you get when Wu-Tang raised you" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Can't Hold Us - Macklemore (2011)");
        tenLyrics.add("I won't stay put, give me the chance to be free Suffolk sadly seems to sort of suffocate me" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "You Need Me, I Don't Need You - Ed Sheeran (2011)");
        tenLyrics.add("Joey was an artist just living out of case, but his best work was his letters home" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "L.I.F.E.G.O.E.S.O.N - Noah And The Whale (2011)");
        tenLyrics.add("We've come too far to give up who we are, so let's raise the bar and our cups to the stars" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Get Lucky - Daft Punk (2013)");
        tenLyrics.add("I know that I’m rich enough for pride, I see a billion dollars in your eyes. Even if we’re strangers til we die" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Runaway (U And I) - Galantis (2015)");
        tenLyrics.add("But if you close your eyes, does it almost feel like nothing changed at all?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Pompeii - Bastille (2012)");
        tenLyrics.add("Come on, come on, turn the radio on, it's Saturday and I won't be long. Gotta paint my nails, put my high heels on" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Cheap Thrills - Sia (2016)");
        tenLyrics.add("I know I don't know you, but I'd like to skip the small talk and romance, girl" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Can We Dance - The Vamps (2014)");
        tenLyrics.add("I'm perusing down fourth and they watching me. I do a handstand, the eagle lands on my seat, well hello" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Downtown - Macklemore (2016)");
        tenLyrics.add("We bring the stars out, we bring the women and the cars and the cards out" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Pass Out - Tinie Tempah (2010)");

        lyrics.addAll(fiveLyrics);
        lyrics.addAll(sixLyrics);
        lyrics.addAll(sevenLyrics);
        lyrics.addAll(eightLyrics);
        lyrics.addAll(nineLyrics);
        lyrics.addAll(twentyLyrics);
        lyrics.addAll(tenLyrics);
    }

    ArrayList getLyricsList() {
        return lyrics;
    }

    ArrayList getFiveList() {
        return fiveLyrics;
    }

    ArrayList getSixList() {
        return sixLyrics;
    }

    ArrayList getSevenList() {
        return sevenLyrics;
    }

    ArrayList getEightList() {
        return eightLyrics;
    }

    ArrayList getNineList() {
        return nineLyrics;
    }

    ArrayList getTwentyList() {
        return twentyLyrics;
    }

    ArrayList getTenList() {
        return tenLyrics;
    }

    String getLyricsElement(int i) {
        return lyrics.get(i);
    }

    int getListSize() {
        return lyrics.size();
    }

    String getLyric(int index) {
        String randomLyric = null;
        for (String lyric : lyrics) {
            if (index == lyrics.indexOf(lyric)) {
                randomLyric = lyric;
            }
        }
        return randomLyric;
    }

    int getIndexByLyric(String lyricName) {
        for (String lyric : lyrics) {
            if (Objects.equals(lyric, lyricName)) {
                lyricIndex = lyrics.indexOf(lyric);
            }
        }
        return lyricIndex;
    }

    String getDecadeLyric(ArrayList<String> array, int index) {
        String randomLyric = null;
        for (String lyric : array) {
            if (index == array.indexOf(lyric)) {
                randomLyric = lyric;
            }
        }
        return randomLyric;
    }

    int getIndexByDecadeLyric(ArrayList<String> array, String lyricName) {
        for (String lyric : array) {
            if (Objects.equals(lyric, lyricName)) {
                lyricIndex = array.indexOf(lyric);
            }
        }
        return lyricIndex;
    }

    void addLaa(String laa) {
        lyrics.add(laa);
    }

    void addList(ArrayList<String> list) {
        lyrics.addAll(list);
    }
}

