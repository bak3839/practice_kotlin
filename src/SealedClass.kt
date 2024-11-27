sealed class Error

class FileError(val fileName: String) : Error()

class DatabaseError(val dbmsType: DbmsType) : Error()

class RedisError(val host: String):Error()

enum class DbmsType {
    MYSQL, MARIA
}

fun getErrorMessage(error: Error) = when (error) {
    is FileError -> "Error is occurred at : ${error.fileName}"
    is DatabaseError -> "Error on DBMS : ${error.dbmsType}"
    //else -> throw IllegalArgumentException("unknown type")
    is RedisError -> "Error on host : ${error.host}"
}
