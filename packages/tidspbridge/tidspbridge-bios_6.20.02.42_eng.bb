SECTION = "toolchains"
PRIORITY = "optional"
DESCRIPTION = "Texas Instruments DSP Toolchain"
LICENSE = "Texas Instruments"
PR = "r0"

inherit dfetch

PV_underscr = `echo "${PV}" | sed -e 's/\./_/g'`

DIRAC_PATHFETCH = "/data/omapts/linux/dsp-tc/bios_${PV_underscr}_eng"
DIRAC_PATHCOMPONENT = "bios_${PV_underscr}_eng"
DIRAC_PATHCOMPONENTS = 4 

#CCASE_SPEC = "%\
#	element /vobs/WTSD_TOOLS/dsp/bios6/linux... BIOS_${PV}%\
#	element * /main/LATEST%"

#CCASE_PATHFETCH = "/vobs/WTSD_TOOLS/dsp/bios6/linux"
#CCASE_PATHCOMPONENT = "linux"
#CCASE_PATHCOMPONENTS = "4"

#inherit ccasefetch


do_stage() {
	chmod -R +w ${S}/*
	install -d ${STAGING_BINDIR}/dspbridge/tools/bios_${PV_underscr}_eng
	cp -a ${S}/* ${STAGING_BINDIR}/dspbridge/tools/
	
}