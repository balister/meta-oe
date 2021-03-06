DESCRIPTION = "Interface definitions for Zope products"
SECTION = "console/network"

LICENSE = "ZPL-2.1"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e54fd776274c1b7423ec128974bd9d46"

SRC_URI = "http://pypi.python.org/packages/source/z/zope.interface/zope.interface-${PV}.tar.gz"
SRC_URI[md5sum] = "685fc532550abb07cca6190c9cd2b901"
SRC_URI[sha256sum] = "b81d898532c47f73475c2d0c23580e289eed25923d007eca8e62750c0998bba0"

S = "${WORKDIR}/zope.interface-${PV}"

inherit setuptools

RPROVIDES_${PN} += "zope-interfaces"
FILES_${PN}-dbg += "${PYTHON_SITEPACKAGES_DIR}/*.egg/*/*/.debug"
FILES_${PN}-dev += "${PYTHON_SITEPACKAGES_DIR}/zope/interface/*.c"
FILES_${PN}-doc += "${PYTHON_SITEPACKAGES_DIR}/zope/interface/*.txt"
FILES_${PN}-tests = " \
        ${PYTHON_SITEPACKAGES_DIR}/zope/interface/tests \
        ${PYTHON_SITEPACKAGES_DIR}/zope/interface/common/tests \
"
