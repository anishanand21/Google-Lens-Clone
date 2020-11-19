package com.android.googlelensclone.imageLabeler

import androidx.camera.core.ImageAnalysis
import androidx.core.content.ContextCompat
import com.android.googlelensclone.BaseLensActivity

class ImageLabelingActivity: BaseLensActivity() {
    override val imageAnalyzer = ImageLabelAnalyzer()

    override fun startScanner() {
        startImageLabeling()
    }

    private fun startImageLabeling() {
        imageAnalysis.setAnalyzer(
            ContextCompat.getMainExecutor(this),
            imageAnalyzer
        )
    }
}