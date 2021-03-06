PRIORITY = "optional"
DESCRIPTION = "Texas Instruments Baseimage inst2."
LICENSE = "LGPL"
PR = "r0"

CCASE_SPEC = "%\
	      element /vobs/wtbu/OMAPSW_DSP/system/inst2/...  DSP-MM-TID-AUDIO_RLS_${PV}%\
	      element * /main/LATEST%"

CCASE_PATHFETCH = "/vobs/wtbu/OMAPSW_DSP/system/inst2"
CCASE_PATHCOMPONENT = "inst2"
CCASE_PATHCOMPONENTS = "4"

inherit ccasefetch

do_stage() {
        chmod -R +w ${S}/*
	install -d ${STAGING_BINDIR}/dspbridge/system/inst2
	cp -a ${S}/* ${STAGING_BINDIR}/dspbridge/system/inst2
}
