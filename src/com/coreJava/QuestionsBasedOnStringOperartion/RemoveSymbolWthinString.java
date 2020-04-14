package com.coreJava.QuestionsBasedOnStringOperartion;

/*
 * problem :
 * I have string raj@Wagh$nal&wandi# ;
 * Remove all symbol within string and string output is rajwaghnalwandi
 * */

public class RemoveSymbolWthinString {

	public static void main(String[] args) {

		String str = "raj@Wagh$nal&wandi#";
		String NewString="";
		for(int i =0 ; i <= str.length()-1 ; i++)
		{
			char ch=str.charAt(i);
			if(ch == '@' || ch=='$' ||ch=='&' || ch=='#')
			{
				System.out.println("This Symbole is removed from string =" + ch);
			}else
			{

				NewString=NewString+ch;
			}

		}
		System.out.println("Output String is = "+NewString);

	}

}
/*
 * This Symbole is removed from string =@
This Symbole is removed from string =$
This Symbole is removed from string =&
This Symbole is removed from string =#
Output String is = rajWaghnalwandi
 * */
