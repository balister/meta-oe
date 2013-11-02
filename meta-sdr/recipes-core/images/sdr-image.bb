DESCRIPTION = "An image with a bunch of SDR stuff on it"
LICENSE = "GPLv3"

require recipes-core/images/core-image-minimal.bb
IMAGE_INSTALL += " gnuradio hackrf bladerf"
