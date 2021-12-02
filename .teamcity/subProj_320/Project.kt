package subProj_320

import subProj_320.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_320")
    name = "subProj 320"

    buildType(subProj_bt_320_5)
    buildType(subProj_bt_320_4)
    buildType(subProj_bt_320_3)
    buildType(subProj_bt_320_2)
    buildType(subProj_bt_320_1)
    buildType(subProj_bt_320_0)
})
