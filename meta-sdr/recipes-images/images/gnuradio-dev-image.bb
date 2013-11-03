DESCRIPTION = "A console-only image with a development/debug \
environment suitable for building GNURadio installed."

IMAGE_FEATURES += "splash ssh-server-openssh tools-sdk \
                   tools-debug debug-tweaks \
                   dev-pkgs dbg-pkgs \
                  "

EXTRA_IMAGE_FEATURES += "package-management"

LICENSE = "MIT"

TOOLCHAIN_HOST_TASK_append = " nativesdk-python-cheetah \
    nativesdk-python-netserver nativesdk-python-pprint \
    nativesdk-python-pickle nativesdk-python-shell \
    nativesdk-orc nativesdk-swig nativesdk-python-distutils \
    nativesdk-python-xml"

CORE_IMAGE_EXTRA_INSTALL = "\
    gnuradio \
    alsa-utils \
    i2c-tools \
    screen \
    vim \
    vim-vimrc \
    git \
    swig \
    boost \
    cmake \
    python \
    python-cheetah \
    python-modules \
    python-argparse \
    python-distutils \
    htop \
    sshfs-fuse \
    glib-2.0 \
    orc \
    libudev \
    iperf \
    openssh-sftp \
    openssh-sftp-server \
    "

inherit core-image
