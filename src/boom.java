import javax.swing.ImageIcon;
import javax.swing.JButton;

public class boom {
	int[] minearray; // ������ǥ
	JButton[] b;
	int[] minedetector;// ����ǥ

	public boom(int[] minearray, JButton[] b, int[] minedetector) {
		this.minearray = minearray;
		this.b = b;
		this.minedetector = minedetector;
	}

	public void run() {
		for (int i = 0; i < minedetector.length; i++) {
			int y = 0;
			for (int j = 0; j < minearray.length; j++) {
				if (minearray[j] == i) {
					b[i].setIcon(new ImageIcon("지뢰.png"));
					y = 1;
					break;
				}

			}
			if (y == 1) {
				continue;
			} else {
				b[i].setIcon(new ImageIcon(minedetector[i] + "개.png"));
			}
		}
		
	}

}
