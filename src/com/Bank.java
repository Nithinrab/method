package com;
    public interface Bank {
        void getbalance();
    }

    class BankA implements Bank{
        public void getbalance() {
            System.out.println("balance: $100 ");
        }
    }
    class BankB implements Bank {
        public void getbalance() {
            System.out.println("balance: $150 ");
        }
    }
    class BankC implements Bank {
        public void getbalance() {
            System.out.println("balance: $200 ");
        }
    }
    class People{
        public static void main(String[] args) {
            BankA bA=new BankA();
            bA.getbalance();

            BankB bB=new BankB();
            bB.getbalance();

            BankC bC=new BankC();
            bC.getbalance();
        }
    }

