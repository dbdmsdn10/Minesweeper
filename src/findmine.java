import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class findmine {

	public static JFrame frame;
	Random random = new Random();
	JButton[] a = new JButton[9 * 9];// 개ư�迭 81개
	int[] minedetector = new int[81];// 개개 개개��
	int howmine = 1;// ������ ����
	int[] minearray = new int[howmine];// ������ǥ
	public static long start = System.currentTimeMillis(); // ���۽ð�
	int answer=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new findmine();
	}

	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 */
	public findmine() {
		int mine = 0;// ���ΰ���
		
		frame = new JFrame();
		frame.setBounds(0, 0, 600, 600);// GUI ũ��
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(9, 9, 0, 0));

		for (int i = 0; i < howmine; i++)// ���� ��Ҹ����
		{
			minearray[i] = random.nextInt(81);
			for (int j = 0; j < i; j++) {
				if (minearray[i] == minearray[j]) {
					i--;
				}

			}
		}

		for (int i = 0; i < 9 * 9; i++)// �ϴ� ����ư�� ��ĭ�̷� ����
		{

			a[i] = new JButton("");
			minedetector[i] = 0;
			a[i].addActionListener(new Change(i));

		}

		for (int i = 0; i < howmine; i++)// ���� �ֺ� ���� ++
		{
			if ((minearray[i] + 1) % 9 == 0)// ��������
			{
				if (minearray[i] == 8) {
					minedetector[minearray[i] - 1]++;
					minedetector[minearray[i] + 8]++;
					minedetector[minearray[i] + 9]++;
				} else if (minearray[i] == 80) {
					minedetector[minearray[i] - 10]++;
					minedetector[minearray[i] - 9]++;
					minedetector[minearray[i] - 1]++;
				} else {
					minedetector[minearray[i] - 10]++;
					minedetector[minearray[i] - 9]++;
					minedetector[minearray[i] - 1]++;
					minedetector[minearray[i] + 8]++;
					minedetector[minearray[i] + 9]++;
				}
			} else if (minearray[i] % 9 == 0)// ������
			{
				if (minearray[i] == 0) {
					minedetector[minearray[i] + 1]++;
					minedetector[minearray[i] + 9]++;
					minedetector[minearray[i] + 10]++;
				} else if (minearray[i] == 72) {
					minedetector[minearray[i] - 9]++;
					minedetector[minearray[i] - 8]++;
					minedetector[minearray[i] + 1]++;
				} else {
					minedetector[minearray[i] - 9]++;
					minedetector[minearray[i] - 8]++;
					minedetector[minearray[i] + 1]++;
					minedetector[minearray[i] + 9]++;
					minedetector[minearray[i] + 10]++;
				}
			} else {
				if (minearray[i] / 9 == 0)// 0�� 8���� ������
				{
					minedetector[minearray[i] - 1]++;
					minedetector[minearray[i] + 1]++;
					minedetector[minearray[i] + 8]++;
					minedetector[minearray[i] + 9]++;
					minedetector[minearray[i] + 10]++;
				} else if (minearray[i] - 71 > 0)// 72�� 80���� �ǾƷ���
				{
					minedetector[minearray[i] - 10]++;
					minedetector[minearray[i] - 9]++;
					minedetector[minearray[i] - 8]++;
					minedetector[minearray[i] - 1]++;
					minedetector[minearray[i] + 1]++;
				} else {

					minedetector[minearray[i] - 10]++;
					minedetector[minearray[i] - 9]++;
					minedetector[minearray[i] - 8]++;
					minedetector[minearray[i] - 1]++;
					minedetector[minearray[i] + 1]++;
					minedetector[minearray[i] + 8]++;
					minedetector[minearray[i] + 9]++;
					minedetector[minearray[i] + 10]++;

				}

			}

		}
		for (int i = 0; i < 9 * 9; i++)// ��������ֱ�
		{

			for (int j = 0; j < howmine; j++) {
				int y = 0;
				if (minearray[j] == i) {
					a[i].setIcon(new ImageIcon("지뢰-1.png"));
					y = 1;
					break;
				}
				if (y == 1) {
					continue;
				} else {
					a[i].setIcon(new ImageIcon(minedetector[i] + "개-1.png"));
				}
			}

		}

		for (int i = 0; i < 9 * 9; i++)// ������ ����ư ����ֱ�
		{
			frame.getContentPane().add(a[i]);
		}

		// https://code.i-harness.com/ko-kr/q/1654355
		frame.setVisible(true);
	}

	class Change implements ActionListener {
		int i;

		Change(int i) {
			this.i = i;
		}

		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			minedetect3 c = new minedetect3(a, i, minedetector, 1, minearray);

			String[] what = { "클릭하기", "찾음", "?", "취소" };
			Object select = JOptionPane.showInputDialog(null, "무엇을 하시겠습까?", " ", JOptionPane.QUESTION_MESSAGE, null,
					what, what[0]);
			if (select == null) {

			} else if (select.toString().equals("?")) {
				b.setIcon(new ImageIcon("물음표.png"));
				
				
			} else if (select.toString().equals("찾음")) {
				b.setIcon(new ImageIcon("찾음.png"));
				int y = 0;
				for (int j = 0; j < howmine; j++) {
					if (minearray[j] == i) {
						y = 1;
					}
				}
				if(y==1) {
					answer++;
					if(answer>=howmine) {
						int result = JOptionPane.showConfirmDialog(null, "모두 지뢰를 찾았습니다", "성공", JOptionPane.YES_NO_OPTION);
						if (result == JOptionPane.CLOSED_OPTION) {System.exit(0);
							
						} // �׳� �����
						else if (result == JOptionPane.YES_OPTION)// ����� �Ҷ�
						{
							System.exit(0);
						} else if (result == JOptionPane.NO_OPTION)// �ƴ϶�� �Ҷ�
						{
							System.exit(0);
						}
					}
				}
			} else if (select.toString().equals("취소")) {
				int y = 0;
				for (int j = 0; j < howmine; j++) {
					if (minearray[j] == i) {
						y = 1;
					}
				}
				if (y == 1) {
					a[i].setIcon(new ImageIcon("지뢰-1.png"));
					answer--;
				} else {
					a[i].setIcon(new ImageIcon(minedetector[i] + "개-1.png"));
				}

			} else if (select.toString().equals("클릭하기")) {
				if (b.getIcon().toString().equals("지뢰-1.png")) {

					new boom(minearray, a, minedetector).run();;

					int result = JOptionPane.showConfirmDialog(null, "실패", "지뢰를 밟았습니다", JOptionPane.YES_NO_OPTION);
					if (result == JOptionPane.CLOSED_OPTION) {System.exit(0);
						
					} // �׳� �����
					else if (result == JOptionPane.YES_OPTION)// ����� �Ҷ�
					{
						System.exit(0);
					} else if (result == JOptionPane.NO_OPTION)// �ƴ϶�� �Ҷ�
					{
						System.exit(0);
					}
				} else if (b.getIcon().toString().equals("0개-1.png")) {
					b.setIcon(new ImageIcon("0개.png"));
				} else if (b.getIcon().toString().equals("1개-1.png")) {
					b.setIcon(new ImageIcon("1개.png"));
				} else if (b.getIcon().toString().equals("2개-1.png")) {
					b.setIcon(new ImageIcon("2개.png"));
				} else if (b.getIcon().toString().equals("3개-1.png")) {
					b.setIcon(new ImageIcon("3개.png"));
				} else if (b.getIcon().toString().equals("4개-1.png")) {
					b.setIcon(new ImageIcon("4개.png"));
				} else if (b.getIcon().toString().equals("5개-1.png")) {
					b.setIcon(new ImageIcon("5개.png"));
				} else if (b.getIcon().toString().equals("6개-1.png")) {
					b.setIcon(new ImageIcon("6개.png"));
				} else if (b.getIcon().toString().equals("7개-1.png")) {
					b.setIcon(new ImageIcon("7개.png"));
				} else if (b.getIcon().toString().equals("8개-1.png")) {
					b.setIcon(new ImageIcon("8개.png"));
				} else if (b.getIcon().toString().equals("9개-1.png")) {
					b.setIcon(new ImageIcon("9개.png"));
				} else {
				}

				c.run();
				
			}

			else {
			}
			new confirm(minearray, a, minedetector).run();
		}
	}
}
