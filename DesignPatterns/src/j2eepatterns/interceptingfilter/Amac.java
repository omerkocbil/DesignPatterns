/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2eepatterns.interceptingfilter;

/**
 *
 * @author jan
 */
public class Amac {
    /* Front Controller tasarım şablonunda, kullanıcıdan gelen isteklerin (request)
    merkezi bir yerde toplanarak, işlem yapıldığını daha önce görmüştük. 
    Intercepting Filter tasarım şablonu ile, kullanıcının isteği (request) işleme 
    alınmadan önce filtreler kullanılarak süzgeçten geçirilir. Örneğin bir filtre
    ile kullanıcının işlem öncesi login yaptığını konrol edebiliriz. Filtremiz,
    session (HttpServletSesion) içinde login bilgilerini bulamadığı taktirde, 
    kullanıcıyı login sayfasına yönlendirebilir. */
}
