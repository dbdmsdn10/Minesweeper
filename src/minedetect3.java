import javax.swing.ImageIcon;
import javax.swing.JButton;

public class minedetect3 {
	JButton[] a;// ���� ������ ��
	int i;// ������ġ

	int[] c;// ���ΰ���
	int k;// �����������ǰ� ���α׷��� Ų�ǰ�

	public minedetect3(JButton[] a, int i, int[] c, int k) {
		this.a = a;
		this.i = i;
		this.c = c;
		this.k = k;
	}

	public void run() {
		System.out.println(i + "����");

		if (a[i].getIcon().toString().equals("0��.png")) {
			if ((i + 1) % 9 == 0)// ��������
			{
				if (i == 8) {

					if (!a[i - 1].getIcon().toString().equals("0��.png")) {

						a[i - 1].setIcon(new ImageIcon(c[i - 1] + "��.png"));
						new minedetect3(a, i - 1, c, 0).run();

					} else {
					}
					if (!a[i + 8].getIcon().toString().equals("0��.png")) {
						a[i + 8].setIcon(new ImageIcon(c[i + 8] + "��.png"));
						new minedetect3(a, i + 8, c, 0).run();
					} else {
					}
					if (!a[i + 9].getIcon().toString().equals("0��.png")) {
						a[i + 9].setIcon(new ImageIcon(c[i + 9] + "��.png"));
						new minedetect3(a, i + 9, c, 0).run();
					} else {
					}

				} else if (i == 80) {
					if (!a[i - 10].getIcon().toString().equals("0��.png")) {
						a[i - 10].setIcon(new ImageIcon(c[i - 10] + "��.png"));
						new minedetect3(a, i - 10, c, 0).run();
					} else {
					}
					if (!a[i - 9].getIcon().toString().equals("0��.png")) {
						a[i - 9].setIcon(new ImageIcon(c[i - 9] + "��.png"));
						new minedetect3(a, i - 9, c, 0).run();
					} else {
					}

					if (!a[i - 1].getIcon().toString().equals("0��.png")) {
						a[i - 1].setIcon(new ImageIcon(c[i - 1] + "��.png"));
						new minedetect3(a, i - 1, c, 0).run();
					} else {
					}

				} else {
					if (!a[i - 10].getIcon().toString().equals("0��.png")) {
						a[i - 10].setIcon(new ImageIcon(c[i - 10] + "��.png"));
						new minedetect3(a, i - 10, c, 0).run();
					} else {
					}
					if (!a[i - 9].getIcon().toString().equals("0��.png")) {
						a[i - 9].setIcon(new ImageIcon(c[i - 9] + "��.png"));
						new minedetect3(a, i - 9, c, 0).run();
					} else {
					}

					if (!a[i - 1].getIcon().toString().equals("0��.png")) {
						a[i - 1].setIcon(new ImageIcon(c[i - 1] + "��.png"));
						new minedetect3(a, i - 1, c, 0).run();
					} else {
					}
					if (!a[i + 8].getIcon().toString().equals("0��.png")) {
						a[i + 8].setIcon(new ImageIcon(c[i + 8] + "��.png"));
						new minedetect3(a, i + 8, c, 0).run();
					} else {
					}

					if (!a[i + 9].getIcon().toString().equals("0��.png")) {
						a[i + 9].setIcon(new ImageIcon(c[i + 9] + "��.png"));
						new minedetect3(a, i + 9, c, 0).run();
					} else {
					}

				}
			} else if (i % 9 == 0)// ������
			{
				if (i == 0) {

					if (!a[i + 1].getIcon().toString().equals("0��.png")) {
						a[i + 1].setIcon(new ImageIcon(c[i + 1] + "��.png"));
						new minedetect3(a, i + 1, c, 0).run();
					} else {
					}

					if (!a[i + 9].getIcon().toString().equals("0��.png")) {
						a[i + 9].setIcon(new ImageIcon(c[i + 9] + "��.png"));
						new minedetect3(a, i + 9, c, 0).run();
					} else {
					}
					if (!a[i + 10].getIcon().toString().equals("0��.png")) {
						a[i + 10].setIcon(new ImageIcon(c[i + 10] + "��.png"));
						new minedetect3(a, i + 10, c, 0).run();
					} else {
					}

				} else if (i == 72) {

					if (!a[i - 9].getIcon().toString().equals("0��.png")) {
						a[i - 9].setIcon(new ImageIcon(c[i - 9] + "��.png"));
						new minedetect3(a, i - 9, c, 0).run();
					}
					if (!a[i - 8].getIcon().toString().equals("0��.png")) {
						a[i - 8].setIcon(new ImageIcon(c[i - 8] + "��.png"));
						new minedetect3(a, i - 8, c, 0).run();
					}

					if (!a[i + 1].getIcon().toString().equals("0��.png")) {
						a[i + 1].setIcon(new ImageIcon(c[i + 1] + "��.png"));
						new minedetect3(a, i + 1, c, 0).run();
					} else {
					}

				} else {

					if (!a[i - 9].getIcon().toString().equals("0��.png")) {
						a[i - 9].setIcon(new ImageIcon(c[i - 9] + "��.png"));
						new minedetect3(a, i - 9, c, 0).run();
					} else {
					}
					if (!a[i - 8].getIcon().toString().equals("0��.png")) {
						a[i - 8].setIcon(new ImageIcon(c[i - 8] + "��.png"));
						new minedetect3(a, i - 8, c, 0).run();
					} else {
					}

					if (!a[i + 1].getIcon().toString().equals("0��.png")) {
						a[i + 1].setIcon(new ImageIcon(c[i + 1] + "��.png"));
						new minedetect3(a, i + 1, c, 0).run();
					} else {
					}

					if (!a[i + 9].getIcon().toString().equals("0��.png")) {
						a[i + 9].setIcon(new ImageIcon(c[i + 9] + "��.png"));
						new minedetect3(a, i + 9, c, 0).run();
					} else {
					}
					if (!a[i + 10].getIcon().toString().equals("0��.png")) {
						a[i + 10].setIcon(new ImageIcon(c[i + 10] + "��.png"));
						new minedetect3(a, i + 10, c, 0).run();
					} else {
					}

				}
			} else {
				if (i / 9 == 0)// 0�� 8���� ������
				{

					if (!a[i - 1].getIcon().toString().equals("0��.png")) {
						a[i - 1].setIcon(new ImageIcon(c[i - 1] + "��.png"));
						new minedetect3(a, i - 1, c, 0).run();
					}

					if (!a[i + 1].getIcon().toString().equals("0��.png")) {
						a[i + 1].setIcon(new ImageIcon(c[i + 1] + "��.png"));
						new minedetect3(a, i + 1, c, 0).run();
					} else {
					}
					if (!a[i + 8].getIcon().toString().equals("0��.png")) {
						a[i + 8].setIcon(new ImageIcon(c[i + 8] + "��.png"));
						new minedetect3(a, i + 8, c, 0).run();
					} else {
					}
					if (!a[i + 9].getIcon().toString().equals("0��.png")) {
						a[i + 9].setIcon(new ImageIcon(c[i + 9] + "��.png"));
						new minedetect3(a, i + 9, c, 0).run();
					} else {
					}
					if (!a[i + 10].getIcon().toString().equals("0��.png")) {
						a[i + 10].setIcon(new ImageIcon(c[i + 9] + "��.png"));
						new minedetect3(a, i + 10, c, 0).run();
					} else {
					}

				} else if (i - 71 > 0)// 72�� 80���� �ǾƷ���
				{
					if (!a[i - 10].getIcon().toString().equals("0��.png")) {
						a[i - 10].setIcon(new ImageIcon(c[i - 10] + "��.png"));
						new minedetect3(a, i - 10, c, 0).run();
					} else {
					}
					if (!a[i - 9].getIcon().toString().equals("0��.png")) {
						a[i - 9].setIcon(new ImageIcon(c[i - 9] + "��.png"));
						new minedetect3(a, i - 9, c, 0).run();
					} else {
					}

					if (!a[i - 8].getIcon().toString().equals("0��.png")) {
						a[i - 8].setIcon(new ImageIcon(c[i - 8] + "��.png"));
						new minedetect3(a, i - 8, c, 0).run();
					} else {
					}

					if (!a[i - 1].getIcon().toString().equals("0��.png")) {
						a[i - 1].setIcon(new ImageIcon(c[i - 1] + "��.png"));
						new minedetect3(a, i - 1, c, 0).run();
					} else {
					}

					if (!a[i + 1].getIcon().toString().equals("0��.png")) {
						a[i + 1].setIcon(new ImageIcon(c[i + 1] + "��.png"));
						new minedetect3(a, i + 1, c, 0).run();
					} else {
					}

				} else {
					if (!a[i - 10].getIcon().toString().equals("0��.png")) {
						a[i - 10].setIcon(new ImageIcon(c[i - 10] + "��.png"));
						new minedetect3(a, i - 10, c, 0).run();
					} else {
					}
					if (!a[i - 9].getIcon().toString().equals("0��.png")) {
						a[i - 9].setIcon(new ImageIcon(c[i - 9] + "��.png"));
						new minedetect3(a, i - 9, c, 0).run();
					} else {
					}
					if (!a[i - 8].getIcon().toString().equals("0��.png")) {
						a[i - 8].setIcon(new ImageIcon(c[i - 8] + "��.png"));
						new minedetect3(a, i - 8, c, 0).run();
					} else {
					}

					if (!a[i - 1].getIcon().toString().equals("0��.png")) {
						a[i - 1].setIcon(new ImageIcon(c[i - 1] + "��.png"));
						new minedetect3(a, i - 1, c, 0).run();
					} else {
					}

					if (!a[i + 1].getIcon().toString().equals("0��.png")) {
						a[i + 1].setIcon(new ImageIcon(c[i + 1] + "��.png"));
						new minedetect3(a, i + 1, c, 0).run();
					} else {
					}

					if (!a[i + 8].getIcon().toString().equals("0��.png")) {
						a[i + 8].setIcon(new ImageIcon(c[i + 8] + "��.png"));
						new minedetect3(a, i + 8, c, 0).run();
					} else {
					}
					if (!a[i + 9].getIcon().toString().equals("0��.png")) {
						a[i + 9].setIcon(new ImageIcon(c[i + 9] + "��.png"));
						new minedetect3(a, i + 9, c, 0).run();
					} else {
					}
					if (!a[i + 10].getIcon().toString().equals("0��.png")) {
						a[i + 10].setIcon(new ImageIcon(c[i + 10] + "��.png"));
						new minedetect3(a, i + 10, c, 0).run();
					} else {
					}

				}
			}

		} else

		{// 0��.png ���ƴҶ�
			if (k == 1) {
				if ((i + 1) % 9 == 0)// ��������
				{
					if (i == 8) {

						if (a[i - 1].getIcon().toString().equals("0��-1.png")) {

							a[i - 1].setIcon(new ImageIcon(c[i - 1] + "��.png"));
							new minedetect3(a, i - 1, c, 0).run();

						} else {
						}

						if (a[i + 9].getIcon().toString().equals("0��-1.png")) {
							a[i + 9].setIcon(new ImageIcon(c[i + 9] + "��.png"));
							new minedetect3(a, i + 9, c, 0).run();
						} else {
						}

					} else if (i == 80) {

						if (a[i - 9].getIcon().toString().equals("0��-1.png")) {
							a[i - 9].setIcon(new ImageIcon(c[i - 9] + "��.png"));
							new minedetect3(a, i - 9, c, 0).run();
						} else {
						}

						if (a[i - 1].getIcon().toString().equals("0��-1.png")) {
							a[i - 1].setIcon(new ImageIcon(c[i - 1] + "��.png"));
							new minedetect3(a, i - 1, c, 0).run();
						} else {
						}

					} else {

						if (a[i - 9].getIcon().toString().equals("0��-1.png")) {
							a[i - 9].setIcon(new ImageIcon(c[i - 9] + "��.png"));
							new minedetect3(a, i - 9, c, 0).run();
						} else {
						}

						if (a[i - 1].getIcon().toString().equals("0��-1.png")) {
							a[i - 1].setIcon(new ImageIcon(c[i - 1] + "��.png"));
							new minedetect3(a, i - 1, c, 0).run();
						} else {
						}

						if (a[i + 9].getIcon().toString().equals("0��-1.png")) {
							a[i + 9].setIcon(new ImageIcon(c[i + 9] + "��.png"));
							new minedetect3(a, i + 9, c, 0).run();
						} else {
						}

					}
				} else if (i % 9 == 0)// ������
				{
					if (i == 0) {

						if (a[i + 1].getIcon().toString().equals("0��-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "��.png"));
							new minedetect3(a, i + 1, c, 0).run();
						} else {
						}

						if (a[i + 9].getIcon().toString().equals("0��-1.png")) {
							a[i + 9].setIcon(new ImageIcon(c[i + 9] + "��.png"));
							new minedetect3(a, i + 9, c, 0).run();
						} else {
						}

					} else if (i == 72) {

						if (a[i - 9].getIcon().toString().equals("0��-1.png")) {
							a[i - 9].setIcon(new ImageIcon(c[i - 9] + "��.png"));
							new minedetect3(a, i - 9, c, 0).run();
						}

						if (a[i + 1].getIcon().toString().equals("0��-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "��.png"));
							new minedetect3(a, i + 1, c, 0).run();
						} else {
						}

					} else {

						if (a[i - 9].getIcon().toString().equals("0��-1.png")) {
							a[i - 9].setIcon(new ImageIcon(c[i - 9] + "��.png"));
							new minedetect3(a, i - 9, c, 0).run();
						} else {
						}
						if (a[i + 1].getIcon().toString().equals("0��-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "��.png"));
							new minedetect3(a, i + 1, c, 0).run();
						} else {
						}

						if (a[i + 1].getIcon().toString().equals("0��-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "��.png"));
							new minedetect3(a, i + 1, c, 0).run();
						} else {
						}

						if (a[i + 9].getIcon().toString().equals("0��-1.png")) {
							a[i + 9].setIcon(new ImageIcon(c[i + 9] + "��.png"));
							new minedetect3(a, i + 9, c, 0).run();
						} else {
						}

					}
				} else {
					if (i / 9 == 0)// 0�� 8���� ������
					{

						if (a[i - 1].getIcon().toString().equals("0��-1.png")) {
							a[i - 1].setIcon(new ImageIcon(c[i - 1] + "��.png"));
							new minedetect3(a, i - 1, c, 0).run();
						}

						if (a[i + 1].getIcon().toString().equals("0��-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "��.png"));
							new minedetect3(a, i + 1, c, 0).run();
						} else {
						}

						if (a[i + 9].getIcon().toString().equals("0��-1.png")) {
							a[i + 9].setIcon(new ImageIcon(c[i + 9] + "��.png"));
							new minedetect3(a, i + 9, c, 0).run();
						} else {
						}

					} else if (i - 71 > 0)// 72�� 80���� �ǾƷ���
					{

						if (a[i - 9].getIcon().toString().equals("0��-1.png")) {
							a[i - 9].setIcon(new ImageIcon(c[i - 9] + "��.png"));
							new minedetect3(a, i - 9, c, 0).run();
						} else {
						}

						if (a[i - 1].getIcon().toString().equals("0��-1.png")) {
							a[i - 1].setIcon(new ImageIcon(c[i - 1] + "��.png"));
							new minedetect3(a, i - 1, c, 0).run();
						} else {
						}

						if (a[i + 1].getIcon().toString().equals("0��-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "��.png"));
							new minedetect3(a, i + 1, c, 0).run();
						} else {
						}

					} else {

						if (a[i - 9].getIcon().toString().equals("0��-1.png")) {
							a[i - 9].setIcon(new ImageIcon(c[i - 9] + "��.png"));
							new minedetect3(a, i - 9, c, 0).run();
						} else {
						}

						if (a[i - 1].getIcon().toString().equals("0��-1.png")) {
							a[i - 1].setIcon(new ImageIcon(c[i - 1] + "��.png"));
							new minedetect3(a, i - 1, c, 0).run();
						} else {
						}

						if (a[i + 1].getIcon().toString().equals("0��-1.png")) {
							a[i + 1].setIcon(new ImageIcon(c[i + 1] + "��.png"));
							new minedetect3(a, i + 1, c, 0).run();
						} else {
						}

						if (a[i + 9].getIcon().toString().equals("0��-1.png")) {
							a[i + 9].setIcon(new ImageIcon(c[i + 9] + "��.png"));
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
