import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTExampleTwo extends Frame {
    AWTExampleTwo(String name) {
        super(name);
        setSize(400, 400);
        setLocation(400, 400);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        AWTExampleTwo awt = new AWTExampleTwo("Apps");
    }
}