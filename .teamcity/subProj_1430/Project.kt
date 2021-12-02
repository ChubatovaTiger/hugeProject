package subProj_1430

import subProj_1430.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1430")
    name = "subProj 1430"

    buildType(subProj_bt_1430_0)
    buildType(subProj_bt_1430_1)
    buildType(subProj_bt_1430_2)
    buildType(subProj_bt_1430_3)
    buildType(subProj_bt_1430_4)
    buildType(subProj_bt_1430_5)
})
