/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Ali Murtaza
 */
public class validators {
    
    public boolean courseCode(String code)
    {
        int size = code.length();
        if (size == 6 || size == 7 ) {
            if (!(code.charAt(0) == 'C' && code.charAt(1) == 'S' && code.charAt(2) == '-')) {
                return false;
            }
            for (int i = 3; i < 6; i++) {
                if (!( code.charAt(i) >= '0' && code.charAt(i) <= '9')) {
                    return false;
                }
            }
            if (size == 7) {
                if (!(code.charAt(6) == 'L')) {
                    return false;
                }
            }
            
        }
        else{
            return false;
        }
        return true;
    }

    public boolean Name(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (!((name.charAt(i) >= 'A' && name.charAt(i) <= 'Z')
                    || (name.charAt(i) >= 'a' && name.charAt(i) <= 'z')
                    || (name.charAt(i) == ' '))) {
                return false;
            }
        }
        return true;

    }

    public boolean email(String email) {
        if (email.length() > 0) {

            if (!((email.charAt(0) >= '0' && email.charAt(0) <= '9')
                    || (email.charAt(0) >= 'a' && email.charAt(0) <= 'z')
                    || (email.charAt(0) >= 'A' && email.charAt(0) <= 'Z'))) {
//            System.out.println("First false");
                return false;
            }
            int rat = 0, dot = 0;
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    rat = i;
//                break;
                }
                if (email.charAt(i) == '.') {
                    dot = i;
                }

            }

            for (int i = 0; i < rat; i++) {
                if (!((email.charAt(i) >= '0' && email.charAt(i) <= '9')
                        || (email.charAt(i) >= 'a' && email.charAt(i) <= 'z')
                        || (email.charAt(i) >= 'A' && email.charAt(i) <= 'Z'))) {
//                System.out.println("Second false");

                    return false;
                }

            }

            for (int i = rat + 1; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
//                System.out.println("Third false");

                    return false;
                }

            }
            if (dot < rat) {
//            System.out.println("Fourth false");

                return false;
            }
            if (!((email.charAt(email.length() - 1) >= 'a' && email.charAt(email.length() - 1) <= 'z')
                    || (email.charAt(email.length() - 1) >= 'A' && email.charAt(email.length() - 1) <= 'Z'))) {
//            System.out.println("Fifth false");

                return false;
            }
        }else
        {
            return false;
        }
        return true;
    }

    public boolean Number(String num) {

        if (!(num.length() == 11)) {
            return false;
        }
        for (int i = 0; i < num.length(); i++) {
            if (!(num.charAt(i) >= '0' && num.charAt(i) <= '9')) {
                return false;
            }

        }
        return true;
    }

}
