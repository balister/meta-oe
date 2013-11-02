DESCRIPTION = "Host utilities and driver for Great Scot Gadgets Hack RF Jawbreaker"
HOMEPAGE = "http://greatscottgadgets.com/hackrf/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://../COPYING;md5=1484b9683e3fc1dd9f5cf802a23fe67c"

DEPENDS = "git-native gnuradio boost "
# RDEPENDS_${PN} += "hackrf-firmware"

PR = "0"
INC_PR = "r0"

inherit cmake pythonnative

FILES_${PN} += "${libdir}/* \
                ${datadir/* \
                ${bindirs}/* \
                "

OECMAKE_BUILDPATH = "${S}/build"
OECMAKE_SOURCEPATH = "${S}"

EXTRA_OEMAKE = "-C ${OECMAKE_BUILDPATH}"
