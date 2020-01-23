# config-server-experiment

Experiments with Spring config server.

The config-server is the basic configuration for a Spring config server.
It is configured to read from the git repo: https://github.com/dzou/dummy-config

The config-user is the Spring application which consumes the configuration from config-server.
It will display a message at the endpoint: http://localhost:8080 based on the contents of the config file in the `dummy-config` repo.
