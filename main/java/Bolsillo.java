import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bolsillo.*;

public class Bolsillo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String accion=req.getParameter("accion");
        System.out.println(accion);

        switch(accion){

            case "index":
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            break;

            case "ConsultarD":
            req.getRequestDispatcher("ConsultarD.jsp").forward(req, resp);
            break;

            case "ConsultarN":
            req.getRequestDispatcher("ConsultarN.jsp").forward(req, resp);
            break;

            case "DashboardD":
            req.getRequestDispatcher("DashboardD.jsp").forward(req, resp);
            break;

            case "DashboardN":
            req.getRequestDispatcher("DashboardN.jsp").forward(req, resp);
            break;

            case "Daviplata":
            req.getRequestDispatcher("Daviplata.jsp").forward(req, resp);
            break;

            case "Nequi":
            req.getRequestDispatcher("Nequi.jsp").forward(req, resp);
            break;

            case "RecargarD":
            req.getRequestDispatcher("RecargarD.jsp").forward(req, resp);
            break;

            case "RecargarN":
            req.getRequestDispatcher("RecargarN.jsp").forward(req, resp);
            break;

            case "Registrarse":
            req.getRequestDispatcher("Registrarse.jsp").forward(req, resp);
            break;

            case "RetirarD":
            req.getRequestDispatcher("RetirarD.jsp").forward(req, resp);
            break;

            case "RetirarN":
            req.getRequestDispatcher("RetirarN.jsp").forward(req, resp);
            break;
        
        }
    

}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String accion=req.getParameter("accion");
        System.out.println(accion);

        switch (accion) {
            case "RecargarD":
                    double RecargarD = Double.parseDouble(req.getParameter("RecargarD"));
                    Daviplata davirecarga = new Daviplata(RecargarD);
                    req.setAttribute("SaldoAnterior", davirecarga.getSaldo());
                    davirecarga.recarga(RecargarD);
                    req.setAttribute("Saldo", davirecarga.getSaldo());
                    req.getRequestDispatcher("Retiroresultadodaviplata.jsp").forward(req, resp);
                break;

        
            case "RecargaN":
                double RecargarN = Double.parseDouble(req.getParameter("RecargarN"));
                Nequi nequiRecarga = new Nequi(RecargarN);
                req.setAttribute("SaldoAnterior", nequiRecarga.getSaldo());
                nequiRecarga.recarga(RecargarN);
                req.setAttribute("Saldo", nequiRecarga.getSaldo());
                System.out.println(nequiRecarga.getSaldo());
                req.getRequestDispatcher("Retiroresultadonequi.jsp").forward(req, resp);
                break;
        

            case "ConsultarN":
                Nequi nequiConsultar = new Nequi();
                req.setAttribute("Saldo", nequiConsultar.getSaldo());
                System.out.println(nequiConsultar.getSaldo());
                req.getRequestDispatcher("Consultarresultadonequi.jsp").forward(req, resp);
                break;

        
            case "ConsultarD":
                Daviplata daviConsultarD = new Daviplata();
                daviConsultarD.getSaldo();
                req.setAttribute("Saldo", daviConsultarD.getSaldo());
                System.out.println(daviConsultarD.getSaldo());
                req.getRequestDispatcher("Consultarresultadodavi.jsp").forward(req, resp);
            break;

            case "RetirarD":
                double RetirarD = Double.parseDouble(req.getParameter("RetirarD"));
                Daviplata RetiroD = new Daviplata(RetirarD);
                req.setAttribute("SaldoAnterior", RetiroD.getSaldo());
                RetiroD.recarga(RetirarD);
                req.setAttribute("Saldo",RetiroD.getSaldo());
                System.out.println(RetiroD .getSaldo());
                req.getRequestDispatcher("Rresultadodaviplata.jsp").forward(req, resp);
                break;

            case "RetirarN":
            double RetirarN = Double.parseDouble(req.getParameter("RetirarN"));
            Nequi nequiRetiroN = new Nequi(RetirarN);
            req.setAttribute("SaldoAnterior", nequiRetiroN.getSaldo());
            nequiRetiroN.recarga(RetirarN);
            req.setAttribute("Saldo", nequiRetiroN.getSaldo());
            System.out.println(nequiRetiroN.getSaldo());
            req.getRequestDispatcher("Rresultadonequi.jsp").forward(req, resp);
            break;

            case "validarSesionNequi":
            Usuario validarUsuNequi = new Usuario();
            String Celular = req.getParameter("Celular");
            String ContraseñaN= req.getParameter("ContraseñaN");
            boolean Sesion= validarUsuNequi.ValidarUsuNequi( Celular, ContraseñaN);
            if(Sesion==true)
            {
                req.getRequestDispatcher("DashboardD.jsp");
            }
            else{
                System.out.println("error");
            }

            break;

            case "validarSesionDavi":
            Usuario validarUsuDaviplata = new Usuario();
            String Documento = req.getParameter("Documento");
            String ContraseñaD = req.getParameter("ContraseñaD");
            boolean SesionDavi= validarUsuDaviplata.ValidarUsuarioDaviplata(Documento, ContraseñaD);
            if(SesionDavi==true)
            {
                req.getRequestDispatcher("DashboardD.jsp");
            }
            else{
                System.out.println("error");
            }

            break;
        }
    }
}

