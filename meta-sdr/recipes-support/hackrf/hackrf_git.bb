require hackrf.inc

PV = "v2013.07.1"
PR = "${INC_PR}.0"

SRC_URI = "git://github.com/mossmann/hackrf.git;protocol=https;branch=master"

S = "${WORKDIR}/git/host"

# latest as of oct 11
SRCREV = "0de2298d7702647a03beb12e10ea1694ad3c4d12"
