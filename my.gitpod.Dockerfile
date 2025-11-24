FROM gitpod/workspace-java-17

# Install GUI dependencies for JavaFX
USER root
RUN apt-get update && \
    apt-get install -y libxrender1 libxtst6 libxi6 libgtk-3-0 libasound2 && \
    apt-get clean

USER gitpod
