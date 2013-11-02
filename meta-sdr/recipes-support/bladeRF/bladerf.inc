DESCRIPTION = "Host utilities and driver for Nuan folks' bladeRF SDR front end"
HOMEPAGE = "http://nuand.com/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://../COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "git-native libusb1 boost python-cheetah-native"
# RDEPENDS_${PN} += "bladeRF-firmware"

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
