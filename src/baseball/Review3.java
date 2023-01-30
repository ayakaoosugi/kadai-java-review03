package baseball;

public class Review3 {

	    public static void main(String[] args) {
	    	//繰り返し処理に利用するため、配列を準備
	    	BaseBallTeam[] baseballteam= new BaseBallTeam[6];
	    	
		    baseballteam[0]=new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
			baseballteam[1]=new BaseBallTeam("横濱DeNAベイスターズ",73,68,2);
	        baseballteam[2]=new BaseBallTeam("阪神タイガース",68,71,4);
			baseballteam[3]=new BaseBallTeam("読売ジャイアンツ",68,72,3);
	        baseballteam[4]=new BaseBallTeam("広島東洋カープ",66,74,3);
			baseballteam[5]=new BaseBallTeam("中日ドラゴンズ",66,75,2);
			// 拡張for文にて記述した場合
			for (BaseBallTeam Baseballteam: baseballteam) {
			      Baseballteam.report();
			    }
			  }

	    }
	    
