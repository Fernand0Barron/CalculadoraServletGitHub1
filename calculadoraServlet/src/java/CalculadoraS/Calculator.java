package CalculadoraS;

import   java.io.*;
import   javax.servlet.*;
import   javax.servlet.http.*;
 
public   class   Calculator  extends   HttpServlet
{
public   void   doPost(HttpServletRequest   req,   HttpServletResponse res)
throws   ServletException,   IOException
    {
    double   num1,   num2,   result;
    int   operacion;

    ServletOutputStream   out   =   res.getOutputStream();

    num1   =   Double.parseDouble(req.getParameter("num1"));
    num2   =   Double.parseDouble(req.getParameter("num2"));
    operacion = Integer.parseInt(req.getParameter("operacion"));

    result   =   calcularRes(num1,num2,operacion);

    out.println("<html>");
    out.println("<head><title>.:CalculadoraServlet:.</title></head>");
    out.println("<body>");
    out.println("<h1><center>El resultado es</center></h1>");
    out.println("<h2>   <b><center>"+  result   +"</center></b></h2>");
    out.println("</body>");
    out.println("</html>");
    out.close();
    }

    public   double   calcularRes(double   num1,   double   num2,   int   operacion)
    {
    double   result   =   0;

        switch   (operacion)
        {
        case   1:
            return   num1   +   num2;
            
        case   2:
            return   num1   -   num2;
            
        case   3:
            return   num1   *   num2;
            
        case   4:
            return   num1   /   num2;
            
        case 5:
            return  Math.acos(num1);
            
        case 6:
            return  Math.cos(num1);
            
        case 7:
            return  Math.asin(num1);
            
        case 8:
            return  Math.sin(num1);
            
        case 9:
            return   Math.log10(num1);
        
        case 10:
            return  Math.abs(num1);
        }

    return   result;
    }
}
 