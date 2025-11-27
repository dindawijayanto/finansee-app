package com.finansee.controller;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class ArticleController {

    @FXML
    private Text contentArea;

    @FXML
    public void initialize() {
        contentArea.setText(
                "Jakarta, CNBC Indonesia - Investor ritel saham-saham emiten pemilik Bitcoin dilaporkan telah kehilangan sekitar US$17 miliar atau sekitar Rp281,46 triliun.\n\n" +
                        "Perusahaan publik yang dimaksud diantaranya perusahaan investasi asal Jepang Metaplanet hingga perusahaan teknologi asal Amerika Serikat Michael Saylor's Strategy.\n\n" +
                        "Menurut laporan terbaru 10x Research, kerugian tersebut terjadi akibat imbal hasil saham yang sebelumnya membuat valuasi perusahaan jauh di atas nilai kepemilikan Bitcoin mereka, namun kini telah menguap.\n\n" +
                        "Dalam laporan bertajuk 'After the Magic', disebutkan era keajaiban finansial bagi perusahaan penyimpan Bitcoin mulai berakhir."
        );
    }
}