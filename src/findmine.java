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
	JButton[] a = new JButton[9 * 9];// 버튼배열 81개
	int[] minedetector = new int[81];// 지뢰 감지기
	int howmine = 15;// 총지뢰 갯수
	int[] minearray = new int[howmine];// 지뢰좌표

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
		int mine = 0;// 마인갯수

		frame = new JFrame();
		frame.setBounds(0, 0, 600, 600);// GUI 크기
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(9, 9, 0, 0));

		for (int i = 0; i < howmine; i++)// 마인 장소만들기
		{
			minearray[i] = random.nextInt(81);
			for (int j = 0; j < i; j++) {
				if (minearray[i] == minearray[j]) {
					i--;
				}

			}
		}

		for (int i = 0; i < 9 * 9; i++)// 일단 모든버튼은 빈칸이로 지정
		{

			a[i] = new JButton("");
			minedetector[i] = 0;
			a[i].addActionListener(new Change(i));

		}

		for (int i = 0; i < howmine; i++)// 마인 주변 변수 ++
		{
			if ((minearray[i] + 1) % 9 == 0)// 오른쪽줄
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
			} else if (minearray[i] % 9 == 0)// 왼쪽줄
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
				if (minearray[i] / 9 == 0)// 0과 8제외 맨윗줄
				{
					minedetector[minearray[i] - 1]++;
					minedetector[minearray[i] + 1]++;
					minedetector[minearray[i] + 8]++;
					minedetector[minearray[i] + 9]++;
					minedetector[minearray[i] + 10]++;
				} else if (minearray[i] - 71 > 0)// 72와 80제외 맨아래줄
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
		for (int i = 0; i < 9 * 9; i++)// 숫자집어넣기
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

		for (int i = 0; i < 9 * 9; i++)// 수정된 모든버튼 집어넣기
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

			String[] what = { "?", "지뢰", "클릭하기", "복구하기" };
			Object select = JOptionPane.showInputDialog(null, "어떻게하겠습니까?", " ", JOptionPane.QUESTION_MESSAGE, null,
					what, what[0]);
			if (select == null) {

			} else if (select.toString().equals("?")) {
				b.setIcon(new ImageIcon("물음표.png"));
			} else if (select.toString().equals("지뢰")) {
				b.setIcon(new ImageIcon("찾음.png"));
			} else if (select.toString().equals("복구하기")) {
				int y = 0;
				for (int j = 0; j < howmine; j++) {

					if (minearray[j] == i) {

						y = 1;

					}
				}
				if (y == 1) {
					a[i].setIcon(new ImageIcon("지뢰-1.png"));
				} else {
					a[i].setIcon(new ImageIcon(minedetector[i] + "개-1.png"));
				}

			} else if (select.toString().equals("클릭하기")) {
				if (b.getIcon().toString().equals("지뢰-1.png")) {
					b.setIcon(new ImageIcon("지뢰.png"));
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

		}
	}
}
