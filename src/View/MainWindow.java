package View;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindow extends Frame {
    public MainWindow() {
        super("関数電卓");
        setSize(500, 500);
        setVisible(true);

        // 閉じるときのイベントを登録
        addWindowListener(new WindowListener());
        
        // GUIを構築

        var label = new Label("10 + 20 + 80 * 100");
        add(label, BorderLayout.NORTH);

        var inputPanel = new Panel();
        inputPanel.setLayout(new GridLayout(3, 3));

        for(int i = 0; i < 9; i++) {
            var button = new Button(Integer.toString(i + 1));
            inputPanel.add(button);
        }
        add(inputPanel, BorderLayout.CENTER);
    }

    class WindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
