package com.learning.core.day7;

import java.util.Scanner;
import java.util.Stack;

public class D07P04 
{
	 public static int evaluateExpression(String expression) 
	 {
	        Stack<Integer> numbers = new Stack<>();
	        Stack<Character> operators = new Stack<>();
	        
	        for (int i = 0; i < expression.length(); i++) 
	        {
	            char currentChar = expression.charAt(i);
	            if (Character.isDigit(currentChar)) 
	            {
	                StringBuilder operand = new StringBuilder();
	                while (i < expression.length() && Character.isDigit(expression.charAt(i))) 
	                {
	                    operand.append(expression.charAt(i++));
	                }
	                i--; 
	                numbers.push(Integer.parseInt(operand.toString()));
	            } 
	            else if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/') 
	            {
	                while (!operators.empty() && precedence(operators.peek()) >= precedence(currentChar)) 
	                {
	                    int b = numbers.pop();
	                    int a = numbers.pop();
	                    char operator = operators.pop();
	                    numbers.push(applyOperation(a, b, operator));
	                }
	                operators.push(currentChar);
	            }
	        }
	        
	        while (!operators.empty()) 
	        {
	            int b = numbers.pop();
	            int a = numbers.pop();
	            char operator = operators.pop();
	            numbers.push(applyOperation(a, b, operator));
	        }
	        
	        return numbers.pop();
	    }
	    
	    public static int precedence(char operator) 
	    {
	        switch (operator) 
	        {
	            case '+':
	            case '-':
	                return 1;
	            case '*':
	            case '/':
	                return 2;
	        }
	        return -1;
	    }
	    
	    public static int applyOperation(int a, int b, char operator) 
	    {
	        switch (operator) {
	            case '+':
	                return a + b;
	            case '-':
	                return a - b;
	            case '*':
	                return a * b;
	            case '/':
	                if (b == 0) throw new UnsupportedOperationException("Cannot divide by zero");
	                return a / b;
	        }
	        return 0;
	    }
	    
	    public static void main(String[] args) 
	    {
	        String expression = "10+2*6";
	        int result = evaluateExpression(expression);
	        System.out.println(result);
	    }
}
