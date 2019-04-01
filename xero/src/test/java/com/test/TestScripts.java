package com.test;

import Pages.SignUpPage;
import Pages.AccountsPage;
import Pages.CreateAccountPage;
import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.MyXeroPage;
import Pages.NavigationPage;
import Pages.ProfilePage;

public class TestScripts extends Reuse
{
public static void main(String[] args) throws Exception 
{	LoginPage a=new LoginPage();
	a.Tc1A();
	a.Tc1B();
	a.Tc1C();
	a.Tc1D();
	SignUpPage b=new SignUpPage();
	b.Tc2A();
	b.Tc2B();
	b.Tc2C();
	b.Tc2D();
	b.Tc2E();
	NavigationPage c=new NavigationPage();
	c.Tc3();
	LogoutPage d=new LogoutPage();
	d.Tc4();
	CreateAccountPage e=new CreateAccountPage();
	e.Tc5();
	ProfilePage f=new ProfilePage();
	f.Tc6();
	MyXeroPage g=new MyXeroPage();
	g.Tc8A();
	g.Tc8B();
	AccountsPage h=new AccountsPage();
	h.Tc10();
	
}
}
