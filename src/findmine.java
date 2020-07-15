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

	private JFrame frame;
	Random random = new Random();
	JButton[] a = new JButton[9 * 9];// ��ư�迭 81��
	int[] minedetector = new int[81];// ���� ������
	int howmine = 15;// ������ ����
	int[] minearray = new int[howmine];// ������ǥ

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					findmine window = new findmine();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public findmine() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
					a[i].setIcon(new ImageIcon("����-1.png"));
					y = 1;
					break;
				}
				if (y == 1) {
					continue;
				} else {
					a[i].setIcon(new ImageIcon(minedetector[i] + "��-1.png"));
				}
			}

		}

		for (int i = 0; i < 9 * 9; i++)// ������ ����ư ����ֱ�
		{
			frame.getContentPane().add(a[i]);
		}

		// https://code.i-harness.com/ko-kr/q/1654355

	}

	class Change implements ActionListener {
		int i;

		Change(int i) {
			this.i = i;
		}

		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			minedetect3 c = new minedetect3(a, i, minedetector, 1);

			String[] what = { "?", "����", "Ŭ���ϱ�", "�����ϱ�" };
			Object select = JOptionPane.showInputDialog(null, "����ϰڽ��ϱ�?", " ", JOptionPane.QUESTION_MESSAGE, null,
					what, what[0]);
			if (select == null) {

			} else if (select.toString().equals("?")) {
				b.setIcon(new ImageIcon("����ǥ.png"));
			} else if (select.toString().equals("����")) {
				b.setIcon(new ImageIcon("ã��.png"));
			} else if (select.toString().equals("�����ϱ�")) {
				int y = 0;
				for (int j = 0; j < howmine; j++) {

					if (minearray[j] == i) {

						y = 1;

					}
				}
				if (y == 1) {
					a[i].setIcon(new ImageIcon("����-1.png"));
				} else {
					a[i].setIcon(new ImageIcon(minedetector[i] + "��-1.png"));
				}

			} else if (select.toString().equals("Ŭ���ϱ�")) {
				if (b.getIcon().toString().equals("����-1.png")) {
					b.setIcon(new ImageIcon("����.png"));
				} else if (b.getIcon().toString().equals("0��-1.png")) {
					b.setIcon(new ImageIcon("0��.png"));
				} else if (b.getIcon().toString().equals("1��-1.png")) {
					b.setIcon(new ImageIcon("1��.png"));
				} else if (b.getIcon().toString().equals("2��-1.png")) {
					b.setIcon(new ImageIcon("2��.png"));
				} else if (b.getIcon().toString().equals("3��-1.png")) {
					b.setIcon(new ImageIcon("3��.png"));
				} else if (b.getIcon().toString().equals("4��-1.png")) {
					b.setIcon(new ImageIcon("4��.png"));
				} else if (b.getIcon().toString().equals("5��-1.png")) {
					b.setIcon(new ImageIcon("5��.png"));
				} else if (b.getIcon().toString().equals("6��-1.png")) {
					b.setIcon(new ImageIcon("6��.png"));
				} else if (b.getIcon().toString().equals("7��-1.png")) {
					b.setIcon(new ImageIcon("7��.png"));
				} else if (b.getIcon().toString().equals("8��-1.png")) {
					b.setIcon(new ImageIcon("8��.png"));
				} else if (b.getIcon().toString().equals("9��-1.png")) {
					b.setIcon(new ImageIcon("9��.png"));
				} else {
				}

				c.run();
			}

			else {
			}

		}
	}
}
