
rootProject.name = "hexagon"

include(
    // Infrastructure
    "site",
    "starters",

    // Internal modules
    "core",
    "http",

    // Ports
    "http_client",
    "http_server",
    "serialization",
    "templates",

    // Adapters
    "logging_logback",
    "logging_slf4j_jul",
    "serialization_jackson",
    "serialization_jackson_json",
    "serialization_jackson_csv",
    "serialization_jackson_yaml",
    "serialization_jackson_xml",
    "http_client_jetty",
    "http_server_servlet",
    "http_server_jetty",
    "http_server_netty",
    "templates_pebble",
    "templates_freemarker",

    // Testing
    "http_test",
    "serialization_test",
)
