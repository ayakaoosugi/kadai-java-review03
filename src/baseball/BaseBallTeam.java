package baseball;

public class BaseBallTeam {
	// フィールド
	private String name;// 野球チーム
	private int win; // 勝ち数
	private int lose; // 負け数
	private int draw; // 引き分け

	// 引数なしのコンストラクタ
	public BaseBallTeam() {

	}

	// 引数ありのコンストラクタ
	public BaseBallTeam(String name, int win, int lose, int draw) {
		
		this.name = name;
		this.win = win;
		this.lose = lose;
		this.draw = draw;
	}
    //勝率 ＝ 勝試合数÷（勝試合数＋敗試合数）
	public double getRate() {
		double winRate = (double) win / (win + lose);
		return winRate;
	}

	public void report() {

		System.out.println(
				this.name + "の2022年の成績は" + this.win + "勝" + this.lose + "敗" + this.draw + "分、勝率は" + getRate() + "です。");

	}

	public String getName() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
	}

}

