package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }

       
        // Test Case 2 ตัวอักษรเล็ทั้งหมดจะ WEAK
        PasswordStrength result2 = PasswordValidator.validate("qwertuyi");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: password is WEAK.");
        } else {
            System.out.println("Test Case 2 FAILED: Expected WEAK but got " + result2);
        }

        // Test Case 3 มีทั้งตัวอักษรใหญ่,เล็ก เเละมีตัวเลขจะ MEDIUM
        PasswordStrength result3 = PasswordValidator.validate("Patchatapon1");
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed: password is MEDIEM.");
        } else {
            System.out.println("Test Case 3 FAILED: Expected MEDIUM but got " + result3);
        }

        // Test Case 4 มีทั้งหมด 4 กรณีจะเป็น STRONG
        PasswordStrength result4 = PasswordValidator.validate("QWwertyu123-");
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed: password is STRONG.");
        } else {
            System.out.println("Test Case 4 FAILED: Expected STRONG but got " + result4);
        }


        System.out.println("--------------------------------");
    }
}
