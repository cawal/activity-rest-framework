package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server

import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.nio.file.*
import java.nio.file.attribute.BasicFileAttributes
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream


class ZipDir(sourceDir: Path) : SimpleFileVisitor<Path>() {
    private val sourceDir: Path
    override fun visitFile(
        file: Path,
        attributes: BasicFileAttributes
    ): FileVisitResult {
        try {
            val targetFile: Path = sourceDir.relativize(file)
            zos!!.putNextEntry(ZipEntry(targetFile.toString()))
            val bytes: ByteArray = Files.readAllBytes(file)
            zos!!.write(bytes, 0, bytes.size)
            zos!!.closeEntry()
        } catch (ex: IOException) {
            System.err.println(ex)
        }
        return FileVisitResult.CONTINUE
    }

    companion object {
        private var zos: ZipOutputStream? = null
        @JvmStatic
        fun main(dir : File) : File {
            val dirPath = dir.absolutePath
            val sourceDir: Path = Paths.get(dirPath)
            val zipFileName = "$dirPath.zip"
            try {
                zos = ZipOutputStream(FileOutputStream(zipFileName))
                Files.walkFileTree(sourceDir, ZipDir(sourceDir))
                zos!!.close()
            } catch (ex: IOException) {
                System.err.println("I/O Error: $ex")
            }

            return File(zipFileName)
        }
    }

    init {
        this.sourceDir = sourceDir
    }
}
