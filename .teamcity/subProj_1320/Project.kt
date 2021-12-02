package subProj_1320

import subProj_1320.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1320")
    name = "subProj 1320"

    buildType(subProj_bt_1320_0)
    buildType(subProj_bt_1320_1)
    buildType(subProj_bt_1320_4)
    buildType(subProj_bt_1320_5)
    buildType(subProj_bt_1320_2)
    buildType(subProj_bt_1320_3)
})
