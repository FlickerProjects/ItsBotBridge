package io.github.itsflicker.itsbotbridge

import com.google.gson.JsonElement
import com.google.gson.JsonParser
import java.io.BufferedReader
import java.io.DataOutputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun post(host: String, port: Int, file: String, data: Map<String, Any>): JsonElement {
    val url = URL("http", host, port, file, null)
    val postData = data.map { "${it.key}=${it.value}" }.joinToString("&")

    val conn = url.openConnection() as HttpURLConnection
    conn.requestMethod = "POST"
    conn.doOutput = true
    conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
    conn.setRequestProperty("Content-Length", postData.length.toString())
    conn.useCaches = false

    DataOutputStream(conn.outputStream).use { it.writeBytes(postData) }
    return BufferedReader(InputStreamReader(conn.inputStream)).use { br ->
        JsonParser().parse(br)
    }
}