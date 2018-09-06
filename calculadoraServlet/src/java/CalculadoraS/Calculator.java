package CalculadoraS;

import   java.io.*;
import   javax.servlet.*;
import   javax.servlet.http.*;
 
public   class   Calculator  extends   HttpServlet
{
public   void   doPost(HttpServletRequest   req,   HttpServletResponse res)
throws   ServletException,   IOException
    {
    double   numA,   numB,   result;
    int   operacion;

    ServletOutputStream   out   =   res.getOutputStream();

    numA   =   Double.parseDouble(req.getParameter("numA"));
    numB   =   Double.parseDouble(req.getParameter("numB"));
    operacion = Integer.parseInt(req.getParameter("operacion"));

    result   =   calcularRes(numA,numB,operacion);

    out.println("<html>");
    out.println("<head><title>.:CalculadoraServlet:.</title></head>");
    out.println("<style>");
    out.println("body {\n" +
"    background-color: beige;\n" +
"}");
    out.println("</style>");
    out.println("<body>");
    out.println("<h1><center> \"El resultado es\"  </center></h1>");
    out.println("<h2>   <b><center>"+  result   +"</center></b></h2>");
    out.println("</body>");
    out.println("</html>");
    out.close();
    }

    public   double   calcularRes(double   numA,   double   numB,   int   operacion)
    {
    double   result   =   0;

        switch   (operacion)
        {
        case   1:
            return   numA   +   numB;
            
        case   2:
            return   numA   -   numB;
            
        case   3:
            return   numA   *   numB;
            
        case   4:
            return   numA   /   numB;
            
        case 5:
            return  Math.acos(numA);
            
        case 6:
            return  Math.cos(numA);
            
        case 7:
            return  Math.asin(numA);
            
        case 8:
            return  Math.sin(numA);
            
        case 9:
            return   Math.log10(numA);
        
        case 10:
            return  Math.abs(numA);
        }

    return   result;
    }
}
 