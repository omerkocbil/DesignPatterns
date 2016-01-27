/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2eepatterns.interceptingfilter;

/*
 * Login yapmis üye bilgilerini session içinde kontrol eder. Login yapmamis
 * bir kullaniciyi login.jsp sayfasina yönlendirir.
 *
 * @author jan
 *     
 */

/*
public final class AuthenticationFilter implements Filter {

    // Bir kullanici login yaptiktan sonra, session içine USER etiketi altinda
    // login ismi yerlestirilir.
    
    // Eger session içinde USER isminde bir etiket yoksa, o zaman kullanici
    // login yapmamis demektir.
    private static final String USER = "user";

    // FilterManager (Tomcat) doFilter() metodunu kullanarak, filtreyi işleme
    // alir.
    public void doFilter(final ServletRequest req, final ServletResponse res, final FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        HttpSession session = request.getSession();

        if (session.getAttribute(USER) != null) {
            // Kontrolü bir sonraki filtreye vermek için chain.doFilter() metodu
            // kullanılır.
            chain.doFilter(req, res);
        } else {
            response.sendRedirect("login.jsp");
        }
    }
    
    // Filter init()
    public void init(final FilterConfig arg0)
            throws ServletException {
    }

    // Filter destroy()
    public void destroy() {
    }
}
*/