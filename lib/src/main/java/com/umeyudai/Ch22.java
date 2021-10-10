package com.umeyudai;


public class Ch22 {
    public static void main(String args[]) {
		String pw = Input.getString("パスワード");
		boolean match = pw.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s+).{4,8}$");
		if(!match) {
			System.out.println("パスワードの要件を満たしていない");
		}else {
			System.out.println("OK");
		}
	} 
}
