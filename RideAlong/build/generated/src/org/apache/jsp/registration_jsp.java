package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ride Along - Registration</title>\n");
      out.write("        <style>\n");
      out.write("            @import url(http://fonts.googleapis.com/css?family=Vibur);\n");
      out.write("        div.main {\n");
      out.write("         border: 1px solid black;\n");
      out.write("         margin-left: 100px;\n");
      out.write("         margin-right: 100px;\n");
      out.write("        \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("            \n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  -moz-box-sizing: border-box;\n");
      out.write("  -webkit-box-sizing: border-box;\n");
      out.write("  font-family: arial;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  background-image: url(\"http://www.coolwallpapers.org/photo/43651/2-road-hd-wallpaper.jpg\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("  color: #ccc;\n");
      out.write("  text-align: center;\n");
      out.write("  font-family: 'Vibur', cursive;\n");
      out.write("  font-size: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-horizontal {\n");
      out.write("  width: 350px;\n");
      out.write("  padding: 40px 30px;\n");
      out.write("  background: #eee;\n");
      out.write("  -moz-border-radius: 4px;\n");
      out.write("  -webkit-border-radius: 4px;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  margin: auto;\n");
      out.write("  position: absolute;\n");
      out.write("  left: 0;\n");
      out.write("  right: 0;\n");
      out.write("  top: 50%;\n");
      out.write("  -moz-transform: translateY(-50%);\n");
      out.write("  -ms-transform: translateY(-50%);\n");
      out.write("  -webkit-transform: translateY(-50%);\n");
      out.write("  transform: translateY(-50%);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group {\n");
      out.write("  position: relative;\n");
      out.write("  margin-bottom: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-control {\n");
      out.write("  width: 100%;\n");
      out.write("  height: 50px;\n");
      out.write("  border: none;\n");
      out.write("  padding: 5px 7px 5px 15px;\n");
      out.write("  background: #fff;\n");
      out.write("  color: #666;\n");
      out.write("  border: 2px solid #ddd;\n");
      out.write("  -moz-border-radius: 4px;\n");
      out.write("  -webkit-border-radius: 4px;\n");
      out.write("  border-radius: 4px;\n");
      out.write("}\n");
      out.write(".form-control:focus, .form-control:focus + .fa {\n");
      out.write("  border-color: #10CE88;\n");
      out.write("  color: #10CE88;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group .fa {\n");
      out.write("  position: absolute;\n");
      out.write("  right: 15px;\n");
      out.write("  top: 17px;\n");
      out.write("  color: #999;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".log-status.wrong-entry {\n");
      out.write("  -moz-animation: wrong-log 0.3s;\n");
      out.write("  -webkit-animation: wrong-log 0.3s;\n");
      out.write("  animation: wrong-log 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".log-status.wrong-entry .form-control, .wrong-entry .form-control + .fa {\n");
      out.write("  border-color: #ed1c24;\n");
      out.write("  color: #ed1c24;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".reg-btn {\n");
      out.write("  background: #0AC986;\n");
      out.write("  dispaly: inline-block;\n");
      out.write("  width: 100%;\n");
      out.write("  font-size: 16px;\n");
      out.write("  height: 50px;\n");
      out.write("  color: #fff;\n");
      out.write("  text-decoration: none;\n");
      out.write("  border: none;\n");
      out.write("  -moz-border-radius: 4px;\n");
      out.write("  -webkit-border-radius: 4px;\n");
      out.write("  border-radius: 4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".link {\n");
      out.write("  text-decoration: none;\n");
      out.write("  color: #C6C6C6;\n");
      out.write("  float: right;\n");
      out.write("  font-size: 12px;\n");
      out.write("  margin-bottom: 15px;\n");
      out.write("}\n");
      out.write(".link:hover {\n");
      out.write("  text-decoration: underline;\n");
      out.write("  color: #8C918F;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".alert {\n");
      out.write("  display: none;\n");
      out.write("  font-size: 12px;\n");
      out.write("  color: #f00;\n");
      out.write("  float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-moz-keyframes wrong-log {\n");
      out.write("  0%, 100% {\n");
      out.write("    left: 0px;\n");
      out.write("  }\n");
      out.write("  20% , 60% {\n");
      out.write("    left: 15px;\n");
      out.write("  }\n");
      out.write("  40% , 80% {\n");
      out.write("    left: -15px;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("@-webkit-keyframes wrong-log {\n");
      out.write("  0%, 100% {\n");
      out.write("    left: 0px;\n");
      out.write("  }\n");
      out.write("  20% , 60% {\n");
      out.write("    left: 15px;\n");
      out.write("  }\n");
      out.write("  40% , 80% {\n");
      out.write("    left: -15px;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("@keyframes wrong-log {\n");
      out.write("  0%, 100% {\n");
      out.write("    left: 0px;\n");
      out.write("  }\n");
      out.write("  20% , 60% {\n");
      out.write("    left: 15px;\n");
      out.write("  }\n");
      out.write("  40% , 80% {\n");
      out.write("    left: -15px;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("  <script>\n");
      out.write("        var mod = angular.module(\"app\", []);\n");
      out.write("\tmod.controller(\"reg\", function($scope,$http)\n");
      out.write("\t{\n");
      out.write("\t\t$scope.addUser = function(){\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t//\t\t\n");
      out.write("\t\tvar dataObj = \n");
      out.write("                { \n");
      out.write("                    id_no: $scope.id_no,\n");
      out.write("                    fname : $scope.fname,\n");
      out.write("                    sname : $scope.sname,\n");
      out.write("                    email: $scope.email,\n");
      out.write("                    password : $scope.password,\n");
      out.write("                    username : $scope.username,\n");
      out.write("                    cell_no :\"0767646593\",\n");
      out.write("                    gender : \"Male\",\n");
      out.write("                    bio : \"Hello world\",\n");
      out.write("                    photo: \"photo\",\n");
      out.write("                    verified:\"Yes\"\n");
      out.write("                                \n");
      out.write("\t\t};\t\n");
      out.write("                var parameter = JSON.stringify(dataObj);\n");
      out.write("                var res = $http.post(\"./service/RegUser\", parameter);\n");
      out.write("             res.success(function() {\n");
      out.write("\t\t\t\n");
      out.write("                        alert( \"found\" );\n");
      out.write("\t\t});\n");
      out.write("\t\tres.error(function() {\n");
      out.write("\t\t\talert( \"failure message: error\" );\n");
      out.write("\t\t});\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("\t}\n");
      out.write("\t\t\n");
      out.write("\t \n");
      out.write("\t});\n");
      out.write("              \n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body ng-app=\"app\" ng-controller=\"reg\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"page-header\">\n");
      out.write("                <h1>Registration</h1>  \n");
      out.write("                <h4>Already a Member? Login Here</h4>\n");
      out.write("                <button type=\"button\"class=\"btn btn-primary\">Login</button>\n");
      out.write("            </div>\n");
      out.write("      \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    <div class=\"main\">\n");
      out.write("    <form class=\"form-horizontal\" name=\"regForm\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <h2>Not a Member Yet? Sign Up Below!</h2>\n");
      out.write("       \n");
      out.write("        First Name: <input type=\"text\" placeholder=\"First Name\" name=\"fname\" ng-model=\"fname\" id=\"fname\"class=\"form-control\"><br/>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        Surname: <input type=\"text\" placeholder=\"Surname\" name=\"sname\" ng-model=\"sname\" id=\"sname\" class=\"form-control\"><br/>\n");
      out.write("     \n");
      out.write("        Username: <input type=\"text\" placeholder=\"Username\" name=\"username\" ng-model=\"username\" id=\"username\" class=\"form-control\"><br/>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("        Email: <input type=\"email\" placeholder=\"Email\" name=\"email\" ng-model=\"email\" id=\"email\" class=\"form-control\"><br/>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        Password: <input type=\"password\" placeholder=\"Password\" name=\"password\" ng-model=\"password\" id=\"password\" class=\"form-control\"><br/>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        Identity Number <input type=\"text\" placeholder=\"Identity Number\" name=\"id_no\" ng-model=\"id_no\" id=\"id_no\" class=\"form-control\"><br/>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\" value=\"Sign Me UP!\" ng-click=\"addUser()\" class=\"reg-btn\">Sign Me Up!</button>\n");
      out.write("      \n");
      out.write("             \n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("        <p>{{items}}</p>\n");
      out.write("        \n");
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
