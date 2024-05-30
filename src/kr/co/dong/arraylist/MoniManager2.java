package kr.co.dong.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kr.co.dong.check5.Monitor;

public class MoniManager2 {
	static Scanner sc = new Scanner(System.in);
	static List<Monitor> listMonitor = new ArrayList<Monitor>();
	static boolean stop = false;

	public static void main(String[] args) {
//		모니터관리프로그램 ver0.0
//		메뉴입력 : 1. 추가 2. 수정 3. 삭제 4. 조회(전체/선택) 99. 종료
//		처음으로 우선 만들고,
		process();
	}

	private static void process() {
		int key = 0;
		Monitor m = null;

		while (!stop) {
			key = init();
			switch (key) {
			case 1:
				// 1. 추가
				createMonitor(m);
				break;
			case 2:
				// 2. 수정
				updateMonitor();
				break;
			case 3:
				// 3. 삭제
				deleteMonitor();
				break;
			case 4:
				// 4. 조회(전체/선택)
				searchMonitor(key);
				break;
			case 99:
				// 99. 종료
				stop = true;
				System.out.println("시스템 종료");
				break;
			}

		}
	}

	private static int init() {
		System.out.println("모니터 관리 프로그램 Start");
		System.out.println("1. 추가 2. 수정 3. 삭제 4. 조회(전체/선택) 99. 종료");
		System.out.print("선택 키 : ");
		return sc.nextInt();

	}

	private static void searchMonitor(int key) {
		System.out.println("1. 전체 2. 선택 ");
		System.out.print("선택 키 : ");
		key = sc.nextInt();

		switch (key) {
		case 1:
			// 1. 전체
			searchAll();
			break;
		case 2:
			// 2. 선택
			searchSelectMonitor();

			break;
		}

	}

	private static boolean searchSelectMonitor() {
		System.out.print("검색할 모니터 명 : ");
		String mName = sc.next();
		if (listMonitor.isEmpty() || listMonitor == null || listMonitor.size() == 0) {
			System.out.println("추가 한 모니터가 존재하지 않습니다.");
			return false;
		}
		for (Object obj : listMonitor) {
			Monitor m = (Monitor) obj;

			if (mName.equals(m.getName())) {
				System.out.println("모니터 명 : " + m.getName() + " 색상 : " + m.getColor() + " 가격 : " + m.getPrice());
				return true;
			}

		}
		return false;
	}

	private static boolean searchAll() {
		if (listMonitor.isEmpty() || listMonitor == null || listMonitor.size() == 0) {
			System.out.println("추가 한 모니터가 존재하지 않습니다.");
			return false;
		}
		for (Object obj : listMonitor) {
			Monitor m = (Monitor) obj;

			System.out.println("모니터 명 : " + m.getName() + " 색상 : " + m.getColor() + " 가격 : " + m.getPrice());
		}
		return true;
	}

	private static void deleteMonitor() {
		System.out.print("삭제 할 모니터 명 : ");
		String mName = sc.next();

		for (Object obj : listMonitor) {
			Monitor m = (Monitor) obj;

			if (m.getName().equals(mName)) {
				System.out.println(m);
				System.out.println("위 모니터를 정말 삭제하시겠습니까?");
				System.out.print("(y/n)");
				String trueFalse = sc.next();
				if (trueFalse.equals("y")) {
					listMonitor.remove(m);
					System.out.println("삭제 완료");
				} else if (trueFalse.equals("n")) {
					System.out.println("삭제를 취소 합니다. ");
				} else {
					System.out.println("관리자에게 문의하세요.");
				}
			}
		}

	}

	private static void updateMonitor() {
		System.out.print("변경 할 모니터 명 : ");
		String mName = sc.next();

		for (Object obj : listMonitor) {
			Monitor m = (Monitor) obj;

			if (m.getName().equals(mName)) {
				System.out.print("변경할 이름 : ");
				String cMoniName = sc.next();
				System.out.print("변경할 색상 : ");
				String cMoniColor = sc.next();
				System.out.print("변경할 가격 : ");
				String cMoniPrice = sc.next();

				m.setName(cMoniName);
				m.setColor(cMoniColor);
				m.setPrice(cMoniPrice);
				System.out.println("수정 완료");
			} else {
				System.out.println("해당 모니터를 찾을 수 없음");
			}
		}
	}

	private static void createMonitor(Monitor m) {
		System.out.print("모니터 명 : ");
		String mName = sc.next();
		System.out.print("모니터 색상 : ");
		String mColor = sc.next();
		System.out.print("모니터 가격 : ");
		String mPrice = sc.next();

		m = new Monitor(mName, mColor, mPrice);
		listMonitor.add(m);
	}

}
