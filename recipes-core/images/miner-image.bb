DESCRIPTION = "Miner image for rpi"
LICENSE = "MIT"

include recipes-core/images/core-image-minimal.bb

SPLASH_rpi = "psplash-raspberrypi"

IMAGE_FEATURES += "package-management \
                   ssh-server-dropbear \
                   splash \
"

IMAGE_INSTALL += "kernel-modules \
                  cgminer \
"
