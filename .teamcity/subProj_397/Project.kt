package subProj_397

import subProj_397.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_397")
    name = "subProj 397"

    buildType(subProj_bt_397_5)
    buildType(subProj_bt_397_3)
    buildType(subProj_bt_397_4)
    buildType(subProj_bt_397_1)
    buildType(subProj_bt_397_2)
    buildType(subProj_bt_397_0)
})
