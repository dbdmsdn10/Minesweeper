import javax.swing.ImageIcon;
import javax.swing.JButton;

public class minedetect3 {
	JButton[] a;// 마인 번지수 들
	int i;// 현제위치

	int[] c;// 마인갯수
	int k;// 유저가누른건가 프로그램이 킨건가

	public minedetect3(JButton[] a, int i, int[] c, int k) {
		this.a = a;
		this.i = i;
		this.c = c;
		this.k = k;
	}

	public void run() {
		System.out.println(i + "번지");

		if (a[i].getIcon().toString().equals("0개.png")) {
			if ((i + 1) % 9 == 0)// 오른쪽줄
			{
				if (i == 8) {

					if (!a[i - 1].getIcon().toString().equals("0개.png")) {

						a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
						new minedetect3(a, i - 1, c, 0).run();

					} else {
					}
					if (!a[i + 8].getIcon().toString().equals("0개.png")) {
						a[i + 8].setIcon(new ImageIcon(c[i + 8] + "개.png"));
						new minedetect3(a, i + 8, c, 0).run();
					} else {
					}
					if (!a[i + 9].getIcon().toString().equals("0개.png")) {
						a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
						new minedetect3(a, i + 9, c, 0).run();
					} else {
					}

				} else if (i == 80) {
					if (!a[i - 10].getIcon().toString().equals("0개.png")) {
						a[i - 10].setIcon(new ImageIcon(c[i - 10] + "개.png"));
						new minedetect3(a, i - 10, c, 0).run();
					} else {
					}
					if (!a[i - 9].getIcon().toString().equals("0개.png")) {
						a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
						new minedetect3(a, i - 9, c, 0).run();
					} else {
					}

					if (!a[i - 1].getIcon().toString().equals("0개.png")) {
						a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
						new minedetect3(a, i - 1, c, 0).run();
					} else {
					}

				} else {
					if (!a[i - 10].getIcon().toString().equals("0개.png")) {
						a[i - 10].setIcon(new ImageIcon(c[i - 10] + "개.png"));
						new minedetect3(a, i - 10, c, 0).run();
					} else {
					}
					if (!a[i - 9].getIcon().toString().equals("0개.png")) {
						a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
						new minedetect3(a, i - 9, c, 0).run();
					} else {
					}

					if (!a[i - 1].getIcon().toString().equals("0개.png")) {
						a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
						new minedetect3(a, i - 1, c, 0).run();
					} else {
					}
					if (!a[i + 8].getIcon().toString().equals("0개.png")) {
						a[i + 8].setIcon(new ImageIcon(c[i + 8] + "개.png"));
						new minedetect3(a, i + 8, c, 0).run();
					} else {
					}

					if (!a[i + 9].getIcon().toString().equals("0개.png")) {
						a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
						new minedetect3(a, i + 9, c, 0).run();
					} else {
					}

				}
			} else if (i % 9 == 0)// 왼쪽줄
			{
				if (i == 0) {

					if (!a[i + 1].getIcon().toString().equals("0개.png")) {
						a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
						new minedetect3(a, i + 1, c, 0).run();
					} else {
					}

					if (!a[i + 9].getIcon().toString().equals("0개.png")) {
						a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
						new minedetect3(a, i + 9, c, 0).run();
					} else {
					}
					if (!a[i + 10].getIcon().toString().equals("0개.png")) {
						a[i + 10].setIcon(new ImageIcon(c[i + 10] + "개.png"));
						new minedetect3(a, i + 10, c, 0).run();
					} else {
					}

				} else if (i == 72) {

					if (!a[i - 9].getIcon().toString().equals("0개.png")) {
						a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
						new minedetect3(a, i - 9, c, 0).run();
					}
					if (!a[i - 8].getIcon().toString().equals("0개.png")) {
						a[i - 8].setIcon(new ImageIcon(c[i - 8] + "개.png"));
						new minedetect3(a, i - 8, c, 0).run();
					}

					if (!a[i + 1].getIcon().toString().equals("0개.png")) {
						a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
						new minedetect3(a, i + 1, c, 0).run();
					} else {
					}

				} else {

					if (!a[i - 9].getIcon().toString().equals("0개.png")) {
						a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
						new minedetect3(a, i - 9, c, 0).run();
					} else {
					}
					if (!a[i - 8].getIcon().toString().equals("0개.png")) {
						a[i - 8].setIcon(new ImageIcon(c[i - 8] + "개.png"));
						new minedetect3(a, i - 8, c, 0).run();
					} else {
					}

					if (!a[i + 1].getIcon().toString().equals("0개.png")) {
						a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
						new minedetect3(a, i + 1, c, 0).run();
					} else {
					}

					if (!a[i + 9].getIcon().toString().equals("0개.png")) {
						a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
						new minedetect3(a, i + 9, c, 0).run();
					} else {
					}
					if (!a[i + 10].getIcon().toString().equals("0개.png")) {
						a[i + 10].setIcon(new ImageIcon(c[i + 10] + "개.png"));
						new minedetect3(a, i + 10, c, 0).run();
					} else {
					}

				}
			} else {
				if (i / 9 == 0)// 0과 8제외 맨윗줄
				{

					if (!a[i - 1].getIcon().toString().equals("0개.png")) {
						a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
						new minedetect3(a, i - 1, c, 0).run();
					}

					if (!a[i + 1].getIcon().toString().equals("0개.png")) {
						a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
						new minedetect3(a, i + 1, c, 0).run();
					} else {
					}
					if (!a[i + 8].getIcon().toString().equals("0개.png")) {
						a[i + 8].setIcon(new ImageIcon(c[i + 8] + "개.png"));
						new minedetect3(a, i + 8, c, 0).run();
					} else {
					}
					if (!a[i + 9].getIcon().toString().equals("0개.png")) {
						a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
						new minedetect3(a, i + 9, c, 0).run();
					} else {
					}
					if (!a[i + 10].getIcon().toString().equals("0개.png")) {
						a[i + 10].setIcon(new ImageIcon(c[i + 9] + "개.png"));
						new minedetect3(a, i + 10, c, 0).run();
					} else {
					}

				} else if (i - 71 > 0)// 72와 80제외 맨아래줄
				{
					if (!a[i - 10].getIcon().toString().equals("0개.png")) {
						a[i - 10].setIcon(new ImageIcon(c[i - 10] + "개.png"));
						new minedetect3(a, i - 10, c, 0).run();
					} else {
					}
					if (!a[i - 9].getIcon().toString().equals("0개.png")) {
						a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
						new minedetect3(a, i - 9, c, 0).run();
					} else {
					}

					if (!a[i - 8].getIcon().toString().equals("0개.png")) {
						a[i - 8].setIcon(new ImageIcon(c[i - 8] + "개.png"));
						new minedetect3(a, i - 8, c, 0).run();
					} else {
					}

					if (!a[i - 1].getIcon().toString().equals("0개.png")) {
						a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
						new minedetect3(a, i - 1, c, 0).run();
					} else {
					}

					if (!a[i + 1].getIcon().toString().equals("0개.png")) {
						a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
						new minedetect3(a, i + 1, c, 0).run();
					} else {
					}

				} else {
					if (!a[i - 10].getIcon().toString().equals("0개.png")) {
						a[i - 10].setIcon(new ImageIcon(c[i - 10] + "개.png"));
						new minedetect3(a, i - 10, c, 0).run();
					} else {
					}
					if (!a[i - 9].getIcon().toString().equals("0개.png")) {
						a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
						new minedetect3(a, i - 9, c, 0).run();
					} else {
					}
					if (!a[i - 8].getIcon().toString().equals("0개.png")) {
						a[i - 8].setIcon(new ImageIcon(c[i - 8] + "개.png"));
						new minedetect3(a, i - 8, c, 0).run();
					} else {
					}

					if (!a[i - 1].getIcon().toString().equals("0개.png")) {
						a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
						new minedetect3(a, i - 1, c, 0).run();
					} else {
					}

					if (!a[i + 1].getIcon().toString().equals("0개.png")) {
						a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
						new minedetect3(a, i + 1, c, 0).run();
					} else {
					}

					if (!a[i + 8].getIcon().toString().equals("0개.png")) {
						a[i + 8].setIcon(new ImageIcon(c[i + 8] + "개.png"));
						new minedetect3(a, i + 8, c, 0).run();
					} else {
					}
					if (!a[i + 9].getIcon().toString().equals("0개.png")) {
						a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
						new minedetect3(a, i + 9, c, 0).run();
					} else {
					}
					if (!a[i + 10].getIcon().toString().equals("0개.png")) {
						a[i + 10].setIcon(new ImageIcon(c[i + 10] + "개.png"));
						new minedetect3(a, i + 10, c, 0).run();
					} else {
					}

				}
			}

		} else

		{// 0개.png 가아닐때
			if (k == 1) {
				if ((i + 1) % 9 == 0)// 오른쪽줄
				{
					if (i == 8) {

						if (a[i - 1].getIcon().toString().equals("0개-1.png")) {

							a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
							new minedetect3(a, i - 1, c, 0).run();

						} else {
						}

						if (a[i + 9].getIcon().toString().equals("0개-1.png")) {
							a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
							new minedetect3(a, i + 9, c, 0).run();
						} else {
						}

					} else if (i == 80) {

						if (a[i - 9].getIcon().toString().equals("0개-1.png")) {
							a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
							new minedetect3(a, i - 9, c, 0).run();
						} else {
						}

						if (a[i - 1].getIcon().toString().equals("0개-1.png")) {
							a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
							new minedetect3(a, i - 1, c, 0).run();
						} else {
						}

					} else {

						if (a[i - 9].getIcon().toString().equals("0개-1.png")) {
							a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
							new minedetect3(a, i - 9, c, 0).run();
						} else {
						}

						if (a[i - 1].getIcon().toString().equals("0개-1.png")) {
							a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
							new minedetect3(a, i - 1, c, 0).run();
						} else {
						}

						if (a[i + 9].getIcon().toString().equals("0개-1.png")) {
							a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
							new minedetect3(a, i + 9, c, 0).run();
						} else {
						}

					}
				} else if (i % 9 == 0)// 왼쪽줄
				{
					if (i == 0) {

						if (a[i + 1].getIcon().toString().equals("0개-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
							new minedetect3(a, i + 1, c, 0).run();
						} else {
						}

						if (a[i + 9].getIcon().toString().equals("0개-1.png")) {
							a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
							new minedetect3(a, i + 9, c, 0).run();
						} else {
						}

					} else if (i == 72) {

						if (a[i - 9].getIcon().toString().equals("0개-1.png")) {
							a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
							new minedetect3(a, i - 9, c, 0).run();
						}

						if (a[i + 1].getIcon().toString().equals("0개-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
							new minedetect3(a, i + 1, c, 0).run();
						} else {
						}

					} else {

						if (a[i - 9].getIcon().toString().equals("0개-1.png")) {
							a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
							new minedetect3(a, i - 9, c, 0).run();
						} else {
						}
						if (a[i + 1].getIcon().toString().equals("0개-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
							new minedetect3(a, i + 1, c, 0).run();
						} else {
						}

						if (a[i + 1].getIcon().toString().equals("0개-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
							new minedetect3(a, i + 1, c, 0).run();
						} else {
						}

						if (a[i + 9].getIcon().toString().equals("0개-1.png")) {
							a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
							new minedetect3(a, i + 9, c, 0).run();
						} else {
						}

					}
				} else {
					if (i / 9 == 0)// 0과 8제외 맨윗줄
					{

						if (a[i - 1].getIcon().toString().equals("0개-1.png")) {
							a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
							new minedetect3(a, i - 1, c, 0).run();
						}

						if (a[i + 1].getIcon().toString().equals("0개-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
							new minedetect3(a, i + 1, c, 0).run();
						} else {
						}

						if (a[i + 9].getIcon().toString().equals("0개-1.png")) {
							a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
							new minedetect3(a, i + 9, c, 0).run();
						} else {
						}

					} else if (i - 71 > 0)// 72와 80제외 맨아래줄
					{

						if (a[i - 9].getIcon().toString().equals("0개-1.png")) {
							a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
							new minedetect3(a, i - 9, c, 0).run();
						} else {
						}

						if (a[i - 1].getIcon().toString().equals("0개-1.png")) {
							a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
							new minedetect3(a, i - 1, c, 0).run();
						} else {
						}

						if (a[i + 1].getIcon().toString().equals("0개-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
							new minedetect3(a, i + 1, c, 0).run();
						} else {
						}

					} else {

						if (a[i - 9].getIcon().toString().equals("0개-1.png")) {
							a[i - 9].setIcon(new ImageIcon(c[i - 9] + "개.png"));
							new minedetect3(a, i - 9, c, 0).run();
						} else {
						}

						if (a[i - 1].getIcon().toString().equals("0개-1.png")) {
							a[i - 1].setIcon(new ImageIcon(c[i - 1] + "개.png"));
							new minedetect3(a, i - 1, c, 0).run();
						} else {
						}

						if (a[i + 1].getIcon().toString().equals("0개-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "개.png"));
							new minedetect3(a, i + 1, c, 0).run();
						} else {
						}

						if (a[i + 9].getIcon().toString().equals("0개-1.png")) {
							a[i + 9].setIcon(new ImageIcon(c[i + 9] + "개.png"));
							new minedetect3(a, i + 9, c, 0).run();
						} else {
						}

					}
				}
			} else {
			}

		}
	}
}
