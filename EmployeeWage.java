package com.bridgelabz.com;

public class EmployeeWage {
    public static  void main(String[] args)
    {
        System.out.println("Welcome to Employee wage");

        double Empcheck= Math.floor(Math.random() *10)%2;

        if(Empcheck==1)
        {
            System.out.println("Employee is Present");

        }
        else
        {
            System.out.println("Employee is Absent");
        }

    }}
