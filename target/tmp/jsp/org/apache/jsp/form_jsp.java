package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_theme_label_key_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_theme_label_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_checkbox_type_key_id_data$1toggle_data$1style_data$1on_data$1off_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_theme_maxlength_label_key_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_theme_label_key_id_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_select_theme_list_key_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_textfield_theme_label_key_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_textfield_theme_label_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_checkbox_type_key_id_data$1toggle_data$1style_data$1on_data$1off_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_textfield_theme_maxlength_label_key_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_textfield_theme_label_key_id_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_select_theme_list_key_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_textfield_theme_label_key_cssClass_nobody.release();
    _jspx_tagPool_s_textfield_theme_label_cssClass_nobody.release();
    _jspx_tagPool_s_checkbox_type_key_id_data$1toggle_data$1style_data$1on_data$1off_nobody.release();
    _jspx_tagPool_s_textfield_theme_maxlength_label_key_cssClass_nobody.release();
    _jspx_tagPool_s_textfield_theme_label_key_id_cssClass_nobody.release();
    _jspx_tagPool_s_select_theme_list_key_cssClass_nobody.release();
    _jspx_tagPool_s_property_value_nobody.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!doctype>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; UTF-8\">\n");
      out.write("    <title>CIAT Partners</title>\n");
      out.write("    <style>\n");
      out.write("      .bs-example {\n");
      out.write("      margin-right: 0;\n");
      out.write("      margin-left: 0;\n");
      out.write("      background-color: #fff;\n");
      out.write("      border-color: #ddd;\n");
      out.write("      border-width: 1px;\n");
      out.write("      border-radius: 4px 4px 0 0;\n");
      out.write("      -webkit-box-shadow: none;\n");
      out.write("      box-shadow: none;\n");
      out.write("      padding: 45px 15px 15px;\n");
      out.write("      margin: 0 30px 30px;\n");
      out.write("      }\n");
      out.write("      .toggle.ios, .toggle-on.ios, .toggle-off.ios { border-radius: 20px; }\n");
      out.write("    </style>\n");
      out.write("    <!-- Latest compiled and minified CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("    <!-- Optional theme -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n");
      out.write("    <link href=\"https://gitcdn.github.io/bootstrap-toggle/2.2.2/css/bootstrap-toggle.min.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("          <div class=\"navbar-header\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">CIAT Partners</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("      <div class=\"bs-example\" style=\"margin-top: 68px; border-style: double;\">\n");
      out.write("        <div>\n");
      out.write("          <h3 style=\"text-align: center;\">Request a new Institution or Branch</h3>\n");
      out.write("          <span id=\"nameHelp\" style=\"color:red;text-align: center;\" class=\"help-block\">\n");
      out.write("            ");
      if (_jspx_meth_s_property_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("          </span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row bs-example bs-callout \">\n");
      out.write("          ");
      if (_jspx_meth_s_property_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("          <form action=\"save\" method=\"post\">\n");
      out.write("            <div class=\"col-xs-12 form-group\">\n");
      out.write("              <label style=\"margin-right: 30px;\"> Is this institution a branch? </label>\n");
      out.write("              ");
      if (_jspx_meth_s_checkbox_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"institutuion\" style=\"display: none;\" class=\"col-xs-12 form-group\">\n");
      out.write("              <label>Select Institution Headquarter:</label>\n");
      out.write("              ");
      if (_jspx_meth_s_select_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-6 form-group\">\n");
      out.write("              <label>Acronym:</label> \n");
      out.write("              ");
      if (_jspx_meth_s_textfield_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-xs-6\">\n");
      out.write("              <label>Type:</label>\n");
      out.write("              ");
      if (_jspx_meth_s_select_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-xs-6\">\n");
      out.write("              <label >City:</label>\n");
      out.write("              ");
      if (_jspx_meth_s_textfield_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-xs-6\">\n");
      out.write("              <label >Name:</label>\n");
      out.write("              ");
      if (_jspx_meth_s_textfield_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("              <span id=\"nameHelp\" style=\"display:none\" class=\"help-block\">The name field have max length of 10 words.</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-xs-6\">\n");
      out.write("              <label for=\"userBean_username\">Country:</label>\n");
      out.write("              ");
      if (_jspx_meth_s_select_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-xs-12\">\n");
      out.write("              <label >WebSite:</label>\n");
      out.write("              ");
      if (_jspx_meth_s_textfield_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-xs-12\">\n");
      out.write("              <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.min.js\" integrity=\"sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=\" crossorigin=\"anonymous\"></script>      <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.9.2/jquery-ui.js\" integrity=\"sha256-PsB+5ZEsBlDx9Fi/GXc1bZmC7wEQzZK4bM/VwNm1L6c=\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script>\n");
      out.write("  $( \"#chekcbox-ins\" ).change(function(e) {\n");
      out.write("  \t$( \"#institutuion\" ).toggle( \"fade\" );\n");
      out.write("  });\n");
      out.write("  var nameHelpdisplay = false;\n");
      out.write("  $(\"#name_ins\").keypress(function(e){\n");
      out.write("   event.preventDefault();\n");
      out.write("   var input = $(\"#name_ins\");\n");
      out.write("   var newValue=input.val() + e.key\n");
      out.write("   \n");
      out.write("   if (newValue.split(\" \").length < 10){\n");
      out.write("    input.val(newValue);\n");
      out.write("   }else{\n");
      out.write("    if (!nameHelpdisplay){ \n");
      out.write("    \t$( \"#nameHelp\" ).toggle( \"fadeIn\" );\n");
      out.write("    \tnameHelpdisplay = true\n");
      out.write("    }\n");
      out.write("   }\n");
      out.write("  });\n");
      out.write("</script>");
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

  private boolean _jspx_meth_s_property_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent(null);
    _jspx_th_s_property_0.setValue("message");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_property_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent(null);
    _jspx_th_s_property_1.setValue("name");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_s_checkbox_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:checkbox
    org.apache.struts2.views.jsp.ui.CheckboxTag _jspx_th_s_checkbox_0 = (org.apache.struts2.views.jsp.ui.CheckboxTag) _jspx_tagPool_s_checkbox_type_key_id_data$1toggle_data$1style_data$1on_data$1off_nobody.get(org.apache.struts2.views.jsp.ui.CheckboxTag.class);
    _jspx_th_s_checkbox_0.setPageContext(_jspx_page_context);
    _jspx_th_s_checkbox_0.setParent(null);
    _jspx_th_s_checkbox_0.setId("chekcbox-ins");
    _jspx_th_s_checkbox_0.setKey("partnerModel.branch");
    _jspx_th_s_checkbox_0.setDynamicAttribute(null, "data-on", new String("Yes"));
    _jspx_th_s_checkbox_0.setDynamicAttribute(null, "data-off", new String("No"));
    _jspx_th_s_checkbox_0.setDynamicAttribute(null, "type", new String("checkbox"));
    _jspx_th_s_checkbox_0.setDynamicAttribute(null, "data-style", new String("ios"));
    _jspx_th_s_checkbox_0.setDynamicAttribute(null, "data-toggle", new String("toggle"));
    int _jspx_eval_s_checkbox_0 = _jspx_th_s_checkbox_0.doStartTag();
    if (_jspx_th_s_checkbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_checkbox_type_key_id_data$1toggle_data$1style_data$1on_data$1off_nobody.reuse(_jspx_th_s_checkbox_0);
      return true;
    }
    _jspx_tagPool_s_checkbox_type_key_id_data$1toggle_data$1style_data$1on_data$1off_nobody.reuse(_jspx_th_s_checkbox_0);
    return false;
  }

  private boolean _jspx_meth_s_select_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_select_0 = (org.apache.struts2.views.jsp.ui.SelectTag) _jspx_tagPool_s_select_theme_list_key_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_select_0.setPageContext(_jspx_page_context);
    _jspx_th_s_select_0.setParent(null);
    _jspx_th_s_select_0.setTheme("simple");
    _jspx_th_s_select_0.setKey("partnerModel.parent");
    _jspx_th_s_select_0.setCssClass("form-control");
    _jspx_th_s_select_0.setList("partners");
    int _jspx_eval_s_select_0 = _jspx_th_s_select_0.doStartTag();
    if (_jspx_th_s_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_select_theme_list_key_cssClass_nobody.reuse(_jspx_th_s_select_0);
      return true;
    }
    _jspx_tagPool_s_select_theme_list_key_cssClass_nobody.reuse(_jspx_th_s_select_0);
    return false;
  }

  private boolean _jspx_meth_s_textfield_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_theme_maxlength_label_key_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_0.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_0.setParent(null);
    _jspx_th_s_textfield_0.setTheme("simple");
    _jspx_th_s_textfield_0.setKey("partnerModel.acronym");
    _jspx_th_s_textfield_0.setMaxlength("10");
    _jspx_th_s_textfield_0.setCssClass("form-control");
    _jspx_th_s_textfield_0.setLabel("User Name");
    int _jspx_eval_s_textfield_0 = _jspx_th_s_textfield_0.doStartTag();
    if (_jspx_th_s_textfield_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_theme_maxlength_label_key_cssClass_nobody.reuse(_jspx_th_s_textfield_0);
      return true;
    }
    _jspx_tagPool_s_textfield_theme_maxlength_label_key_cssClass_nobody.reuse(_jspx_th_s_textfield_0);
    return false;
  }

  private boolean _jspx_meth_s_select_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_select_1 = (org.apache.struts2.views.jsp.ui.SelectTag) _jspx_tagPool_s_select_theme_list_key_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_select_1.setPageContext(_jspx_page_context);
    _jspx_th_s_select_1.setParent(null);
    _jspx_th_s_select_1.setTheme("simple");
    _jspx_th_s_select_1.setKey("partnerModel.type");
    _jspx_th_s_select_1.setCssClass("form-control");
    _jspx_th_s_select_1.setList("types");
    int _jspx_eval_s_select_1 = _jspx_th_s_select_1.doStartTag();
    if (_jspx_th_s_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_select_theme_list_key_cssClass_nobody.reuse(_jspx_th_s_select_1);
      return true;
    }
    _jspx_tagPool_s_select_theme_list_key_cssClass_nobody.reuse(_jspx_th_s_select_1);
    return false;
  }

  private boolean _jspx_meth_s_textfield_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_theme_label_key_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_1.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_1.setParent(null);
    _jspx_th_s_textfield_1.setTheme("simple");
    _jspx_th_s_textfield_1.setKey("partnerModel.city");
    _jspx_th_s_textfield_1.setCssClass("form-control");
    _jspx_th_s_textfield_1.setLabel("User Name");
    int _jspx_eval_s_textfield_1 = _jspx_th_s_textfield_1.doStartTag();
    if (_jspx_th_s_textfield_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_theme_label_key_cssClass_nobody.reuse(_jspx_th_s_textfield_1);
      return true;
    }
    _jspx_tagPool_s_textfield_theme_label_key_cssClass_nobody.reuse(_jspx_th_s_textfield_1);
    return false;
  }

  private boolean _jspx_meth_s_textfield_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_2 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_theme_label_key_id_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_2.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_2.setParent(null);
    _jspx_th_s_textfield_2.setTheme("simple");
    _jspx_th_s_textfield_2.setKey("partnerModel.name");
    _jspx_th_s_textfield_2.setId("name_ins");
    _jspx_th_s_textfield_2.setCssClass("form-control");
    _jspx_th_s_textfield_2.setLabel("User Name");
    int _jspx_eval_s_textfield_2 = _jspx_th_s_textfield_2.doStartTag();
    if (_jspx_th_s_textfield_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_theme_label_key_id_cssClass_nobody.reuse(_jspx_th_s_textfield_2);
      return true;
    }
    _jspx_tagPool_s_textfield_theme_label_key_id_cssClass_nobody.reuse(_jspx_th_s_textfield_2);
    return false;
  }

  private boolean _jspx_meth_s_select_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_select_2 = (org.apache.struts2.views.jsp.ui.SelectTag) _jspx_tagPool_s_select_theme_list_key_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_select_2.setPageContext(_jspx_page_context);
    _jspx_th_s_select_2.setParent(null);
    _jspx_th_s_select_2.setTheme("simple");
    _jspx_th_s_select_2.setKey("partnerModel.country");
    _jspx_th_s_select_2.setCssClass("form-control");
    _jspx_th_s_select_2.setList("countries");
    int _jspx_eval_s_select_2 = _jspx_th_s_select_2.doStartTag();
    if (_jspx_th_s_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_select_theme_list_key_cssClass_nobody.reuse(_jspx_th_s_select_2);
      return true;
    }
    _jspx_tagPool_s_select_theme_list_key_cssClass_nobody.reuse(_jspx_th_s_select_2);
    return false;
  }

  private boolean _jspx_meth_s_textfield_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_3 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_theme_label_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_3.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_3.setParent(null);
    _jspx_th_s_textfield_3.setTheme("simple");
    _jspx_th_s_textfield_3.setCssClass("form-control");
    _jspx_th_s_textfield_3.setLabel("User Name");
    int _jspx_eval_s_textfield_3 = _jspx_th_s_textfield_3.doStartTag();
    if (_jspx_th_s_textfield_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_theme_label_cssClass_nobody.reuse(_jspx_th_s_textfield_3);
      return true;
    }
    _jspx_tagPool_s_textfield_theme_label_cssClass_nobody.reuse(_jspx_th_s_textfield_3);
    return false;
  }
}
