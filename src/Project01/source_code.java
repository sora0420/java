package Project01;

import java.util.Scanner;

public class source_code { 
	// 번호 외의 문자 있으면 예외처리
	// 읽기, 수정, 삭제 없는 예외처리

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] boardArray = new String[100][5];
		String[][] tempArray = new String[100][5];

		boolean flag = true;
		String title, content, writer;
		Scanner scanner = new Scanner(System.in);
		int num = 0, no = 1, view = 0, del = 0, back = 0;
		boolean confirm = false;

		while (flag) {
			title = null;
			content = null;
			writer = null;
			System.out.println();
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("1.목록 | 2.생성(Create) | 3.읽기(Read) | 4.수정(Update) | 5.삭제(Delete) | 6.종료");
			System.out.println("------------------------------------------------------------------------------");
			System.out.print(">선택 : ");
			num = Integer.parseInt(scanner.nextLine());
			switch (num) {
			case 1:
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("\t번호\t\t제목\t\t내용\t\t글쓴이\t\t조회수");
				System.out.println("------------------------------------------------------------------------------");
				if (boardArray[1][0] == null && boardArray[2][0] == null) {
					System.out.println("내용이 없습니다.");
					break;
				}
				
				String[] tempa;
				System.arraycopy(boardArray, 0, tempArray, 0, boardArray.length);
				for (int i = 1; i < boardArray.length-1; i++) {
					for (int j = i + 1; j < boardArray.length; j++) {
						if (tempArray[j][0] != null && boardArray[i][0] != null) {
							if (Integer.parseInt(tempArray[i][0]) < Integer.parseInt(tempArray[j][0])) {
								tempa = tempArray[j];
								tempArray[j] = tempArray[i];
								tempArray[i] = tempa;
							}
						}
					}
				}

				for (int i = 1; i < no; i++) {
					for (int j = 0; j < boardArray[no].length; j++) {
						if (boardArray[i][j] != null) {
							System.out.print("\t" + tempArray[i][j] + "\t");
						}
					}
					if (boardArray[i][0] != null)
						System.out.println();
				}
				break;
			case 2:
				if (confirm == true) {
					for (int j = 0; j < boardArray[del].length; j++) {
						boardArray[del][j] = String.valueOf(no);
						System.out.print("제목 : ");
						boardArray[del][j + 1] = title = scanner.nextLine();
						System.out.print("내용 : ");
						boardArray[del][j + 2] = content = scanner.nextLine();
						System.out.print("글쓴이 : ");
						boardArray[del][j + 3] = writer = scanner.nextLine();
						boardArray[del][j + 4] = String.valueOf(view);
						confirm = false;
						no++;
						break;
					}
				} else {
					for (int j = 0; j < boardArray[no].length; j++) {
						boardArray[no][j] = String.valueOf(no);
						System.out.print("제목 : ");
						boardArray[no][j + 1] = title = scanner.nextLine();
						System.out.print("내용 : ");
						boardArray[no][j + 2] = content = scanner.nextLine();
						System.out.print("글쓴이 : ");
						boardArray[no][j + 3] = writer = scanner.nextLine();
						boardArray[no][j + 4] = String.valueOf(view);
						no++;
						break;
					}
				}
				break;
			case 3:
				int input = 0;
				int temp = 0;
				System.out.print("번호 : ");
				input = Integer.parseInt(scanner.nextLine());

				for (int i = 1; i < boardArray.length; i++) {
					if (Integer.parseInt(boardArray[i][0]) == input) {
						System.out.println("제목 : " + boardArray[i][1]);
						System.out.println("내용 : " + boardArray[i][2]);
						System.out.println("글쓴이 : " + boardArray[i][3]);
						temp = Integer.parseInt(boardArray[i][4]);
						temp++;
						boardArray[i][4] = String.valueOf(temp);
						System.out.println("조회수 : " + boardArray[i][4]);
						break;
					}
				}
				break;
			case 4:
				input = 0;
				System.out.print("번호 : ");
				input = Integer.parseInt(scanner.nextLine());
				for (int i = 1; i < boardArray.length; i++) {
					if (Integer.parseInt(boardArray[i][0]) == input) {
						System.out.println("기존제목 : " + boardArray[i][1]);
						System.out.print("수정제목 : ");
						title = scanner.nextLine();
						System.out.println(title);
						if (title != "") {
							boardArray[i][1] = title;
						}
						System.out.println("기존내용 : " + boardArray[i][2]);
						System.out.print("수정내용 : ");
						content = scanner.nextLine();
						if (content != "") {
							boardArray[i][2] = content;
						}
						break;
					}
				}

				break;
			case 5:
				del = 0;
				System.out.print("번호 : ");
				del = Integer.parseInt(scanner.nextLine());
				for (int i = 1; i < boardArray.length; i++) {
					if (Integer.parseInt(boardArray[i][0]) == del) {
						for (int j = 0; j < boardArray[i].length; j++) {
							boardArray[i][j] = null;
						}
						confirm = true;
						break;
					}
				}

				break;
			case 6:
				flag = false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
