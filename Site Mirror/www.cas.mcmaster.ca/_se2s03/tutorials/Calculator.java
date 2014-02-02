/*
 * Filename: Calculator.java
 * Author: 2S03MakeYouLearnGood
 * Description: This file will teach you about how GUIs are created in Java.
 */

/*
 * Java provides us with 3 default layouts that
 * can be used to well, layout our interfaces.
 * They come from the java.awt package that
 * contains all of the classes for creating
 * user interfaces and for painting graphics and images.
 */
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

/*
 * We're going to be using the Swing package.
 * It provides a set of "lightweight" (all-Java language) components that
 * (as best as possible) work the same on all platforms.
 *
 * The general heirarchy is: text fields, labels, buttons etc. are ADDED to panels
 * and panels are ADDED to frames.
 *
 * We're gonna use panels, frames, text fields and button so we import them.
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;


/* We're making this class CalculatorFrame extend
 * JFrame, which means it in and of itself IS A JFrame.
 */
class CalculatorFrame extends JFrame {

  /* In the end this is what we're looking for
   *    -------------------
   *    |               0 |
   *    -------------------
   *    | ( | ) | % | AC  |
   *    -------------------
   *    | 7 | 8 | 9 |  /  |
   *    -------------------
   *    | 4 | 5 | 6 |  *  |
   *    -------------------
   *    | 1 | 2 | 3 |  -  |
   *    -------------------
   *    | 0 | . | = |  +  |
   *    -------------------
   */

  /* we could use many different categorizations but we going to use
   * 3 JPanels, a resultPanel for showing our results, a numberPanel
   * for holding our buttons and operations and a mainPanel
   * which will serve as a container for both.
   */
  private JPanel mainPanel, resultPanel, numberPanel;

  /* we need lots of JButtons so we declare all of them */
  private JButton zero, one, two, three, four, five, six, seven, eight, nine;
  private JButton dot, plus, minus, multiply, divide, mod, equals, clear;
  private JButton lparen, rparen;

  /* We could have made use of other things such as JLabel, JRadioButton, and JCheckBox etc */

  /* and finally we need a JTextField to hold our results */
  private JTextField resultField;

  CalculatorFrame() {
    /* set the title of the window */
    super("Really Simple Calculator");

    /* result panel */
    resultPanel = new JPanel();

    /* FlowLayout positions components row wise from left to right */
    resultPanel.setLayout(new FlowLayout());
    /* We want it to initially say 0 and have a width of about 20 columns */
    resultField = new JTextField("0", 20);
    /* Add the text field to its panel */
    resultPanel.add(resultField);
    /* Set the alignment */
    resultField.setHorizontalAlignment(JTextField.RIGHT);
    /* We don't want it to be editable we just want to display results */
    resultField.setEditable(false);

    /* number panel*/
    numberPanel = new JPanel();
    /* we want the layout to be a grid of 5 rows and 4 columns */
    /* to look something like this */
    /*
       1: ( ) % AC
       2: 7 8 9 /
       3: 4 5 6 *
       4: 1 2 3 -
       5: 0 . = +
    */
    numberPanel.setLayout(new GridLayout(5,4));

    /* we create our buttons and
     * initialize them with what we want them to say
     */
    zero   = new JButton("0");
    one    = new JButton("1");
    two    = new JButton("2");
    three  = new JButton("3");
    four   = new JButton("4");
    five   = new JButton("5");
    six    = new JButton("6");
    seven  = new JButton("7");
    eight  = new JButton("8");
    nine   = new JButton("9");

    lparen   = new JButton("(");
    rparen   = new JButton(")");
    plus     = new JButton("+");
    minus    = new JButton("-");
    multiply = new JButton("*");
    divide   = new JButton("/");
    mod      = new JButton("%");
    equals   = new JButton("=");
    dot      = new JButton(".");
    clear    = new JButton("AC");

    /* our first row */
    numberPanel.add(lparen);
    numberPanel.add(rparen);
    numberPanel.add(mod);
    numberPanel.add(clear);

    /* our second row */
    numberPanel.add(seven);
    numberPanel.add(eight);
    numberPanel.add(nine);
    numberPanel.add(divide);

    /* our third row */
    numberPanel.add(four);
    numberPanel.add(five);
    numberPanel.add(six);
    numberPanel.add(multiply);

    /* our fourth row */
    numberPanel.add(one);
    numberPanel.add(two);
    numberPanel.add(three);
    numberPanel.add(minus);

    /* our fifth row */
    numberPanel.add(zero);
    numberPanel.add(dot);
    numberPanel.add(equals);
    numberPanel.add(plus);

    /* we then create our mainPanel which we're going to add everything else to */
    mainPanel = new JPanel();

    /* we make it have 2 rows and 1 column so we can stack our panels */
    mainPanel.setLayout(new GridLayout(2, 1));

    /* and we add both in the order we want them to be displayed */
    mainPanel.add(resultPanel);
    mainPanel.add(numberPanel);

    /* we add our mainPanel to the JFrame */
    add(mainPanel);

    /* and specify that it should close when the exit button provided by the OS is clicked */
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    /* we then call pack() which causes the window to be sized
     * to fit the preferred size and layouts of its subcomponents
     */
    pack();

    /* and finally set it's visibility to true */
    setVisible(true);
  }
}


public class Calculator {
  public static void main(String[] args) {
    /* We simple create a new object of CalculatorFrame */
    CalculatorFrame cf = new CalculatorFrame();
  }
}