package model;

import java.util.Random;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class art {

	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	MP3Player mp3 = new MP3Player();
	String patheffect = "C:/Users/smhrd/Desktop/박민지팀/effect/";

	public boolean Hard() {
		boolean sucess = false;
		try {
			String[] arrayArtHard = new String[3];
			arrayArtHard[0] = "Q.다음 그림은 누구인가요...\r\n" + "\r\n"
					+ "\r\n"
					+ ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,..,,,,,............\r\n"
					+ ",,,,,,,,,,,,,,,,,,,,,,.,,,,,,,,,.,,,,,............\r\n"
					+ ",,,,,,,,,,,,,,,,,,,,,,#####$,,,,,,,,..............\r\n"
					+ ",,,,,,,,,,,,,,,,,,,,~$$$$$$$#,,,,,,,..............\r\n"
					+ ",,,,,,,,,,,,,,,,,,,,#$$$$$$$$-,,,,,,..............\r\n"
					+ ",,,,,,,,,,,,,,,,,,,~#$$$$$$$$!,,,,................\r\n"
					+ ",,,,,,,,,,,,,,,,,,,~$$$$$$$$$#,,,.................\r\n"
					+ ",,,,,,,,,,,,,,,,,,,~$$$$$$$$$#.,..................\r\n"
					+ ",,,,,,,,,,,,,,,,,,,~$$$$$$$$$#,,..................\r\n"
					+ ",,,,,,,,,,,,,,,,,,,~$$$$$$$$$#,,,.................\r\n"
					+ ",,,,,,,,,,,,,.,---,~$$$$$$$$$#:**!**!*-...........\r\n"
					+ ",,,,,,,,,,,,~*==**=$$$$$$$$$$**!*****!*...........\r\n"
					+ ",,,,,,,,,,,.***!!**#$$$$$$#$$**!*!!!!!!!..........\r\n"
					+ ",,,,,,,,,,,-*******##$$$$$$#$$*!!!=***!*..........\r\n"
					+ ",,,,,,,,,,,.****!!!#$$$$$$$$$$*!!;!!*=* ..........\r\n"
					+ ",,,,,,,,,,,,-=!!!$==#@#==###=$##$*=*$*............\r\n"
					+ ",,,,,,,,,,,,,,~~-..:,......-~#,...................\r\n"
					+ ",,,,,,,,,,,,,,,,,,,~,...,--,.~,,..,...............\r\n"
					+ ",,,,,,,,,,,,,,,,,,,,,........,,,..,...............\r\n"
					+ ",,,,,,,,,,,,,,,,,,,,-...-,,,.-,,..................\r\n"
					+ ",,,,,,,.,,,,,,,,,,,~~,...,,,.-,...................\r\n"
					+ ",,,,,,,.,,,,,,,,,,,,........,-,...................\r\n"
					+ ",,,,,,,,,,,,,,,,,,,-.-.,,...-~-...,...............\r\n"
					+ ",,,,,,,,,,,,.,,,,,,-,-,-~-,,~-.,.,,...............\r\n"
					+ ",,,,,,,,,,,,,,,,,,,~~~-~-~~~:-,*;-,...............\r\n"
					+ ",,,,,,,,,,,,,,,,,,~:~,--,-~~~-.====-,.............\r\n"
					+ ",,,,,,,,,,,,,,,,,,$!~-,,,-~:-,.$==$$#*............\r\n"
					+ ",,,,,,,,,,,,,,,.=$=!:~,,-~~~~,-=*=$===$-,,........\r\n"
					+ ",,,,,,,,,,,,,,,==$$*;~,,-~~~-,:=*===*==$:.........\r\n"
					+ ",,,,,,,,,,,,,-$=$==$--,,----,.;=*====*===!,.......\r\n"
					+ ",,,,,,,,,,,.~$==$$=$.-,,,---,.;**=======*=*,......\r\n"
					+ ",,,,,,,,,,,~#====$=$ ,,,,-,,.,!**=*=====*==*,,....\r\n"
					+ ",,,,,,,,,,.$$*=$*$=$ ,,,,,,,. =**$==$==**====.....\r\n"
					+ ",,,,,,,,,.====$#*==$..,,,,,..:=====*===****=$*,...\r\n"
					+ ",,,,,,,,,$=*==$$*$==-.,,,,...==*======*!****=$*!~,\r\n"
					+ ",,,,,,,.*==*=*$$=$===.......!===$=$===*!***===$=:-\r\n"
					+ ",,,,,,,-==**==$$=$==$~.....;======$===*****==*=~*=\r\n"
					+ ",,,,,,,==***==$$$=$==$*~-:$$===$==$=$*****==***===\r\n"
					+ ",,,,,,;==*=*==$$$$$$*=====*=*=$===$$=****===***=~~\r\n"
					+ ",,,,-====***=$$#$===$***==*=======$$*==*===**!**==\r\n"
					+ ",,,-*$$=***==$=$==*$=$$$$$$=============$*=*!!!*=*\r\n"
					+ ",,-!!===**=$===$=$*====!;!;!**!*$$$====$*==*!!***;\r\n"
					+ "" + "\n" + "[1]김홍도\n" + "[2]율곡 이이\n"
					+ "[3]김정희\n" + "[4]신숙주\n 답 : ";

			arrayArtHard[1] = "Q.다음 그림은 누구인가요...\r\n" + "\r\n"
					+ "\r\n"
					+ "!!!!!!!!!!!**************!!!!!*!!!;\r\n"
					+ "!!*!!!!!!*!***************!!!!*!*!!\r\n"
					+ "!!!*!!!!!*!***===*~~~-~-*****!***!*\r\n"
					+ "!**!!*!****=====*:--:~~;*~!=****!**\r\n"
					+ "!***!!!****=====*,.....~$;:=*******\r\n"
					+ "!!!!!!!***======; .....-!$-=*******\r\n"
					+ "!!!!!******=====. .....,,=:*==***=*\r\n"
					+ "!!**!!****=**==;......,,-;=$*==*=**\r\n"
					+ "!!*!!!***======:....,,,-:#$=$==*=**\r\n"
					+ "!!!!!****======:~:.!!~--*#@$=$===**\r\n"
					+ "!!!!!****======!:,.,,,,-;==$$==*===\r\n"
					+ "!!!****========*.,,,,,,-~~$$$======\r\n"
					+ "*********====$==,;;:,,,-~~##$$=====\r\n"
					+ "!!*****=========,.~,--,-~*##$$=====\r\n"
					+ "!******=========~~::~,-~;=@#$$$====\r\n"
					+ "!******=======$$!,,,,,-:~@@@$#$$===\r\n"
					+ "!******=======$==$~;*!!#@#@@$$@====\r\n"
					+ "**!****=======$$=$##$@@#$$$=$@=$===\r\n"
					+ "**!****=========#$$#=@#====*@@==#==\r\n"
					+ "***!***======$$=*@$$@$=$==*$@@@@===\r\n"
					+ "****!****=====#@#,=$=$===**@$@$$###\r\n"
					+ "*****!****==$#@==.-=$$=***$#====$@=\r\n"
					+ "*********===@@==.:$$$$=$!=$==$==$#$\r\n"
					+ "**********$#@@=:;==$$=*=#$$=#$$=$#!\r\n"
					+ "*****!***@@@@!~==*====**$*=$===$#$#\r\n"
					+ "***!!!****@,!=*=*=*=*=$=*=$*=**##$#\r\n"
					+ "!**!!!***!$ #$$*********=@=$=*=$###\r\n"
					+ "***!!******-##$$**==*!*$#@===*=$##@\r\n"
					+ "!!!!****=$*$##@#=#*!!*=##@**===$#@#\r\n"
					+ "!!!!!****#=$@#@@@@$==*=#@$!*!**$#@@\r\n"
					+ "!!!******##$##@@##@$$=$@$;!!!!=#@@@\r\n"
					+ "!!!*****==$#@@@@@@######*;!!**=@@@#\r\n"
					+ "!!!***=$##$@@#$=##@####@!!***!#@@@#\r\n"
					+ "!!!!**##$=@#$*!!!!*@@$#$#@==$=@@@$$\r\n"
					+ "!!!!***$#@=#$*!!!*=$@#=$*$=*=@@@@#$\r\n"
					+ "!!!!*$$$$!**!=*!**===#@@#!*=#@@@@$$\r\n"
					+ "!!!==$=$;;!!!=****===$#==!*=@@@#@=$\r\n"
					+ "!!$===$*;!!!!****===**=##*=@@@@$@$$\r\n"
					+ "!*===*=#*!!**!*!!!!;**=$#*#@@@@#@@$\r\n"
					+ "!!#-.,-*#=**!;;**=!*==$@@@@@@@#$@@=\r\n"
					+ "!:..,..,-*!:;;;*!==*=$$#@@@@@@#$#@=\r\n"
					+ ":...-.,.-;;;;;!;!!!===#@@@@@@@$#=@=\r\n"
					+ ":-...,..-;:;;;!!*$$#@@@@@#@@@@=#=@=\r\n"
					+ "~~;,,,,,~;;!!*===##@@@@@$#@@@@$@##=\r\n"
					+ ":::;!!;~;;!*=$#@@@@@@@###@@@@@$$!==\r\n"
					+ "" + "\n" + "[1] 고르바초프\n" + "[2] 찰스 베비지\n"
					+ "[3] 알렉산더 플레밍\n" + "[4] 조나스 소크\n 답 : ";

			arrayArtHard[2] = "Q.다음 그림은 누구의 그림인가요...\r\n" + "\r\n"
					+ "\r\n"
					+ "=$$$##=;;!!;::::*##$$$$$###$##$$$$$\r\n"
					+ "$$#$$!!**=*!::;::=#$$$$$#@####$$#=$\r\n"
					+ "=$#=!**====*;:;;::=#$$$$#@@######$$\r\n"
					+ "=$**=$=====!;::;;:;=$$$#@@@@@@###$$\r\n"
					+ "=**=====*==*;::;:*==#$$#@@@@@@@###$\r\n"
					+ "*!===***==*!;:;*@@@@@#$#@@@@@@@@##$\r\n"
					+ "!!!!!!****;::*@@@@@@@@$#@@@@@@#=~*=\r\n"
					+ ";;;;;!!!!!;;#@@@@@##@@@#@@@@=*$$$$=\r\n"
					+ ";;;;;;!!!;!@@@@@@@#@#@@@@@$=$####$=\r\n"
					+ ";;;;;;;!;*@@@@@@@@@###@@$=#######$$\r\n"
					+ ":;:;;!;;$@@@@@@@@@@@#@#*=$@@@@@#$=#\r\n"
					+ ";:;:;;;@@@@@@@@@@@@@#$$$#@@@@@##$##\r\n"
					+ ";::;:!#@@@@@@@@@@@@#=##@#$=@@####@#\r\n"
					+ ";;::*#@@@@@@@@@@@@=$@#$*;;;$@###@@#\r\n"
					+ ";!;!@@@@@@@@@@@@#$##=*:-~:::###@@@#\r\n"
					+ "!;;@@@@@@@@@@@@$#@#*;~-----~$##@###\r\n"
					+ "!!#@@@@@@@@@@@$@#$*!~,  .,--:$$$$==\r\n"
					+ "!@@@@@@@@@@@@$@@#=;~--..,,,,:=$$==$\r\n"
					+ "#@@@@@@@@@@$#@#=*:~-,...,-,:*$$$$==\r\n"
					+ "@@@@@@@@@@#@@#$*!:-,,.-~--,*#$#$$==\r\n"
					+ "@@@@@@@@@#@##$*!::,.,!#@;,,$$#@#$$$\r\n"
					+ "@@@@@@@@#@@#=**!:~.,;*!*$-!#.*@$#$=\r\n"
					+ "@@@@@@@#@@#$*!;;:~-~;*$==$-,-$###$$\r\n"
					+ "@@@@@##@@@$*!;:~~--!:=$;:!:~.~$#$$$\r\n"
					+ "@@@@#$@@@@$*!:-:;=#$;*;*;!-:-,~=$$$\r\n"
					+ "@@@##@@####==###=!**!=;!:*-~~~--$$$\r\n"
					+ "@@$#@@#@@@@!*:~-,~-~-:;$!,.~:~-.,$$\r\n"
					+ "@$@@@@#$!**!::~--,---~~-..~~~~~-;$$\r\n"
					+ "###@#$#*-!**::::~-,,,..  -!:;==$$$$\r\n"
					+ "#####=:$;;*;;::;;~~,.....~:*=~;!$$$\r\n"
					+ "###*$$~#$;!;!!;!;::-,,,,,,-:*:~-=$$\r\n"
					+ "##@#;$~,*:~::!;!;!:~--,,,-!=*;;;!$$\r\n"
					+ "#@@@==~,-**~:;!!!;:~~---,-:;;*==:$$\r\n"
					+ "@@@@@$~,~--*;;!!!;!::~--,,:=$;~~;=$\r\n"
					+ "@@@@@@:-,--~=!!*!;;::~-~-::~-,--:*$\r\n"
					+ "@@@@@@@*,. -$$=***;::-~-----~---~:$\r\n"
					+ "@@@@@@@@@$$$##$$==!:~~~~---~~--,-~=\r\n"
					+ "@@@@@@@@@@@#$##$#$*!:-~~~~~-,,,.--*\r\n"
					+ "@@@@@@@@@@@@=$####$=;:~~~~~--,..--*\r\n"
					+ "@@@@@@@@@@@@#==$###$=;;:::~:~---~;$\r\n"
					+ "#@@@@@@@@@@@@=*=$#$##=*!!!;;::~~*$$\r\n"
					+ "#@@@@@@@@@@@*$***#$$$=$$$=*=$$####$\r\n"
					+ "#@@@@@@@@@@@:$=!*=#$=*=*$$$##~#@##$\r\n"
					+ "##@@@@@@@@@@@,==*!=#$$$$$=$## *@@##\r\n"
					+ "#@@@@@@@@@@@@- ****==*;:~!=*, ~#@##\r\n"
					+ "@@@@@@@@@@@@@#  ~!!**!!::;!*  ~####\r\n"
					+ "@@@@@@@@@@@@@@;  ,:!==*;;;:   -$###\r\n"
					+ "@@@@@@@@@@@@@@#,   ,;*!!!:    -$###\r\n"
					+ "#@@@@@@@@@@@@@@*     -~:!..   ~$###\r\n"
					+ "@#@@@@@@@@@@@@@@.     ~=*=!   =####\r\n"
					+ "##@@@@@@@@@@@@@@=  .!:=~!!!: ~=####\r\n"
					+ "~~~~~~~~~~~~~~~~~  .-,-,-.,, ,-~~~~\r\n"
					+ "" + "\n" + "[1] 제임스 조이스\n"
					+ "[2] 굴리엘모 마르코니\n" + "[3] 엔리코 페르미\n" + "[4] 블라디미르 쥐보르킨\n 답 : ";

			System.out.println("==================== 미술실 ====================");
			mp3.play(patheffect + "자물쇠2.mp3");
			Thread.sleep(2000);

			mp3.play(patheffect + "키보드.mp3");
			System.out.println("자물쇠로 미술실 문을 열었다.");
			Thread.sleep(2000);

			mp3.play(patheffect + "문여는소리.mp3");
			Thread.sleep(6000);

			mp3.play(patheffect + "키보드.mp3");
			System.out.println("미술실에는 캔버스가 있다.");
			Thread.sleep(2000);

			mp3.play(patheffect + "키보드.mp3");
			System.out.println("캔버스앞에 서니 서서히 그림이 나타난다...");
			Thread.sleep(3000);

			System.out.println("================= 미술실 문제 ====================");
			int num = rd.nextInt(3);
			System.out.print(arrayArtHard[num]);
			int answer = sc.nextInt();
			if (num == 0) {
				if (answer == 3) {
					mp3.play(patheffect + "상자.mp3");
					Thread.sleep(2000);
					mp3.play(patheffect + "열쇠 얻는소리.mp3");
					Thread.sleep(2000);
					mp3.play(patheffect + "키보드.mp3");
					System.out.println("상자를 열어보니 음악이라고 적힌 열쇠가 하나 들어있다. 음악실로 가보자");
					Thread.sleep(3000);
					sucess = true;

				}
			} else if (num == 1) {
				if (answer == 2) {
					mp3.play(patheffect + "상자.mp3");
					Thread.sleep(2000);
					mp3.play(patheffect + "열쇠 얻는소리.mp3");
					Thread.sleep(2000);
					mp3.play(patheffect + "키보드.mp3");
					System.out.println("상자를 열어보니 음악이라고 적힌 열쇠가 하나 들어있다. 음악실로 가보자");
					Thread.sleep(3000);
					sucess = true;

				}
			} else if (num == 2) {
				if (answer == 1) {
					mp3.play(patheffect + "상자.mp3");
					Thread.sleep(2000);
					mp3.play(patheffect + "열쇠 얻는소리.mp3");
					Thread.sleep(2000);
					mp3.play(patheffect + "키보드.mp3");
					System.out.println("상자를 열어보니 음악이라고 적힌 열쇠가 하나 들어있다. 음악실로 가보자");
					Thread.sleep(3000);
					sucess = true;

				}
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return sucess;

	}

	// Easy 모드 과학실
	public boolean Easy() { // 주소값만 가지고 있는 레퍼런스 변수
		boolean sucess = false;
		try {
			String[] arrayArtEasy = new String[3];
			arrayArtEasy[0] = "Q.다음 그림은 누구인가요..." + "\r\n"
					+ "\r\n"
					+ "                                                  \r\n"
					+ "                                                  \r\n"
					+ "       .=                           ;             \r\n"
					+ "         :                         :              \r\n"
					+ "          -                       -               \r\n"
					+ "           ,                     -                \r\n"
					+ "                    .,---       ,                 \r\n"
					+ "              ~*             -$.                  \r\n"
					+ "        *                                         \r\n"
					+ "        #                      $##  ,             \r\n"
					+ "        $!.                   ####  ,             \r\n"
					+ "        ####!                ###$     ~           \r\n"
					+ "         #####;            ;###                   \r\n"
					+ "           ;####          $##;#        .          \r\n"
					+ "    $         $##         ## ###                  \r\n"
					+ "            #:               ###        #         \r\n"
					+ "   !        #   -             ,         $         \r\n"
					+ "   #         *     $      $ -!          #         \r\n"
					+ "   =        ,        !  *     !         .         \r\n"
					+ "                               ;                  \r\n"
					+ "    ,          =;=        .!   ,                  \r\n"
					+ "           !   ;;;        ;;          ~           \r\n"
					+ "      ~    -   !;;        *$   ,    ,             \r\n"
					+ "       .*                      $  :~              \r\n"
					+ "          : !       ,  $       $.                 \r\n"
					+ "         .   *    #     $    -      ,             \r\n"
					+ "                     -~              #            \r\n"
					+ "                                                  \r\n"
					+ "                                 -    -           \r\n"
					+ "                                 $     ;          \r\n"
					+ "    ,     ~    ;                 :                \r\n"
					+ "   !      #                       ,     $         \r\n"
					+ "   :      $                :       $              \r\n"
					+ "    *   - =               *  -                    \r\n"
					+ "     =    ,               $  #$    $              \r\n"
					+ "      = ,.                 ~,,,! - ~*             \r\n"
					+ "       *                     ;,,,   #             \r\n"
					+ "        !#                    =,,,  ;             \r\n"
					+ "         :-------~~~::::~~~~~-- -,  $             \r\n"
					+ "          ---------------------      $            \r\n"
					+ "          ---------------------;   :              \r\n"
					+ "          ------------------------~ *   $         \r\n"
					+ "          ------------------------~   -  -        \r\n"
					+ "          -------------------------    $   :      \r\n"
					+ "          -------------------------         =     \r\n"
					+ "          -------------------------       #       \r\n"
					+ "          ------------$------------        .      \r\n"
					+ "          -----------! ,----------~          $    \r\n"
					+ "          ----------.    ---------~               \r\n"
					+ "          ---------       :-------~               \r\n"
					+ "          --------         ;------*               \r\n"
					+ "          ------:           ;-----#               \r\n"
					+ "          -----~             ;----$               \r\n"
					+ "          ----~               ;---,               \r\n"
					+ "          !--:                 :--                \r\n"
					+ "          =--!                 !--=               \r\n"
					+ "         --$-                   :$;#              \r\n"
					+ "                                                  \r\n"
					+ "\n" 
					
					
					+ "\n[1]부리부리몬\n"
					+ "[2]멧돼지왕자님\n" + "[3]벌거벗은돼지용사\n" + "[4]신짱구\n 답 : ";

			arrayArtEasy[1] = "Q.다음 그림은 누구인가요..." 
					+ "*;:;;*-::~~=*:-::~~~:!=;;~~,;-,.--,               \r\n"
					+ "!;:!!:~~~~~-!~~~~~;:;~;,-,,,--~,:..               \r\n"
					+ "::~~!;;:::~-;:::~:-,,~    ,    :,~......          \r\n"
					+ ";!;;::;;;!:~=;;;~,.,,     ~.    ,,,~  ..... .. .  \r\n"
					+ ":;$;::!!!!;!#:!:..,,.   -. -,   .,,,,,          ..\r\n"
					+ "::*;:;!!!;=:~;,..,,,.   $$ =$   .,,,,,,        ...\r\n"
					+ ";:*;!*=**!:!~-.,,,-..   *!.!*   .~.,,,,        .  \r\n"
					+ ":~$$*!!!~~-,~,,,,..       .         -,,-     .    \r\n"
					+ "!#;:**--,,.,,,~:~    ~    ,,:  ,      ,,.         \r\n"
					+ "!;!!~~:~~,:-,,,. ,     --!,.-     ~    ,-         \r\n"
					+ ":~~-,.,,!:-,,-,          ,--~          -,~..      \r\n"
					+ "--~---;!,..,,,            ,~          . ,,    ....\r\n"
					+ "---!;!,,,,-,,                      ,,   ~,      ..\r\n"
					+ "-=:~---,,,;,:                           .,     ...\r\n"
					+ "*~----,,,.:,                             ,  ,... .\r\n"
					+ ":-----,,,-:,    -,--               ,  -. ,,.......\r\n"
					+ "--~-,,,,,-!,  -;----,,,-~:,         : . ,,,,,,,,,.\r\n"
					+ ",,---,,,,,,,,  ;,,,,,,,,,,,,,---,,--~    ,,,,,-,,,\r\n"
					+ ",,--,,,,,,,,   -,,,,,,,,,,,,,,,,,,,,.    ~,,,,,-,,\r\n"
					+ "----,,,,,,--    -,,,,,,--::~-,,,,,,-.   !,,,,,,,..\r\n"
					+ "-----,,,,,,,,   ,-,,,-.      .,,-,,,    -,,,,,--,,\r\n"
					+ "----.  .,,,--    ,-,.    ..     ,--.   .~,,,,,,.,,\r\n"
					+ ",,,      ,..-:    ,.  ........  ..-    :,,,-----,-\r\n"
					+ ",,:      ;,,,-    ...............,    -,,,------~-\r\n"
					+ ",,;      *-,,~.     ,...........      ~-,,,,,,--~-\r\n"
					+ ",,,      -,~,,-       ~.......,      ~--~,,,,-----\r\n"
					+ ",,,-.   ,,,,,~!;,       ....,      .-,,,,-,,----,,\r\n"
					+ "...,,,:,,,,,,,-:~-,~-           .~-~~,,,-,-~!:*-~~\r\n"
					+ "......,,,,,,,,...-!------..-~-----::~,,,,,,,-~~--,\r\n"
					+ "....,,.,,,,,,,,,,,.  .-~-,,,--,. ,,,,,,-,,,,,,,-,-\r\n"
					+ ".....,.,~,,,,,,,,.     ...;,      ,,,,,-,,,,--,,--" 
					+ "\n[1] 냥냥이\n" + "[2] 떼껄룩\n"
					+ "[3] 강아지\n" + "[4] 도라에몽\n 답 : ";

			arrayArtEasy[2] = "Q.다음 그림은 누구인가요...\n\r\n" + "\r\n"
					+ "\r\n"
					+ "                                                  \r\n"
					+ "                                                  \r\n"
					+ "                                                  \r\n"
					+ "                                                  \r\n"
					+ "                                      !!!         \r\n"
					+ "                                     .   -.       \r\n"
					+ "                                     .    :       \r\n"
					+ "         ;;!                          ;    ,      \r\n"
					+ "       ~-  :*                              ~      \r\n"
					+ "      ~   :                    ~:~,,~-.~   :      \r\n"
					+ "     ..  ; ~:,-           .-,:~       ,--- ~      \r\n"
					+ "     :   ;~    -,       .,-               :-      \r\n"
					+ "     ..  :;      ~     -,               ,,..;     \r\n"
					+ "      -  ,..      *   ~                $   : *    \r\n"
					+ "       :   $~;~=    -;                =     :.    \r\n"
					+ "        ~!  .*, ..~-:                ;      , ~   \r\n"
					+ "      .::,;    ,:: :  ~,,,~          .         .  \r\n"
					+ "      :  .,       ~. ~     ,                   :  \r\n"
					+ "       ~;-        ! ~.     .             ~$    ~  \r\n"
					+ "       ,~           ,                    .;    :  \r\n"
					+ "      ,-         .  .                          .  \r\n"
					+ "     ,-          ~      -                     ~   \r\n"
					+ "    ,.           -     :$                     ,   \r\n"
					+ "   ,.                               ~$$      ;    \r\n"
					+ "  :    ,=-        ;             !=##$$~     *     \r\n"
					+ " ~.  *,   -*,     ..            $$,-     !~~,     \r\n"
					+ "-. !-       ,~!.   ~                .;-,,   .;    \r\n"
					+ ".-~            -~:  -~          !;--,         ~   \r\n"
					+ "                  ::. ---,~::~~:       -~::~~- ;  \r\n"
					+ "                    -:-             ,~;       :;  \r\n"
					+ "                       ;-        .-!-             \r\n"
					+ "                         ;     !*,                \r\n"
					+ "                          *    *                  \r\n"
					+ "                           !   !                  \r\n"
					+ "                            :  .                  \r\n"
					+ "                             ~                    \r\n"
					+ "                              ~~                  \r\n"
					+ "                                                  \r\n"
					+ "" + "" 
					+ "\n[1] 시바견\n" + "[2] 흰둥이\n"
					+ "[3] 호랑이\n" + "[4] 검둥이\n 답 : ";

			System.out.println("==================== 미술실 ====================");
			mp3.play(patheffect + "자물쇠2.mp3");
			Thread.sleep(2000);

			mp3.play(patheffect + "키보드.mp3");
			System.out.println("자물쇠로 미술실 문을 열었다.");
			Thread.sleep(2000);

			mp3.play(patheffect + "문여는소리.mp3");
			Thread.sleep(6000);

			mp3.play(patheffect + "키보드.mp3");
			System.out.println("미술실에는 캔버스가 있다.");
			Thread.sleep(2000);

			mp3.play(patheffect + "키보드.mp3");
			System.out.println("캔버스앞에 서니 서서히 그림이 나타난다...");
			Thread.sleep(3000);

			System.out.println("================= 미술실 문제 ====================");
			int num = rd.nextInt(3);
			System.out.print(arrayArtEasy[num]);
			int answer = sc.nextInt();
			if (num == 0) {
				if (answer == 1) {
					mp3.play(patheffect + "상자.mp3");
					Thread.sleep(2000);
					mp3.play(patheffect + "열쇠 얻는소리.mp3");
					Thread.sleep(2000);
					mp3.play(patheffect + "키보드.mp3");
					System.out.println("상자를 열어보니 음악이라고 적힌 열쇠가 하나 들어있다. 음악실로 가보자");
					Thread.sleep(3000);
					sucess = true;

				}
			} else if (num == 1) {
				if (answer == 4) {
					mp3.play(patheffect + "상자.mp3");
					Thread.sleep(2000);
					mp3.play(patheffect + "열쇠 얻는소리.mp3");
					Thread.sleep(2000);
					mp3.play(patheffect + "키보드.mp3");
					System.out.println("상자를 열어보니 음악이라고 적힌 열쇠가 하나 들어있다. 음악실로 가보자");
					Thread.sleep(3000);
					sucess = true;

				}
			} else if (num == 2) {
				if (answer == 2) {
					mp3.play(patheffect + "상자.mp3");
					Thread.sleep(2000);
					mp3.play(patheffect + "열쇠 얻는소리.mp3");
					Thread.sleep(2000);
					mp3.play(patheffect + "키보드.mp3");
					System.out.println("상자를 열어보니 음악이라고 적힌 열쇠가 하나 들어있다. 음악실로 가보자");
					Thread.sleep(3000);
					sucess = true;
				}
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return sucess;

	}

}
