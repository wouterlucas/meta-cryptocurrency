include cgminer.inc

SUMMAR = "cgminer for the compac/2pac mining sticks"

SRC_URI = "git://github.com/vthoang/cgminer.git;protocol=https;branch=master"
SRCREV = "495461ca3b905212f0082c2dad622f9ac7d35360"
PV = "4.9+gitr${SRCPV}"

PACKAGECONFIG_append 	= " gekko"
PACKAGECONFIG[gekko]  	= "--enable-gekko,,"

# rename to gekko specific cgminer binary, so we can co-exist multiple versions
do_install_append() {
	mv ${D}/usr/bin/cgminer ${D}/usr/bin/${PN}
}
