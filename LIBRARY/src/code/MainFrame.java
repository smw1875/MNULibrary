package code;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.Serial;

public class MainFrame extends JFrame {

    @Serial
    private static final long serialVersionUID = 1L;

    private void createMenu() {
        JMenuBar mb = new JMenuBar();
        JMenu personMenu = new JMenu("Person");
        JMenuItem loginMenuItem = new JMenuItem("Log-in ...");
        JMenuItem logoutMenuItem = new JMenuItem("Log-out ...");
        personMenu.add(loginMenuItem);
        personMenu.add(logoutMenuItem);

        JMenu memberMenu = new JMenu("Members");
        JMenuItem membersMenuItem = new JMenuItem("Members ...");
        memberMenu.add(membersMenuItem);

        JMenu bookMenu = new JMenu("Book");
        JMenuItem bookMenuItem = new JMenuItem("Books ...");
        JMenuItem bookAddMenuItem = new JMenuItem("Add Book ...");
        JMenuItem bookSearchItem = new JMenuItem("Search Book ...");
        JMenuItem bookDeleteItem = new JMenuItem("Book Delete ...");
        JMenuItem bookborrowItem = new JMenuItem("Book borrow ...");
        JMenuItem bookReturnItem = new JMenuItem("Book Return ...");
        
        bookMenu.add(bookMenuItem);
        bookMenu.add(bookAddMenuItem);
        bookMenu.add(bookSearchItem);
        bookMenu.add(bookDeleteItem);
        bookMenu.add(bookborrowItem);
        bookMenu.add(bookReturnItem);
        mb.add(personMenu);
        mb.add(memberMenu);
        mb.add(bookMenu);

        MenuActionListener menuListener = new MenuActionListener(this);
        membersMenuItem.addActionListener(menuListener);
        loginMenuItem.addActionListener(menuListener);
        logoutMenuItem.addActionListener(menuListener);
        bookMenuItem.addActionListener(menuListener);
        bookAddMenuItem.addActionListener(menuListener);       
        bookSearchItem.addActionListener(menuListener);
        bookDeleteItem.addActionListener(menuListener);
        bookborrowItem.addActionListener(menuListener);
        bookReturnItem.addActionListener(menuListener);
        setJMenuBar(mb);
    }

    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("도서 메인 화면");
        createMenu();
        setSize(800, 500);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}