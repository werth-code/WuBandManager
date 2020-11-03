package com.codedifferently;


public class BandManager {
    private final WuMember[] wuMemberArray;

    public BandManager(WuMember[] wuMemberArray) {
        this.wuMemberArray = wuMemberArray;
    }

    public String whileLoop() {
        String result = "";
        Integer count = 0;

        while(count < wuMemberArray.length) {
            result += String.format("\nMy first name is " + wuMemberArray[count].getFirstName()) +
                    ("\nMy last name is " + wuMemberArray[count].getLastName()) +
                    ("\nMy stage name is " + wuMemberArray[count].getStageName());
            count += 1;
        }
        return result;
    }



    public String forLoop() {
        String result = "";
        for(int i = 0; i < wuMemberArray.length; i++) {
            result += String.format("\nMy first name is " + wuMemberArray[i].getFirstName()) +
                    ("\nMy last name is " + wuMemberArray[i].getLastName()) +
                    ("\nMy stage name is " + wuMemberArray[i].getStageName());
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        //wuMemberArray.forEach(ele ->);

        return result;
    }


    public WuMember[] getwuMemberArray() {
        return wuMemberArray;
    }
}
