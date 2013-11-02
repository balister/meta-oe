require bladerf.inc

PV = "null"
PR = "${INC_PR}.0"

SRC_URI = "git://github.com/Nuand/bladeRF.git;protocol=https;branch=master"

S = "${WORKDIR}/git/host"

# latest as of oct 11
SRCREV = "130cbbaebc72bb9180f2d2487add46d9c59d196b"
