import javax.swing.JButton;
import javax.swing.JOptionPane;

public class confirm {
	int[] minearray;
	JButton[] b;
	int[] minedetector;
	String finish;

	public confirm(int[] minearray, JButton[] b, int[] minedetector) {
		this.minearray = minearray;
		this.b = b;
		this.minedetector = minedetector;
	}

	public void run() {

		int y = 0;
		int count = 0;
		for (int j = 0; j < minearray.length; j++) {

			if (b[minearray[j]].getIcon().toString().equals("찾음.png")) {
				y++;
				System.out.println(y + "," + minearray.length);

			} else {
				break;
			}

		}
		for (int i = 0; i < 80; i++) {

			if (!Character.toString(b[i].getIcon().toString().charAt(2)).equals("-")) {
				count++;

			}
		}
		if (count == 80) {
			if (y == minearray.length) {

				long end = System.currentTimeMillis();

				long time = (end - findmine.start) / 1000;
				long point = end - findmine.start - time * 1000;

				JOptionPane.showMessageDialog(null, time + "." + point + "초");
				findmine.frame.dispose();

			}
		}
	}

}
