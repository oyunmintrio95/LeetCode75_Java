package day2L2;

public class MultiplyString {
    public String multiply(String num1, String num2) {
        // int n1 = num1.length(), n2 = num2.length();
        // int[] products = new int[n1+n2];

        // for(int i = n1-1; i>=0; i--){
        //     for (int j= n2-1; j>=0; j--){
        //         int d1 = num1.charAt(i) - '0';
        //         int d2 = num2.charAt(j) - '0';
        //         products[i + j + 1] += d1 * d2;
        //     }
        // }
        // int carry = 0;
        // for(int i = products.length -1; i>=0; i--){
        //     int tmp = (products[i] + carry) % 10;
        //     carry = (products[i] + carry) / 10;
        //     products[i] = tmp;
        // }

        // StringBuilder sb = new StringBuilder();
        // for(int num : products) sb.append(num);
        // while(sb.length != 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        // return sb.length() == 0 ? "0" : sb.toString();

        // Check for valid input
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Input numbers are invalid");
        }

        int m = num1.length();
        int n = num2.length();

        // Base Conditions
        if (m == 0 || n == 0 || "0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        if ("1".equals(num1)) {
            return num2;
        }
        if ("1".equals(num2)) {
            return num1;
        }

        // Result can be maximum of length M + N.
        // For example 99 * 99 = 9801 (Result is of length 4)
        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                // Adding previous values in result array into this product.
                product += result[i + j + 1];

                // Adding the new product into the result array
                result[i + j + 1] = product % 10;
                result[i + j] += product / 10;
            }
        }

        // Generating the result String
        StringBuilder sb = new StringBuilder();
        for (int r : result) {
            // Ignoring leading zeros
            if (sb.length() == 0 && r == 0) {
                continue;
            }
            sb.append(r);
        }

        return sb.toString();
    }

}
