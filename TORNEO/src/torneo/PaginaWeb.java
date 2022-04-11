package torneo;

public class PaginaWeb {

    public static void abrirPagina(String nombre) {  
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri = new java.net.URI("http://torneo.local/"+nombre);
                    desktop.browse(uri);
                } catch (Exception e) {}
            }
        }
    }
    
}
