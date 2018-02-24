import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Polynomial {
    private int leadMultiplier;
    private char variable;
    private int leadExponent;
    private int secondMultiplier;
    private int constant;


    public Polynomial() {
    }

    public Polynomial(int leadMultiplier, char variable, int leadExponent, int secondMultiplier, int constant) {
        this.leadMultiplier = leadMultiplier;
        this.variable = variable;
        this.leadExponent = leadExponent;
        this.secondMultiplier = secondMultiplier;
        this.constant = constant;

    }


    public int getLeadMultiplier() {
        return leadMultiplier;
    }

    public void setLeadMultiplier(int leadMultiplier) {
        this.leadMultiplier = leadMultiplier;
    }

    public char getVariable() {
        return variable;
    }

    public void setVariable(char variable) {
        this.variable = variable;
    }

    public int getLeadExponent() {
        return leadExponent;
    }

    public void setLeadExponent(int leadExponent) {
        this.leadExponent = leadExponent;
    }

    public int getSecondMultiplier() {
        return secondMultiplier;
    }

    public void setSecondMultiplier(int secondMultiplier) {
        this.secondMultiplier = secondMultiplier;
    }

    public int getConstant() {
        return constant;
    }

    public void setConstant(int constant) {
        this.constant = constant;
    }

    public String derive(Polynomial poly) {

        if (leadExponent == 2) {
            return "Derived{" + leadMultiplier * leadExponent + variable + "+" + secondMultiplier + "}";
        } else {
            return "Derived polynomial: {" + leadMultiplier *leadExponent +
                    variable +
                    "^" + (leadExponent-1) +
                    "+" + secondMultiplier +
                    '}';
        }
    }


    public void questioner() throws IOException {

        BufferedInputStream br = new BufferedInputStream(System.in);
        Scanner reader = new Scanner(System.in);

        System.out.println("Welcome to Johanna's amazing simple polynomial function deriving program 1.0!");
        System.out.println("Since this is a very simple little program, it will only derive polynomials of the form {ax^b+cx+d}.");
        System.out.println("(For more advanced features, please stay tuned for version 2.0!)");
        System.out.println(" ");

        System.out.println("Let's start with inputting the polynomial!");
        System.out.println("First, please provide the lead multiplier(a).");
        int leadMul = Integer.parseInt(reader.nextLine());

        System.out.println("Alrighty, next you can decide your own variable name(x) (please make sure it's one character...)!");
        char var = (char) br.read();

        System.out.println("I'm also going to require a lead exponent(b) from you.");
        int exp = Integer.parseInt(reader.nextLine());

        System.out.println("Let's add a multiplier for the second term(c) as well.");
        int mult2 = Integer.parseInt(reader.nextLine());

        System.out.println("And fiiiinally, let's add a constant(d) to the mess.");
        int cons = Integer.parseInt(reader.nextLine());

        System.out.println("Lovely! Now we have our polynomial :)");

        Polynomial poly = new Polynomial(leadMul, var, exp, mult2, cons);

        System.out.println(poly);

        System.out.println(" ");
        System.out.println("Now, Let's derive it!");
        System.out.println("Ready? Shall we derive? (Yup/Nope)");

        poly.doWeDerive();

        System.out.println("Well you asked for it, so here you go!");
        String derived = poly.derive(poly);
        System.out.println(derived);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("P.S. If you don't believe me, just check it from WolframAlpha... ");
    }

    public void doWeDerive(){

        Scanner reader = new Scanner(System.in);
        String ans = reader.nextLine();
        while (true) {
            if (ans.equals("Yup")) {
                break;
            } else ;
            System.out.println("Ready? (Yup/Nope)");
            ans = reader.nextLine();
        }
    }


    @Override
    public String toString() {
        return "Polynomial function: {" + leadMultiplier +
                 variable +
                "^" + leadExponent +
                "+" + secondMultiplier +
                variable + "+" + constant +
                '}';
    }
}

