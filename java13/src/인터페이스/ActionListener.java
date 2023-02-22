package 인터페이스;

import java.awt.event.ActionEvent;

public interface ActionListener {
	// 추상메서드, 불완전한 메서드
	// 인터페이스는 추상메서드로만 정의해야 함.
	// 불완전한 인터페이스
	// new ActionLister 쓸 수 없음.
	public void actionPerformed(ActionEvent e);
}
