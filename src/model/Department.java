package model;

public class Department{

    private Office firstOffice;

    public Department(){


    }

    public Office searchOffice(String code) throws Exception {

        Office o = firstOffice;

        if(o.getNextOffice() == null){
            throw new Exception();
        }else if(o.getCode().equals(code)){

            return o;

        }
        //while ()

        return o;

    }

}