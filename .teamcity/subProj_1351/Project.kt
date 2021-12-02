package subProj_1351

import subProj_1351.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1351")
    name = "subProj 1351"

    buildType(subProj_bt_1351_3)
    buildType(subProj_bt_1351_2)
    buildType(subProj_bt_1351_1)
    buildType(subProj_bt_1351_0)
    buildType(subProj_bt_1351_5)
    buildType(subProj_bt_1351_4)
})
