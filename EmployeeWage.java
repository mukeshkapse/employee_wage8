package com.bridgelabz.com;

public class EmployeeWage {
    public static  void main(String[] args)
    {
        final int isFullTime = 1;
        final int isEmpRatPerHr = 20;
        final int isPartTime = 2;

        System.out.println("Welcome to Employee wage");

        int EmpHrs=0;
        int EmpWage=0;

        double EmpCheck = Math.floor(Math.random()*10)%3;
        switch ((int)EmpCheck){

            case isFullTime:
                EmpHrs=8;
                System.out.println("Employee is full time");
                break;

            case isPartTime:
                EmpHrs=4;
                System.out.println("Employee is part time");
                break;
            default:
                EmpHrs=0;
                System.out.println("Employee is absent");
        }
        EmpWage = EmpHrs*isEmpRatPerHr;
        System.out.println("Emp Wage"+ EmpWage);
    }
    }
