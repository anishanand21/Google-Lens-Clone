package com.android.googlelensclone.barcode

import androidx.core.content.ContextCompat
import com.android.googlelensclone.BaseLensActivity

class BarcodeActivity : BaseLensActivity() {
    companion object {
        @JvmStatic
        val CAMERA_PERM_CODE = 422
    }

    override val imageAnalyzer = BarcodeAnalyzer()

    override fun startScanner() {
        scanBarcode()
    }

    private fun scanBarcode() {

        imageAnalysis.setAnalyzer(
            ContextCompat.getMainExecutor(this),
            imageAnalyzer
        )

    }
}