/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2eepatterns.frontcontroller;

/*
 * FrontController tasarim şablonu örnegi.
 * Http üzerinden gelen tüm request'ler
 * su sinif tarafindan islem görür.
 *
 * Controller sinifi gerekli command nesnesi bularak
 * islemi bu nesneye devreder ve netice göre gerekli
 * jsp sayfasina yönlendirme yapar.
 *
 * @author jan
 *
 */

/*

public class FrontController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    
    // FrontController sinifina gelen tüm request'ler bu metod tarafindan işlem
    // görür.
    
    public void handle(HttpServletRequest request, HttpServletResponse response) {
        Logger.instance(this).debug("handle()");
        String nextPage = "";
        try {
            RequestHelper helper = new HotelRequestHelper(request, response);
            Command command = helper.getCommand();
            nextPage = command.execute(helper);
            dispatch(request, response, nextPage);
        } // CommandException ve IOExcepton olusabilir.
        // Bu durumda error.jsp sayfasina yönlendiriyoruz.
        catch (Exception e) {
            e.printStackTrace();
            try {
                dispatch(request, response, "/error.jsp");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

    
    // Jsp sayfalari arasinda yönlendirme yapmak için kullanılır.
    
    private void dispatch(HttpServletRequest request, HttpServletResponse response, String page) throws ServletException, IOException {
        Logger.instance(this).debug("dispatch()");
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }

    
    // FrontController bir servlet sinifi oldugu için GET metodu ile gelen tüm
    // request'ler bu metod tarafindan islem görür.
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Logger.instance(this).debug("doGet()");
        handle(request, response);
    }

    
    // FrontController bir servlet sinifi oldugu için POST metodu ile gelen tüm
    // request'ler bu metod tarafindan islem görür.
     
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        Logger.instance(this).debug("doPost()");
        handle(request, response);
    }
}

*/