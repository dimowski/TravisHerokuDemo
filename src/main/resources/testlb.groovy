import static ch.qos.logback.classic.Level.INFO

scan("30 seconds")
appender("Console-Appender", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%clr(%d{yyyy-MM-dd HH:mm:ss.SSS}){faint} %clr(\${LOG_LEVEL_PATTERN:-%5p}) %clr(\${PID:- }){magenta} " +
                "%clr(---){faint} %clr([%15.15t]){faint} %clr(%-40.40logger{39}){cyan} %clr(:){faint} " +
                "%m%n\${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}"
    }
}
logger("com.example.demo", DEBUG, ["Console-Appender"], false)
root(INFO, ["Console-Appender"])
