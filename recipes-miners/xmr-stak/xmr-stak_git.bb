SUMMARY = "XMR-Stak is a universal Stratum pool miner. This miner supports CPUs, AMD and NVIDIA gpus and can be used to mine the crypto currency Monero and Aeon."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=16893fdbb628c69a45803cb052c09c2b"

# this is for x86/x64 only 
COMPATIBLE_MACHINE = "core2-32 core2-64"

DEPENDS = "curl openssl"

SRC_URI = "git://github.com/fireice-uk/xmr-stak.git;protocol=https;branch=master"
SRCREV = "2ae7260b90fe3dbe835ba2489519510f0e57d770"
PV = "1.0+gitr${SRCPV}"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

PACKAGECONFIG ?= ""
PACKAGECONFIG[cuda] 		= "-DCUDA_ENABLE=ON,-DCUDA_ENABLE=OFF,"
PACKAGECONFIG[opencl] 		= "-DOpenCL_ENABLE=ON,-DOpenCL_ENABLE=OFF,"
PACKAGECONFIG[microhttpd] 	= "-DMICROHTTPD_ENABLE=ON,-DMICROHTTPD_ENABLE=OFF,"
PACKAGECONFIG[hwloc] 		= "-DHWLOC_ENABLE=ON,-DHWLOC_ENABLE=OFF,"
