import javax.swing.ImageIcon;
import javax.swing.JButton;

public class minedetect3 {
	JButton[] a;// ���� ������ ��
	int i;// ������ġ

	int[] c;// ���ΰ���  minedetector
	int[] d;// ������ġminearray
	int k;// �����������ǰ� ���α׷��� Ų�ǰ�

	public minedetect3(JButton[] a, int i, int[] c, int k,int[] d) {
		this.a = a;
		this.i = i;
		this.c = c;
		this.k = k;
		this.d=d;
	}

	public void run() {
	

		if (a[i].getIcon().toString().equals("0개.png")) {
			if ((i + 1) % 9 == 0)// 개개개개
			{
				if (i == 8) {

					if (!a[i - 1].getIcon().toString().equals("0개.png")) {

						a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
						new minedetect3(a, i - 1, c, 0,d).run();

					} else {
					}
					if (!a[i + 8].getIcon().toString().equals("0개.png")) {
						a[i + 8].setIcon(new ImageIcon(c[i + 8] + "개.png"));
						new minedetect3(a, i + 8, c, 0,d).run();
					} else {
					}
					if (!a[i + 9].getIcon().toString().equals("0개.png")) {
						a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
						new minedetect3(a, i + 9, c, 0,d).run();
					} else {
					}

				} else if (i == 80) {
					if (!a[i - 10].getIcon().toString().equals("0개.png")) {
						a[i - 10].setIcon(new ImageIcon(c[i - 10] + "개.png"));
						new minedetect3(a, i - 10, c, 0,d).run();
					} else {
					}
					if (!a[i - 9].getIcon().toString().equals("0개.png")) {
						a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
						new minedetect3(a, i - 9, c, 0,d).run();
					} else {
					}

					if (!a[i - 1].getIcon().toString().equals("0개.png")) {
						a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
						new minedetect3(a, i - 1, c, 0,d).run();
					} else {
					}

				} else {
					if (!a[i - 10].getIcon().toString().equals("0개.png")) {
						a[i - 10].setIcon(new ImageIcon(c[i - 10] + "개.png"));
						new minedetect3(a, i - 10, c, 0,d).run();
					} else {
					}
					if (!a[i - 9].getIcon().toString().equals("0개.png")) {
						a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
						new minedetect3(a, i - 9, c, 0,d).run();
					} else {
					}

					if (!a[i - 1].getIcon().toString().equals("0개.png")) {
						a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
						new minedetect3(a, i - 1, c, 0,d).run();
					} else {
					}
					if (!a[i + 8].getIcon().toString().equals("0개.png")) {
						a[i + 8].setIcon(new ImageIcon(c[i + 8] + "개.png"));
						new minedetect3(a, i + 8, c, 0,d).run();
					} else {
					}

					if (!a[i + 9].getIcon().toString().equals("0개.png")) {
						a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
						new minedetect3(a, i + 9, c, 0,d).run();
					} else {
					}

				}
			} else if (i % 9 == 0)// 개개개
			{
				if (i == 0) {

					if (!a[i + 1].getIcon().toString().equals("0개.png")) {
						a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
						new minedetect3(a, i + 1, c, 0,d).run();
					} else {
					}

					if (!a[i + 9].getIcon().toString().equals("0개.png")) {
						a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
						new minedetect3(a, i + 9, c, 0,d).run();
					} else {
					}
					if (!a[i + 10].getIcon().toString().equals("0개.png")) {
						a[i + 10].setIcon(new ImageIcon(c[i + 10] + "개.png"));
						new minedetect3(a, i + 10, c, 0,d).run();
					} else {
					}

				} else if (i == 72) {

					if (!a[i - 9].getIcon().toString().equals("0개.png")) {
						a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
						new minedetect3(a, i - 9, c, 0,d).run();
					}
					if (!a[i - 8].getIcon().toString().equals("0개.png")) {
						a[i - 8].setIcon(new ImageIcon(c[i - 8] + "개.png"));
						new minedetect3(a, i - 8, c, 0,d).run();
					}

					if (!a[i + 1].getIcon().toString().equals("0개.png")) {
						a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
						new minedetect3(a, i + 1, c, 0,d).run();
					} else {
					}

				} else {

					if (!a[i - 9].getIcon().toString().equals("0개.png")) {
						a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
						new minedetect3(a, i - 9, c, 0,d).run();
					} else {
					}
					if (!a[i - 8].getIcon().toString().equals("0개.png")) {
						a[i - 8].setIcon(new ImageIcon(c[i - 8] + "개.png"));
						new minedetect3(a, i - 8, c, 0,d).run();
					} else {
					}

					if (!a[i + 1].getIcon().toString().equals("0개.png")) {
						a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
						new minedetect3(a, i + 1, c, 0,d).run();
					} else {
					}

					if (!a[i + 9].getIcon().toString().equals("0개.png")) {
						a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
						new minedetect3(a, i + 9, c, 0,d).run();
					} else {
					}
					if (!a[i + 10].getIcon().toString().equals("0개.png")) {
						a[i + 10].setIcon(new ImageIcon(c[i + 10] + "개.png"));
						new minedetect3(a, i + 10, c, 0,d).run();
					} else {
					}

				}
			} else {
				if (i / 9 == 0)// 0개 8개개 개개개
				{

					if (!a[i - 1].getIcon().toString().equals("0개.png")) {
						a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
						new minedetect3(a, i - 1, c, 0,d).run();
					}

					if (!a[i + 1].getIcon().toString().equals("0개.png")) {
						a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
						new minedetect3(a, i + 1, c, 0,d).run();
					} else {
					}
					if (!a[i + 8].getIcon().toString().equals("0개.png")) {
						a[i + 8].setIcon(new ImageIcon(c[i + 8] + "개.png"));
						new minedetect3(a, i + 8, c, 0,d).run();
					} else {
					}
					if (!a[i + 9].getIcon().toString().equals("0개.png")) {
						a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
						new minedetect3(a, i + 9, c, 0,d).run();
					} else {
					}
					if (!a[i + 10].getIcon().toString().equals("0개.png")) {
						a[i + 10].setIcon(new ImageIcon(c[i + 10] + "개.png"));
						new minedetect3(a, i + 10, c, 0,d).run();
					} else {
					}

				} else if (i - 71 > 0)// 72개 80개개 �ǾƷ개�
				{
					if (!a[i - 10].getIcon().toString().equals("0개.png")) {
						a[i - 10].setIcon(new ImageIcon(c[i - 10] + "개.png"));
						new minedetect3(a, i - 10, c, 0,d).run();
					} else {
					}
					if (!a[i - 9].getIcon().toString().equals("0개.png")) {
						a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
						new minedetect3(a, i - 9, c, 0,d).run();
					} else {
					}

					if (!a[i - 8].getIcon().toString().equals("0개.png")) {
						a[i - 8].setIcon(new ImageIcon(c[i - 8] + "개.png"));
						new minedetect3(a, i - 8, c, 0,d).run();
					} else {
					}

					if (!a[i - 1].getIcon().toString().equals("0개.png")) {
						a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
						new minedetect3(a, i - 1, c, 0,d).run();
					} else {
					}

					if (!a[i + 1].getIcon().toString().equals("0개.png")) {
						a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
						new minedetect3(a, i + 1, c, 0,d).run();
					} else {
					}

				} else {
					if (!a[i - 10].getIcon().toString().equals("0개.png")) {
						a[i - 10].setIcon(new ImageIcon(c[i - 10] + "개.png"));
						new minedetect3(a, i - 10, c, 0,d).run();
					} else {
					}
					if (!a[i - 9].getIcon().toString().equals("0개.png")) {
						a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
						new minedetect3(a, i - 9, c, 0,d).run();
					} else {
					}
					if (!a[i - 8].getIcon().toString().equals("0개.png")) {
						a[i - 8].setIcon(new ImageIcon(c[i - 8] + "개.png"));
						new minedetect3(a, i - 8, c, 0,d).run();
					} else {
					}

					if (!a[i - 1].getIcon().toString().equals("0개.png")) {
						a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
						new minedetect3(a, i - 1, c, 0,d).run();
					} else {
					}

					if (!a[i + 1].getIcon().toString().equals("0개.png")) {
						a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
						new minedetect3(a, i + 1, c, 0,d).run();
					} else {
					}

					if (!a[i + 8].getIcon().toString().equals("0개.png")) {
						a[i + 8].setIcon(new ImageIcon(c[i + 8] + "개.png"));
						new minedetect3(a, i + 8, c, 0,d).run();
					} else {
					}
					if (!a[i + 9].getIcon().toString().equals("0개.png")) {
						a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
						new minedetect3(a, i + 9, c, 0,d).run();
					} else {
					}
					if (!a[i + 10].getIcon().toString().equals("0개.png")) {
						a[i + 10].setIcon(new ImageIcon(c[i + 10] + "개.png"));
						new minedetect3(a, i + 10, c, 0,d).run();
					} else {
					}

				}
			}

		} else

		{// 0개.png 개�ƴҶ�
			if (k == 1) {
				if ((i + 1) % 9 == 0)// 개개개개
				{
					if (i == 8) {

						if (a[i - 1].getIcon().toString().equals("0개-1.png")) {

							a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
							new minedetect3(a, i - 1, c, 0,d).run();

						} else {
						}

						if (a[i + 9].getIcon().toString().equals("0개-1.png")) {
							a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
							new minedetect3(a, i + 9, c, 0,d).run();
						} else {
						}

					} else if (i == 80) {

						if (a[i - 9].getIcon().toString().equals("0개-1.png")) {
							a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
							new minedetect3(a, i - 9, c, 0,d).run();
						} else {
						}

						if (a[i - 1].getIcon().toString().equals("0개-1.png")) {
							a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
							new minedetect3(a, i - 1, c, 0,d).run();
						} else {
						}

					} else {

						if (a[i - 9].getIcon().toString().equals("0개-1.png")) {
							a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
							new minedetect3(a, i - 9, c, 0,d).run();
						} else {
						}

						if (a[i - 1].getIcon().toString().equals("0개-1.png")) {
							a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
							new minedetect3(a, i - 1, c, 0,d).run();
						} else {
						}

						if (a[i + 9].getIcon().toString().equals("0개-1.png")) {
							a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
							new minedetect3(a, i + 9, c, 0,d).run();
						} else {
						}

					}
				} else if (i % 9 == 0)// 개개개
				{
					if (i == 0) {

						if (a[i + 1].getIcon().toString().equals("0개-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
							new minedetect3(a, i + 1, c, 0,d).run();
						} else {
						}

						if (a[i + 9].getIcon().toString().equals("0개-1.png")) {
							a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
							new minedetect3(a, i + 9, c, 0,d).run();
						} else {
						}

					} else if (i == 72) {

						if (a[i - 9].getIcon().toString().equals("0개-1.png")) {
							a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
							new minedetect3(a, i - 9, c, 0,d).run();
						}

						if (a[i + 1].getIcon().toString().equals("0개-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
							new minedetect3(a, i + 1, c, 0,d).run();
						} else {
						}

					} else {

						if (a[i - 9].getIcon().toString().equals("0개-1.png")) {
							a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
							new minedetect3(a, i - 9, c, 0,d).run();
						} else {
						}
						if (a[i + 1].getIcon().toString().equals("0개-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
							new minedetect3(a, i + 1, c, 0,d).run();
						} else {
						}

						if (a[i + 1].getIcon().toString().equals("0개-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
							new minedetect3(a, i + 1, c, 0,d).run();
						} else {
						}

						if (a[i + 9].getIcon().toString().equals("0개-1.png")) {
							a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
							new minedetect3(a, i + 9, c, 0,d).run();
						} else {
						}

					}
				} else {
					if (i / 9 == 0)// 0개 8개개 개개개
					{

						if (a[i - 1].getIcon().toString().equals("0개-1.png")) {
							a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
							new minedetect3(a, i - 1, c, 0,d).run();
						}

						if (a[i + 1].getIcon().toString().equals("0개-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
							new minedetect3(a, i + 1, c, 0,d).run();
						} else {
						}

						if (a[i + 9].getIcon().toString().equals("0개-1.png")) {
							a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
							new minedetect3(a, i + 9, c, 0,d).run();
						} else {
						}

					} else if (i - 71 > 0)// 72개 80개개 �ǾƷ개�
					{

						if (a[i - 9].getIcon().toString().equals("0개-1.png")) {
							a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
							new minedetect3(a, i - 9, c, 0,d).run();
						} else {
						}

						if (a[i - 1].getIcon().toString().equals("0개-1.png")) {
							a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
							new minedetect3(a, i - 1, c, 0,d).run();
						} else {
						}

						if (a[i + 1].getIcon().toString().equals("0개-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
							new minedetect3(a, i + 1, c, 0,d).run();
						} else {
						}

					} else {

						if (a[i - 9].getIcon().toString().equals("0개-1.png")) {
							a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
							new minedetect3(a, i - 9, c, 0,d).run();
						} else {
						}

						if (a[i - 1].getIcon().toString().equals("0개-1.png")) {
							a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
							new minedetect3(a, i - 1, c, 0,d).run();
						} else {
						}

						if (a[i + 1].getIcon().toString().equals("0개-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
							new minedetect3(a, i + 1, c, 0,d).run();
						} else {
						}

						if (a[i + 9].getIcon().toString().equals("0개-1.png")) {
							a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
							new minedetect3(a, i + 9, c, 0,d).run();
						} else {
						}

					}
				}
			} else {
			}

		}
		
		new confirm(d,a,c).run();
	}//개
}
