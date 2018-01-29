SUMMARY = "A modification of Christian Buchner's & Christian H.'s ccminer project by tsiv for Cryptonight mining."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=783b7e40cdfb4a1344d15b1f7081af66"

DEPENDS = "curl openssl"

SRC_URI = "git://github.com/tsiv/ccminer-cryptonight.git;protocol=https;branch=master"
SRCREV = "c874975118051e6190943de3a849b7d53cd24054"
PV = "1.0+gitr${SRCPV}"

S = "${WORKDIR}/git"

inherit autotools
