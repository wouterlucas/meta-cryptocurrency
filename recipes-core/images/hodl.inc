DESCRIPTION = "Base HODL OS image"
LICENSE = "MIT"

include recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES += "package-management \
                   ssh-server-dropbear \
                   splash \
"

IMAGE_INSTALL += "kernel-modules \
                  packagegroup-miners \
                  packagegroup-cgminer \
                  screen \
"

IMAGE_FEATURE_remove = "psplash"
