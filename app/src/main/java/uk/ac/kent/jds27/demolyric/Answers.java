package uk.ac.kent.jds27.demolyric;

import java.util.ArrayList;

public class Answers
{
    //Arraylist to hold song answers
    private ArrayList<String> answers;
    /**
     * Constructor for objects of class Answers
     */
    public Answers()
    {
        answers = new ArrayList<>();
        answers.add(0, null);
        answers.add(1, "Losing My Religion - R.E.M");
        answers.add(2, "Down Under - Men At Work");
        answers.add(3, "Two Princes - Spin Doctors");
        answers.add(4, "Wonderwall - Oasis");
        answers.add(5, "Every Breath You Take - The Police");
        answers.add(6, "Breakfast At Tiffany's - Deep Blue Something");
        answers.add(7, "Don't Look Back In Anger - Oasis");
        answers.add(8,"Sex On Fire - Kings Of Leon");
        answers.add(9,"Midnight Train To Georgia - Gladys Knight & The Pips");
        answers.add(10,"Starz In Their Eyes - Just Jack");
        answers.add(11,"Africa - Toto");
        answers.add(12,"Jenny Don't Be Hasty - Paolo Nutini");
        answers.add(13,"These Streets - Paolo Nutini");
        answers.add(14,"Fortunate Son - Creedence Clearwater Revival");
        answers.add(15,"Sexual Healing - Marvin Gaye");
        answers.add(16,"Rocket Man (I Think It's Going To Be A Long Long Time) - Elton John");
        answers.add(17,"All Along The Watchtower - Jimi Hendrix");
        answers.add(18,"Rich Girl - Daryl Hall & John Oates");
        answers.add(19,"Mrs. Robinson - Simon & Garfunkel");
        answers.add(20,"The Chain - Fleetwood Mac");
        answers.add(21,"Hey, Soul Sister - Train");
        answers.add(22,"Human - Rag'N'Bone Man");
        answers.add(23,"In The Morning - Razorlight");
        answers.add(24,"Is This Love - Bob Marley");
        answers.add(25,"Return Of The Mack - Mark Morrison");
        answers.add(26,"Come And Get Your Love - Redbone");
        answers.add(27,"My Head Is A Jungle - Emma Louise, Wankelmut");
        answers.add(28,"The Boys Are Back In Town - Thin Lizzy");
        answers.add(29,"Are You With Me - Lost Frequencies");
        answers.add(30,"I Wish I Was A Punk Rocker (With Flowers In My Hair) - Sandi Thom");
        answers.add(31,"Take Me Out - Franz Ferdinand");
        answers.add(32,"Stand By Me - Ben E. King");
        answers.add(33,"You've Got The Love - Candi Staton");
        answers.add(34,"We Didn't Start The Fire - Billy Joel");
        answers.add(35,"December 1963 (Oh What A Night) - Frankie Valli & The Four Seasons");
        answers.add(36,"In The Air Tonight - Phil Collins");
        answers.add(37,"American Pie - Don McLean");
        answers.add(38,"Jessie's Girl - Rick Springfield");
        answers.add(39,"Viva La Vida - Coldplay");
        answers.add(40,"Radioactive - Imagine Dragons");
        answers.add(41,"Demons - Imagine Dragons");
        answers.add(42,"Live Forever - Oasis");
        answers.add(43,"Somebody Told Me - The Killers");
        answers.add(44,"Mr. Brightside - The Killers");
        answers.add(45,"Come On Eileen - Dexys Midnight Runners");
        answers.add(46,"Piano Man - Billy Joel");
        answers.add(47,"Sympathy For The Devil - The Rolling Stones");
        answers.add(48,"Hooked On A Feeling - Blue Swede");
        answers.add(49,"Dancing In The Moonlight - Toploader");
        answers.add(50,"Can't Stop - Red Hot Chili Peppers");
        answers.add(51,"Valerie - The Zutons");
        answers.add(52, "HUMBLE. - Kendrick Lamar");
        answers.add(53, "Welcome To The Black Parade - My Chemical Romance");
        answers.add(54, "Welcome To The Jungle - Guns 'n' Roses");
        answers.add(55, "Without Me - Eminem");
        answers.add(56, "Rap God - Eminem");
        answers.add(57, "Mo Money Mo Problems - The Notorious B.I.G");
        answers.add(58, "Roses - Outkast");
        answers.add(59, "Ms. Jackson - Outkast");
        answers.add(60, "Classico - Tenacious D");
        answers.add(61, "POWER - Kanye West");
        answers.add(62, "Baby Got Back - Sir Mix-A-Lot");
        answers.add(63, "Low - Flo Rida");
        answers.add(64, "Better Now - Post Malone");
        answers.add(65, "Crashed The Wedding - Busted");
        answers.add(66, "Let's Dance To Joy Division - The Wombats");
        answers.add(67, "Shape Of You - Ed Sheeran");
        answers.add(68, "I Want You Back - Jackson 5");
        answers.add(69, "Crazy In Love - Beyonce");
        answers.add(70, "Teenagers - My Chemical Romance");
        answers.add(71, "Gives You Hell - All American Rejects");
        answers.add(72, "I Bet That You Look Good On The Dancefloor - Arctic Monkeys");
        answers.add(73, "I Took A Pill In Ibiza - Mike Posner");
        answers.add(74, "Dancing Queen - ABBA");
        answers.add(75, "Beautiful - Christina Aguilera");
        answers.add(76, "The House Of The Rising Sun - The Animals");
        answers.add(77, "Never Gonna Give You Up - Rick Astley");
        answers.add(78, "I Want It That Way - The Backstreet Boys");
        answers.add(79, "Johnny B. Goode - Chuck Berry");
        answers.add(80, "Livin' On A Prayer - Bon Jovi");
        answers.add(81, "Hallelujah - Jeff Buckley");
        answers.add(82, "Take Me Home, Country Roads - John Denver");
        answers.add(83, "Hotel California - The Eagles");
    }

    public String getAnswer(int index)
    {
        String answerString = null;
        for(String answer : answers) {
            if(index == answers.indexOf(answer)) {
                answerString = answer;
            }
        }
        return answerString;
    }

    public ArrayList getAnswerArray()
    {
        return answers;
    }
}

