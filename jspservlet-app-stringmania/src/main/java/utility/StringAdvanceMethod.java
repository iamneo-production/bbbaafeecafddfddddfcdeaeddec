package utility;

public class StringAdvanceMethod {
    private String input1;
    private String input2;

    public String getInput1() {
        return input1;
    }

    public void setInput1(String input1) {
        this.input1 = input1;
    }

    public String getInput2() {
        return input2;
    }

    public void setInput2(String input2) {
        this.input2 = input2;
    }

    public String concat(String one, String two) {
        if (one == null) {
            one = "";
        }
        if (two == null) {
            two = "";
        }
        return one.concat(two);
    }

    public String split(String one, String two) {
        String[] parts = one.split(two);
        String result = String.join("  ", parts);
    return result;
    }
    
    

    public String indexOf(String one, String two) {
        if (one == null || two == null) {
            return "-1";
        }
        return Integer.toString(one.indexOf(two));
    }

    public String trim(String str) {
        if (str == null) {
            return "";
        }
        return str.trim();
    }
}