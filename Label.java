import javax.swing.JButton;

public class Label {
    private void prepareGUI() {
        JFrame frame = new JFrame("Label Example");
        frame.setSize(400, 400);
        frame.setLayout(null);
        JLabel label = new JLabel("Hello, World!");
        label.setBounds(50, 50, 200, 30);
        frame.add(label);
        frame.setVisible(true);
    }
    private void showEventDemo() {
        headerLabel1.setText("Control in action: Button");
        JButton okButton = new JButton("OK");
        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");
    }
}
