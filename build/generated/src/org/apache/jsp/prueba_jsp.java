package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.CandidateDAO;

public final class prueba_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div align=\"center\">CEDULA DE VOTACION</div>\n");
      out.write("        <form action=\"vote.jsp\" id=\"formcss\" method=\"post\">\n");
      out.write("            <table border=\"0\" id=\"table1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th id=\"namecss\">Nombre del Partido</th>\n");
      out.write("                        <th id=\"namecss\">Simbolo</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

    CandidateDAO cdao= new CandidateDAO();
            int i=0;
            while(i<3){
            
    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td id=\"namecss\">");
      out.print(cdao.nmCandidate(i+1));
      out.write("</td>\n");
      out.write("                        <td><img src=\"");
      out.print(cdao.pathIcon(i+1));
      out.write("\" width=\"200\" height=\"200\"></td>\n");
      out.write("                        <td id=\"namecss\"><input type=\"radio\" name=\"candidate\" value=\"1\"/></td>\n");
      out.write("                    </tr>    \n");
      out.write("                    ");

           i=i+1;
            }
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" value=\"Registrar\" id=\"btncss\"/></td>\n");
      out.write("                        <td><input type=\"reset\" value=\"Cancelar\" id=\"btncss\"/></td>          \n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
