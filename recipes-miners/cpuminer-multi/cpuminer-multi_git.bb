SUMMARY = "crypto cpuminer (linux + windows) https://bitcointalk.org/?topic=841401"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

DEPENDS = "zlib libusb openssl"

SRC_URI = "git://github.com/tpruvot/cpuminer-multi.git;protocol=https;branch=linux"
SRCREV = "4073fd4aa2b8f78058fa295806af47cab8b87826"
PV = "1.0+gitr${SRCPV}"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

PACKAGECONFIG ?= "curl crypto"

PACKAGECONFIG[crypto] 	= "--with-crypto,,"
PACKAGECONFIG[curl]  	= "--with-curl,,curl"
