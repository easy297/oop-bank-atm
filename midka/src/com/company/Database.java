package com.company;

    public class Database {
        public static BankAccount allAccounts[] = new BankAccount[10]; static{
        allAccounts[0] = new CityBankAccount("Bill","Gates",20000, "KZ010322312", "0102");
        allAccounts[1] = new CityBankAccount("Steve","Jobs",10000, "KZ010322313","0101");
        allAccounts[2] = new NationalBankAccount("Arman Armanov",200, "KZ0101112", "0103");

        }

        public static int getAccountNum(String str, String pin) {
            int num = 0;
            for (int i = 0; i < allAccounts.length; i++) {
                if (str.equals(allAccounts[i].getAccountNumber()) && pin.equals(allAccounts[i].getPinCode())) {
                    num = 1;
                }
                break;
            }
            return num;
        }

    }


