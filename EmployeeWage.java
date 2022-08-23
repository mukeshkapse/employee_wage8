package com.bridgelabz.com;

public class EmployeeWage {
    public static  void main(String[] args)
    {
        int isFullTime=1;
        int EmpHrs=0;
        int EmpWage=0;
        int EmpRatePerHr=20;

        double EmpCheck = Math.floor(Math.random()*10)%2;
        if (EmpCheck==isFullTime);
        {
            EmpHrs=8;
        }
        EmpWage = EmpHrs * EmpRatePerHr;
        System.out.println(" EmpWage "+EmpWage);

    }}
