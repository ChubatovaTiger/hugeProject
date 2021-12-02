package subProj_1922

import subProj_1922.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1922")
    name = "subProj 1922"

    buildType(subProj_bt_1922_0)
    buildType(subProj_bt_1922_1)
    buildType(subProj_bt_1922_4)
    buildType(subProj_bt_1922_5)
    buildType(subProj_bt_1922_2)
    buildType(subProj_bt_1922_3)
})
